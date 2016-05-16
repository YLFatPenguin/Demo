<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/common.js"></script>
<script type="text/javascript">

function addLinkman() {
	$("#fm").form("submit", {
		url : "${pageContext.request.contextPath}/Customer/insertLinkMan.do",
		
		onSubmit : function() {
			/*if($("#area").combobox("getValue")==""){
			    $.messager.alert("系统提示","请选择客户地区");
			    return false;
			}
			if($("#cusManager").combobox("getValue")==""){
			    $.messager.alert("系统提示","请选择客户经理");
			    return false;
			}
			if($("#level").combobox("getValue")==""){
			    $.messager.alert("系统提示","请选择客户的等级");
			    return false;
			}
			if($("#myd").combobox("getValue")==""){
			    $.messager.alert("系统提示","请选择客户满意度");
			    return false;
			}
			if($("#xyd").combobox("getValue")==""){
			    $.messager.alert("系统提示","请选择客户信用度");
			    return false;
			}*/
			return $(this).form("validate");
		},
		success : function(result) {

			var result = eval('(' + result + ')');
			alert(result);
			if (result.success) {
				$.messager.alert("系统提示", "保存成功");
				window.close();
				window.opener && window.opener.location.reload();
			} else {
				$.messager.alert("系统提示", "保存失败");
				return;
			}
		}
	});
}

function closeDialog() {
	window.close();
	//window.opener && window.opener.location.reload();
}

</script>
</head>
<body style="margin: 15px;">
	<div id="p" class="easyui-panel" title="添加新的联系人"
		style="width: 600px; height: 460px; padding: 10px;">
		<form id="fm" method="post">
		<table cellspacing="8px">
			<tr>
				<td>名称：</td>
				<td><input type="hidden" id="id" name="id" /><input type="text" id="name" name="name" value="${customerLinkman.name }"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>				
			</tr>
			<tr>
			<td>性别：</td>
				<td><input type="radio" id="sex" name="sex" value="${customerLinkman.sex }" />男
				<input type="radio" id="sex" name="sex" value="${customerLinkman.sex }"   />女</td>				
			</tr>
			<tr>
			    <td>所属客户：</td>
			    <td><input type="text" id="customerName" name="customerName" value="${customerLinkman.customerName }"/></td>
			</tr>
			<tr>
			    <td>部门：</td>
			    <td><input type="text" id="groupname" name="groupname" value="${customerLinkman.groupname }" /></td>
			</tr>
			<tr>
			    <td>职位称呼：</td>
			    <td><input type="text" id="title" name="title" value="${customerLinkman.title }"/></td>
			</tr>
			<tr>
			    <td>类型：</td>
			    <td><input class="easyui-combobox" type="text"
						 id="type" name="type" editable="false"
						 panelHeight="auto"
						 data-options="
                         url:'${pageContext.request.contextPath}/Customer/selectLinkmanType.do',
                         method:'get',valueField:'id',textField:'name',panelHeight:'auto'" value="${customerListVo.type}"/>  </td>
			</tr>
			<tr>
			    <td>手机：</td>
				<td><input type="text" id="mobile" name="mobile" value="${customerLinkman.mobile }"  /></td>
			</tr>
			<tr>
			    <td>邮箱：</td>
				<td><input type="text" id="email" name="email" value="${customerLinkman.email }" /></td>			
			</tr>
			<tr>
			    <td>QQ：</td>
			    <td><input type="text" id="qq" name="qq" value="${customerLinkman.qq }"/></td>
			</tr>
			<tr>
			    <td>网站:</td>
			    <td><input type="text" id="web" name="web" value="${customerLinkman.web }"/></td>
			</tr>
			<tr>
			<td>生日：</td>
				<td><input class="easyui-datebox" type="text" id="birthdate" name="birthdate" value="${customerLinkman.birthdate }"/></td>
				
			</tr>
			<tr>
			<td>地址：</td>
				<td><input type="text" id="address" name="address" value="${customerLinkman.address }" /></td>		
			</tr>
			<tr>
			    <td>联系人标签：</td>
			    <td>这个地方还没好  现在不会做</td>
			</tr>
			<tr>
				<td>详细描述：</td>
				<td><input type="text" id="overView"
					name="overView"   /></td>
			</tr>
		</table>
		</form>
	</div>
	
	<br/>
	<div id="dlg-buttons">
		<a href="javascript:addLinkman()" class="easyui-linkbutton"
			iconCls="icon-ok">保存</a> <a href="javascript:closeDialog()"
			class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
	</div>
</body>
</html>