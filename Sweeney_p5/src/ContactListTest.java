import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import jdk.internal.jimage.ImageStrings;
import jdk.nashorn.internal.objects.AccessorPropertyDescriptor;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactListTest {

    @Test
    public void addingItemsIncreasesSize()  {
        ContactList contactList = new ContactList();
        //ArrayList<ContactItem> contactList = null;

        String fName = "Logan";
        String lName = "Sweeney";
        String phone = "111-867-5309";
        String email = "abc@123.com";

        InputStream first = new ByteArrayInputStream(fName.getBytes());
        InputStream last = new ByteArrayInputStream(lName.getBytes());
        InputStream _Phone = new ByteArrayInputStream(phone.getBytes());
        InputStream _Email = new ByteArrayInputStream(email.getBytes());

        //ContactList.addTask();


        
        

        assertEquals(1, contactList);

    }
    @Test
    public void editingItemsFailsWithAllBlankValues(){}
    @Test
    public void editingItemsFailsWithInvalidIndex(){}
    @Test
    public void editingSucceedsWithBlankFirstName(){}
    @Test
    public void editingSucceedsWithBlankLastName(){}
    @Test
    public void editingSucceedsWithBlankPhone(){}
    @Test
    public void editingSucceedsWithNonBlankValues(){}
    @Test
    public void newListIsEmpty(){}
    @Test
    public void removingItemsDecreasesSize(){}
    @Test
    public void removingItemsFailsWithInvalidIndex(){}
    @Test
    public void savedContactListCanBeLoaded(){}

}
