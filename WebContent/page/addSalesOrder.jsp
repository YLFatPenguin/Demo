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
	<div id="p" class="easyui-panel" title="新增合同页面"
		style="width: 700px; height: 460px; padding: 10px;">
		<table cellspacing="8px">
			<tr>
				<td>合同编号：</td>
				<td><input type="hidden" id="id" name="id" /><input type="text" id="title" name="title"   value="${salesOrderList.title}"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>行动记录：</td>
				<td><input type="text" id="customeraction"
					name="customeraction"  /></td>
			</tr>
			<tr>
				<td>投资人：</td>
				<td colspan="5"><input type="text" id="customername" name="customername" style="width: 503px"  /></td>
			</tr>
			<tr>
				<td>开户行及其支行：</td>
				<td><input type="text" id="bank" name="bank"  value="${salesOrderList.bank }"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>银行账号：</td>
				<td><input type="text" id="bankcode" name="bankcode"  value="${salesOrderList.bankcode }"/></td>
			</tr>
			<tr>
				<td>投资金额：</td>
				<td><input type="text" id="linkMan" name="orderprice"  value="${salesOrderList.orderprice }"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>投资时间：</td>
				<td><input type="text" id="invest" name="invest"  /></td>
			</tr>
			<tr>
				<td>产品类型：</td>
				<td><input type="text" id="productname" name="productname" /></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>收益率：</td>
				<td><input type="text" id="profit" name="profit"  /></td>
			</tr>
			<tr>
				<td>合同开始时间：</td>
				<td><input type="text" id="startdate" name="startdate"  /></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>合同结束时间：</td>
				<td><input type="text" id="enddate" name="enddate"  /></td>
			</tr>
			<tr>
				<td>付息时间：</td>
				<td><input type="text" id="linkMan" name="linkMan"  /></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>理财经理：</td>
				<td><input type="text" id="linkPhone" name="linkPhone"  /></td>
			</tr>
			<tr>
				<td>促成时间：</td>
				<td><input type="text" id="linkMan" name="linkMan"  /></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>合同状态：</td>
				<td><input type="text" id="status" name="status"  /></td>
			</tr>
			<tr>
				<td>支付方式：</td>
				<td><input type="text" id="linkMan" name="linkMan"  /></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>本息总计：</td>
				<td><input type="text" id="linkPhone" name="linkPhone"  /></td>
			</tr>
			<tr>
				<td>创建人员：</td>
				<td><input type="text" id="createuser" name="createuser"  value="${salesOrderList.createuser }"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>创建时间：</td>
				<td><input type="text" id="createdate" name="createdate"  value="${salesOrderList.createdate }"/></td>
			</tr>
			<tr>
				<td>合同详情：</td>
				<td colspan="5"><input type="text" id="overView"
					name="overView" style="width: 503px"  /></td>
			</tr>
			<tr>
				<td>合同拍照：</td>
				<td colspan="5"><input type="text" id="overView"
					name="overView" style="width: 503px"  /></td>
			</tr>
			<tr>
				<td>合同附件：</td>
				<td colspan="5"><input type="text" id="attachment"
					name="attachment" style="width: 503px"  /></td>
			</tr>
		</table>
	</div>
	
	<br/>	
	<div id="dlg-buttons">
		<a href="javascript:goSalesOrderEdit()" class="easyui-linkbutton"
			iconCls="icon-ok">保存</a> <a href="javascript:closeDialog()"
			class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
	</div>
</body>
</html>