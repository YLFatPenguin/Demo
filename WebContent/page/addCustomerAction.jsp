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

</script>
</head>
<body style="margin: 15px;">
	<div id="p" class="easyui-panel" title="新增客户行动记录"
		style="width: 700px; height: 460px; padding: 10px;">
		<table cellspacing="8px">
			<tr>
				<td>客户名称：</td>
				<td><input type="hidden" id="id" name="id" /><input type="text" id="title" name="title" readonly="readonly"  value="${customerList.name}"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>客户编号：</td>
				<td><input type="text" id="customeraction"
					name="customeraction" readonly="readonly" value="${customerList.number}" /></td>
			</tr>
			<tr>
				<td>客户手机：</td>
				<td colspan="5"><input type="text" id="customername" name="customername" style="width: 503px" readonly="readonly" value="${customerList.mobile}"/></td>
			</tr>
			<tr>
				<td>客户邮箱：</td>
				<td><input type="text" id="bank" name="bank" readonly="readonly" value="${customerList.email }"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>证件类型：</td>
				<td><input type="text" id="bankcode" name="bankcode" readonly="readonly" value="${customerList.certificate }"/></td>
			</tr>
			<tr>
				<td>证件号码：</td>
				<td><input type="text" id="linkMan" name="orderprice" readonly="readonly" value="${customerList.certificatecode }"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>性别：</td>
				<td><input type="text" id="invest" name="invest" readonly="readonly" value="${customerList.sex }"/></td>
			</tr>
			<tr>
				<td>客户生日：</td>
				<td><input type="text" id="productname" name="productname"readonly="readonly" value="${customerList.birthdate }" /></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>家庭住址：</td>
				<td><input type="text" id="profit" name="profit" readonly="readonly" value="${customerList.homeaddress }" /></td>
			</tr>
			<tr>
				<td>账号寄送方式：</td>
				<td><input type="text" id="startdate" name="startdate" readonly="readonly" value="${customerList.sendtype }" /></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>寄送地址：</td>
				<td><input type="text" id="enddate" name="enddate" readonly="readonly" /></td>
			</tr>
			<tr>
				<td>邮编号码：</td>
				<td><input type="text" id="linkMan" name="linkMan" readonly="readonly" /></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>紧急联系人：</td>
				<td><input type="text" id="linkPhone" name="linkPhone" readonly="readonly" /></td>
			</tr>
			<tr>
				<td>紧急联系人电话：</td>
				<td><input type="text" id="linkMan" name="linkMan" readonly="readonly" /></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>家庭成员：</td>
				<td><input type="text" id="status" name="status" readonly="readonly" /></td>
			</tr>
			<tr>
				<td>关系客户：</td>
				<td><input type="text" id="linkMan" name="linkMan" readonly="readonly" /></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>客户类型：</td>
				<td><input type="text" id="linkPhone" name="linkPhone" readonly="readonly" /></td>
			</tr>
			<tr>
				<td>客户来源：</td>
				<td><input type="text" id="createuser" name="createuser" readonly="readonly" value="${salesOrderList.createuser }"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>客户标签：</td>
				<td><input type="text" id="createdate" name="createdate" readonly="readonly" value="${salesOrderList.createdate }"/></td>
			</tr>
			<tr>
				<td>相关附件：</td>
				<td colspan="5"><input type="text" id="overView"
					name="overView" style="width: 503px" readonly="readonly" /></td>
			</tr>
			<tr>
				<td>详细描述：</td>
				<td colspan="5"><input type="text" id="overView"
					name="overView" style="width: 503px" readonly="readonly" /></td>
			</tr>
			<tr>
				<td>创建人：</td>
				<td colspan="5"><input type="text" id="attachment"
					name="attachment" style="width: 503px" readonly="readonly" /></td>
			</tr>
		</table>
	</div>
	
	<br/>
	
</body>
</html>