package Pamphlet2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Pamphlet2.Track;
import Pamphlet2.Main;
import Pamphlet2.Music;

public class PhampletSource extends JFrame {
	
	private Image screenImage;
	private Graphics screenGraphic;
	private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));
	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png"));
	private ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("../images/TopBasic.png"));
	private ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/TopEntered.png"));
	private ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/BottomBasic.png"));
	private ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/BottomEntered.png"));
	private ImageIcon Gyeonggi_doButtonBasicImage = new ImageIcon(Main.class.getResource("../images/Gyeonggi_doBasic.png"));
	private ImageIcon Gyeonggi_doButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/Gyeonggi_doClick.png"));
	private ImageIcon Gangwon_doButtonBasicImage = new ImageIcon(Main.class.getResource("../images/Gangwon_doBasic.png"));
	private ImageIcon Gangwon_doButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/Gangwon_doClick.png"));
	private ImageIcon Chungcheongbuk_doButtonBasicImage = new ImageIcon(Main.class.getResource("../images/Chungcheongbuk_doBasic.png"));
	private ImageIcon Chungcheongbuk_doButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/Chungcheongbuk_doClick.png"));
	private ImageIcon Chungcheongnam_doButtonBasicImage = new ImageIcon(Main.class.getResource("../images/Chungcheongnam_doBasic.png"));
	private ImageIcon Chungcheongnam_doButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/Chungcheongnam_doClick.png"));
	private ImageIcon Jeollabuk_doButtonBasicImage = new ImageIcon(Main.class.getResource("../images/Jeollabuk_doBasic.png"));
	private ImageIcon Jeollabuk_doButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/Jeollabuk_doClick.png"));
	private ImageIcon Jeollanam_doButtonBasicImage = new ImageIcon(Main.class.getResource("../images/Jeollanam_doBasic.png"));
	private ImageIcon Jeollanam_doButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/Jeollanam_doClick.png"));
	private ImageIcon Gyengsangbuk_doButtonBasicImage = new ImageIcon(Main.class.getResource("../images/Gyengsangbuk_doBasic.png"));
	private ImageIcon Gyengsangbuk_doButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/Gyengsangbuk_doClick.png"));
	private ImageIcon Gyengsangnam_doButtonBasicImage = new ImageIcon(Main.class.getResource("../images/Gyengsangnam_doBasic.png"));
	private ImageIcon Gyengsangnam_doButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/Gyengsangnam_doClick.png"));
	private ImageIcon Jeju_doButtonBasicImage = new ImageIcon(Main.class.getResource("../images/Jeju_doBasic.png"));
	private ImageIcon Jeju_doButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/Jeju_doClick.png"));
	
	private ImageIcon miriButtonImage = new ImageIcon(Main.class.getResource("../images/PingBasic.png"));
	private ImageIcon miri2ButtonImage = new ImageIcon(Main.class.getResource("../images/PingEntered.png"));
	
	private ImageIcon BackButtonBasicImage = new ImageIcon(Main.class.getResource("../images/musicStartButtonEntered.png"));
	private ImageIcon BackButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/musicStartButtonBasic.png"));
	
	//private Image selectedImage = new ImageIcon(Main.class.getResource("../images/Jeonbuk selected image.jpg")).getImage();
	
	private Image background = new ImageIcon(Main.class.getResource("../images/Background.jpg")).getImage();

	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/MenuBar.png")));
	

	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton startButton = new JButton(startButtonBasicImage);
	private JButton quitButton = new JButton(quitButtonBasicImage);
	
	private JButton Gyeonggi_doButton = new JButton(Gyeonggi_doButtonBasicImage);
	private JButton Gangwon_doButton = new JButton(Gangwon_doButtonBasicImage);
	private JButton Chungcheongbuk_doButton = new JButton(Chungcheongbuk_doButtonBasicImage);
	private JButton Chungcheongnam_doButton = new JButton(Chungcheongnam_doButtonBasicImage);
	private JButton Jeollabuk_doButton = new JButton(Jeollabuk_doButtonBasicImage);
	private JButton Jeollanam_doButton = new JButton(Jeollanam_doButtonBasicImage);
	private JButton Gyengsangbuk_doButton = new JButton(Gyengsangbuk_doButtonBasicImage);
	private JButton Gyengsangnam_doButton = new JButton(Gyengsangnam_doButtonBasicImage);
	private JButton Jeju_doButton = new JButton(Jeju_doButtonBasicImage);
	
	private JButton BackButton = new JButton(BackButtonBasicImage);
	private JButton BackButton2 = new JButton(BackButtonBasicImage);
	private JButton miriButton = new JButton(miriButtonImage);
	private JButton miri2Button = new JButton(miriButtonImage);
	private JButton miri3Button = new JButton(miriButtonImage);
	private JButton miri4Button = new JButton(miriButtonImage);
	private JButton miri5Button = new JButton(miriButtonImage);
	private JButton miriexitButton = new JButton(exitButtonBasicImage);
	
	private int mouseX, mouseY;
	
	private boolean isMainScreen = false;
	private boolean isSubScreen = false;
	
	ArrayList<Track> trackList = new ArrayList<Track>();
	
	private Image selectedImage;
	private Image titleImage;
	private int nowSelected = 0;
	
	
	public PhampletSource() {
		setUndecorated(true);
		setTitle("관광지도");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		Music introMusic = new Music("intro.mp3",true);
		introMusic.start();
		
		trackList.add(new Track("Jejudinosaur.png", "Jejudinosaur_miri.png"));
		trackList.add(new Track("Eyondon.PNG", "Eyondon_miri.PNG"));
		trackList.add(new Track("Olaenoodle.PNG", "Olaenoodle_miri.PNG"));
		trackList.add(new Track("Sungsanilchoolbong.PNG", "Sungsanilchoolbong_miri.PNG"));
		trackList.add(new Track("Jeongbangpokpo.PNG", "Jeongbangpokpo_miri.PNG"));
		
		
		exitButton.setBounds(1245, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});

		add(exitButton);
		
		BackButton.setBounds(0, 0, 30, 30);
		BackButton.setBorderPainted(false);
		BackButton.setContentAreaFilled(false);
		BackButton.setFocusPainted(false);
		BackButton.setVisible(false);
		BackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BackButton.setIcon(BackButtonEnteredImage);
				BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				BackButton.setIcon(BackButtonBasicImage);
				BackButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
				exitButton.setBounds(1245, 0, 30, 30);
				Gangwon_doButton.setVisible(false);
				Gyeonggi_doButton.setVisible(false);
				Chungcheongnam_doButton.setVisible(false);
				Chungcheongbuk_doButton.setVisible(false);
				Jeollanam_doButton.setVisible(false);
				Jeollabuk_doButton.setVisible(false);
				Gyengsangnam_doButton.setVisible(false);
				Gyengsangbuk_doButton.setVisible(false);
				Jeju_doButton.setVisible(false);
				BackButton.setVisible(false);
				isMainScreen = false;
				background = new ImageIcon(Main.class.getResource("../images/Background.jpg")).getImage();
				startButton.setVisible(true);
				quitButton.setVisible(true);
			}
		});
		add(BackButton);
		
		BackButton2.setBounds(0, 0, 30, 30);
		BackButton2.setBorderPainted(false);
		BackButton2.setContentAreaFilled(false);
		BackButton2.setFocusPainted(false);
		BackButton2.setVisible(false);
		BackButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BackButton2.setIcon(BackButtonEnteredImage);
				BackButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				BackButton2.setIcon(BackButtonBasicImage);
				BackButton2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				setSize(480, 720);
				exitButton.setBounds(445, 0, 30, 30);
				Gangwon_doButton.setVisible(true);
				Gyeonggi_doButton.setVisible(true);
				Chungcheongnam_doButton.setVisible(true);
				Chungcheongbuk_doButton.setVisible(true);
				Jeollanam_doButton.setVisible(true);
				Jeollabuk_doButton.setVisible(true);
				Gyengsangnam_doButton.setVisible(true);
				Gyengsangbuk_doButton.setVisible(true);
				Jeju_doButton.setVisible(true);
				BackButton2.setVisible(false);
				isMainScreen = false;
				isSubScreen = false;
				background = new ImageIcon(Main.class.getResource("../images/mainbackground3.png")).getImage();
				miriButton.setVisible(false);
				miri2Button.setVisible(false);
				miri3Button.setVisible(false);
				miri4Button.setVisible(false);
				miri5Button.setVisible(false);
				BackButton.setVisible(true);
				miriexitButton.setVisible(false);
			}
		});
		
		add(BackButton2);

		startButton.setBounds(170, 200, 300, 90);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonBasicImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				introMusic.close();
				selectTrack(0);
				startButton.setVisible(false);
				quitButton.setVisible(false);
				Gangwon_doButton.setVisible(true);
				Gyeonggi_doButton.setVisible(true);
				Chungcheongnam_doButton.setVisible(true);
				Chungcheongbuk_doButton.setVisible(true);
				Jeollanam_doButton.setVisible(true);
				Jeollabuk_doButton.setVisible(true);
				Gyengsangnam_doButton.setVisible(true);
				Gyengsangbuk_doButton.setVisible(true);
				Jeju_doButton.setVisible(true);
				setSize(480, 720);
				exitButton.setBounds(445, 0, 30, 30);
				background = new ImageIcon(Main.class.getResource("../images/mainbackground3.png")).getImage();
				//프로그램 시작 이벤트
				BackButton.setVisible(true);
			}
		});

		add(startButton);
		
		
		quitButton.setBounds(160, 320, 300, 90);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setFocusPainted(false);
		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				quitButton.setIcon(quitButtonEnteredImage);
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				quitButton.setIcon(quitButtonBasicImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});

		add(quitButton);
		
		miriexitButton.setBounds(980, 480, 30, 30);
		miriexitButton.setBorderPainted(false);
		miriexitButton.setContentAreaFilled(false);
		miriexitButton.setFocusPainted(false);
		miriexitButton.setVisible(false);
		miriexitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				miriexitButton.setIcon(exitButtonEnteredImage);
				miriexitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				miriexitButton.setIcon(exitButtonBasicImage);
				miriexitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				isSubScreen = false;
				miriexitButton.setVisible(false);
			}
		});
		add(miriexitButton);
		
		//애월
		miriButton.setBounds(420, 195, 28, 28);
		miriButton.setBorderPainted(false);
		miriButton.setContentAreaFilled(false);
		miriButton.setFocusPainted(false);
		miriButton.setVisible(false);
		miriButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectTrack(0);
				isMainScreen = true;
				miriButton.setIcon(miri2ButtonImage);
				miriButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				isMainScreen = false;
				miriButton.setIcon(miriButtonImage);
				miriButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				selectTrack(0);
				isSubScreen = true;
				miriexitButton.setVisible(true);
				//titleImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getTitleImage()));
				//GwanButton.setVisible(true);
				//관광
			}
		});


		add(miriButton);
		
		//중문
		miri2Button.setBounds(428, 479, 28, 28);
		miri2Button.setBorderPainted(false);
		miri2Button.setContentAreaFilled(false);
		miri2Button.setFocusPainted(false);
		miri2Button.setVisible(false);
		miri2Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectTrack(1);
				isMainScreen = true;
				miri2Button.setIcon(miri2ButtonImage);
				miri2Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				isMainScreen = false;
				miri2Button.setIcon(miriButtonImage);
				miri2Button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//관광
				selectTrack(1);
				isSubScreen = true;
				miriexitButton.setVisible(true);
			}
		});

		add(miri2Button);
		
		//제주시
		miri3Button.setBounds(530, 120, 28, 28);
		miri3Button.setBorderPainted(false);
		miri3Button.setContentAreaFilled(false);
		miri3Button.setFocusPainted(false);
		miri3Button.setVisible(false);
		miri3Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectTrack(2);
				isMainScreen = true;
				miri3Button.setIcon(miri2ButtonImage);
				miri3Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				isMainScreen = false;
				miri3Button.setIcon(miriButtonImage);
				miri3Button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//관광
				selectTrack(2);
				isSubScreen = true;
				miriexitButton.setVisible(true);
			}
		});

		add(miri3Button);
		
		//성산
		miri4Button.setBounds(1041, 180, 28, 28);
		miri4Button.setBorderPainted(false);
		miri4Button.setContentAreaFilled(false);
		miri4Button.setFocusPainted(false);
		miri4Button.setVisible(false);
		miri4Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectTrack(3);
				isMainScreen = true;
				miri4Button.setIcon(miri2ButtonImage);
				miri4Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				isMainScreen = false;
				miri4Button.setIcon(miriButtonImage);
				miri4Button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//관광
				selectTrack(3);
				isSubScreen = true;
				miriexitButton.setVisible(true);
			}
		});

		add(miri4Button);
		
		//서귀포
		miri5Button.setBounds(645, 490, 28, 28);
		miri5Button.setBorderPainted(false);
		miri5Button.setContentAreaFilled(false);
		miri5Button.setFocusPainted(false);
		miri5Button.setVisible(false);
		miri5Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectTrack(4);
				isMainScreen = true;
				miri5Button.setIcon(miri2ButtonImage);
				miri5Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				isMainScreen = false;
				miri5Button.setIcon(miriButtonImage);
				miri5Button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//관광
				selectTrack(4);
				isSubScreen = true;
				miriexitButton.setVisible(true);
			}
		});

		add(miri5Button);
		
		
		Gangwon_doButton.setVisible(false);
		Gangwon_doButton.setBounds(150, 10, 286, 236);
		Gangwon_doButton.setBorderPainted(false);
		Gangwon_doButton.setContentAreaFilled(false);
		Gangwon_doButton.setFocusPainted(false);
		Gangwon_doButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Gangwon_doButton.setIcon(Gangwon_doButtonEnteredImage);
				Gangwon_doButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Gangwon_doButton.setIcon(Gangwon_doButtonBasicImage);
				Gangwon_doButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//강원도

			}
		});

		add(Gangwon_doButton);
		
		Gyeonggi_doButton.setVisible(false);
		Gyeonggi_doButton.setBounds(82, 67, 164, 190);
		Gyeonggi_doButton.setBorderPainted(false);
		Gyeonggi_doButton.setContentAreaFilled(false);
		Gyeonggi_doButton.setFocusPainted(false);
		Gyeonggi_doButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Gyeonggi_doButton.setIcon(Gyeonggi_doButtonEnteredImage);
				Gyeonggi_doButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Gyeonggi_doButton.setIcon(Gyeonggi_doButtonBasicImage);
				Gyeonggi_doButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//경기도
			}
		});

		add(Gyeonggi_doButton);
		
		Chungcheongnam_doButton.setVisible(false);
		Chungcheongnam_doButton.setBounds(39, 227, 186, 159);
		Chungcheongnam_doButton.setBorderPainted(false);
		Chungcheongnam_doButton.setContentAreaFilled(false);
		Chungcheongnam_doButton.setFocusPainted(false);
		Chungcheongnam_doButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Chungcheongnam_doButton.setIcon(Chungcheongnam_doButtonEnteredImage);
				Chungcheongnam_doButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Chungcheongnam_doButton.setIcon(Chungcheongnam_doButtonBasicImage);
				Chungcheongnam_doButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//충정남도

			}
		});

		add(Chungcheongnam_doButton);
		
		Chungcheongbuk_doButton.setVisible(false);
		Chungcheongbuk_doButton.setBounds(172, 200, 172, 187);
		Chungcheongbuk_doButton.setBorderPainted(false);
		Chungcheongbuk_doButton.setContentAreaFilled(false);
		Chungcheongbuk_doButton.setFocusPainted(false);
		Chungcheongbuk_doButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Chungcheongbuk_doButton.setIcon(Chungcheongbuk_doButtonEnteredImage);
				Chungcheongbuk_doButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Chungcheongbuk_doButton.setIcon(Chungcheongbuk_doButtonBasicImage);
				Chungcheongbuk_doButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//충청북도
