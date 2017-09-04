package io.developer.contacts;

import java.io.File;
import java.util.Collections;

/**
 * Created by AjayMenon on 6/3/2017.
 */
public class ContactsUtil {
    private boolean checkIfHiddenFiles (String path) {
        File[] filesHidden = new File(path).listFiles(File::isHidden);
        if (filesHidden != null) {
            for (File file : filesHidden) {
                System.out.println(file.getName());
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContactsUtil contactsUtil = new ContactsUtil();
        contactsUtil.checkIfHiddenFiles("F:\\");

        System.out.println("current path : " + new File(".").getAbsolutePath());
    }
}
