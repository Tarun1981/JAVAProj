package test;

import main.Adjustment;
import main.Msg;
import main.MsgProcessor;
import main.Operation;
import main.Products;
import main.Sale;

import java.util.*;
import org.junit.*;

public class TestMessageProcessor {

	@Test
	public void testMsgProcessorForMoreThan50Msgs() {
		List<Msg> messages = createMsgList();
		MsgProcessor mp = new MsgProcessor();
		
		for(Msg message : messages) {
			mp.processor(message);
		} 
		Assert.assertEquals(mp.messageSize, 51);
		
	}
		
	List<Msg> createMsgList(){
		
		List<Msg>  messages = new ArrayList<>();
		
		  Msg message1 = new Msg(new Sale(Products.APPLE, 10), 1);
		  Msg message2 = new Msg(new Sale(Products.APPLE, 10), 15);
		  Msg message3 = new Msg(new Sale(Products.Apricot, 15), 5);
		  Msg message4 = new Msg(new Sale(Products.Apricot, 15), 10);
		  Msg message5 = new Msg(new Sale(Products.PEAR, 15), 3);
		  Msg message6 = new Msg(new Sale(Products.PEAR, 15), 20);
		  Msg message7 = new Msg(new Sale(Products.PEAR, 15), 20 , new Adjustment(Operation.ADD , 5));
		  Msg message8 = new Msg(new Sale(Products.Apricot, 10), 10 , new Adjustment(Operation.SUBSTRACT , 10));
		  Msg message9 = new Msg(new Sale(Products.Avocado, 2), 1);
		  Msg message10 = new Msg(new Sale(Products.Avocado, 2), 15);		 
		  Msg message11 = new Msg(new Sale(Products.Apricot, 10), 1);
		  Msg message12 = new Msg(new Sale(Products.APPLE, 10), 2);
		  Msg message13 = new Msg(new Sale(Products.PEAR, 15), 5);
		  Msg message14 = new Msg(new Sale(Products.Apricot, 10), 8);
		  Msg message15 = new Msg(new Sale(Products.Avocado, 2), 3);
		  Msg message16 = new Msg(new Sale(Products.PEAR, 15), 20);
		  Msg message17 = new Msg(new Sale(Products.PEAR, 20), 10 , new Adjustment(Operation.ADD , 5));
		  Msg message18 = new Msg(new Sale(Products.Apricot, 15), 10 , new Adjustment(Operation.MULTIPLY , 2));
		  Msg message19 = new Msg(new Sale(Products.APPLE, 15), 20 , new Adjustment(Operation.ADD , 5));
		  Msg message20 = new Msg(new Sale(Products.Avocado, 10), 10 , new Adjustment(Operation.MULTIPLY , 5));
		  
		  Msg message21 = new Msg(new Sale(Products.Banana, 5), 1);
		  Msg message22 = new Msg(new Sale(Products.PLUM, 4), 2);
		  Msg message23 = new Msg(new Sale(Products.MANGO, 12), 5);
		  Msg message24 = new Msg(new Sale(Products.Banana, 5), 8);
		  Msg message25 = new Msg(new Sale(Products.MANGO, 12), 15);
		  Msg message26 = new Msg(new Sale(Products.PLUM, 4), 20);
		  Msg message27 = new Msg(new Sale(Products.Banana, 8), 10 , new Adjustment(Operation.ADD , 3));
		  Msg message28 = new Msg(new Sale(Products.PLUM, 3), 15 , new Adjustment(Operation.SUBSTRACT , 1));
		  Msg message29 = new Msg(new Sale(Products.MANGO, 10), 30 , new Adjustment(Operation.SUBSTRACT , 2));
		  Msg message30 = new Msg(new Sale(Products.PEAR, 20), 10 );
		  Msg message31 = new Msg(new Sale(Products.Apricot, 15), 10 );
		  Msg message32 = new Msg(new Sale(Products.APPLE, 15), 5 );
		  Msg message33 = new Msg(new Sale(Products.Avocado, 10), 10 );
		  Msg message34 = new Msg(new Sale(Products.Banana, 8), 10);
		  Msg message35 = new Msg(new Sale(Products.PLUM, 3), 15 );
		  Msg message36 = new Msg(new Sale(Products.MANGO, 10), 4);		  
		  Msg message37 = new Msg(new Sale(Products.Banana, 8), 5);
		  Msg message38 = new Msg(new Sale(Products.PLUM, 3), 30 );
		  Msg message39 = new Msg(new Sale(Products.MANGO, 10), 10 );
		  Msg message40 = new Msg(new Sale(Products.Avocado, 10), 15 );			 
		  Msg message41 = new Msg(new Sale(Products.PINEAPPLE, 30), 1);
		  Msg message42 = new Msg(new Sale(Products.PLUM, 3), 6);
		  Msg message43 = new Msg(new Sale(Products.MANGO, 10), 5);
		  Msg message44 = new Msg(new Sale(Products.PINEAPPLE, 30), 8);
		  Msg message45 = new Msg(new Sale(Products.Fig, 7), 15);
		  Msg message46 = new Msg(new Sale(Products.PLUM, 3), 20);
		  Msg message47 = new Msg(new Sale(Products.PINEAPPLE, 35), 10 , new Adjustment(Operation.ADD , 5));
		  Msg message48 = new Msg(new Sale(Products.Fig, 3), 15 , new Adjustment(Operation.SUBSTRACT , 2));
		  Msg message49 = new Msg(new Sale(Products.Banana, 8), 30 , new Adjustment(Operation.SUBSTRACT , 2));
		  Msg message50 = new Msg(new Sale(Products.PINEAPPLE, 35), 10 );
		  Msg message51 = new Msg(new Sale(Products.Apricot, 15), 50 );
	
		  messages.add(message1);		  
		  messages.add(message2);
		  messages.add(message3);
		  messages.add(message4);
		  messages.add(message5);
		  messages.add(message6);
		  messages.add(message7);
		  messages.add(message8);
		  messages.add(message9);
		  messages.add(message10);		
		  messages.add(message11);		  
		  messages.add(message12);
		  messages.add(message13);
		  messages.add(message14);
		  messages.add(message15);
		  messages.add(message16);
		  messages.add(message17);
		  messages.add(message18);
		  messages.add(message19);
		  messages.add(message20);
		  messages.add(message21);		  
		  messages.add(message22);
		  messages.add(message23);
		  messages.add(message24);
		  messages.add(message25);
		  messages.add(message26);
		  messages.add(message27);
		  messages.add(message28);
		  messages.add(message29);
		  messages.add(message30);
		  messages.add(message31);		  
		  messages.add(message32);
		  messages.add(message33);
		  messages.add(message34);
		  messages.add(message35);
		  messages.add(message36);
		  messages.add(message37);
		  messages.add(message38);
		  messages.add(message39);
		  messages.add(message40);
		  messages.add(message41);		  
		  messages.add(message42);
		  messages.add(message43);
		  messages.add(message44);
		  messages.add(message45);
		  messages.add(message46);
		  messages.add(message47);
		  messages.add(message48);
		  messages.add(message49);
		  messages.add(message50);
		  messages.add(message51);
		
		  
		  return messages;
		
	}

}
