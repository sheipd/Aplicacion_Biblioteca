package com.company;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.Box;
import javax.swing.JComboBox;

public class Ventana extends JFrame {
    Map<String, Ejemplar> Libro = new TreeMap<>();

    private JPanel contentPane;
    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JTextField txtISBN;

    public enum Categoría {Fantasía, Misterio, Terror, Clásico, Juvenil, Infantil, Romance, Historia, Educación};

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana frame = new Ventana();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Ventana() {
        setTitle("Biblioteca");
        setResizable(false);
        setBackground(new Color(224, 255, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 220);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(240, 248, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel pnlAbajo = new JPanel();
        pnlAbajo.setBackground(new Color(248, 248, 255));
        contentPane.add(pnlAbajo, BorderLayout.SOUTH);
        pnlAbajo.setLayout(new GridLayout(0, 4, 0, 0));

        JButton btnPrestamo = new JButton("Pr\u00E9stamo");
        btnPrestamo.setForeground(new Color(0, 0, 0));
        btnPrestamo.setBackground(new Color(230, 230, 250));
        pnlAbajo.add(btnPrestamo);

        btnPrestamo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) throws NullPointerException{
                new VentanaPrest();
            }
        });

        JLabel lblVacio = new JLabel(" ");
        lblVacio.setBackground(new Color(255, 255, 255));
        pnlAbajo.add(lblVacio);

        JButton btnAñadir = new JButton("A\u00F1adir ejemplar");
        btnAñadir.setBackground(new Color(230, 230, 250));
        pnlAbajo.add(btnAñadir);
        btnAñadir.setEnabled(false);

        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setBackground(new Color(230, 230, 250));
        pnlAbajo.add(btnCerrar);

        JPanel pnlArriba = new JPanel();
        pnlArriba.setBackground(new Color(248, 248, 255));
        contentPane.add(pnlArriba, BorderLayout.NORTH);
        pnlArriba.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JLabel lblTitulo = new JLabel("T\u00EDtulo");
        pnlArriba.add(lblTitulo);

        txtTitulo = new JTextField();
        pnlArriba.add(txtTitulo);
        txtTitulo.setColumns(30);

        JPanel pnlCentro = new JPanel();
        pnlCentro.setBackground(new Color(248, 248, 255));
        contentPane.add(pnlCentro, BorderLayout.CENTER);
        GridBagLayout gbl_pnlCentro = new GridBagLayout();
        gbl_pnlCentro.columnWidths = new int[] {0, 0, 0, 0, 0, 0};
        gbl_pnlCentro.rowHeights = new int[]{0, 0, 0, 0, 0};
        gbl_pnlCentro.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_pnlCentro.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        pnlCentro.setLayout(gbl_pnlCentro);

        Component verticalStrut = Box.createVerticalStrut(20);
        GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
        gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
        gbc_verticalStrut.gridx = 3;
        gbc_verticalStrut.gridy = 0;
        pnlCentro.add(verticalStrut, gbc_verticalStrut);

        JLabel lblAutor = new JLabel("Autor");
        GridBagConstraints gbc_lblAutor = new GridBagConstraints();
        gbc_lblAutor.insets = new Insets(0, 0, 5, 5);
        gbc_lblAutor.anchor = GridBagConstraints.EAST;
        gbc_lblAutor.gridx = 0;
        gbc_lblAutor.gridy = 1;
        pnlCentro.add(lblAutor, gbc_lblAutor);

        txtAutor = new JTextField();
        GridBagConstraints gbc_txtAutor = new GridBagConstraints();
        gbc_txtAutor.insets = new Insets(0, 0, 5, 5);
        gbc_txtAutor.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtAutor.gridx = 1;
        gbc_txtAutor.gridy = 1;
        pnlCentro.add(txtAutor, gbc_txtAutor);
        txtAutor.setColumns(10);

        JLabel lblCategoria = new JLabel("Categor\u00EDa");
        GridBagConstraints gbc_lblCategoria = new GridBagConstraints();
        gbc_lblCategoria.insets = new Insets(0, 0, 5, 5);
        gbc_lblCategoria.anchor = GridBagConstraints.EAST;
        gbc_lblCategoria.gridx = 3;
        gbc_lblCategoria.gridy = 1;
        pnlCentro.add(lblCategoria, gbc_lblCategoria);

        JComboBox cbxCategoría = new JComboBox();
        cbxCategoría.setBackground(new Color(230, 230, 250));
        GridBagConstraints gbc_cbxCategoría = new GridBagConstraints();
        gbc_cbxCategoría.insets = new Insets(0, 0, 5, 0);
        gbc_cbxCategoría.fill = GridBagConstraints.HORIZONTAL;
        gbc_cbxCategoría.gridx = 4;
        gbc_cbxCategoría.gridy = 1;
        pnlCentro.add(cbxCategoría, gbc_cbxCategoría);

        Component verticalStrut_1 = Box.createVerticalStrut(20);
        GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
        gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 5);
        gbc_verticalStrut_1.gridx = 2;
        gbc_verticalStrut_1.gridy = 2;
        pnlCentro.add(verticalStrut_1, gbc_verticalStrut_1);

        JLabel lblISBN = new JLabel("ISBN");
        GridBagConstraints gbc_lblISBN = new GridBagConstraints();
        gbc_lblISBN.anchor = GridBagConstraints.EAST;
        gbc_lblISBN.insets = new Insets(0, 0, 0, 5);
        gbc_lblISBN.gridx = 0;
        gbc_lblISBN.gridy = 3;
        pnlCentro.add(lblISBN, gbc_lblISBN);

        txtISBN = new JTextField();
        GridBagConstraints gbc_txtISBN = new GridBagConstraints();
        gbc_txtISBN.insets = new Insets(0, 0, 0, 5);
        gbc_txtISBN.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtISBN.gridx = 1;
        gbc_txtISBN.gridy = 3;
        pnlCentro.add(txtISBN, gbc_txtISBN);
        txtISBN.setColumns(10);

        JCheckBox chckbxDisp = new JCheckBox("disponibilidad");
        chckbxDisp.setBackground(new Color(240, 248, 255));
        GridBagConstraints gbc_chckbxDisp = new GridBagConstraints();
        gbc_chckbxDisp.gridwidth = 2;
        gbc_chckbxDisp.gridx = 3;
        gbc_chckbxDisp.gridy = 3;
        pnlCentro.add(chckbxDisp, gbc_chckbxDisp);

        if(Libro.containsKey(txtTitulo.getText()) == false && txtTitulo.getText().length() > 0 && txtISBN.getText().length() > 0) btnAñadir.setEnabled(true);

        btnAñadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
