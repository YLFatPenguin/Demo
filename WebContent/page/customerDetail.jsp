<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>   
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
function closeDialog() {
	window.close();
	//window.opener && window.opener.location.reload();
}
</script>
</head>
<body style="margin: 15px;">
	<div id="p" class="easyui-panel" title="客户信息"
		style="width: 800px; height: 760px; padding: 10px;">
		<table cellspacing="8px">
			<tr>
				<td>客户名称：</td>
				<td><input type="hidden" id="id" name="id" /><input type="text" id="title" name="title" readonly="readonly"  value="${customerListVo.name}"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>客户编号：</td>
				<td><input type="text" id="number"
					name="number" readonly="readonly" value="${customerListVo.number}" /></td>
			</tr>
			<tr>
				<td>客户手机：</td>
				<td colspan="5"><input type="text" id="mobile" name="mobile" style="width: 503px" readonly="readonly" value="${customerListVo.mobile}"/></td>
			</tr>
			<tr>
				<td>客户邮箱：</td>
				<td><input type="text" id="email" name="email" readonly="readonly" value="${customerListVo.email }"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>证件类型：</td>
				<td><input type="text" id="certificate" name="certificate" readonly="readonly" value="${customerListVo.certificate }"/></td>
			</tr>
			<tr>
				<td>证件号码：</td>
				<td><input type="text" id="certificatecode" name="certificatecode" readonly="readonly" value="${customerListVo.certificatecode }"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>性别：</td>
				<td><input type="text" id="sex" name="sex" readonly="readonly" value="${customerListVo.sex==1?"男":"女" }"/></td>
			</tr>
			<tr>
				<td>客户生日：</td>
				<td>
				<input type="text" id="stringDate" name="stringDate" readonly="readonly" value="${customerListVo.stringDate }" /></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>家庭住址：</td>
				<td><input type="text" id="homeaddress" name="homeaddress" readonly="readonly" value="${customerListVo.homeaddress }" /></td>
			</tr>
			<tr>
				<td>账号寄送方式：</td>
				<td><input type="text" id="sendtype" name="sendtype" readonly="readonly" value="${customerListVo.sendtype }" /></td>
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
				<td> 		
			      <input type="text" id="typeName" name="typeName" value="${customerListVo.typeName}"/>
               </td>
			</tr>
			<tr>
				<td>客户来源：</td>
				<td>
                 <input type="text" id="originTypeName" name="originTypeName" value="${customerListVo.originTypeName}"/>
                 </td>
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
				<td><input type="text" id="ownerName"
					name="ownerName"  readonly="readonly" value="${customerListVo.ownerName }"/></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>创建时间：</td>
				<td><input type="text" id="stringDate" name="stringDate" readonly="readonly" value="${customerListVo.stringDate }"/></td>
			</tr>
			<tr>
				<td>业务员：</td>
				<td><input type="text" id="ownerName" name="ownerName" readonly="readonly" value="${customerListVo.ownerName }"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>分配日期：</td>
				<td><input type="text" id="stringDate" name="stringDate" readonly="readonly" value="${customerListVo.stringDate }"/></td>
			</tr>
			<tr>
				<td>首次接触时间：</td>
				<td><input type="text" id="stringDate" name="stringDate" readonly="readonly" value="${customerListVo.stringDate }"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>最后接触时间：</td>
				<td><input type="text" id="stringDate" name="stringDate" readonly="readonly" value="${customerListVo.stringDate }"/></td>
			</tr>
			<tr>
				<td>最后修改人：</td>
				<td><input type="text" id="ownerName" name="ownerName" readonly="readonly" value="${customerListVo.ownerName }"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>最后修改时间：</td>
				<td><input type="text" id="stringDate" name="stringDate" readonly="readonly" value="${customerListVo.stringDate }"/></td>
			</tr>
			<tr>
				<td>预计回落时间：</td>
				<td><input type="text" id="stringDate" name="stringDate" readonly="readonly" value="${salesOrderList.stringDate }"/></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>共享给：</td>
				<td><input type="text" id="createdate" name="createdate" readonly="readonly" value="${salesOrderList.createdate }"/></td>
			</tr>
			<tr>
				<td>行动周期：</td>
				<td><input type="text" id="createuser" name="createuser" readonly="readonly" /></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>行动成本：</td>
				<td><input type="text" id="createdate" name="createdate" readonly="readonly" value="0"/></td>
			</tr>
		</table>
	</div>
	<div id="dlg-buttons">
	         <a href="javascript:closeDialog()"
			class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
	</div>
</body>
</html>