<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户信息编辑</title>
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
    
	$(function() {
		$('#loantype').combobox(
						{
							onChange : function(newValue, oldValue) {
								if (newValue == "1") {
									document.getElementById("divParent").style.display = "none";
								} else {
									document.getElementById("divParent").style.display = "";
								}
							}
						});
	      $('#idprofit').combobox(
                  {
                      onChange : function(newValue, oldValue) {
                    	  var str = newValue.split(",");
                    	  $("#profit").val(str[1]);
                      }
                  });
		   });

	
	function updateCustomerInfo() {
		$('#fm').form('submit', {
			url : "${pageContext.request.contextPath}/Customer/updateCustomerInfo.do?",
			onSubmit : function() {
				return $(this).form('validate');
			},
			success : function(data) {
				var data = eval('(' + data + ')');			
				if (data.success) {
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
	}
	
</script>
</head>
<body style="margin: 15px;">
	<div id="p" class="easyui-panel" title="客户信息编辑"
		style="width: 800px; height: 660px; padding: 10px;">
		<form id="fm" method="post">
			<table cellspacing="8px">
				<tr>
					<td><font face="wingdings" color="red">v</font>客户名称：</td>
					<td><input type="hidden" id="id" name="id" value="${customerListVo.id}"/><input
						type="text" id="name" name="name"   value="${customerListVo.name}"/></td>
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>性别：</td>
                    <td> <form:radiobutton path="customerListVo.sex" value="1"/>男  
                    <form:radiobutton path="customerListVo.sex" value="0"/>女   </td>  
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>客户手机：</td>
					<td colspan="5"><input type="text" id="mobile" name="mobile"
						 value="${customerListVo.mobile}" /></td>
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>客户邮箱：</td>
					<td colspan="5"><input type="text" id="email"
						name="email"  value="${customerListVo.email}" /></td>
				</tr>
				<tr>
                    <td><font face="wingdings" color="red">v</font>证件类型：</td>
                    <td><form:radiobutton path="customerListVo.certificate" value="身份证"/>身份证
                    <form:radiobutton path="customerListVo.certificate" value="护照"/>护照
                    <form:radiobutton path="customerListVo.certificate" value="港澳台居民往来大陆通行证"/>港澳台居民往来大陆通行证
                    <form:radiobutton path="customerListVo.certificate" value="军官证"/>军官证
                    <form:radiobutton path="customerListVo.certificate" value="驾照"/>驾照</td>
                </tr>
                <tr>
                    <td><font face="wingdings" color="red">v</font>证件号码：</td>
                    <td colspan="5"><input type="text" id="certificatecode"
                        name="certificatecode"  value="${customerListVo.certificatecode}" /></td>
                </tr>
                <tr>
                    <td><font face="wingdings" color="red">v</font>客户生日：</td>
                    <td colspan="5"><input class="easyui-datebox" type="text" id="birthdate"
                        name="birthdate"  value="<fmt:formatDate value='${customerListVo.birthdate}' type='date' pattern="yyyy-MM-dd"/>"/></td>
                </tr>
                <tr>
                    <td><font face="wingdings" color="red">v</font>家庭住址：</td>
                    <td colspan="5"><input type="text" id="homeaddress"
                        name="homeaddress"  value="${customerListVo.homeaddress}" /></td>
                </tr>
                <tr>
                    <td><font face="wingdings" color="red">v</font>账号寄送方式：</td>
                    <td><form:radiobutton path="customerListVo.sendtype" value="邮件"/>邮件
                    <form:radiobutton path="customerListVo.sendtype" value="信件"/>信件
                    <form:radiobutton path="customerListVo.sendtype" value="电子账单"/>电子账单</td>
                </tr>
                <tr>
                    <td><font face="wingdings" color="red">v</font>寄送地址：</td>
                    <td>
                      <input id="cc1" class="easyui-combobox" data-options="valueField: 'id',textField: 'text',url: 'selectAddress.do?id=0',
                                  onSelect: function(rec){
                                  var url = 'selectAddress.do?id='+rec.id;
                                  $('#cc2').combobox('clear');
                                  $('#cc2').combobox('reload', url);}" value="${customerListVo.area1 }">
                      <input id="cc2" class="easyui-combobox" data-options="valueField:'id',textField:'text'" value="${customerListVo.area2 }">
                    </td>
                </tr>
                <tr>
                    <td><font face="wingdings" color="red">v</font>邮编：</td>
                    <td colspan="5"><input type="text" id="postalcode"
                        name="postalcode"  value="${customerListVo.postalcode}" /></td>
                </tr>
                <tr>
                    <td><font face="wingdings" color="red">v</font>紧急联系人：</td>
                    <td colspan="5"><input type="text" id="emergencylinkman"
                        name="emergencylinkman"  value="${customerListVo.emergencylinkman}" /></td>
                </tr>
                <tr>
                    <td><font face="wingdings" color="red">v</font>紧急联系人电话：</td>
                    <td colspan="5"><input type="text" id="tel"
                        name="tel"  value="${customerListVo.tel}" /></td>
                </tr>
                <tr>
                    <td><font face="wingdings" color="red">v</font>家庭成员：</td>
                    <td colspan="5"><input type="text" id="family"
                        name="family"  value="${customerListVo.family}" /></td>
                </tr>
                <tr>
                    <td><font face="wingdings" color="red">v</font>详细描述：</td>
                    <td colspan="5"><input type="text" id="memo"
                        name="memo"  value="${customerListVo.memo}" /></td>
                </tr><tr>
                    <td><font face="wingdings" color="red">v</font>客户类型：</td>
                    <td>
                    <input class="easyui-combobox" type="text"
						 id="type" name="type" editable="false"
						 panelHeight="auto"
						 data-options="
                         url:'${pageContext.request.contextPath}/Customer/selectType.do',
                         method:'get',valueField:'id',textField:'name',panelHeight:'auto'" value="${customerListVo.type}"/>                   
                    </td>
                </tr>
                <tr>
                    <td><font face="wingdings" color="red">v</font>客户来源：</td>
                    <td>
                      <input class="easyui-combobox" type="text"
						 id="origintype" name="origintype" editable="false"
						 panelHeight="auto"
						 data-options="
                         url:'${pageContext.request.contextPath}/Customer/selectOriginType.do',
                         method:'get',valueField:'id',textField:'name',panelHeight:'auto'" value="${customerListVo.origintype}"/>
                    </td>
                </tr>
                <tr>
                    <td><font face="wingdings" color="red">v</font>分类标签：</td>
                    <td><input type="text" id="label"
                        name="label"  value="${customerListVo.label}" /></td>
                </tr>
			</table>
		</form>
	</div>

	<div id="dlg-buttons">
		<a href="javascript:updateCustomerInfo()" class="easyui-linkbutton"
			iconCls="icon-ok">保存</a> <a href="javascript:closeDialog()"
			class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
	</div>

</body>
</html>