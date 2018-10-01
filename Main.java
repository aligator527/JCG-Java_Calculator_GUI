import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Main {
	static JFrame jFrame = getFrame();
	static JPanel jPanel = new JPanel();
	static Integer FirstValue = 0; //Стандартное значение
	static String operation = "+"; //Стандартная операция
	
	public static void main(String[] args) {
		JTextArea display = new JTextArea();
		jPanel.setLayout(new GridLayout(3,5));
		
		JButton jButton0 = new JButton("0"); //Кнопка 0
		JButton jButton1 = new JButton("1"); //Кнопка 1
		JButton jButton2 = new JButton("2"); //Кнопка 2
		JButton jButton3 = new JButton("3"); //Кнопка 3
		JButton jButton4 = new JButton("4"); //Кнопка 4
		JButton jButton5 = new JButton("5"); //Кнопка 5
		JButton jButton6 = new JButton("6"); //Кнопка 6
		JButton jButton7 = new JButton("7"); //Кнопка 7
		JButton jButton8 = new JButton("8"); //Кнопка 8
		JButton jButton9 = new JButton("9"); //Кнопка 9
		JButton jButtonSum = new JButton("+"); //Кнопка +
		JButton jButtonBack = new JButton("C"); //Кнопка C
		JButton jButtonDivide = new JButton("/"); //Кнопка /
		JButton jButtonSub = new JButton("-"); //Кнопка -
		JButton jButtonMul = new JButton("*"); //Кнопка *
		JButton jButtonStart = new JButton("="); //Кнопка =
		
		//Наше текстовое поле будет вверху, играет роль дисплея в калькуляторе
		jFrame.add(display, BorderLayout.NORTH); 
		//Наща панель с кнопками будет в центре
		jFrame.add(jPanel, BorderLayout.CENTER);
		//Наша кнопка = будет снизу
		jFrame.add(jButtonStart, BorderLayout.SOUTH);
		
		jPanel.add(jButton0); //Добавляем кнопку 0
		jPanel.add(jButton1); //Добавляем кнопку 1
		jPanel.add(jButton2); //Добавляем кнопку 2
		jPanel.add(jButton3); //Добавляем кнопку 3
		jPanel.add(jButton4); //Добавляем кнопку 4
		jPanel.add(jButton5); //Добавляем кнопку 5
		jPanel.add(jButton6); //Добавляем кнопку 6
		jPanel.add(jButton7); //Добавляем кнопку 7
		jPanel.add(jButton8); //Добавляем кнопку 8
		jPanel.add(jButton9); //Добавляем кнопку 9
		jPanel.add(jButtonSub); //Добавляем кнопку -
		jPanel.add(jButtonSum); //Добавляем кнопку +
		jPanel.add(jButtonMul); //Добавляем кнопку *
		jPanel.add(jButtonBack); //Добавляем кнопку С
		jPanel.add(jButtonDivide); //Добавляем кнопку /

		jPanel.revalidate(); //Перерисовываем jPanel, чтобы все кнопки отобразались
		
		//Настраиваем кнопку 0 
		jButton0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "0");
			}
		});
		//Настраиваем кнопку 1
		jButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "1");
			}
		});
		//Настраиваем кнопку 2
		jButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "2");
			}
		});
		//Настраиваем кнопку 3
		jButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "3");
			}
		});
		//Настраиваем кнопку 4
		jButton4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "4");
			}
		});
		//Настраиваем кнопку 5
		jButton5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "5");
			}
		});
		//Настраиваем кнопку 6
		jButton6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "6");
			}
		});
		//Настраиваем кнопку 7
		jButton7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "7");
			}
		});
		//Настраиваем кнопку 8
		jButton8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "8");
			}
		});
		//Настраиваем кнопку 9
		jButton9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "9");
			}
		});
		//Настраиваем кнопку -
		jButtonSub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FirstValue = Integer.valueOf(display.getText());
				display.setText("");
				operation = "-";
			}
		});
		//Настраиваем кнопку С
		jButtonBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String temp = display.getText();
				display.setText(temp.substring(0,temp.length() - 1));
				//Первый параметр у substring - от какого элемента
				//Второй параметр у substring - до какого элемента
				//Здесь мы сетаем наш текст и устанавливаем
				//Всё оставляем от самого первого элемента
				//Но удаляем последний элемент
			}
		});
		//Настраиваем кнопку /
		jButtonDivide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FirstValue = Integer.valueOf(display.getText());
				display.setText("");
				operation = "/";
			}
		});
		//Настраиваем кнопку *
		jButtonMul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FirstValue = Integer.valueOf(display.getText());
				display.setText("");
				operation = "*";
			}
		});
		//Настраиваем кнопку +
		jButtonSum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FirstValue = Integer.valueOf(display.getText());
				display.setText("");
				operation = "+";
			}
		});
		jButtonStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int SecondValue = Integer.valueOf(display.getText());
				if("+".equals(operation)) {
					display.setText((FirstValue+SecondValue)+"");
					//Возвращаем результат суммирования
				}
				if("-".equals(operation)) {
					display.setText((FirstValue-SecondValue)+"");
					//Возвращаем результат разности
				}
				if("*".equals(operation)) {
					display.setText((FirstValue*SecondValue)+"");
					//Возвращаем результат умножения
				}
				if("/".equals(operation)) {
					display.setText((FirstValue/SecondValue)+"");
					//Возвращаем результат деления
				}
				FirstValue = 0; //Возвращаем стандартное значение
				operation = "+"; //Возвращаем стандартную операцию
			}
		});
}
	
	
    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 75, dimension.height / 2 - 125, 250, 150);
        jFrame.setTitle("JCG");
        return jFrame;
    }
}
