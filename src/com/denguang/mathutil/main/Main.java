/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denguang.mathutil.main;

import com.denguang.mathutil.core.MathUtil;

/**
 *
 * @author DangTuan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //kỹ thuật 1, dùng mắt luận kết quả - manual test
        //gọi hàm với các giá trị đầu vào chuẩn bị sẵn ở test case, in ra kết quả và dùng mắt luận đúng sai Expected và Actual
        //in ra kết quả xử lí của hàm theo
        //-sout()
        // log file (Java Web)
        // - popup kết quả xử lí (windows form/Destop app,.. output ra trang web

        //Kĩ thuật manual test dùng sout() -> xuất ra kết quả
        //TEST CASE #1: input n = 0; expect == 0! == 1; thực tế là mấy, đoán xem
        long expectedValue = 1;// hy vọng hàm trả về 1
        long actual = MathUtil.getFactorial(0);
        System.out.println("Test 0!: expected = " + expectedValue
                + " | actual = " + actual);

        //TEST CASE #2: input n = 1; expected == 1! == 1
        expectedValue = 1;// hy vọng hàm trả về 1
        actual = MathUtil.getFactorial(1);
        System.out.println("Test 1!: expected = " + expectedValue
                + " | actual = " + actual);
        
        //TEST CASE #3: input n = 5; expected == 5! == 120
        expectedValue = 120;// hy vọng hàm trả về 120
        actual = MathUtil.getFactorial(5);
        System.out.println("Test 5!: expected = " + expectedValue
                + " | actual = " + actual);
        
        //TEST CASE #4: input n = -5; expected == hy vong bị chửi... between 1 to 20
        System.out.println("See the Illegal Argument Exception if n = -5");
        MathUtil.getFactorial(-5);
        
        //VIỆC KẾT LUẬN HÀM ĐÚNG HAY SAI THÌ MẮT TA PHẢI DUYỆT QUA TỪNG CẶP EXPECTED CÓ == ACTUAL HAY KHÔNG
        // VÀ DUYỆT HẾT THÌ MỚI GIÁM KÊT LUẬN, MẤT SỨC VÀ DỄ SAI SOÁT NẾU CÓ NHIỀU CASE TEST KHÁC NHAU
        //NẾU MÁY LÀM GIÙM LUÔN PHẦN MẤT SỨC NÀY -> TEST AUTOMATION
        //MÁY QUÉT QUA HẾT CÁC CẶP EXPECTED VÀ ACTUAL VÀ CHỐT DEAL 1 CÂU
        //ĐÚNG, SAI
        //NHỜ TRÒ NÀY -> TỰ ĐỘNG HÓA ĐƯỢC VIỆC KIỂM SOÁT CHẤT LƯƠNG CODE
        //THẰNG DEV NÀO MÀ SỬA CODE, ÔNG CHỈ QUÉT QUA 1 LƯỢT -> KẾT LUẬN LUÔN
        // LÕI CỦA CI - COUNTINUOUS INTEGRATION - TÍCH HỢP LIÊN TỤC

    }
    // để test 1 hàm 1 method hoặc 1 class có những cách thức cụ thể sau:
//        1. TEST dùng mắt, trâu bò, manual, test dùng mắt để luận kết quẩ đúng sai
//            - Cách truyền thống

    //2. Dùng mắt xem 2 mã màu xanh đỏ là đủ
//    - Xanh hàm đúng, đỏ hàm sai (so sánh: Expected và Actual)
//    - Test Automation; kĩ thuật hiện đại hơn, đỡ dùng sức hơn để luận kết quả
}
