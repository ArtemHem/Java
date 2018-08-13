package ru.geekbrains.Java_Level1.lesson8;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.*;

public class MyWindow extends JFrame {

    public MyWindow(){
        setTitle("New window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,200,800,600);
        setLayout(new GridLayout(2,2));

        JPanel[] pnl = new JPanel[4];
        for (int i = 0; i<pnl.length; i++){
            pnl[i] = new JPanel();
            this.add(pnl[i]);
            pnl[i].setBackground(new Color(100+i*40,100+i*40,100+i*40));

        }

        pnl[0].setLayout(new BorderLayout());
        JTextArea jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
        pnl[0].add(jsp);

        pnl[1].setLayout(new FlowLayout());
        JRadioButton[] jrb = new JRadioButton[4];
        ButtonGroup bgr = new ButtonGroup();
        ButtonGroup bgr2 = new ButtonGroup();
        for (int i = 0; i<jrb.length;i++){
            jrb[i] = new JRadioButton("#" + i);
            if (i<2){
                bgr.add(jrb[i]);
            }else{
                bgr2.add(jrb[i]);
            }
            pnl[1].add(jrb[i]);
        }
        JCheckBox[] jcb = new JCheckBox[4];
        for (int i = 0; i<jcb.length;i++){
            jcb[i] = new JCheckBox("Check #" + i);
            pnl[1].add(jcb[i]);
        }
        jrb[1].setBackground(new ColorUIResource(Color.blue));

        pnl[2].setLayout(new FlowLayout());
        String[] comboStr = {"Item #1","Item #2","Item #3","Item #4"};
        JComboBox<String> jcombo1 = new JComboBox<>(comboStr);
        JComboBox<String> jcombo2 = new JComboBox<>(comboStr);
        pnl[2].add(jcombo1);
        pnl[2].add(jcombo2);
        jcombo1.setBackground(new Color(254,225,25));
        jcombo2.setForeground(Color.red);

        jcombo1.addActionListener(e -> System.out.println("Выбор: " + (jcombo1.getSelectedIndex()+1)));

        pnl[3].setLayout(null);
        JSlider js = new JSlider();
        JLabel jLabel = new JLabel("Value: 50");
        js.setMaximum(100);
        js.setMinimum(0);
        js.setValue(50);
        pnl[3].add(jLabel);
        pnl[3].add(js);
        js.addChangeListener(e -> jLabel.setText("Value: " + js.getValue()));
        jLabel.setBounds(10,10,100,20);
        js.setBounds(20,40,300,100);
        js.setBackground(new Color(160,255,160));

        Font font = new Font("Serif", Font.PLAIN,20);
        jLabel.setFont(font);
        jLabel.setForeground(Color.white);

        JMenuBar mainMenu = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenu mEdit = new JMenu("Edit");
        JMenuItem miFileNew = new JMenuItem("New");
        JMenuItem miFileExit = new JMenuItem("Exit");

        setJMenuBar(mainMenu);

        mainMenu.add(mFile);
        mainMenu.add(mEdit);

        mFile.add(miFileNew);
        mFile.addSeparator();
        mFile.add(miFileExit);

        miFileExit.addActionListener(e -> System.exit(0));

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("BYE");
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Click");
            }
        });

        setVisible(true);
    }
















//    public MyWindow() {
//        setTitle("Test Window");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setBounds(300, 300, 400, 400);
//
//        JPanel pan = new JPanel();
//        add(pan);
//        pan.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                System.out.println("MousePos: " + e.getX()+" " + e.getY());
//            }
//        });

//        JTextField field = new JTextField();
//        add(field);
//        field.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Your message: " + field.getText());
//            }
//        });

//        JButton button = new JButton("Button");
//        add(button);
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button pressed...");
//            }
//        });

//        JButton[] jbs = new JButton[10];
//        setLayout(new GridLayout(4,3));
////        setLayout(new FlowLayout());
////        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
////        setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
//        for (int i = 0; i < jbs.length; i++) {
//            jbs[i] = new JButton("#" + i);
//            jbs[i].setAlignmentX(CENTER_ALIGNMENT);
//            add(jbs[i]);
//        }

//        JButton button = new JButton("Button 1(PAGE_START)");
//        add(button,BorderLayout.PAGE_START);
//        button = new JButton("Button 2(CENTER)");
//        button.setPreferredSize(new Dimension(200,100));
//        add(button,BorderLayout.CENTER);
//        button = new JButton("Button 3(LINE_START)");
//        add(button, BorderLayout.LINE_START);
//        button = new JButton("Long-Named Button 4(PAGE_END)");
//        add(button, BorderLayout.PAGE_END);
//        button = new JButton("5(LINE_END)");
//        add(button, BorderLayout.LINE_END);


//        JButton[] jbs = new JButton[5];
//        for(int i =0;i<5;i++){
//            jbs[i] = new JButton("#" + i);
//        }
//        setLayout(new BorderLayout()); // выбор компоновщика элементов
//        add(jbs[0], BorderLayout.EAST); // добавление кнопки на форму
//        add(jbs[1], BorderLayout.WEST);
//        add(jbs[2], BorderLayout.SOUTH);
//        add(jbs[3], BorderLayout.NORTH);
//        add(jbs[4], BorderLayout.CENTER);

//        setVisible(true);
//    }
}
