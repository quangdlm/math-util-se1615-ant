/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denguang.mathutil.core.test;

import com.denguang.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author DangTuan
 */
public class MathUtilTest {
    
//    @Test
//    public void testGreen(){
//        Assert.assertEquals(10, 10);
//
//    }
//    @Test
//    public void testRed(){
//        Assert.assertEquals(10, 100); //em hy vọng anh trả về 10
//                                        // thực tês anh là mấy
//                                        // thực tê là 10 -> xanh
//                                        // thực tế là mấy -> Đỏ 
//
//    }
    @Test
    //@Test la anotation để báo với JVM biết rằng hàm này là hàm main() và chạy code trong hàm này
    //Nếu thiếu @Test trước hàm thì JUNIT không vận hành
    //TEST CASE 1: n = 0, expected = 1
    //TEST CASE 2: n = 1, expected = 1
    //TEST CASE 3: n = 2, expected = 2
    //TEST CASE 4: n = 3, expected = 6
    public void testFactorialGivenRightArgumentReturnWell(){
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
    }
    @Test
    //TEST CASE #5: 4! Expected 24, actual = ?
    //TEST CASE #6: 5! Expected 120, actual = ?
     public void testFactorialGivenRightArgumentReturnWellv2(){

        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }
    
     //Bắt exception thì sao?
     //TEST CASE #7: -5! Expected = Hy vọng được thấy ngoại lệ được ném ra
     //Nếu -5 đưa vào hàm thì phải thấy ngoại lệ xuất hiện
     //Nếu ngoại lệ xuất hiện khi tính -5 thì hàm chạy đúng như thiết kế
     //Do ngoại lệ không phải là value để so sánh -> cách viết sẽ khác 1 tý
     // Khi chạy hàm này, -5!, expected = illegalArgumentException.class
     //Nghĩa là có sự xuaats hiện của 1 obj thuộc class IllegalArgument
//     @Test(expected = Exception.class)//không tốt vì bắt chung chung exception
     @Test(expected = IllegalArgumentException.class)// cụ thể
     public void testFactorialGivenWrongArgumentThrowsException(){
         MathUtil.getFactorial(-5);
     }
}