;
			}
		});

		add(Chungcheongbuk_doButton);
		
		Jeollanam_doButton.setVisible(false);
		Jeollanam_doButton.setBounds(16, 452, 231, 178);
		Jeollanam_doButton.setBorderPainted(false);
		Jeollanam_doButton.setContentAreaFilled(false);
		Jeollanam_doButton.setFocusPainted(false);
		Jeollanam_doButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Jeollanam_doButton.setIcon(Jeollanam_doButtonEnteredImage);
				Jeollanam_doButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Jeollanam_doButton.setIcon(Jeollanam_doButtonBasicImage);
				Jeollanam_doButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//전라남도

			}
		});

		add(Jeollanam_doButton);
		
		Jeollabuk_doButton.setVisible(false);
		Jeollabuk_doButton.setBounds(73, 354, 199, 128);
		Jeollabuk_doButton.setBorderPainted(false);
		Jeollabuk_doButton.setContentAreaFilled(false);
		Jeollabuk_doButton.setFocusPainted(false);
		Jeollabuk_doButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Jeollabuk_doButton.setIcon(Jeollabuk_doButtonEnteredImage);
				Jeollabuk_doButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Jeollabuk_doButton.setIcon(Jeollabuk_doButtonBasicImage);
				Jeollabuk_doButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//전라북도

			}
		});

		add(Jeollabuk_doButton);
		
		Gyengsangnam_doButton.setVisible(false);
		Gyengsangnam_doButton.setBounds(208, 393, 209, 189);
		Gyengsangnam_doButton.setBorderPainted(false);
		Gyengsangnam_doButton.setContentAreaFilled(false);
		Gyengsangnam_doButton.setFocusPainted(false);
		Gyengsangnam_doButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Gyengsangnam_doButton.setIcon(Gyengsangnam_doButtonEnteredImage);
				Gyengsangnam_doButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Gyengsangnam_doButton.setIcon(Gyengsangnam_doButtonBasicImage);
				Gyengsangnam_doButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//경상남도

			}
		});

		add(Gyengsangnam_doButton);
		
		Gyengsangbuk_doButton.setVisible(false);
		Gyengsangbuk_doButton.setBounds(240, 218, 222, 228);
		Gyengsangbuk_doButton.setBorderPainted(false);
		Gyengsangbuk_doButton.setContentAreaFilled(false);
		Gyengsangbuk_doButton.setFocusPainted(false);
		Gyengsangbuk_doButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Gyengsangbuk_doButton.setIcon(Gyengsangbuk_doButtonEnteredImage);
				Gyengsangbuk_doButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Gyengsangbuk_doButton.setIcon(Gyengsangbuk_doButtonBasicImage);
				Gyengsangbuk_doButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//경상북도

			}
		});

		add(Gyengsangbuk_doButton);

		Jeju_doButton.setVisible(false);
		Jeju_doButton.setBounds(68, 622, 193, 91);
		Jeju_doButton.setBorderPainted(false);
		Jeju_doButton.setContentAreaFilled(false);
		Jeju_doButton.setFocusPainted(false);
		Jeju_doButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Jeju_doButton.setIcon(Jeju_doButtonEnteredImage);
				Jeju_doButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Jeju_doButton.setIcon(Jeju_doButtonBasicImage);
				Jeju_doButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//경상북도
				setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
				exitButton.setBounds(1245, 0, 30, 30);
				Gangwon_doButton.setVisible(false);
				Gyeonggi_doButton.setVisible(false);
				Chungcheongnam_doButton.setVisible(false);
				Chungcheongbuk_doButton.setVisible(false);
				Jeollanam_doButton.setVisible(false);
				Jeollabuk_doButton.setVisible(false);
				Gyengsangnam_doButton.setVisible(false);
				Gyengsangbuk_doButton.setVisible(false);
				Jeju_doButton.setVisible(false);
				miriButton.setVisible(true);
				miri2Button.setVisible(true);
				miri3Button.setVisible(true);
				miri4Button.setVisible(true);
				miri5Button.setVisible(true);
				BackButton.setVisible(false);
				BackButton2.setVisible(true);
				isMainScreen = false;
				background = new ImageIcon(Main.class.getResource("../images/Jejuisland.png")).getImage();
			}
		});

		add(Jeju_doButton);
		
		
		menuBar.setBounds(0, 0, 1280, 30);
		
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
			
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		
		add(menuBar);
		

	}
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
		
		
	}
	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null);
		if(isMainScreen)
		{
			g.drawImage(selectedImage, 450, 230, null);
		}
		if(isSubScreen)
		{
			g.drawImage(titleImage, 980, 480, null);
		}
		paintComponents(g);
		this.repaint();
	}
	public void selectTrack(int nowSelected) {
		titleImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getTitleImage())).getImage();
		selectedImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getStartImage())).getImage();
		
	}
	public void selectLeft() {
		if (nowSelected == 0)
			nowSelected = trackList.size() - 1;
		else
			nowSelected--;
		selectTrack(nowSelected);
	}
	public void selectRight() {
		if (nowSelected == trackList.size() - 1)
			nowSelected = 0;
		else
			nowSelected++;
		selectTrack(nowSelected);
	}
	public void selectplace(int nowSelected, String difficulty) {
		isMainScreen = false;
		background = new ImageIcon(Main.class.getResource("../images/"+trackList.get(nowSelected).getTitleImage())).getImage();
	}

}
