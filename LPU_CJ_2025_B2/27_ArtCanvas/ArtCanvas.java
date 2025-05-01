// import javax.imageio.ImageIO;
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
// import java.awt.image.BufferedImage;
// import java.io.File;
// import java.io.IOException;


// public class ArtCanvas extends JFrame {

//     DrawArea drawArea;
//     JButton clearBtn, savebtn, pickColor, undoBtn;
//     JSlider brushSlider;
//     JComboBox colorPicker;

//     public ArtCanvas(){
//         setTitle("Art Canvas");
//         setSize(800,800);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());

//         drawArea = new DrawArea(); //Initilize the custom drawing panel;
//         add(drawArea, BorderLayout.CENTER);

//         //panel for holding buttons and control
//         JPanel controls = new JPanel();

//         clearBtn = new JButton("Clear");
//         clearBtn.addActionListener(e -> drawArea.clearCanvas());
//         controls.add(clearBtn);

//         brushSlider = new JSlider(1,20,5);
//         brushSlider.addChangeListener(e -> drawArea.setBrushSize(brushSlider.getValue()));
//         controls.add(new JLabel("Brush size : "));
//         controls.add(brushSlider);

// //        colorPicker = new JComboBox(new String[]{"Black", "Red", "Green", "Blue", "Orange", "Pink"});
// //        colorPicker.addActionListener(e -> drawArea.setColor((String) colorPicker.getSelectedItem()));
// //        controls.add(colorPicker);

//         pickColor = new JButton("Pick Color");
//         pickColor.addActionListener(e -> {
//             Color selectedColor = JColorChooser.showDialog(null, "Choose Custom Color",Color.BLACK);
//             if(selectedColor != null) drawArea.setCustomBrushColor(selectedColor);
//         });
//         controls.add(pickColor);

//         savebtn = new JButton("Save");
//         savebtn.addActionListener(e->drawArea.saveImage());
//         controls.add(savebtn);

//         undoBtn = new JButton("Undo");

//         controls.add(undoBtn);

//         add(controls, BorderLayout.SOUTH);

//         setVisible(true);
//     }

//     class DrawArea extends JPanel{

//         Image image;
//         int prevX, prevY;
//         Graphics2D g2;
//         Color brushColor = Color.BLACK;
//         int brushSize = 5;
//         BufferedImage previousState;

//         DrawArea(){
//             setDoubleBuffered(false);
//             addMouseListener(new MouseAdapter() {
//                 @Override
//                 public void mousePressed(MouseEvent e) {
//                     prevX = e.getX(); //save starting x
//                     prevY = e.getY(); //save starting y
//                 }
//             });

//             addMouseMotionListener(new MouseMotionAdapter() {
//                 @Override
//                 public void mouseDragged(MouseEvent e) {
//                     int x = e.getX(); //new x
//                     int y = e.getY(); //new Y

//                     if(g2 != null) {

//                         g2.setColor(brushColor);
//                         //set brush thickness and style
//                         g2.setStroke(new BasicStroke(brushSize, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
//                         //draw line from previous to current point
//                         g2.drawLine(prevX, prevY, x, y);
//                         repaint();
//                         prevX = x; //updated previous x position
//                         prevY = y; //updated previous y position
//                     }
//                 }
//             });

//         }

//         protected void paintComponent(Graphics g){
//             if(image == null) {
//                 image = createImage(getSize().width, getSize().height);
//                 g2 =(Graphics2D) image.getGraphics();

//                 clearCanvas();

//             }
//             g.drawImage(image, 0,0,null);
//         }

//         void clearCanvas(){
//             g2.setPaint(Color.WHITE);
//             g2.fillRect(0,0, getSize().width, getSize().height);
//             g2.setPaint((brushColor));
//             repaint();
//         }

//         void setBrushSize(int size){
//             brushSize = size;
//         }

// //        void setColor(String colorName){
// //            switch (colorName){
// //                case "Red" : brushColor = Color.RED; break;
// //                case "Green" : brushColor = Color.GREEN; break;
// //                case "Blue" : brushColor = Color.BLUE; break;
// //                case "Orange" : brushColor = Color.ORANGE; break;
// //                case "Pink" : brushColor = Color.PINK; break;
// //                default: brushColor = Color.BLACK;
// //            }
// //        }

//         void setCustomBrushColor(Color color){
//             brushColor = color;
//         }

//         void saveImage(){
//             try {
//                 BufferedImage bi = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
//                 Graphics2D g2d = bi.createGraphics();
//                 paint(g2d);
//                 ImageIO.write(bi, "PNG", new File("MyArt.png"));
//                 JOptionPane.showMessageDialog(null, "Saved successfully");
//             } catch (IOException e) {
//                 throw new RuntimeException(e);
//             }
//         }
//     }



//     public static void main(String[] args) {

//         SwingUtilities.invokeLater(ArtCanvas::new);
//     }
// }
