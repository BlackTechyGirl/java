package chiefsClass;

public class Native {
    private String firstName;
    private String lastName;
    private String NativeId;

    public Native() {
    }
    public Native(String firstName) {
        this.firstName = firstName;
    }

    public Native(String firstName, String surName) {
        this(firstName);
        surName =lastName;
    }
    public Native(String firstName, String lastName, String nativeId){
        this(firstName,lastName);

    }

//    public Native findNative(Native[] natives) {
//        return
//    }
}
