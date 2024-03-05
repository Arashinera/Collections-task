package app;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> userList = UserList.newUserList();
        UserListView.showUserList(userList);
    }
}
