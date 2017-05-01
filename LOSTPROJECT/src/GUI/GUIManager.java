//GUI Yasin

package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.BoxLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.Box;
import javax.swing.SwingConstants;

public class GUIManager extends JFrame {

	private CardLayout cards;
	private boolean isSoundActive;
	private JPanel contentPane;
	private mainPanel mainPanel;
	private HelpPanel helpPanel;
	private SettingsPanel settingsPanel;
	private gamePanel gamePanel;
	private recordsPanel recordsPanel;
	private creditsPanel creditsPanel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIManager frame = new GUIManager();
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
	public GUIManager() {
		setName("mainFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setMinimumSize(new Dimension(800,600));
		contentPane = new JPanel();
		cards = new CardLayout(0, 0);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(cards);
		
		mainPanel = new mainPanel();
		helpPanel = new HelpPanel();
		settingsPanel = new SettingsPanel();
		gamePanel = new gamePanel();
		recordsPanel = new recordsPanel();
		creditsPanel = new creditsPanel();
		contentPane.add(mainPanel, "main");
		contentPane.add(settingsPanel, "settings");
		contentPane.add(gamePanel, "game");
		contentPane.add(helpPanel, "help");
		contentPane.add(recordsPanel, "records");
		contentPane.add(creditsPanel, "credits");
		//gamePanel.setSize();
		
		cards.show(contentPane, "main");
		
		
		setContentPane(contentPane);
		
		//mainPanel mainPanel = new mainPanel();
		//contentPane.add(mainPanel, BorderLayout.CENTER);
		
		
		//JPanel panel_1 = new JPanel();
		//contentPane.add(panel_1, BorderLayout.NORTH);
		
	}

	public mainPanel getMainPanel() {
		return mainPanel;
	}

	public HelpPanel getHelpPanel() {
		return helpPanel;
	}

	public SettingsPanel getSettingsPanel() {
		return settingsPanel;
	}

	public gamePanel getGamePanel() {
		return gamePanel;
	}

	public recordsPanel getRecordsPanel() {
		return recordsPanel;
	}

	public creditsPanel getCreditsPanel() {
		return creditsPanel;
	}

	/**
	 * @return the isSoundActive
	 */
	public boolean isSoundActive() {
		return isSoundActive;
	}

	/**
	 * @param isSoundActive the isSoundActive to set
	 */
	public void setSoundActive(boolean isSoundActive) {
		this.isSoundActive = isSoundActive;
	}
	
	

}
