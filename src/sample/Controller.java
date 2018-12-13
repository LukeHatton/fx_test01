package sample;

import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Button btn_sendRequest;
    public Button btn_showText;

    public void onClick(MouseEvent mouseEvent) {
        // TODO: 2018/12/13 发送http请求
    }

    public void onClick2(MouseEvent mouseEvent) {
        System.out.println("显示一行文本");
    }
}
