import java.awt.*;
import java.awt.event.*;



public class probando {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Formulario de envío");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            panel.setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            c.insets = new Insets(5,5,5,5);
            c.fill = GridBagConstraints.HORIZONTAL;

            JLabel lblNombre = new JLabel("Nombre:");
            c.gridx = 0; c.gridy = 0; c.weightx = 0;
            panel.add(lblNombre, c);

            JTextField txtNombre = new JTextField(20);
            c.gridx = 1; c.gridy = 0; c.weightx = 1;
            panel.add(txtNombre, c);

            JLabel lblEmail = new JLabel("Email:");
            c.gridx = 0; c.gridy = 1; c.weightx = 0;
            panel.add(lblEmail, c);

            JTextField txtEmail = new JTextField(20);
            c.gridx = 1; c.gridy = 1; c.weightx = 1;
            panel.add(txtEmail, c);

            JButton btnEnviar = new JButton("Enviar");
            c.gridx = 0; c.gridy = 2; c.gridwidth = 2; c.weightx = 0;
            panel.add(btnEnviar, c);

            btnEnviar.addActionListener(e -> {
                String nombre = txtNombre.getText().trim();
                String email = txtEmail.getText().trim();
                if (nombre.isEmpty() && email.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Por favor, complete al menos un campo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // Ejemplo de acción: mostrar datos y limpiar campos
                    JOptionPane.showMessageDialog(frame,
                            "Enviado:\nNombre: " + nombre + "\nEmail: " + email,
                            "Enviado", JOptionPane.INFORMATION_MESSAGE);
                    txtNombre.setText("");
                    txtEmail.setText("");
                }
            });

            frame.getContentPane().add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}