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

function addCustomerInfo() {
	$("#fm").form("submit", {
		url : "${pageContext.request.contextPath}/Customer/insertNewCustomerInfo.do",		
		onSubmit : function() {
			return $(this).form("validate");
		},
		success : function(result) {
			var result = eval('(' + result + ')');
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
	<div id="p" class="easyui-panel" title="客户信息"
		style="width: 900px; height: 760px; padding: 10px;">
		<form id="fm" method="post">
		<table cellspacing="8px">
			<tr>
				<td>客户名称：</td>
				<td><input type="hidden" id="id" name="id" /><input type="text" id="name" name="name"   value="${customerList.name}"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				
			</tr>
			<tr>
			<td>性别：</td>
				<td><input type="radio" id="sex" name="sex"  value="${customerList.sex }"/>男
				<input type="radio" id="sex" name="sex"  value="${customerList.sex }"/>女</td>
				
			</tr>
			<tr>
			<td>客户手机：</td>
				<td><input type="text" id="mobile" name="mobile"   value="${customerList.mobile}"/></td>
				
			</tr>
			<tr>
			<td>客户邮箱：</td>
				<td><input type="text" id="email" name="email"  value="${customerList.email }"/></td>
				
				
			</tr>
			<tr>
			<td>证件类型：</td>
				<td><input type="radio" id="certificate" name="certificate"  value="${customerList.certificate }"/>身份证
				<input type="radio" id="certificate" name="certificate"  value="${customerList.certificate }"/>护照
				<input type="radio" id="certificate" name="certificate"  value="${customerList.certificate }"/>港澳台居民往来大陆通行证
				<input type="radio" id="certificate" name="certificate"  value="${customerList.certificate }"/>军官证
				<input type="radio" id="certificate" name="certificate"  value="${customerList.certificate }"/>驾照</td>
			</tr>
			<tr>
			<td>证件号码：</td>
				<td><input type="text" id="certificatecode" name="certificatecode"  value="${customerList.certificatecode }"/></td>
				
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				
			</tr>
			<tr>
			<td>客户生日：</td>
				<td><input class="easyui-datebox" type="text" id="birthdate" name="birthdate" value="${customerList.birthdate }" /></td>
				
			</tr>
			<tr>
			<td>家庭住址：</td>
				<td><input type="text" id="homeaddress" name="homeaddress"  value="${customerList.homeaddress }" /></td>
			
			</tr>
			<tr>
			<td>账号寄送方式：</td>
				<td><input type="radio" id="sendtype" name="sendtype"  value="${customerList.sendtype }" />邮件
				<input type="radio" id="sendtype" name="sendtype"  value="${customerList.sendtype }" />信件
				<input type="radio" id="sendtype" name="sendtype"  value="${customerList.sendtype }" />电子账单</td>
			</tr>
			<tr>
			  <td>寄送地址：</td>
		      <td>
		        <input id="cc1" class="easyui-combobox" data-options="valueField: 'id',textField: 'text',url: 'selectAddress.do?id=0',
                                  onSelect: function(rec){
                                  var url = 'selectAddress.do?id='+rec.id;
                                  $('#cc2').combobox('clear');
                                  $('#cc2').combobox('reload', url);}" >
                <input id="cc2" class="easyui-combobox" data-options="valueField:'id',textField:'text'">
		      </td>
			</tr>
			<tr>
			<td>邮编：</td>
			<td><input type="text" id="postalcode" name="postalcode" value="${customerList.postalcode}"/></td>
			</tr>
			<tr>
			  <td>紧急联系人：</td>
				<td><input type="text" id="linkPhone" name="linkPhone"  /></td>
			</tr>
			<tr>
			<td>紧急联系人电话：</td>
				<td><input type="text" id="linkMan" name="linkMan"  /></td>
			</tr>
			<tr>
			  <td>家庭成员：</td>
			  <td><input type="text" id="family" name="family" value="${customerList.family }"/></td>
			</tr>
			<tr>
				<td>详细描述：</td>
				<td><input type="text" id="overView"
					name="overView"   /></td>
			</tr>
			<tr>
			  <td>客户类型：</td>
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
				<td>客户来源：</td>
				<td>
				  <input class="easyui-combobox" type="text"
						 id="origintype" name="origintype" editable="false"
						 panelHeight="auto"
						 data-options="
                         url:'${pageContext.request.contextPath}/Customer/selectOriginType.do',
                         method:'get',valueField:'id',textField:'name',panelHeight:'auto'" value="${customerListVo.origintype}"/>
				</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				
			</tr>
			<tr>
			<td>客户标签：</td>
				<td><input type="text" id="createdate" name="createdate"  value="${salesOrderList.createdate }"/></td></tr>
			<tr>
				<td>相关附件：</td>
				<td colspan="5"><input type="text" id="overView"
					name="overView" style="width: 503px"  /></td>
			</tr>
			
		</table>
		</form>
	</div>
	
	<br/>
	<div id="dlg-buttons">
		<a href="javascript:addCustomerInfo()" class="easyui-linkbutton"
			iconCls="icon-ok">保存</a> <a href="javascript:closeDialog()"
			class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
	</div>
</body>
</html>