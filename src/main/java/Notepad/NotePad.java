package Notepad;
//
///**
// *
// * @author ASAD
// */
//public class NotePad {
//
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
//}

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.time.LocalDateTime;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.UIManager;


public class NotePad implements ActionListener
{
    JFrame jf,jf2;
    JMenuBar jmb;
    JMenu File,Edit,Format,Help;
    JMenuItem jmi1,jmi2,jmi3,jmi4,jmi5,jmi6,jmi7,jmi8,jmi9,jmi10,jmi11,jmi12,jmi13;
    JTextArea jta;
    JScrollPane jsp;
    String title="Untitle-Notepad";
    JFileChooser jfc;
    File file1;
    JLabel jl1,jl2;
    JButton jbt1,jbt2;
    JTextField jtf1,jtf2; 
    JFrame font_frame;    
    JComboBox cbff,cbfs, cbfsiz;
    JButton fbtn;
    JCheckBoxMenuItem wordWrap;
    public NotePad() 
    {
        
        try
        {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
   
        
      jf=new JFrame(title);
      jf.setDefaultCloseOperation(3);
      jf.setSize(500, 500);
      //menuBar
      jmb=new JMenuBar();
      File=new JMenu("File");
      jmb.add(File);
      jmi1=new JMenuItem("New");
      File.add(jmi1);
      jmi1.addActionListener(this);
      File.addSeparator();
      jmi1.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_DOWN_MASK));
      jmi2=new JMenuItem("Open");
      File.add(jmi2);
      jmi2.addActionListener(this);
      jmi2.setAccelerator(KeyStroke.getKeyStroke('O', InputEvent.CTRL_DOWN_MASK));
      jmi3=new JMenuItem("Save");
      File.add(jmi3);
      jmi3.addActionListener(this);
      File.addSeparator();
      jmi3.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.CTRL_DOWN_MASK));
      jmi4=new JMenuItem("Save As");
      File.add(jmi4);
      jmi4.addActionListener(this);
      jmi4.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.SHIFT_DOWN_MASK));
      jmi5=new JMenuItem("Exit");
      File.add(jmi5);
      jmi5.addActionListener(this);
      jmi4.setAccelerator(KeyStroke.getKeyStroke('E', InputEvent.CTRL_DOWN_MASK));
      
      Edit=new JMenu("Edit");
      jmb.add(Edit);
      
      jmi6=new JMenuItem("Cut");
      Edit.add(jmi6);
      Edit.addSeparator();
      jmi6.addActionListener(this);
      jmi6.setAccelerator(KeyStroke.getKeyStroke('X', InputEvent.CTRL_DOWN_MASK));
      jmi7=new JMenuItem("Copy");
      Edit.add(jmi7);
      jmi7.addActionListener(this);
      Edit.addSeparator();
      jmi7.setAccelerator(KeyStroke.getKeyStroke('C', InputEvent.CTRL_DOWN_MASK));
      jmi8=new JMenuItem("Paste");
      Edit.add(jmi8);
      jmi8.addActionListener(this);
      Edit.addSeparator();
      jmi8.setAccelerator(KeyStroke.getKeyStroke('P', InputEvent.CTRL_DOWN_MASK));
      jmi10=new JMenuItem("Replace");
      Edit.add(jmi10);
      jmi10.addActionListener(this);
      Edit.addSeparator();
      
      jmi11=new JMenuItem("Date_Time");
      Edit.add(jmi11);
      jmi11.addActionListener(this);
      jmi11.setAccelerator(KeyStroke.getKeyStroke('D', InputEvent.CTRL_DOWN_MASK));
      Format=new JMenu("Format");
      jmb.add(Format);
      wordWrap=new JCheckBoxMenuItem("Word Wrap");
      Format.add(wordWrap);
      Format.addSeparator();
      wordWrap.addActionListener(this);
      jmi9=new JMenuItem("Font..");
      Format.add(jmi9);
      Format.addSeparator();
      jmi9.addActionListener(this);
      jmi9.setAccelerator(KeyStroke.getKeyStroke('F', InputEvent.CTRL_DOWN_MASK));
      
      jmi12=new JMenuItem("Font color");
      Format.add(jmi12);
      jmi12.addActionListener(this);
      Format.addSeparator();
      jmi12.setAccelerator(KeyStroke.getKeyStroke('C', InputEvent.SHIFT_DOWN_MASK));
      
      jmi13=new JMenuItem("Text area color");
      Format.add(jmi13);
      jmi13.addActionListener(this);
      
      
      jf.setJMenuBar(jmb);
      
      Help=new JMenu("Help");
      jmb.add(Help);
      
      
       
       
    
      
      jta=new JTextArea();
      jsp=new JScrollPane(jta);
      jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
      jf.add(jsp);
      
      
      jf.setVisible(true);
      
     Image icon=Toolkit.getDefaultToolkit().getImage("C:\\Users\\ASAD\\Documents\\NetBeansProjects\\tictactoeProject\\src\\main\\java\\demo\\notepad.png.png");
     
     jf.setIconImage(icon); 
      
        
    }
   
     //perFormed Method
    @Override
    public void actionPerformed(ActionEvent e) 
    {
   
    if(e.getSource()==jmi1)
    {
    neww();
    }
    if(e.getSource()==jmi4)
    {
    saveAs();
    }
    if(e.getSource()==jmi2)
    {
    open();
    }
    if(e.getSource()==jmi3)
    {
    
    save();
    }
    if(e.getSource()==jmi5)
    {
    exit();
    }
    if(e.getSource()==jmi6)
    {
    cutt();
    }
    if(e.getSource()==jmi7)
    {
    copyy();
    }
    if(e.getSource()==jmi8)
    {
    pastee();
    }
    if(e.getSource()==jmi10)
    {
    replaceFrame();
    }
    if(e.getSource()==jbt1)
    {
      replaceButton1();
    }
    if(e.getSource()==jbt2)
    {
        System.out.println("Button 2");
    }
    if(e.getSource()==jmi11)
    {
    Date_time();
    }
    if(e.getSource()==jmi9)
    {
       fontFamily();
    }
    if(e.getSource()==jmi12)
    {
    fontColor();
    }
    if(e.getSource()==jmi13)
    {
    txtareaColor();
    }
    if(e.getSource()==fbtn)
    {
            
       okFont();
    }
    if(e.getSource()==wordWrap)
    {
        boolean b=wordWrap.getState();
        jta.setLineWrap(b);
       
    }
     
    }
    public void neww()
    {
     String ftext=jta.getText();
     if(!ftext.equals(""))
     {
     int i=JOptionPane.showConfirmDialog(jf, "Do You Want To Save");
     if(i==0)
     {
     saveAs();
     jta.setText("");
     jf.setTitle(title);
     }
     else if(i==1)
     {
     jta.setText("");
     } 
    }
    
    }
    // save Method
    
    public void saveAs()
    {
        jfc=new JFileChooser();
        int i=jfc.showSaveDialog(jf);
        if(i==0)
        {
        try
         {
          String text = jta.getText();
          byte[] arr=text.getBytes();
          file1=jfc.getSelectedFile();
          FileOutputStream fos=new FileOutputStream(file1);
          fos.write(arr);
          fos.close();
          setTtle();
         
          }
          catch(Exception e)
           {
           JOptionPane.showMessageDialog(jf, "File Not Found");
           }
           }
        else
        {
        JOptionPane.showMessageDialog(jf, "Choose a File Name", "Error...", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void setTtle()
    {
    String title=file1.getName();
    jf.setTitle(title);
    
    }
    //open method
    public void open()
    {
    
     JFileChooser jfc2=new JFileChooser();
     int i= jfc2.showOpenDialog(jf); 
     if(i==0)
     {
    try
    {
       jta.setText("");
        //setTtle();
        file1=jfc2.getSelectedFile();
        FileReader obj=new FileReader(file1);
        setTtle();
       int j=0;
        while(j!=-1)
        {
       j=obj.read();
        jta.append(String.valueOf((char)j));
        }
        obj.close();
    }
    catch(Exception q)
    {
    JOptionPane.showMessageDialog(jf,"File Not Exist");
    }
     }
    }
    public void save()
    {
    if(jf.getTitle().equals(title))
    {
    saveAs();
    }
    else
    {
    String text=jta.getText();
    byte[] arr=text.getBytes();
    
    try
    {
    FileOutputStream fos=new FileOutputStream(file1);
    fos.write(arr);
    fos.close();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    }
    public void exit()
    {
    
    System.exit(0);
    }
    public void cutt()
    {
    jta.cut();
    }
    public void copyy()
    {
    jta.copy();
    }
    public void pastee()
    {
    jta.paste();
    }
    public void replaceFrame()
    {
    jf2=new JFrame("Replace");
    jf2.setSize(500, 300); 
    jf2.setLayout(null);
   
       jl1=new JLabel("Find What");
        jl1.setBounds(50, 50, 80, 40);
        jf2.add(jl1);
        
        jtf1=new JTextField();  
        jtf1.setBounds(120, 60, 150, 30);
        jf2.add(jtf1);
        
        jl1=new JLabel("Replace with");
        jl1.setBounds(50, 100, 80, 40);
        jf2.add(jl1);
        
        jtf2=new JTextField();  
        jtf2.setBounds(120, 100, 150, 30);
        jf2.add(jtf2);
        
         jbt1=new JButton("Replace");
        jbt1.setBounds(300, 60, 100, 30);
        jbt1.addActionListener(this);
        jf2.add(jbt1);
        
        
         jbt2=new JButton("Replace All");
        jbt2.setBounds(300, 100, 100, 30);
        jbt2.addActionListener(this);
        jf2.add(jbt2);
        
        jf2.setVisible(true);
    
    }
    public void replaceButton1()
    {
     String text=jta.getText();
     String oldText=jtf1.getText();
     String newText=jtf2.getText();
     
    String text1= text.replace(oldText, newText);
    jta.setText(text1);
    jf2.setVisible(false);
    
    
    }
    public void  Date_time()
    {
        LocalDateTime ldt=LocalDateTime.now();
        String dt=String.valueOf(ldt);
        jta.append(dt);
    
    }
    public void fontFamily()
    {
    
    font_frame=new JFrame("Font");
    font_frame.setSize(500, 300);
    font_frame.setLayout(null);
    font_frame.setVisible(true);
    
    GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
    String[] fntfamily = ge.getAvailableFontFamilyNames();
    cbff=new JComboBox(fntfamily);
    cbff.setBounds(30, 50, 100, 30);
    font_frame.add(cbff);
   
    String[] fstyle={"PLAIN","BOLD","ITALIC",};
    cbfs=new JComboBox(fstyle);
    cbfs.setBounds(150, 50, 100, 30);
    font_frame.add(cbfs);
    Integer[] fsiz={2,4,8,12,16,22,24};
    cbfsiz=new JComboBox(fsiz);
    cbfsiz.setBounds(300, 50, 100, 30);
    font_frame.add(cbfsiz);
    
     fbtn=new JButton("OK");
    fbtn.setBounds(150, 150, 60, 40);
    
    fbtn.addActionListener(this);
    font_frame.add(fbtn);
    }
    public void fontColor()
    {
        Color c=JColorChooser.showDialog(jf,"Select Font Color", Color.BLUE);
        jta.setForeground(c);
    }
    public void txtareaColor()
    {
    Color c2=JColorChooser.showDialog(jf, "Background Color", Color.WHITE);
    jta.setBackground(c2);
    }
    public void okFont()
    {
    
    String fontFamily = (String)cbff.getSelectedItem();
    
    String fontStyle = (String) cbfs.getSelectedItem();
    
    Integer fontSize = (Integer)cbfsiz.getSelectedItem();
    
    int NfontStyle=0;
    if(fontStyle.equals("PLAIN"))
    {
    NfontStyle =Font.PLAIN;
    }
    else if(fontStyle.equals("BOLD"))
    {
    NfontStyle =Font.BOLD;
    }
    else if(fontStyle.equals("ITALIC"))
    {
    NfontStyle=Font.ITALIC;
    }
    Font f=new Font(fontFamily, NfontStyle, fontSize);
    jta.setFont(f);
    font_frame.setVisible(false);
    }
    }

