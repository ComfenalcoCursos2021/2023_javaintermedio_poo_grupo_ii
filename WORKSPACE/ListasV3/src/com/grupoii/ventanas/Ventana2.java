package com.grupoii.ventanas;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.grupoii.recursos.ManejadorLista;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDato;
	private ManejadorLista manejador;

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
		setBounds(100, 100, 381, 141);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elDatoSiguiente = manejador.getAnterior();
				txtDato.setText("" + elDatoSiguiente);
			}
		});
		btnAnterior.setBounds(78, 50, 58, 23);
		contentPane.add(btnAnterior);
		
		JButton btnIrPrimero = new JButton("<<");
		btnIrPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int elDatoSiguiente = manejador.getPrimero();
				txtDato.setText("" + elDatoSiguiente);
			}
		});
		btnIrPrimero.setBounds(10, 50, 58, 23);
		contentPane.add(btnIrPrimero);
		
		JButton btnSiguiente = new JButton(">");
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
				
			}
		});
		btnAgregar.setBounds(265, 11, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnIrUltimo = new JButton(">>");
		btnIrUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elDatoSiguiente = manejador.getUtlimo();
				txtDato.setText("" + elDatoSiguiente);
			}
		});
		btnIrUltimo.setBounds(293, 50, 61, 23);
		contentPane.add(btnIrUltimo);
	}
}
