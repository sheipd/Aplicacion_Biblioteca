package com.company;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class VentanaPrest {

    private JFrame frmPrstamo;
    private JTextField txtInicio;
    private JTextField txtFin;

    public VentanaPrest() {
        initialize();
    }

    private void initialize() {
        frmPrstamo = new JFrame();
        frmPrstamo.setTitle("Pr\u00E9stamo");
        frmPrstamo.setBounds(100, 100, 490, 120);
        frmPrstamo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPrstamo.getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel pnlAbajo = new JPanel();
        pnlAbajo.setBackground(new Color(248, 248, 255));
        frmPrstamo.getContentPane().add(pnlAbajo, BorderLayout.SOUTH);
        pnlAbajo.setLayout(new GridLayout(0, 4, 0, 0));

        JButton btnFinPres = new JButton("Fin del pr\u00E9stamo");
        btnFinPres.setBackground(new Color(230, 230, 250));
        btnFinPres.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        pnlAbajo.add(btnFinPres);

        JLabel lblVacio = new JLabel(" ");
        lblVacio.setBackground(new Color(240, 248, 255));
        pnlAbajo.add(lblVacio);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBackground(new Color(230, 230, 250));
        pnlAbajo.add(btnGuardar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBackground(new Color(230, 230, 250));
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmPrstamo.dispose();
            }
        });
        pnlAbajo.add(btnCancelar);

        JPanel pnlArriba = new JPanel();
        frmPrstamo.getContentPane().add(pnlArriba, BorderLayout.CENTER);
        pnlArriba.setLayout(new GridLayout(1, 2, 0, 0));

        JPanel pnlIzq = new JPanel();
        pnlIzq.setBackground(new Color(248, 248, 255));
        pnlArriba.add(pnlIzq);

        JLabel lblInicio = new JLabel("Inicio");
        pnlIzq.add(lblInicio);

        txtInicio = new JTextField();
        pnlIzq.add(txtInicio);
        txtInicio.setColumns(10);

        JPanel pnlDer = new JPanel();
        pnlDer.setBackground(new Color(248, 248, 255));
        pnlArriba.add(pnlDer);

        JLabel lblFin = new JLabel("Fin");
        pnlDer.add(lblFin);

        txtFin = new JTextField();
        pnlDer.add(txtFin);
        txtFin.setColumns(10);

        frmPrstamo.setResizable(false);
        frmPrstamo.setVisible(true);
    }
}
