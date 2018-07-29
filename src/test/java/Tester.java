import bean.Area;
import com.google.gson.Gson;
import org.junit.Test;
import services.QuanGuoGGZYService;

import java.util.List;

public class Tester {

    @Test
    public void t (){
        List<Area> areas = new QuanGuoGGZYService().getAllArea();

        System.out.println(new Gson().toJson(areas));
    }
}




