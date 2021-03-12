<html>

<head>

    <style>
        .title {
            border-radius: 10px;
            margin-bottom: 10px;
            text-align: center;
            width: 210px;
            color: #ff4456;
            border: solid black 1px;
        }

        input[type="button"] {
            border-radius: 1px;
            background-color: rgb(6, 199, 141);
            color: black;
            width: 100%;
            height: 100%;
            border: none;
            font-size: large;
        }

        input[type="text"] {
            text-align: right;
            background-color: white;
            width: 100%;
            border: 1px solid black;
            height: 100%;
            font-size: large;
        }

        td {
            border: none;
        }

        tr {
            border: none;
        }

        table {
            width: 22%;
            height: 200px;
        }
    </style>

    <script type="text/javascript">
        let computationMap = new Map();
        class Calculator {
            _num1 = 0.0;
            _num2 = 0.0;
            constructor(num1, num2) {
                this._num1 = num1;
                this._num2 = num2;
            }
            set setNum1(value) {
                this._num1 = value;
            }
            set setNum2(value) {
                this._num2 = value;
            }
            get getNum1() {
                return this._num1;
            }
            get getNum2() {
                return this._num2;
            }
            get radian() {
                return this._num1*(Math.PI/180);
            }
            get getSum() {
                return this.getNum1 + this.getNum2;
            }
            get getSub() {
                return this.getNum1 - this.getNum2;
            }
            get getProduct() {
                return this.getNum1 * this.getNum2;
            }
            get getQuotient() {
            
                return this.getNum1 / this.getNum2;
            }
            addNumbers = function () {
                return this.getSum;
            }
            subtractNumbers = function () {
                return this.getSub;
            }
            multiplyNumbers = function () {
                return this.getProduct;
            }
            divideNumbers = function () {
                return this.getQuotient;
            }
        }

        class ScientificCalculator extends Calculator {
            powerOfNumber = function () {
                return this.getNum1 ** this.getNum2;
            }
        }
        class OneOperator extends Calculator{
            sine= function(){
                return Math.sin(this.radian);
            }
            cos=function(){
                return Math.cos(this.radian);
            }
            tan=function(){
                return Math.tan(this.radian);
            }
        }
       
          
        function showValueOrOperation(value) {
            try {
                if (isNaN(parseInt(value))) {
                    if (!computationMap.has("operator")) {
                        computationMap.set("operator", value);
                        console.log(value+" works");
                    }
                }
                else {
                    if (!computationMap.has("number1")) {
                        computationMap.set("number1", value);
                        console.log(value+" num1");
                    }
                    else {
                        computationMap.set("number2", value);
                        console.log(value+" num2");
                    }
                }
            }
            catch (error) {
                document.getElementById("calc-disply-value").value = "There's been an error";
                console.log(error);
            }
            finally {
                let displayValue = value;
                document.getElementById("calc-disply-value").value = displayValue;
            }
        }
        function getval(){
            var val = document.getElementById('calc-disply-value').value;
            doEmpty2();
            showValueOrOperation(val); 
            
        }
        function putval(val){
                let currentValue = document.getElementById("calc-disply-value").value;
                let displayValue = currentValue + val;
                document.getElementById("calc-disply-value").value = displayValue;
        }
        function backspace(){
            var val = document.getElementById('calc-disply-value').value;
            val = val.slice(0,val.length - 1);
            document.getElementById('calc-disply-value').value = val;
        //  showValueOrOperation();
            return false;
        }
        function doEmpty2(){
            
            document.getElementById("calc-disply-value").value = "";
            return ;
        }
        function doEmpty(){
            setTimeout(()=>{
            document.getElementById("calc-disply-value").value = "";
            },500);
            return ;
        }
        
        function Calulate() {
            let number2= parseFloat(computationMap.get("number2"));
            let operator = computationMap.get("operator");
            let number1=parseFloat(computationMap.get("number1"));
            let calculator = new Calculator(number1, number2);
            let scientificCalculator = new ScientificCalculator(number1, number2);
            let oneoperator =new OneOperator(number1);
            switch (operator) {
                case "+":
                    document.getElementById("calc-disply-value").value = "calculating...";
                    let promise = new Promise(
                        function (resolve, reject) {
                            setTimeout(
                                ()=>{
                                    var result = calculator.addNumbers();
                                    resolve(result);
                                }, 1000);
                        }).then(
                            function (result) {
                                console.log(result);
                                computationMap.get("number1") ?? computationMap.set("number1", result);
                                document.getElementById("calc-disply-value").value = result;
                            }
                        );
                    break;
                case "-":
                    var result = calculator.subtractNumbers();
                    
                    console.log(result);
                    document.getElementById("calc-disply-value").value = result;
                    computationMap.clear();
                    break;
                case "*":
                    var result = calculator.multiplyNumbers();
                    
                    console.log(result);
                    document.getElementById("calc-disply-value").value = result;
                    break;
                case "/":
                    var result = calculator.divideNumbers();
                    if(result=="Infinity"){
                        document.getElementById("calc-disply-value").value ="Cannot divide by 0";
                        break;
                    }
                                console.log(result);
                    document.getElementById("calc-disply-value").value = result;
                    break;
                case "**":
                    var result = scientificCalculator.powerOfNumber();
                    
                    console.log(result);
                    document.getElementById("calc-disply-value").value = result;
                    break;
                case "sin":
                    var result = oneoperator.sine();
                    
                    console.log(result);
                    document.getElementById("calc-disply-value").value = result;
                    break;
                case "cos":
                    var result = oneoperator.cos();
                    
                    console.log(result);
                    document.getElementById("calc-disply-value").value = result;
                    break;
                case "tan":
                    var result = oneoperator.tan();
                    
                    console.log(result);
                    document.getElementById("calc-disply-value").value = result;
                    break;
                case "pi":
                    var result=Math.PI;
                    console.log(result);
                    document.getElementById("calc-disply-value").value = result;
                    break;
            }
            computationMap.clear();
            computationMap.get("number1") ?? computationMap.set("number1", result);
        }
    </script>

