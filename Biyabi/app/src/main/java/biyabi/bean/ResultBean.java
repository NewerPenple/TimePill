package biyabi.bean;

import java.io.Serializable;
import java.util.Arrays;

public class ResultBean implements Serializable {
    private HomeItemBean[] result;

    public HomeItemBean[] getResult() {
        return result;
    }

    public void setResult(HomeItemBean[] result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "result=" + Arrays.toString(result) +
                '}';
    }
}
