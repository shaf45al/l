package com.sanifrey.test1;
/**  * ������������� �������������� ������ � ������  */ 


/**  * ���������� ����������  */ import java.awt.BorderLayout; import java.awt.Color; import java.awt.FlowLayout; import java.awt.GridLayout; import java.awt.event.ActionEvent; import java.awt.event.ActionListener; import javax.swing.JButton; import javax.swing.JFrame; import javax.swing.JLabel; import javax.swing.JPanel; 
 
/**   * ��������� public �����, � ������� �������������� ����� ���� ������������  */ public class OsnF {  /**   *  ������ ������ obj2 ������ Formuly   */   static Formuly obj2 = new Formuly();     /**     * ��������� ����������� ������    */   protected OsnF(){   }     /**    * ����� zapusk    */   public void zapusk(){   /**   * ������ ������ ������ JFrame   */   JFrame s=new JFrame();      /**    * ��������� ��������� ����    */   s.setTitle("����� ����������!  �������� ������������: ");    s.setSize(600,400);     /**    * ��������� ��������, ������� ����� ����������� ��� �������� ����    */   s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    /**    * ��������� ���� �� �������� ������     */   s.setLocationRelativeTo(null);    /**   * ������������ �������� BorderLayout ��� ������������ ����������� �� ������   */   s.setLayout(new BorderLayout()); 
     /**    * ������� ������ StrakhovatelB � StrakhovshikB ��� ������ ���� ������������     * � ������ panel, �� ������� ��� ����� �����������    */   JPanel panel=new JPanel();   panel.setLayout(new GridLayout(1,2));     JButton StrakhovatelB=new JButton("������������");      JButton StrakhovshikB=new JButton("����������");        /**    * ������������� ���� ������ ������ StrakhovatelB    */   StrakhovatelB.setForeground(Color.BLUE);     /**    * ������������� ���� ������ ������ StrakhovshikB    */   StrakhovshikB.setForeground(Color.RED);                     /**    *��������� ��������� � ������ StrakhovatelB � ������� ������    *addActionListener    */   StrakhovatelB.addActionListener(new ActionListener() {    public void actionPerformed(ActionEvent e) {     /**      * ������� ������ ������ Strakhovatel � �������� ����� zapusk()      */     Strakhovatel myStrakhovatel= new Strakhovatel();                                   myStrakhovatel.zapusk();    }});      /**    *��������� ��������� � ������ StrakhovshikB � ������� ������    *addActionListener    */   StrakhovshikB.addActionListener(new ActionListener() {    public void actionPerformed(ActionEvent e) {     /**      * ������� ������ ������ Strakhovshik � �������� ����� zapusk      */     Strakhovshik strakh=new Strakhovshik();     strakh.zapusk();               }});      /**    * ��������� ������ StrakhovatelB , StrakhovshikB �� ������    */   panel.add(StrakhovatelB);   panel.add(StrakhovshikB); 
 
  /**    * ������� ������ panel1    */   JPanel panel1=new JPanel();   panel1.setLayout(new FlowLayout());   /**    *������������� ���� ���� ������    */   panel1.setBackground(Color.WHITE);                        /**    * ������ ��������� kopiright ������ JLabel � ��������� ��� �� ������ panel1    */   JLabel kopiright= new JLabel("copyright � 2018"); 
  panel1.add(kopiright);              /**    *��������� panel � panel1 �� �����    */    s.add(panel,BorderLayout.CENTER);   s.add(panel1,BorderLayout.PAGE_END);   s.setVisible(true);  } } 
