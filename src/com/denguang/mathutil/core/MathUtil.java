/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denguang.mathutil.core;

/**
 *
 * @author DangTuan
 */
//Clss nay se chua cac ham static laf tien ich dung chung cho cac class khac

public class MathUtil {
    //ham tinh n! = 1.2.3...n
    //0! = 1! quy uoc
    //vi gia thua tang cuc nhanh, 21! tran kiem long (18 so 0)
    // khong co giai thua am
    //quy uoc: n nhan vao tu 0-20
    public static long getFactorial(int n){
        
        if (n <0 || n>20) 
            throw new IllegalArgumentException("Invalid argument. n must be between 0 to 20!");
        
        long product = 1; // tích khởi đầu luôn luôn là 1, biến tích lũy acc
        if (n == 0 || n == 1)
            return 1; // tinh luon
        
        for (int i = 2; i <= n; i++) 
            product*=i;// product = product * i;
        return product;
    }
    
    // tu duy viet code theo kieu doi laf TDD v - TEST Driven Development
    //hamf cuar ta getfactorial n đauw vào và trả về n!
    // ta suy nghĩ luôn tình huống kiểm thử - Test Case
    //TEST - CASE: 1 tình huống ta xài app, tức là đưa data đầu vào và chờ app trả kết quả -> so sánh đúng kỳ vọng hay không
    // TDD là kỹ thuật viết code phải song song đó là vửa viết code vừa suy nghĩ luôn các test case kiểm thử
    
    //Case 1: n = 0, expected == getFactorial(0)==1
    //Case 2: n = 1, expected == getFactorial(1)==1
    //Case 3: n = 2, expected == getFactorial(2)==2
    //Case 4: n = 3, expected == getFactorial(3)==6
    //Case 4: n = 4, expected == getFactorial(4)==24
    //Case 5: n = 5, expected == getFactorial(5)==120
    //Case ...: n = 21, expected == getFactorial(21)== Ngoại lệ vì n! quá lơn, không lưu trong long dc
    //Case ...: n < 0 , expected == getFactorial(-5)== Ngoại lệ vì n! không tồn tại,
}
