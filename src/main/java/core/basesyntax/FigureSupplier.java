package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(5);

        ColorSupplier colorSupplier = new ColorSupplier();

        return switch (index) {
            case 0 -> new Square(
                    random.nextDouble(10),
                    colorSupplier.getRandomColor()
            );
            case 1 -> new Rectangle(
                    random.nextDouble(10),
                    random.nextDouble(10),
                    colorSupplier.getRandomColor()
            );
            case 2 -> new IsoscelesTrapezoid(
                    colorSupplier.getRandomColor(),
                    random.nextDouble(10),
                    random.nextDouble(10),
                    random.nextDouble(10)
            );
            case 3 -> new RightTriangle(
                    random.nextDouble(10),
                    random.nextDouble(10),
                    colorSupplier.getRandomColor()
            );
            case 4 -> new Circle(
                    random.nextDouble(10),
                    colorSupplier.getRandomColor()
            );
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }
}
