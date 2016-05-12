<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
<script type="text/javascript">

	//查询----
	function search(){
	    $("#dg").datagrid('load',{
	        "name":$("#s_name").val()
	    });
	}
	//删除单条客户信息
	function deleteCustomer(index){  
        $('#dg').datagrid('selectRow',index);  
        var row = $('#dg').datagrid('getSelected');  
        if (row){  
            
            $.post(url = "${pageContext.request.contextPath}/Customer/delete.do?id="+row.id,function(result){
            	
                if(result.success){
                    $.messager.alert("系统提示","数据已成功删除！");
                    $("#dg").datagrid("reload");
                }else{
                    $.messager.alert("系统提示","数据删除失败！");
                }
            },"json");
        }  
    }

	
    	//删除多条客户
  /*   function deleteCustomer(index){
    	$('#dg').datagrid('selectRow',index); 
    	
        var selectedRows=$("#dg").datagrid('getSelections');
        if(selectedRows.length==0){
            $.messager.alert("系统提示","请选择要删除的数据！");
            return;
        }
        var strIds=[];
        for(var i=0;i<selectedRows.length;i++){
            strIds.push(selectedRows[i].id);
        }
        var ids=strIds.join(",");
      
        $.messager.confirm("系统提示","删除合同将会连合同付息表、审批表一并删除，该操作不可逆，您确认要删除这<font color=red>"+selectedRows.length+"</font>条数据吗？",function(r){
            if(r){
            	
                $.post("${pageContext.request.contextPath}/Customer/delete.do",{ids:ids},function(result){
                	
                    if(result.success){
                        $.messager.alert("系统提示","数据已成功删除！");
                        $("#dg").datagrid("reload");
                    }else{
                        $.messager.alert("系统提示","数据删除失败！");
                    }
                },"json");
            }
        });
        
    }*/
    
    //新增客户
    function addCustomer(){
        url = "${pageContext.request.contextPath}/Customer/goAddCustomer.do?id=0";  
        alert(url);
        window.open(url,"_blank","height=10000px","width=1000px","location=no")
    } 
    
    //新增联系人页面
    function addCustomerLinkMan(){
        url = "${pageContext.request.contextPath}/Customer/goAddCustomerLinkMan.do?id=0";  
        alert(url);
        window.open(url,"_blank","height=600px","width=600px","location=no")
    }    
    //新增行动记录
    function addCustomerAction(){
    	url = "${pageContext.request.contextPath}/Customer/goAddCustomerAction.do?id=0";  
        alert(url);
        window.open(url,"_blank","height=600px","width=600px","location=no")
    }
    
    //客户联系人
    function openCustomerLinkMan(){
        var selectedRows=$("#dg").datagrid('getSelections');
        if(selectedRows.length!=1){
            $.messager.alert("系统提示","请选择一条要管理的数据！");
            return;
        }
        window.parent.openTab('客户联系人管理','linkManManage.jsp?cusId='+selectedRows[0].id,'icon-lxr');
    }
    
    //客户交往记录
    function openCustomerContact(){
        var selectedRows=$("#dg").datagrid('getSelections');
        if(selectedRows.length!=1){
            $.messager.alert("系统提示","请选择一条要管理的数据！");
            return;
        }
        window.parent.openTab('客户交往记录管理','contactManage.jsp?cusId='+selectedRows[0].id,'icon-lsdd');
    }   
    
    //操作链接格式
    function formatOper(val,row,index){  
        return '<a href="#" onclick="editCustomer('+index+')">编辑</a>  |  <a href="#" onclick="deleteCustomer('+index+')">删除</a>';  
    }  
    
    //客户明细信息
    function detailCustomer(index){  
        $('#dg').datagrid('selectRow',index);  
        var row = $('#dg').datagrid('getSelected');  
        if (row){            
            url = "${pageContext.request.contextPath}/Customer/goCustomerInfo.do?id="+row.id;
            alert(url);
            window.open(url,"_blank","height=1600px","width=1600px","location=no")
        }  
    } 
    
    //编辑客户信息
    function editCustomer(index){  
        $('#dg').datagrid('selectRow',index);  
        var row = $('#dg').datagrid('getSelected');  
        if (row){  
            url = "${pageContext.request.contextPath}/Customer/goCustomerEdit.do?id="+row.id;  
            alert(url);
            window.open(url,"_blank","height=600px","width=600px","location=no")
        }  
    }
    
    //合同编号链接格式
    function formatName(val,row,index){
    	return '<a href="#" onclick="detailCustomer('+index+')">'+row.name+'</a>';  
    } 
    

</script>
</head>
<body style="margin:1px;">
    <table id="dg" title="客户信息管理" class="easyui-datagrid"
      pagination="true" rownumbers="true"  fit="true"
      url="${pageContext.request.contextPath}/Customer/listCustomer.do"  toolbar="#tb">
         <thead data-options="frozen:true "  >
                <tr>
                    <th field="cb" checkbox="true" align="center"></th>
                    <th field="id" width="50" align="center" hidden="true">编号</th>
                    <th field="name" width="100" align="center"  formatter="formatName" >客户名称</th>
                    <th field="mobile" width="100" align="center">客户手机</th>
                    <th field="email" width="100" align="center">客户邮箱</th>
                    <th field="customertypename" width="100" align="center">类型</th>
                    <th field="ownername" width="100" align="center">业务员</th>
                    <th field="lastactiondate" width="100" align="center">最后行动日期</th>
                    <th field="_operate" width="100" align="center" formatter="formatOper">操作</th>
                </tr>
            </thead>
    </table>
    <div id="tb">
        <div>
            <a href="javascript:addCustomer()" class="easyui-linkbutton" iconCls="icon-add" plain="true">新增客户</a>           
            <a href="javascript:addCustomerLinkMan()" class="easyui-linkbutton" iconCls="icon-add" plain="true">新增联系人</a>
            <a href="javascript:addCustomerAction()" class="easyui-linkbutton" iconCls="icon-add" plain="true">新增行动记录</a>          
            <a href="javascript:deleteCustomer()" class="easyui-linkbutton" iconCls="icon-remove" plain="true">删除</a>
            <a href="javascript:openCustomerLinkMan()" class="easyui-linkbutton" iconCls="icon-lxr" plain="true">联系人管理</a>
            <a href="javascript:openCustomerContact()" class="easyui-linkbutton" iconCls="icon-jwjl" plain="true">交往记录管理</a>
            <a href="javascript:openCustomerOrder()" class="easyui-linkbutton" iconCls="icon-lsdd" plain="true">历史订单查看</a>
        </div>
        <div>
            &nbsp;客户名称：&nbsp;<input type="text" id="s_name" size="20" onkeydown="if(event.keyCode==13) searchCustomer()"/>&nbsp;
            <a href="javascript:search()" class="easyui-linkbutton" iconCls="icon-search" plain="true">搜索</a>
        </div>
    </div>
</body>
</html>