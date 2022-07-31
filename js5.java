<html>

<head>
    <style>
        div.static {
            position: static;
            left: 30px;
            border: 3px solid green;
        }

        div.fixed {
            position: fixed;
            bottom: 0;
            right: 0;
            width: 200px;
            border: 3px solid #73AD21;
        }

        div.relative {
            position: relative;
            width: 400px;
            height: 100px;
            border: 3px solid #73AD21;
        }

        div.absolute {
            position: absolute;
            top: 80px;
            right: 0;
            width: 200px;
            height: 100px;
            border: 3px solid #73AD21;
        }

        div.sticky {
            position: -webkit-sticky;
            position: sticky;
            top: 0;
            background-color: green;
            border: 2px solid #4CAF50;
        }


        span {
            display: grid;
        }

        div {
            background-color: lightgray;
            width: 400px;
            border: 20px solid green;
            padding: 20px;
            margin-left: 100px;
            margin-top: 150px;
            margin-bottom: 150px;
            margin-right: 150px;
        }
    </style>
</head>

<body>
    <h1 style="color:blue; text-align:center">please scroll to see the result.</h1>
    <div>
        <p style="text-align:right ;color:royalblue">item name:<i><span style="color:black;">chicken fry</span></i></p>
        <p style="text-align:right ;color:royalblue">cost:<i><span style="color:black;">500</span></i></p>
        <p style="text-align:right ;color:royalblue">Quantity:<i><span style="color:black;">250 g</span></i></p>

        <img src="https://tse4.mm.bing.net/th?id=OIP.Xd7HBpgkrZ4_2DKtj6pYdAHaLI&pid=Api&P=0.jpg" alt="here is an image"
            width="200" height="100" image-align:"top-left">
    </div>
    <div class="sticky">this is sticky</div><br>
    <div class="static">this is static </div><br>
    <div class="relative">
        <h1>this is relative and can have scroll bar so please scrolll.</h1>
    </div><br>
    <div class="absolute">this is absolute</div>
    <div class="fixed">this is the fixed</div><br>
</body>

</html>