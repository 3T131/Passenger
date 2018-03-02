package zeliang;

import com.accp.biz.StayRegisterBiz;
import com.accp.biz.impl.StayRegisterBizImpl;
import com.accp.entity.StayRegister;

import java.util.List;

public class test1 {
    public static void main(String[] args) {
        StayRegisterBiz stayRegisterBiz=new StayRegisterBizImpl();
        List<StayRegister> stayRegisterList = stayRegisterBiz.listByParam(new StayRegister());
        for (StayRegister stayRegister:stayRegisterList){
            System.out.println(stayRegister.toString());
        }
    }
}
