/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denguang.mathutil.core.test;

import static com.denguang.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//import static ... tên class.tên hàm; thì sau này khi gọi hàm static thì bỏ luôn tên class. (đã hiểu ngầm tên class)
//code gọi như C
// .* là lấy hết các tên hàm trong class đó

/**
 *
 * @author DangTuan
 */

//KĨ THUẬT DDT - DATA DRIVE TESTING; TDD - TEST DRIVEN DEVELOPMENT
// tránh nhầm lẫn
//DDT là kỹ thuật tổ chức các test case cho gọn gàng
//Tách các câu lệnh kiểm thử và bộ data dùng để test riêng ra 2 nơi
// phiên bản test củ đang trộn data test vầ gọi hàm lẫn lộn với nhau, không sai nhugnw nhìn không rõ ràng

// nếu ta muón test hàm getF() với giá trị đầu vào cvà có  trả về đầu ra mong đợi hay không, kiểu như:
//0 -> 1
//1 -> 1
//2 -> 2
//3 -> 6
//4 -> 24
//5 -> 120
//6 -> 720
// có chổ nào định nghĩa riêng data này thì ta sẽ dễ dàng cảm nhận data này đã đủ hay chưa
// để lát hồi ta nhồi đám data này vào hàm assertEquals với bên trong là getF(?) thì cảm giác viết code để test app nhìn nó rõ ràng hơn
// -> tham số hóa
// kỹ thuật đẩy data test ra chổ khác để lát nhồi vào chổ gọi hàm -> kỹ thuật này gọi là DDT, viêts test case theo kiểu
// hướng data cho dễ đọc, còn gọi là PARAMETERIZED TESTING
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //chuẩn bị data để nhồi vào hàm test
    // quy ước hàm khởi tạo data phải là static - nằm cố định ở trong ram để object nào cũng thấy dc
    @Parameterized.Parameters
    public static Object[][] initData(){
        return new Integer[][] {
                                {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120},
                                {6,7200}
                                };
    }
    @Parameterized.Parameter(value = 0)//MAP BIẾN NÀY VÀO CỘT 0
    public int n;
    
    @Parameterized.Parameter(value = 1)//MAP BIẾN NÀY VỚI CỘT 1
    public long expected; // 2 biến này sẽ map vào 2 cột tượng ứng của hàm ở trên, 
                          //initData sau đó ta nhồi 2 biên này vào trong hàm assertEquals() như cũ
    
    @Test // xài data từ 2 biến trên vf hạy data
    public void testFactorialGivenRightArgumentReturnWell(){
        assertEquals(expected, getFactorial(n));
    }
}

//KẾT LUẬN, XANH KHI TẤT CẢ CÙNG XANH
// ĐỎ CHỈ CẦN 1 CASE ĐỎ, TẤT CẢ COI NHƯ ĐỎ
//XANH: MỆNH ĐỀ AND
//ĐỎ: MỆNHD ĐỀ OR

//LÝ DO: HÀM GỌI LÀ ĐÚNG THÌ PHẢI ĐÚNG HẾT VỚI TẤT CẢ CÁC CASE
//      HÀM CÓ 1 THẰNG SAI, ĐÁM CÒN LẠI ĐÚNG/XANH, HÀM KHÔNG ỔN ĐỊNH
//      DO CÓ 1 THẰNG SAI -> KẾT LUẬN CHUNG HÀM LÀ SAI
//  --> CHỈ CẦN 1 THẰNG ĐỎ -> CODE KHÔNG ỔN ĐỊNH -> KHÔNG ỔN ĐỊNH -> PHẢI SỬA CHO XANH -> 
//CỐT LỖI CỦA TÍCH HỢP LIÊN TỤC - COUNTINOUS INTEGRATION
