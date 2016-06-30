package biyabi.bean;

import java.io.Serializable;
import java.util.Arrays;

public class HomeItemBean implements Serializable {
    private String modelType;
    private HomeItemResultBean[] result;
    private String title;

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public HomeItemResultBean[] getResult() {
        return result;
    }

    public void setResult(HomeItemResultBean[] result) {
        this.result = result;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "HomeItemBean{" +
                "modelType='" + modelType + '\'' +
                ", result=" + Arrays.toString(result) +
                ", title='" + title + '\'' +
                '}';
    }
}
