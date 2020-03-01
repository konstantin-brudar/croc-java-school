package task_2;

import task_2.Figure;

class Annotation {
    private String label;
    private Figure figure;

    Annotation(Figure figure, String label) {
        this.label = label;
        this.figure = figure;
    }

    public Figure getFigure() {
        return figure;
    }

    public String getLabel() {
        return label;
    }
}
