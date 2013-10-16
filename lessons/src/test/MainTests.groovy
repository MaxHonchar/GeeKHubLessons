package test

import ua.max.test.modal.User

/**
 * Created with IntelliJ IDEA.
 * User: Max
 * Date: 16.10.13
 * Time: 0:52
 * To change this template use File | Settings | File Templates.
 */
class MainTests extends GroovyTestCase {

    void testIsUser() {
        String name = "Max";
        String surname = "Honchar";
        def user = new User(name, surname);
        def userList = [name: name, surname: surname, user: user];
        assert userList instanceof java.util.Map: "this value isn't Map";
        assert userList.containsValue(user);
    }

    void testUserListSizeAndContainsElement() {
        def userMap = [];
        assert userMap.size() == 0: "list is not empty";
        def range = 0..5;
        range.each {
            userMap.add(new User(name: "Max$it", surname: "Honchar"));
        }
        assert userMap.get(3).name == "Max3": "this element doesn't exist in list";
    }

    void testEqualsUser() {
        String name = "Bruce";
        String surname = "Wayne";
        User userFirst = new User(name, surname);
        name = "Batman"
        User userSecond = new User(name, "");
        assertFalse(userFirst.equals(userSecond));
    }


}


