<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 21/04/2024
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hotel sunset paradise</title>
    <link rel="icon" href="https://i.ibb.co/hFYdn7p/light-logo.png" >
    <!-- bootstrap css link -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <!-- Font awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer">
    <!-- Css link -->
    <style><%@ include file="css/style.css" %></style>


    <link rel="stylesheet" href="css/style.css">
    <!-- BOX ICONS  -->
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>

</head>
<body>
<div id="booking" class="section">
    <div class="section-center">
        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <div class="booking-cta">
                        <h1>Make your reservation</h1>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Cupiditate laboriosam numquam at</p>
                    </div>
                </div>
                <div class="col-md-6 col-md-offset-1">
                    <div class="booking-form">
                        <form>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <input class="form-control" type="text">
                                        <span class="form-label">Name</span>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <input class="form-control" type="email">
                                        <span class="form-label">Email</span>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <input class="form-control" type="tel">
                                        <span class="form-label">Name</span>
                                    </div>
                                </div>
                                <div class="col-md-3 col-sm-6">
                                    <div class="form-group">
                                        <label for="inputAType"></label>
                                        <span class="form-label">Rooms</span>
                                        <select class="form-control">
                                            <option>Suite</option>
                                            <option>Room</option>

                                        </select>
                                        <span class="select-arrow"></span>
                                    </div>
                                </div>
                                <div class="col-md-3 col-sm-6">
                                    <div class="form-group">
                                        <span class="form-label">Guests</span>
                                        <select class="form-control">
                                            <option>1 Person</option>
                                            <option>2 People</option>
                                            <option>3 People</option>
                                        </select>
                                        <span class="select-arrow"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="CheckIn"></label>
                                        <input class="form-control" type="date" required>
                                        <span class="form-label">Check In</span>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="CheckOut"></label>
                                        <input class="form-control" type="date" required>
                                        <span class="form-label">Check Out</span>
                                    </div>
                                </div>
                            </div>
                            <div class="form-btn">
                                <button class="submit-btn">Book Now</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>




<div class="rounded m-5 check-availabilty" id="next">
    <form id="formCheck" method="post" action="searchavailableroom" class="form-checking row" >
        <div class="col-md-2 mb-2">
            <label for="CheckIn">Check In</label>
            <input class="form-control mt-1" type="date" id="start" name="checkIn" value="2024-04-19" min="2024-01-01" max="2030-12-31" />
        </div>
        <div class="col-md-2 mb-2 ">
            <label for="CheckOut">Check In</label>
            <input class="form-control mt-1" type="date" id="End" name="checkOut" value="2024-04-19" min="2024-01-01" max="2030-12-31" />
        </div>
        <div class="col-md-2 mb-2">
            <label for="inputAType">Type</label>
            <select class="form-control mt-1" id="roomType" name="inputType">
                <option value="Room">Room</option>
                <option value="Suite">Suite</option>
            </select>
        </div>
        <div class="col-md-1 mb-2">
            <label for="inputAdulte">Adults</label>
            <select class="form-control mt-1" id="inputAdults" name="adults">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5+</option>
            </select>
        </div>
        <div class="col-md-1 mb-2">
            <label for="inputChildrens">Childrens</label>
            <select class="form-control mt-1" id="inputChildrens" name="childrens">
                <option value="0">0</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4+</option>
            </select>
        </div>
</body>
</html>
