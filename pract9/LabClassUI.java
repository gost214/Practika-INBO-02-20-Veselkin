package pract9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabClassUI extends JFrame {
    private LabClass lab=new LabClass();
    private int width=350;
    private int height=450;
    private int current=0;
    private JLabel inputName, inputINN, data, result;
    private JButton button,getResult,refresh;
    private JTextField name=new JTextField(15);
    private JTextField INN=new JTextField(15);
    private JTextArea input=new JTextArea(5,20);
    private JTextArea output=new JTextArea(5,20);
    public LabClassUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Сортировка студентов");
        setSize(width,height);
        setResizable(false);
        setLayout(new FlowLayout());
        inputName=new JLabel("Введите имя студента: ");
        inputINN=new JLabel("Введите ИНН студента:");
        data=new JLabel("Студенты:");
        result=new JLabel("Ответ:      ");
        button=new JButton("Добавить");
        getResult=new JButton("Отсортировать");
        refresh=new JButton("Заново");
        name.setText("");
        INN.setText("");
        input.setAutoscrolls(true);
        input.setEditable(false);
        output.setAutoscrolls(true);
        output.setEditable(false);
        JScrollPane inScroll=new JScrollPane(input, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane outScroll=new JScrollPane(output, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JPanel card=new JPanel();
        JPanel card2=new JPanel();
        JPanel card3=new JPanel();
        JPanel card4=new JPanel();
        JPanel card5=new JPanel();
        JPanel card6=new JPanel();
        JPanel card7=new JPanel();
        card.add(inputName);
        card.add(name);
        card2.add(inputINN);
        card2.add(INN);
        card3.add(button);
        card4.add(data);
        card4.add(inScroll);
        card5.add(getResult);
        card6.add(result);
        card6.add(outScroll);
        card7.add(refresh);
        add(card);
        add(card2);
        add(card3);
        add(card4);
        add(card5);
        add(card6);
        add(card7);
        name.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name.getText().equals("")){
                    JOptionPane.showMessageDialog(LabClassUI.this,"Введите имя студента");
                }
            }
        });
        INN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (INN.getText().equals("")){
                    JOptionPane.showMessageDialog(LabClassUI.this,"Введите ИНН студента");
                }
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isReady=true;
                if (name.getText().equals("")){
                    JOptionPane.showMessageDialog(LabClassUI.this,"Введите имя студента");
                    isReady=false;
                }
                if (INN.getText().equals("")){
                    JOptionPane.showMessageDialog(LabClassUI.this,"Введите ИНН студента");
                    isReady=false;

                }
                if (isReady) {
                    input.append(name.getText()+" "+INN.getText()+"\n");
                    Student temp=new Student(name.getText(),Integer.parseInt(INN.getText()));
                    if (current<lab.list.length) {
                        lab.list[current] = temp;
                        current++;
                    }
                    else{
                        Student[] tempList=new Student[lab.list.length+1];
                        lab.clone(tempList,lab.list);
                        tempList[current]=temp;
                        lab.list=tempList;
                        current++;
                    }
                    name.setText("");
                    INN.setText("");
                }
            }
        });
        getResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name.setEditable(false);
                INN.setEditable(false);
                button.setEnabled(false);
                if (input.getText().equals("")){
                    JOptionPane.showMessageDialog(LabClassUI.this,"Студенты не найдены");
                }
                else {
                    LabClassDriver driver=new LabClassDriver();
                    driver.run(lab.list);
                    for (int i = 0; i < lab.list.length; i++) {
                        output.append(lab.list[i].getName() + " " + lab.list[i].getINN() + "\n");
                    }
                }
            }
        });
        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.clear();
                current=0;
                name.setEditable(true);
                INN.setEditable(true);
                button.setEnabled(true);
                input.setText("");
                output.setText("");
            }
        });
    }
    public static void main(String[] args) {
        LabClassUI l=new LabClassUI();
        l.setVisible(true);
    }
}