</head>

<body>
    <table border="1">
        <tr>
            <td style="width:55px"><input type="button" value="**" onclick="getval(); doEmpty();showValueOrOperation('**');doEmpty();" /> </td>
            <td colspan="3"><input type="text" id="calc-disply-value" /></td>
        </tr>
        <tr>
            <td><input type="button" value="pi" onclick="putval(Math.PI)" /> </td>
            <td><input type="button" value="sin" onclick="showValueOrOperation('sin'); doEmpty();" /> </td>
            <td><input type="button" value="tan" onclick="showValueOrOperation('tan'); doEmpty();" /> </td>
            <td><input type="button" value="cos" onclick="showValueOrOperation('cos'); doEmpty();" /> </td>
        </tr>
        <tr>
            <td><input type="button" value="+" onclick=" getval(); showValueOrOperation('+'); doEmpty();" /> </td>
            <td><input type="button" value="1" onclick="putval('1')" /> </td>
            <td><input type="button" value="2" onclick="putval('2')" /> </td>
            <td><input type="button" value="3" onclick="putval('3')" /> </td>
        </tr>
        <tr>
            <td><input type="button" value="-" onclick="getval(); doEmpty();showValueOrOperation('-');doEmpty();" /> </td>
            <td><input type="button" value="4" onclick="putval('4')" /> </td>
            <td><input type="button" value="5" onclick="putval('5')" /> </td>
            <td><input type="button" value="6" onclick="putval('6')" /> </td>
        </tr>
        <tr>
            <td><input type="button" value="*" onclick="getval(); doEmpty();showValueOrOperation('*');doEmpty();" /> </td>
            <td><input type="button" value="7" onclick="putval('7')" /> </td>
            <td><input type="button" value="8" onclick="putval('8')" /> </td>
            <td><input type="button" value="9" onclick="putval('9')" /> </td>
        </tr>
        <tr>
            <td><input type="button" value="/" onclick="getval(); doEmpty();showValueOrOperation('/');doEmpty();" /> </td>
            <td><input type="button" value="." onclick="putval('.')" /> </td>
            <td><input type="button" value="0" onclick="putval('0')" /> </td>
            <td><input type="button" value="<" onclick="backspace()" /></td>
        </tr>
        <tr>
            <td colspan="4"><input type="button" value="Calculate" onclick="getval();Calulate();" /> </td>
        </tr>
    </table>
</html>