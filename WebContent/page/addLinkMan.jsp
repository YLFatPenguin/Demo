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

function addLinkMan(){
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
<body>
	<div id="p" class="easyui-panel" title="添加新的联系人"
		style="width: 700px; height: 460px;">
		<form id="fm" action="post">
		<table>
			<tr>
				<td>名称：
				 <input type="text" id="name" name="name"  value="${customerlinkman.name}"/>
				</td>
				<td>生日：
				<input type="text" id="id"
					name="id"  value="${customerLinkman.birthdate}" />
				</td>
			</tr>	
					
			<tr>
			  <td>
			               所属客户:<input type="text"/>
			  </td>
			</tr>
			<tr>
			  <td>客户手机：</td>
			  <td><input type="text" id="mobile" name="mobile"  value="${customerLinkman.mobile}"/></td>
				<td>客户邮箱：</td>
				<td><input type="text" id="email" name="email"  value="${customerLinkman.email }"/></td>
				
			</tr>
			<tr>
				<td>性别：</td>
				<td><input type="text" id="sex" name="sex"  value="${customerLinkman.sex }"/></td>
				
				<td>客户生日：</td>
				<td><input type="text" id="birthdate" name="birthdate" value="${customerLinkman.birthdate }" /></td>
				
			</tr>
             <tr>
				<td>创建时间：</td>
				<td><input type="text" id="createdate" name="createdate" value="${customerLinkman.createdate }" /></td>
				
				<td>创建人：</td>
				<td><input type="text" id="attachment"
					name="attachment"  /></td>
			</tr>
			<tr>
				<td>相关附件：</td>
				<td ><input type="text" id="overView"
					name="overView"   /></td>
			</tr>
			<tr>
				<td>详细描述：</td>
				<td ><input type="text" id="overView"
					name="overView"  /></td>
			</tr>
			
		</table>
		</form>
	</div>
    <div id="dlg-buttons">
		<a href="javascript:addLinkMan()" class="easyui-linkbutton"
			iconCls="icon-ok">保存</a> <a href="javascript:closeDialog()"
			class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
	</div>
</body>
</html>