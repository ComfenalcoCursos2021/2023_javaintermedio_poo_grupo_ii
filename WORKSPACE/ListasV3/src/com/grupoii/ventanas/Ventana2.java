package com.grupoii.ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.grupoii.excepciones.MalAugurioException;
import com.grupoii.excepciones.ManejadorListaVaciaException;
import com.grupoii.recursos.ManejadorLista;
import javax.swing.JLabel;

public class Ventana2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDato;
	private ManejadorLista manejador;
	private JButton btnIrPrimero;
	private JButton btnSiguiente;
	private JButton btnAnterior;
	private JButton btnIrUltimo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
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
	public Ventana2() {
		manejador = new ManejadorLista();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnAnterior = new JButton("<");
		btnAnterior.setEnabled(false);
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int elDatoSiguiente;
				try {
					
					elDatoSiguiente = manejador.getAnterior();
					txtDato.setText("" + elDatoSiguiente);
					
				} catch (MalAugurioException ex) {
					
					txtDato.setText("POR LA SEÑAL DE LA SANTA CRUZ");
					ex.printStackTrace();
					
				} catch (ManejadorListaVaciaException ex) {
					
					txtDato.setText("LA LISTA ESTA VACIA");
					ex.printStackTrace();
					
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				

			}
		});
		btnAnterior.setBounds(78, 50, 58, 23);
		contentPane.add(btnAnterior);

		btnIrPrimero = new JButton("<<");
		btnIrPrimero.setEnabled(false);
		btnIrPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int elDatoSiguiente = manejador.getPrimero();
				txtDato.setText("" + elDatoSiguiente);
			}
		});
		btnIrPrimero.setBounds(10, 50, 58, 23);
		contentPane.add(btnIrPrimero);

		btnSiguiente = new JButton(">");
		btnSiguiente.setEnabled(false);
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elDatoSiguiente = manejador.getSiguiente();
				txtDato.setText("" + elDatoSiguiente);
			}
		});
		btnSiguiente.setBounds(216, 50, 67, 23);
		contentPane.add(btnSiguiente);

		txtDato = new JTextField();
		txtDato.setBounds(10, 12, 245, 20);
		contentPane.add(txtDato);
		txtDato.setColumns(10);

		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dato = txtDato.getText();

				int convertido = Integer.parseInt(dato);
				manejador.agregar(convertido);
				manejador.imprimirLista();
				btnIrPrimero.setEnabled(true);
				btnAnterior.setEnabled(true);
				btnSiguiente.setEnabled(true);
				btnIrUltimo.setEnabled(true);
			}
		});
		btnAgregar.setBounds(265, 11, 89, 23);
		contentPane.add(btnAgregar);

		btnIrUltimo = new JButton(">>");
		btnIrUltimo.setEnabled(false);
		btnIrUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elDatoSiguiente = manejador.getUtlimo();
				txtDato.setText("" + elDatoSiguiente);
			}
		});
		btnIrUltimo.setBounds(293, 50, 61, 23);
		contentPane.add(btnIrUltimo);
		
		JLabel lblNewLabel = new JLabel("El texto cualquieral");
		lblNewLabel.setBounds(41, 141, 160, 14);
		contentPane.add(lblNewLabel);
	}
}
