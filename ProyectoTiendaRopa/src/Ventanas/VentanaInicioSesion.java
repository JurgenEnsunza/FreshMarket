package Ventanas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaInicioSesion extends JFrame{
	JButton  btnIniciarSesionCliente,    btnIniciarSesionAdmin,     btnRegistrarseCliente;
	JPanel   pNorte,    pSur,    pCentro,   pCentroIzquierda,   pCentroDerecha, panelDNIinicio, panelDNIregistro, panelCONTRAinicio, panelCONTRAregistro, panelFECHANACIMIENTOregistro, panelNOMBREregistro ;
	JLabel   lblDNIregistro, lblNOMBREregistro, lblFECHANACIMIENTOregistro, lblCONTRAregistro, lblDNIinicio, lblCONTRAinicio, tituloInicio, tituloRegistro;
	JTextField   txtDNIregistro, txtDNIinicio, txtFECHANACIMIENTOregistro, txtNOMBREregistro;
	JPasswordField   txtCONTRAregistro,      txtCONTRAinicio;
	
	//private static final String nomficheroClientes = "Clientes.csv";
	  
	

	public VentanaInicioSesion() {
		// TODO Auto-generated constructor stub
		setSize(500,400);
		setVisible(true);
		
		pNorte = new JPanel(new GridLayout(1, 2));
		pCentro = new JPanel(new GridLayout(1, 2));
		pSur = new JPanel();
		pCentroIzquierda = new JPanel(new GridLayout(2, 2));
		panelDNIinicio = new JPanel(new GridLayout(3,0));
		panelCONTRAinicio = new JPanel(new GridLayout(3,0));
		
		pCentroDerecha = new JPanel(new GridLayout(4, 2));
		panelDNIregistro =  new JPanel(new GridLayout(3,0));
		panelNOMBREregistro = new JPanel(new GridLayout(3,0));
		panelFECHANACIMIENTOregistro = new JPanel(new GridLayout(3,0));
		panelCONTRAregistro = new JPanel(new GridLayout(3,0));
		pCentro.add(pCentroIzquierda);
		pCentro.add(pCentroDerecha);
		getContentPane().add(pNorte, BorderLayout.NORTH);
		getContentPane().add(pCentro, BorderLayout.CENTER);
		getContentPane().add(pSur, BorderLayout.SOUTH);
		
		
		lblDNIregistro = new  JLabel("       DNI: ");
		lblDNIregistro.setFont(new Font(Font.SANS_SERIF, Font.ITALIC,27));
		lblNOMBREregistro = new JLabel("       Nombre: ");
		lblNOMBREregistro.setFont(new Font(Font.SANS_SERIF, Font.ITALIC,27));
		lblFECHANACIMIENTOregistro = new JLabel("        Fecha Nacimiento: ");
		lblFECHANACIMIENTOregistro.setFont(new Font(Font.SANS_SERIF, Font.ITALIC,27));
		lblCONTRAregistro = new JLabel ("        Contraseña: ");
		lblCONTRAregistro.setFont(new Font(Font.SANS_SERIF, Font.ITALIC,27));
		lblDNIinicio = new JLabel ("    DNI: ");
		lblDNIinicio.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 29));
		lblCONTRAinicio = new JLabel("    Contraseña: ");
		lblCONTRAinicio.setFont(new Font(Font.SANS_SERIF, Font.ITALIC,29));
		txtDNIregistro = new JTextField();
		txtDNIinicio = new JTextField();
		txtNOMBREregistro = new  JTextField();
		txtFECHANACIMIENTOregistro = new JTextField();
		txtCONTRAinicio = new JPasswordField();
		txtCONTRAregistro = new  JPasswordField();
		
		
		pCentroIzquierda.add(lblDNIinicio);
		pCentroIzquierda.add(panelDNIinicio);
		panelDNIinicio.add(new JPanel());
		panelDNIinicio.add(txtDNIinicio);
		panelDNIinicio.add(new JPanel());
		pCentroIzquierda.add(lblCONTRAinicio);
		pCentroIzquierda.add(panelCONTRAinicio);
		panelCONTRAinicio.add(new JPanel());
		panelCONTRAinicio.add(txtCONTRAinicio);
		panelCONTRAinicio.add(new JPanel());
		
		
		pCentroDerecha.add(lblDNIregistro);	
		pCentroDerecha.add(panelDNIregistro);
		panelDNIregistro.add(new JPanel());
		panelDNIregistro.add(txtDNIregistro);
		panelDNIregistro.add(new JPanel());
		
		
		pCentroDerecha.add(lblNOMBREregistro);
		pCentroDerecha.add(panelNOMBREregistro);
		panelNOMBREregistro.add(new JPanel());
		panelNOMBREregistro.add(txtNOMBREregistro);
		panelNOMBREregistro.add(new JPanel());
		
		
		pCentroDerecha.add(lblFECHANACIMIENTOregistro);
		pCentroDerecha.add(panelFECHANACIMIENTOregistro);
		panelFECHANACIMIENTOregistro.add(new JPanel());
		panelFECHANACIMIENTOregistro.add(txtFECHANACIMIENTOregistro);
		panelFECHANACIMIENTOregistro.add(new JPanel());
		
		
		
		
		pCentroDerecha.add(lblCONTRAregistro);
		pCentroDerecha.add(panelCONTRAregistro);
		panelCONTRAregistro.add(new JPanel());
		panelCONTRAregistro.add(txtCONTRAregistro);
		panelCONTRAregistro.add(new JPanel());
		
		
		
		
		btnIniciarSesionAdmin=new JButton("Inicio Sesion como Administrador ");
		btnIniciarSesionCliente = new JButton("Inicia Sesion como Cliente ");
		btnRegistrarseCliente= new JButton("Registrate");
		
		
		
		
		pSur.add(btnIniciarSesionAdmin);
		pSur.add(btnIniciarSesionCliente);
		pSur.add(btnRegistrarseCliente);
		
		tituloInicio= new JLabel("INICIA SESION AQUI");
		tituloRegistro = new JLabel("REGISTRATE AQUI");
		
		
		pNorte.add(tituloInicio);
		pNorte.add(tituloRegistro);
		
		
		
		
		
		
		
		/*btnIniciarSesionAdmin.addActionListener((e -> {
			String dni = txtDNIinicio.getText();
			String contra = txtCONTRAinicio.getText();
			
			}));*/	
			
		
				
				
	
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame VentanaInicioSesion = new  VentanaInicioSesion();
		

	}

}
