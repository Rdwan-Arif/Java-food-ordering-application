/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251.project;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leo0x
 */
public class MenuandcartTest {
    
    public MenuandcartTest() {
    }

    /**
     * Test of main method, of class Menuandcart.
     */
    @Test
    public void Mutli() {
        // test for single beef burger
       assertEquals(60,database.Mutli(5,12));
       // test for double beef burger
       assertEquals(80,database.Mutli(5, 16));
    }
    
}
