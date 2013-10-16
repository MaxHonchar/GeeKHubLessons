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
    void testUserListSize() {
        def userList = [];
        assert userList.size() == 0 : "list is not empty";
        def range = 0..5;
        range.each { it ->
            userList.add(new User(name: "Max$it", surname: "Honchar"));
        }

        assert userList.get(3).name == "Max3":"this element doesn't exist in list";


    }
}


