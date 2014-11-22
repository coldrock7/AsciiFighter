package com.zarkoix.ascfiighter;

import java.io.IOException;
import java.io.InputStream;

import javax.swing.JFrame;
import javax.swing.JTextField;

import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.wswing.WSwingConsoleInterface;

import com.zarkoix.ascfiighter.levelHandler.Level;
import com.zarkoix.ascfiighter.levelHandler.levelLoad;
import com.zarkoix.ascfiighter.levelHandler.levelWrite;

public class Main extends JFrame{
	public static ConsoleSystemInterface console = null;
	private static final long serialVersionUID = 2060623638149583738L;

	
	
    public static void Mains() throws IOException{
    	console = new WSwingConsoleInterface("Ascii Fight", false);
    }
 
    public static void main(String[] args) throws IOException {
        Mains();
        
        console.cls();
        Level lev = levelWrite.levelForm(levelLoad.getLevel("/Users/coldrock/Desktop/ASCfIIghter/ASCfIIghter/AsciiFighter/lvl.txt"));
       levelWrite.levelDraw(console, lev);
        
    }
    
 
    public void repaint(){
        super.repaint();
        console.refresh();
    }
}
