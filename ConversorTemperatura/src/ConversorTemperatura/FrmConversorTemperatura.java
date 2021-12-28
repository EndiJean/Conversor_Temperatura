package ConversorTemperatura;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FrmConversorTemperatura extends JFrame implements ActionListener {

	String combo[] = { "Celsius", "Fahrenheit", "Kelvin" };
	@SuppressWarnings({ "rawtypes", "unchecked" })
	JComboBox jcombo = new JComboBox(combo);

	String combo2[] = { "Celsius", "Fahrenheit", "Kelvin" };
	@SuppressWarnings({ "rawtypes", "unchecked" })
	JComboBox jcombo2 = new JComboBox(combo2);

	JLabel lblValor = new JLabel();
	JLabel lblPara = new JLabel();
	JLabel lblResultado = new JLabel();

	JTextField txtValor = new JTextField();
	JTextField txtResultado = new JTextField();

	JButton btnCalcular = new JButton();

	Font font = new Font("SansSerif", Font.BOLD, 20);

	public FrmConversorTemperatura() {

		jcombo.setBounds(310, 35, 140, 30);

		jcombo2.setBounds(150, 85, 140, 30);

		lblValor.setText("Converter:");
		lblValor.setBounds(30, 40, 300, 20);
		lblValor.setFont(font);
		this.add(lblValor);

		lblPara.setText("Para:");
		lblPara.setBounds(75, 90, 300, 20);
		lblPara.setFont(font);
		this.add(lblPara);

		lblResultado.setText("Resultado:");
		lblResultado.setBounds(25, 140, 300, 20);
		lblResultado.setFont(font);
		this.add(lblResultado);

		txtValor.setText("0");
		txtValor.setBounds(150, 35, 140, 30);
		txtValor.setFont(font);
		this.add(txtValor);

		txtResultado.setBounds(150, 140, 300, 30);
		txtResultado.setFont(font);
		this.add(txtResultado);

		btnCalcular.setText("Converter");
		btnCalcular.setBounds(200, 185, 100, 30);
		btnCalcular.setFocusable(false);
		btnCalcular.addActionListener(this);
		this.add(btnCalcular);

		this.setTitle("Conversor de Temperatura");
		this.setLayout(null);
		this.setSize(500, 270);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(jcombo);
		this.add(jcombo2);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnCalcular) {

			double valor = Double.parseDouble(txtValor.getText());
			double resultado;
			
			if (jcombo.getItemAt(jcombo.getSelectedIndex()) == "Celsius") {

				if (jcombo2.getItemAt(jcombo2.getSelectedIndex()) == "Fahrenheit") {

					resultado = valor * 1.8 + 32;

					txtResultado.setText(String.valueOf(resultado));

				} else if (jcombo2.getItemAt(jcombo2.getSelectedIndex()) == "Kelvin") {

					resultado = valor + 273;

					txtResultado.setText(String.valueOf(resultado));
				}

			} else if (jcombo.getItemAt(jcombo.getSelectedIndex()) == "Fahrenheit") {

				if (jcombo2.getItemAt(jcombo2.getSelectedIndex()) == "Celsius") {

					resultado = (valor - 32) / 1.8;

					txtResultado.setText(String.valueOf(resultado));

				} else if (jcombo2.getItemAt(jcombo2.getSelectedIndex()) == "Kelvin") {

					resultado = (valor - 32) * 5 / 9 + 273;

					txtResultado.setText(String.valueOf(resultado));
				}

			} else if (jcombo.getItemAt(jcombo.getSelectedIndex()) == "Kelvin") {

				if (jcombo2.getItemAt(jcombo2.getSelectedIndex()) == "Celsius") {
					resultado = valor - 273;

					txtResultado.setText(String.valueOf(resultado));

				} else if (jcombo2.getItemAt(jcombo2.getSelectedIndex()) == "Fahrenheit") {

					resultado = (valor - 273) * 1.8 + 32;

					txtResultado.setText(String.valueOf(resultado));
				}
			}
		}

	}

	public static void main(String[] args) {

		new FrmConversorTemperatura();

	}
}
