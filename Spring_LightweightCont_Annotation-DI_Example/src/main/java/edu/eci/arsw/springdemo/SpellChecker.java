package edu.eci.arsw.springdemo;

import org.springframework.beans.factory.annotation.Autowired;


public interface SpellChecker {

        
	public String checkSpell(String text);
	
}
