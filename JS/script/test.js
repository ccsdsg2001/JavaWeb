// alert("hello");
// var i;
// i = 12;
// alert(typeof(i));
//
//定义一个无参函数
// function fun(){
//     alert("123")
// }
//函数调用才会执行
// fun();
// function fun2(a,b) {
//     alert("有参函数"+a+b);
// }
// fun2(12,"abc");
// //定义带有返回值的函数
// function d12(num1,num2){
//     var ab=num1+num2;
//     return ab;
// }
//
// alert(d12(1,2));

// var fun=function(){
//     alert("函数方式二")
// }
// fun();

//arguments可变长参数
// function sum(sum1,sum2){
//     var result=0;
//     for (var i=0;i<arguments.length;i++){
//         result+=arguments[i];
//     }
//     return result;
// }
// alert(sum(1,2,3,4,4));

//定义对象
var obj=new Object;
obj.ab="";
obj.fun =function (){

};
var object={
    name:1,
    age:2, //定义一个属性
    fun:function (){

    }//定义函数
};//定义对象第二种
alert(object.fun)






