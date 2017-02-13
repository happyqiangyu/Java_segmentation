import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class window extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window frame = new window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(17, 120, 117, 29);
		desktopPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(17, 151, 117, 29);
		desktopPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add");
		btnNewButton_2.setBounds(17, 181, 117, 29);
		desktopPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(17, 210, 117, 29);
		desktopPane.add(btnNewButton_3);
		
		JTextArea txtrBmcvSegmentationTool = new JTextArea();
		txtrBmcvSegmentationTool.setBackground(Color.LIGHT_GRAY);
		txtrBmcvSegmentationTool.setText("BMCV Segmentation Tool");
		txtrBmcvSegmentationTool.setBounds(142, 17, 164, 16);
		desktopPane.add(txtrBmcvSegmentationTool);
		
		table = new JTable();
		table.setBounds(146, 45, 272, 194);
		desktopPane.add(table);
		
		JButton btnImageFolder = new JButton("Image Folder");
		btnImageFolder.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				JFileChooser chooser = new JFileChooser(); 
			    chooser.setCurrentDirectory(new java.io.File("."));
			    String choosertitle = null;
				chooser.setDialogTitle(choosertitle);
			    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			    //
			    // disable the "All files" option.
			    //
			    chooser.setAcceptAllFileFilterUsed(false);
			    //    
			    if (chooser.showOpenDialog(chooser) == JFileChooser.APPROVE_OPTION) { 
			      System.out.println("getCurrentDirectory(): " 
			         +  chooser.getCurrentDirectory());
			      System.out.println("getSelectedFile() : " 
			         +  chooser.getSelectedFile());
			      }
			    else {
			      System.out.println("No Selection ");
			      }
			    
				 // File representing the folder that you select using a FileChooser
			    File imagefolderad=chooser.getSelectedFile();
			    ArrayList<String> names = new ArrayList<String>(Arrays.asList(imagefolderad.list()));
			    
			    
			}
		});
		btnImageFolder.setBounds(17, 49, 117, 29);
		desktopPane.add(btnImageFolder);
		
		JButton btnExportFolder = new JButton("Export Folder");
		btnExportFolder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JFileChooser chooser = new JFileChooser(); 
			    chooser.setCurrentDirectory(new java.io.File("."));
			    String choosertitle = null;
				chooser.setDialogTitle(choosertitle);
			    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			    //
			    // disable the "All files" option.
			    //
			    chooser.setAcceptAllFileFilterUsed(false);
			    //    
			    if (chooser.showOpenDialog(chooser) == JFileChooser.APPROVE_OPTION) { 
			      System.out.println("getCurrentDirectory(): " 
			         +  chooser.getCurrentDirectory());
			      System.out.println("getSelectedFile() : " 
			         +  chooser.getSelectedFile());
			      }
			    else {
			      System.out.println("No Selection ");
			      }

			    
			}
		});
		btnExportFolder.setBounds(17, 78, 117, 29);
		desktopPane.add(btnExportFolder);
	}
}
