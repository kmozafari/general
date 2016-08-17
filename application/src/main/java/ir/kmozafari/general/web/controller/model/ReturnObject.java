package ir.kmozafari.general.web.controller.model;

/**
 * Created by k.mozafari on 08/17/2016.
 */
public class ReturnObject {

    private boolean success;
    private Object data;

    public ReturnObject(Object data) {
        this.success = true;
        this.data = data;
    }

    public ReturnObject(boolean success, Object data) {
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
