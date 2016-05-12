<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>合同信息</title>
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

	function goSalesOrderEdit() {
		$("#fm").form("submit", {
			url : "${pageContext.request.contextPath}/Sales/goSalesOrderEdit.do",
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
	<div id="p" class="easyui-panel" title="合同信息"
		style="width: 700px; height: 460px; padding: 10px;">
		<form id="fm" method="post">
			<table cellspacing="8px">
				<tr>
					<td><font face="wingdings" color="red">v</font>合同编号：</td>
					<td><input type="hidden" id="id" name="id" /><input
						type="text" id="title" name="title"   value="${salesOrderList.title}"/></td>
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>投资人：</td>
					<td colspan="5"><input type="text" id="customerid" 
						name="customerid" style="width: 503px" value="${salesOrderList.customerid}"/></td>
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>开户行及其支行：</td>
					<td colspan="5"><input type="text" id="bank" name="bank"
						style="width: 503px" value="${salesOrderList.bank}" /></td>
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>银行账号：</td>
					<td colspan="5"><input type="text" id="bankcode"
						name="bankcode" style="width: 503px" value="${salesOrderList.bankcode}" /></td>
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>投资产品：</td>
					<td colspan="5"><input class="easyui-combobox" type="text"
						id="idprofit" name="idprofit" editable="false"
						panelHeight="auto"
						data-options="
                    url:'${pageContext.request.contextPath}/Sales/productComboList.do',
                    method:'get',valueField:'idprofit',textField:'name',panelHeight:'auto'" /></td>
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>投资金额：</td>
					<td colspan="5"><input type="text" id="orderprice"
						name="orderprice" style="width: 503px" value="${salesOrderList.orderprice}" /></td>
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>收益率（%）：</td>
					<td colspan="5"><input type="text" id="profit" name="profit"
						style="width: 503px" value="${salesOrderList.profit}" /></td>
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>合同开始时间：</td>
					<td colspan="5"><input class="easyui-datebox" type="text"
						id="startdate" name="startdate" value="${salesOrderList.startdate}"/></td>
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>投资时间：</td>
					<td><input type="radio" id="investtimetype"
						name="investtimetype" value="1" text="天" selected="True"
						onclick="changeInvest(1)" /></td>
					<td>
					<input type="radio" id="investtimetype" name="investtimetype" />
					</td>
					<td colspan="3"><input type="text" id="investtime"
						name="investtime" style="width: 100px" /></td>
				</tr>
				 <tr>
					<td><font face="wingdings" color="red">v</font>合同结束时间：</td>
					<td colspan="5"><input class="easyui-datebox" type="text"
						id="enddate" name="enddate" value="${salesOrderList.enddate}"/></td>
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>支付方式：</td>
					<td colspan="5"><input class="easyui-combobox" type="text"
						id="loantype" name="loantype" editable="false"
						data-options=" url:'${pageContext.request.contextPath}//Sales//loanTypeComboList.do', method:'get',valueField:'Id',textField:'Name',panelHeight:'auto'
				    " />
					</td>
				</tr>

				<!-- <div  style="margin: 10px 0;">
					<tr id="divParent">
						<td>付息时间：</td>
						<td colspan="5"><input class="easyui-datebox" type="text"
							id="loandate" name="loandate" /></td>
					</tr>
				</div> -->
				<tr>
					<td><font face="wingdings" color="red">v</font>本息总计：</td>
					<td colspan="5"><input type="text" id="totalprice"
						name="totalprice" style="width: 503px" value="${salesOrderList.totalprice}"/></td>
				</tr>
				<tr>
					<td><font face="wingdings" color="red">v</font>理财经理：</td>
					<td colspan="5"><input type="text" id="submituser"
						name="submituser" style="width: 503px" value="${salesOrderList.submituser}"/></td>
				</tr>
				<!-- <tr>
				<td><font face="wingdings" color="red">v</font>促成日期：</td>
				<td colspan="5"><input type="text" id="submitdate"
					name="submitdate" style="width: 503px" /></td>
			</tr> -->
			</table>

			<!--<table cellspacing="8px">
			<tr>
				<td>合同详情：</td>
				<td><input type="hidden" id="id" name="id" /><input
					type="text" id="title" name="title" /></td>
			</tr>
			<tr>
				<td>上传文件：</td>
				<td colspan="5"><input type="text" id="customername"
					name="customername" style="width: 503px" /></td>
			</tr>
			<tr>
				<td>共享给：</td>
				<td colspan="5"><input type="text" id="customername"
					name="customername" style="width: 503px" /></td>
			</tr> -->
			</table>
			<!--  </div>-->
		</form>
	</div>

	<div id="dlg-buttons">
		<a href="javascript:goSalesOrderEdit()" class="easyui-linkbutton"
			iconCls="icon-ok">保存</a> <a href="javascript:closeDialog()"
			class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
	</div>

</body>
</html>