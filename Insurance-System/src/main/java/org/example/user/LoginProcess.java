package org.example.user;

import java.util.Map;
import org.example.common.AuthGuideMessage;
import org.example.view.SystemView;

public class LoginProcess implements Process {

    private final CustomerManager customerManager;
    private final WorkerManager workerManager;

    public LoginProcess(CustomerManager customerManager, WorkerManager workerManager) {
        this.customerManager = customerManager;
        this.workerManager = workerManager;
    }

    @Override
    public User execute(SystemView systemView) {
        try {
            Map<String, String> loginInfo = systemView.getLoginInfo();
            User user = login(loginInfo);
            systemView.successLogin();
            return user;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private User login(Map<String, String> loginInfo) {
        String id = loginInfo.get(AuthGuideMessage.AUTH_ID_KEY);
        String password = loginInfo.get(AuthGuideMessage.AUTH_PASSWORD_KEY);
        return isExistUser(id, password);
    }

    private User isExistUser(String id, String password) {
        if (workerManager.isExistByIdAndPassword(id, password)) {
            return workerManager.findByIdAndPassword(id, password).get();
        }
        if (customerManager.isExistByIdAndPassword(id, password)) {
            return customerManager.findByIdAndPassword(id, password).get();
        }
        throw new IllegalArgumentException("아이디 또는 비밀번호가 틀렸습니다");
    }
}
