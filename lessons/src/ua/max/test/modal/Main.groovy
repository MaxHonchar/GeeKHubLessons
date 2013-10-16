package ua.max.test.modal

/**
 * Created with IntelliJ IDEA.
 * User: Max
 * Date: 15.10.13
 * Time: 1:08
 * To change this template use File | Settings | File Templates.
 */

def surname = "Honchar";
String name = "Max";
surname = "$surname";
User user = new User(name: name, surname: surname);
println user;