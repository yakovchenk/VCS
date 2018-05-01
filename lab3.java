import java.awt.Point;
import java.awt.geom.GeneralPath;

public class ShapeFactory
{
  public java.awt.Shape shape;
  public java.awt.BasicStroke stroke;
  public java.awt.Paint paint;
  public int width = 25;
  public int height = 25;
  
  public ShapeFactory(int shape_type) {
    stroke = new java.awt.BasicStroke(3.0F);
    switch (shape_type / 10) {
        ///
     protected void (Graphics gr)
    {
        super.paintComponent(gr);
        Graphics2D g = (Graphics2D) gr;
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.BLACK);
        g.draw(createSimpleStar(50, 200, 200));

        g.setPaint(Color.GREEN);
        g.fill(drawStar(400, 400, 40, 60, 10, 0));

        g.setPaint(new RadialGradientPaint(
            new Point(400, 200), 60, new float[] { 0, 1 }, 
            new Color[] { Color.RED, Color.YELLOW }));
        g.fill(drawStar(400, 200, 20, 60, 8, 0));

        g.setPaint(new RadialGradientPaint(
            new Point(200, 400), 50, new float[] { 0, 0.3f, 1 }, 
            new Color[] { Color.BLACK, Color.YELLOW, Color.ORANGE }));
        g.fill(drawStar(200, 400, 40, 50, 20, 0));

    }
        ////
      break;
    case 2: case 4: case 6: 
    case 8: default: 
      throw new Error("type is nusupported");
    }
    switch (shape_type % 10) {
    case 1:  stroke = new java.awt.BasicStroke(3.0F);
      break;
    case 3: 
      break;
    case 4:  stroke = new java.awt.BasicStroke(7.0F);
      break;
    case 7: 
      paint = new java.awt.GradientPaint(
        -width, -height, java.awt.Color.white, 
        width, height, java.awt.Color.gray, true);
      break;
    case 8: 
      paint = java.awt.Color.red;
      break;
    case 2: case 5: case 6: default: 
      throw new Error("type is nusupported");
    }
  }
  
  private static java.awt.Shape createStar(int arms, Point center, double rOuter, double rInner)
  {
    double angle = 3.141592653589793D / arms;
    
    GeneralPath path = new GeneralPath();
    
    for (int i = 0; i < 2 * arms; i++)
    {
      double r = (i & 0x1) == 0 ? rOuter : rInner;
      java.awt.geom.Point2D.Double p = new java.awt.geom.Point2D.Double(x + Math.cos(i * angle) * r, y + Math.sin(i * angle) * r);
      if (i == 0) path.moveTo(p.getX(), p.getY()); else
        path.lineTo(p.getX(), p.getY());
    }
    path.closePath();
    return path;
    
  }
  ///
     public static void main(String[] args) throws IOException {
       BufferedImage image = ImageIO.read(new File(""));
       int x = 7;
       int y = 7;
       
       boolean isAlfa = checkPix(image, x, y);
       
       if (isAlfa) System.out.println("Пиксель ");
             
    }   
///

}
