package ru.agcon.new_labs.laba15.zadanie3;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Menu extends JFrame {
    public Menu() {
        super("Soft");
        this.setSize(1080, 720);
        this.setLayout(new GridLayout(2, 3));
        Font fontLarge = new Font("Times new roman", 1, 18);
        Font fontSmall = new Font("Times new roman", 1, 10);
        Font fontMenu = new Font("Times new roman", 1, 11);
        JPanel[] panel = new JPanel[6];
        JButton btnFirst = new JButton("Button 1");
        JButton btnSecond = new JButton("Button 2");
        JTextArea textArea = new JTextArea("This os the area you can write text");
        panel[0] = new JPanel();
        panel[0].setBackground(Color.WHITE);
        this.add(panel[0]);
        panel[1] = new JPanel();
        panel[1].setBackground(Color.WHITE);
        this.add(panel[1]);
        panel[2] = new JPanel();
        panel[2].setBackground(Color.WHITE);
        this.add(panel[2]);
        panel[3] = new JPanel();
        panel[3].setBackground(Color.WHITE);
        this.add(panel[3]);
        panel[4] = new JPanel();
        panel[4].setBackground(Color.WHITE);
        this.add(panel[4]);
        panel[5] = new JPanel();
        panel[5].setBackground(Color.WHITE);
        this.add(panel[5]);
        panel[0].add(btnFirst);
        btnFirst.setFont(fontLarge);
        btnFirst.setBackground(Color.WHITE);
        btnFirst.setBorder(BorderFactory.createLineBorder(Color.gray));
        panel[2].add(btnSecond);
        btnSecond.setFont(fontLarge);
        btnSecond.setBackground(Color.white);
        btnSecond.setBorder(BorderFactory.createLineBorder(Color.gray));
        panel[4].add(textArea);
        textArea.setBackground(Color.WHITE);
        textArea.setFont(fontSmall);
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.WHITE);
        JMenu menuFile = new JMenu("File");
        menuFile.setFont(fontMenu);
        JMenuItem itemSave = new JMenuItem("Save");
        menuFile.add(itemSave);
        itemSave.setBackground(Color.WHITE);
        JMenuItem itemExit = new JMenuItem("Exit");
        itemExit.setFont(fontMenu);
        itemExit.setBackground(Color.WHITE);
        menuFile.add(itemExit);
        JMenu menuEdit = new JMenu("Edit");
        menuEdit.setFont(fontMenu);
        JMenuItem itemCopy = new JMenuItem("Copy");
        itemCopy.setFont(fontMenu);
        itemCopy.setBackground(Color.WHITE);
        menuEdit.add(itemCopy);
        JMenuItem itemCut = new JMenuItem("Cut");
        itemCut.setFont(fontMenu);
        itemCut.setBackground(Color.WHITE);
        menuEdit.add(itemCut);
        JMenuItem itemPaste = new JMenuItem("Paste");
        itemPaste.setFont(fontMenu);
        itemPaste.setBackground(Color.WHITE);
        menuEdit.add(itemPaste);
        JMenu menuHelp = new JMenu("Help");
        menuHelp.setFont(fontMenu);
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuHelp);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
}