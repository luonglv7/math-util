/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luonglv.mathutil.test;

import com.luonglv.mathutil.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {
    @Test //bien ham nay thanh main va f6 de chay
    //ta chi can nhin mau ma khong can so sanh bang mat
    public void testFactorialRighArgumentRunWell(){
        long expected = 120;
        int n = 5;
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual);
        
        // tui sẻ test các tình huống còn lại
        
        assertEquals(720, MathUtility.getFactorial(6)); //6! có bằng 720 ko?
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
         //0! là 1 tình huống cần test
         //1! CŨNG LÀ 1 TÌNH HUỐNG KHÁC
         //Tình Huống: TEST CASE. NGHỀ TESTER LÀ NGHỀ TẠO RA TÌNH HUỐNG TEST(TEST CASE) SAU ĐÓ THỬ NGHIỆM.
         
    }   //kì vọng sai, tính đúng --> đỏ
        //kì vọng đúng, tính sai --> đỏ
    
    //equivalent partitioning: phân vùng tương đương.
    
    //ta test xem phần ngoại lệ - exception
    //Exception ko phải là 1 value để so sánh. Nó là 1 tình huống bất thường xảy ra trong app, trông code khi app chạy
    //VD: lỗi trong SQL trùng key ,sai khoá ...
    //Đối với EXCEPTION chỉ có thể đo nó bằng câu: MÀY CÓ XUẤT HIỆN KHÔNG?
    //KHÔNG DÙNG assertEquals() để so sánh.
    //trong thiết kế thì nếu đưa n <0 và n>21 thì hàm sai;
    //thì hàm ném ra và new 1 ngoài lệ
    //cứ đưa n ngoại lệ thì có exception.
    //vậy nếu ngoại lệ xảy ra khi đưa n >0 và n>21
    //Có nghĩa rằng hàm chạy đúng , thấy ngoại lệ ta lại ăn mừng vì chạy như thiết kế.
    
    //Sẻ có test case, tình huống test:
    
    @Test(expected = IllegalArgumentException.class)
    
    public void testFactorialGivenWrongArgumentThrowException(){
        MathUtility.getFactorial(30); // phải xuất hiện execption
        MathUtility.getFactorial(-10); // phải xh excepttion
        MathUtility.getFactorial(21); // phải xh excepttion
        MathUtility.getFactorial(40); // phải xh excepttion
        
        //nếu xuất hiện exception như kì vọng thì phải xanh
        // vì màu xanh là hàm chạy như thiết kế nếm ngoại lệ khi đưa n cà chớn
        //Ta cần KĨ THUẬT ĐỂ BẮT NGOẠI LỆ, ĐÚNG NGOẠI LỆ CẦN BẮT THÌ TA CÓ XANH.
    }
    
}


//quy ước Xanh: nếu tất cả các lời gọi hàm đều trả ra đúng kết quả đúng như kỳ vọng thì có màu xanh
//quy ước Đỏ: chỉ cần 1 lời gọi hàm trả ra kết quả không mong muốn thì có màu đỏ.
//HƯỚNG TEST: đã test thì phải test đúng cho các trường hợp
//Không chơi trò: hầu hết làm đúng.