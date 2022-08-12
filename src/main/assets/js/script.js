function reverseArrayOfNumbers(arr){

    let reverseArray = [];
    
    for (let i = arr.length - 1 ; i >= 0 ; i--){
    
    let numberFromArray = arr[i]
    
    reverseArray.push(numberFromArray);
    
    }
    
    return reverseArray
    
}



$("ul").on("click", "li",function(){

    var acc = 0;
    var acctwo = 0;
    var word = $(this).children('.panel').children('.watebottle').text();
    var arr = new Array();
    sessionStorage.removeItem("C" + word)
    sessionStorage.removeItem("K" + word)
    sessionStorage.removeItem("F" + word)
    sessionStorage.removeItem("P" + word)

    

    

    $(this).remove()

})

$(document).ready(function(){
    sessionStorage.clear();
    sessionStorage.setItem("C"+"Ex", 240);
    sessionStorage.setItem("K"+"Ex", 25);
    sessionStorage.setItem("F"+"Ex", 10);
    sessionStorage.setItem("P"+"Ex", 15);
})



$("ul").on("click", "span",function(){
    $(this).parent().fadeOut(200, function(){
        $(this).remove()
    })
    event.stopPropagation
})

$("#butt").bind('click', function(){
    valid=true;
    if ($('#name').val() == ""){
        alert("Please Enter Proper Name");
        valid=false;
        return 0;
    } else if ($('#Cal').val() == ""){
        alert("Enter Valid Calorie Number");
        valid=false;
        return 0;
    } else if ($('#Carb').val() == ""){
        alert("Enter Valid Carbs Number");
        valid=false;
        return 0;
    } else if ($('#Fat').val() == ""){
        alert("Enter Valid Fats Number");
        valid=false;
        return 0;
    }else if ($('#Protein').val() == ""){
        alert("Enter Valid Protein Number");
        valid=false;
        return 0;
    } else{

        var N = $('#name').val();
        var C = $('#Cal').val();
        var cc = $('#Carb').val();
        var F = $('#Fat').val()
        var P = $('#Protein').val();

        //alert(parseFloat(document.getElementById('CF').innerHTML) + parseFloat(C) )

        sessionStorage.setItem("C"+N, C);
        sessionStorage.setItem("K"+N, cc);
        sessionStorage.setItem("F"+N, F);
        sessionStorage.setItem("P"+N, P);

        
        //$('#CF').text(parseFloat(document.getElementById('CF').innerHTML) + parseFloat(C) )
        //$('#ccF').html(parseFloat(document.getElementById('ccF').innerHTML) + parseFloat(cc) )
        //$('#CF').html(parseFloat(document.getElementById('FF').innerHTML) + parseFloat(F) )
        //$('#CF').html(parseFloat(document.getElementById('PF').innerHTML) + parseFloat(P) )
        
        
        
        

        $("ul").append("<li><div class="+"panel"+"><span> ~ </span><p class="+"watebottle"+" >"+N+"</p> <div class='"+"Stats"+" "+"pro'"+">Protein:<div class="+"num"+">"+P+"</div></div> <div class='"+"Stats"+" "+"fat'"+">Fats:<div class="+"num"+">"+F+"</div></div> <div class='"+"Stats"+" "+"carb'"+">Carbs:<div class="+"num"+">"+cc+"</div></div> <div class='"+"Stats"+" "+"cal'"+">Calories:<div class="+"num"+">"+C+"</div></div> </div></li>")

        return 1;
    } 
    
})

$("#bbbb").bind('click', function(){

    var counter = 0;
    var C = 0;
    var K = 0;
    var F = 0;
    var P = 0;

    for (let i = 0; i < sessionStorage.length; i++) {
        if(sessionStorage.key(i).charAt(0) == "C"){
            counter = counter + 1;
            C = parseFloat(C) + parseFloat(sessionStorage.getItem(sessionStorage.key(i)));
        }else if(sessionStorage.key(i).charAt(0) == "K"){
            K = parseFloat(K) + parseFloat(sessionStorage.getItem(sessionStorage.key(i)));
        }else if(sessionStorage.key(i).charAt(0) == "F"){
            F = parseFloat(F) + parseFloat(sessionStorage.getItem(sessionStorage.key(i)));
        }else if(sessionStorage.key(i).charAt(0) == "P"){
            P = parseFloat(P) + parseFloat(sessionStorage.getItem(sessionStorage.key(i)));
        }
        
    }
      
    $("#CF").text(C);
    $("#ccF").text(K);
    $("#FF").text(F);
    $("#PF").text(P);



})