<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: thanhngan
  Date: 10/5/2023
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
          crossorigin="anonymous">
    <style>
        h4, h5, h6 ,span{
            text-align: center;
        }

        table {
            width: 100%;
        }
        .axis{
            margin-left: 650px;
        }


    </style>
</head>
<body>

<div class="container">
    <div class="row">
        <h4>TỜ KHAI Y TẾ</h4>
        <h5>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG THÔNG TIN CỦA ANH/ CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHONG CHỐNG
            DỊCH BỆNH </h5>
        <h6 style="color:rgb(255,0,0)">Khuyến cáo: Khai báo thông tin sai </h6>
        <form:form modelAttribute="newForm" method="post" action="/show/create">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label"><b>Họ tên (Ghi chữ in hoa)</b></label>
            <form:input path="name" type="text" class="form-control" id="exampleInputEmail1"
                        aria-describedby="emailHelp"/>
        </div>
        <table>
            <tr>
                <td>
                    <div class="mb-3 size radio">
                        <label for="exampleInputPassword1" class="form-label"><b>Năm Sinh</b></label>
                        <form:input path="birthday" class="form-control" name="category" id="category" type="date"/>
                    </div>
                </td>
                <td>
                    <div class="mb-3 radio">
                        <label for="exampleInputPassword1" class="form-label"><b>Giới tính</b></label>
                        <form:select path="gender" items="${gender1}" class="form-control" name="category"
                                     id="category"/>
                    </div>
                </td>
                <td>
                    <div class="mb-3 radio">
                        <label for="exampleInputPassword2" class="form-label"><b>Quốc Tịch</b></label>
                        <form:select path="nationality" items="${nationality1}" class="form-control" name="category"
                                     id="category"/>
                    </div>
                </td>
            </tr>
        </table>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label"><b>Số hộ chiếu,chứng minh nhân dân hoặc giấy thông hành
                khác</b></label>
            <form:input path="CMND" type="text" class="form-control" id="exampleInputEmail1"
                        aria-describedby="emailHelp"/>
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label"><b>Thông tin đi lại</b></label> <br>
           <table class="table table-striped">
               <tr>
<%--                   <td> <form:radiobuttons path="vehicle" items="${vehicle1}"/></td>--%>
                   <c:forEach items="${vehicle1} " var="vehicle" varStatus="loop">
                       <td><form:radiobutton path="vehicle" value="vehicle"/>${vehicle}</td>
                   </c:forEach>
               </tr>

           </table>
        </div>

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label"><b>Số hiệu phương tiện số ghế</b></label>
            <form:input path="idVehicle" type="text" class="form-control" id="exampleInputEmail1"
                        aria-describedby="emailHelp"/>
        </div>

        <table>
            <tr>
                <label for="exampleInputPassword1" class="form-label"><b>Ngày Khởi Hành</b></label>
                <label for="exampleInputPassword1" class="form-label"><b>Ngày Kết thúc</b></label>
            </tr>
            <tr>
                <td>
                    <div class="mb-3 size ">
                        <form:input path="startDate" class="form-control" name="category" id="category" type="date"/>
                    </div>
                </td>
                <td>
                    <div class="mb-3 size ">
                        <form:input path="endDate" class="form-control" name="category" id="category" type="date"/>
                    </div>
                </td>
            </tr>
        </table>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label"><b>Trong 14 ngày qua anh chị có đi đến nơi nào khác
                không</b></label>
            <form:input path="city" type="text" class="form-control" id="exampleInputEmail1"
                        aria-describedby="emailHelp"/>
        </div>
        <br>
        <h5 style="text-align: left">ĐỊA CHỈ LIÊN LẠC</h5>
        <table>
            <tr>
                <td>
                    <div class="mb-3 radio">
                        <label for="exampleInputPassword1" class="form-label"><b>Tỉnh/Thành</b></label>
                        <form:input path="province" class="form-control" name="category"
                                    id="category" type="text"/>
                    </div>
                </td>
                <td>
                    <div class="mb-3 radio">
                        <label for="exampleInputPassword1" class="form-label"><b>Quận/Huyện</b></label>
                        <form:input path="district" class="form-control" name="category"
                                    id="category"/>
                    </div>
                </td>
                <td>
                    <div class="mb-3 radio">
                        <label for="exampleInputPassword1" class="form-label"><b>Phường/Xã</b></label>
                        <form:input path="ward" class="form-control" name="category"
                                    id="category"/>
                    </div>
                </td>
            </tr>
        </table>
        <div class="mb-3 radio">
            <label for="exampleInputPassword1" class="form-label"><b>Địa chỉ nơi ở</b></label>
            <form:input path="address" class="form-control" name="category"
                        id="category" type="text"/>
        </div>
        <table>
            <tr>
                <td>
                    <div class="mb-3 radio">
                        <label for="exampleInputPassword1" class="form-label"><b>Điện thoại</b></label>
                        <form:input path="phoneNumber" class="form-control" name="category"
                                    id="category" type="text"/>
                    </div>
                </td>
                <td>
                    <div class="mb-3 radio">
                        <label for="exampleInputPassword1" class="form-label"><b>Email</b></label>
                        <form:input path="email" class="form-control" name="category"
                                    id="category" type="text"/>
                    </div>
                </td>
            </tr>
        </table>
        <br>
        <h6 style="text-align: left">Trong 14 ngày qua anh/chị có xuất hiện dấu hiệu nào sau đây hay không</h6>
        <table class="table table-striped">
            <tr>
                <th>Triệu chứng</th>
                <th>Có</th>
                <th>Không</th>
            </tr>
            <tr>
                <td>Sốt</td>
                <td><input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1"></td>
                <td><input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault"></td>
            </tr>
            <tr>
                <td>Ho</td>
                <td><input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1"></td>
                <td><input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault"></td>
            </tr>
            <tr>
                <td>Khó thở</td>
                <td><input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1"></td>
                <td><input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault"></td>
            </tr>
            <tr>
                <td>Đau họng</td>
                <td><input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1"></td>
                <td><input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault"></td>
            </tr>
            <tr>
                <td>Nôn/Buồn nôn</td>
                <td><input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1"></td>
                <td><input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault"></td>
            </tr>
        </table>
        <h6 style="text-align: left">Lịch sử phơi nhiễm:Trong vòng 14 ngày qua anh/chị</h6>
        <table class="table table-striped">
            <tr>
                <th></th>
                <th>Có</th>
                <th>Không</th>
            </tr>
            <tr>
                <td>Tiếp xúc gần 2m với người nhiễm nCOv</td>
                <td><input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1"></td>
                <td><input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault"></td>
            </tr>
            <tr>
                <td>Đến trại chăn nuôi/chợ buôn bán động vật sống/cơ sơ diết mổ động vật</td>
                <td><input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1"></td>
                <td><input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1"></td>
            </tr>
        </table>
        <h6 style="color:rgb(255,0,0)" >Dữ liẹu bạn cung cấp được báo mật và chỉ phục vụ cho phòng chống dịch </h6>
    <div class="axis"><button type="submit" class="btn btn-primary">SUBMIT</button></div>
    </div>
</div>
</form:form>
</body>
</html>
