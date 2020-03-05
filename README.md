# CROC Java School

## Домашние задания

Домашние задания курса по разработке на Java от IT-компании КРОК.
Выполнил Константин Брударь.

### Задача 1: [Решение](https://github.com/konstantin-brudar/croc-java-school/blob/master/Task_1.java)
Задан массив целых чисел. Необходимо переставить наименьшее из этих чисел в начало массива, а наибольшее - в конец.

### Задача 1*: [Решение](https://github.com/konstantin-brudar/croc-java-school/blob/master/Task_1_star.java)
Написать метод, форматирующий и выводящий на экран заданный размер в байтах в человекочитаемом виде.

Человекочитаемый вид: 
```{целая часть < 1024}.{дробная часть макс. 1 знак} {единица измерения}```

Например:
```java
printBytes(23) -> "23.0 B"
printBytes(1024) -> "1.0 KB"
printBytes(53692044905543) -> "48.8 TB"
```

### Задача 2: [Решение](https://github.com/konstantin-brudar/croc-java-school/tree/master/task_2)
Вы разрабатываете небольшое приложение по аннотированию (разметке) изображений с целью последующего использования этой разметки для обучения моделей computer vision. В этом приложении пользователь может выделять области на изображении с помощью прямоугольников и окружностей и подписывать их произвольным текстом.

Прямоугольники определяются координатами левого нижнего и правого верхнего углов, а окружности - координатами центра и радиусом. Вся разметка для изображения представляется массивом ```Annotation[]```.

Определите класс ```Annotation``` для представления данных разметки (подпись + фигура) и классы ```Figure```, ```BoundingBox```, ```Circle``` для задания размеченных областей.

### Задача 2*: [Решение](https://github.com/konstantin-brudar/croc-java-school/tree/master/task_2_star)
От пользователей приложения пришел запрос на возможности перемещать уже размеченные области. Для поддержки новой функциональности вам требуется внести несколько изменений: 

1. Выбор аннотации по координатам точки ```(x, y)```.
В массиве аннотаций требуется найти первую, фигура которой содержит точку с заданными координатами.
```java
Annotation findByPoint(Annotation[] annotations, int x, int y) {
  // ...
}
```

2. Перемещение фигуры выбранной аннотации на смещение ```(dx, dy)```.
В рамках этого изменения вы решили доработать классы фигур таким образом, чтобы они реализовывали интерфейс:
```java
public interface Moveable {
  void move(int dx, int dy);
}
```

Доработайте классы и реализуйте метод ```findByPoint```.

### Задача 3: [Решение](https://github.com/konstantin-brudar/croc-java-school/tree/master/task_3)

Определить класс, описывающий позицию на шахматной доске 8x8. Данные класса: компоненты x и y, отсчитываемые от левого нижнего угла (x = 0, y = 0 - левая нижняя клетка). Все методы, позволяющие установить координаты, в том числе и конструкторы, должны проверять корректность аргументов и генерировать ```IllegalArgumentException``` в случае ошибочных значений.

Переопределить метод ```toString()```, выводящий координаты позиции в формате ```<номер колонки в виде буквы от 'a' до 'h'><номер строки, начиная с 1>```. Например, позиция с координатами (1, 1) имеет строковое представление "b2".


### Задача 3*: [Решение](https://github.com/konstantin-brudar/croc-java-school/tree/master/task_3_star)

В виде массива строк задана некоторая последовательность позиций на шахматной доске 8x8. Например, "b1", "a3", "c4", "d6". Реализовать метод, проверяющий, что последовательность может быть пройдена фигурой конь в соответствии с правилами хода этой фигуры (буквой "Г"). На вход метод должени принимать массив объектов класса, определенных в предыдущей задаче.

Определить новый класс обрабатываемого исключения, которое генерируется методом проверки в случае ошибки. 
```java
public class IllegalMoveException extends Exception {
    // ...
}
```

Класс должен содержать информацию о неправильном ходе: из какой в какую позиции ход запрещен.

При вызове метода проверки это исключение должно обрабатываться, а неправильный ход выводиться на экран.

Пример:
```
[in]  "g8", "e7", "e6"
[out] "конь так не ходит: e7 -> e6"
```
```
[in]  "g8", "e7", "c8"
[out] "OK"
```

## Практические задания

Практические задания на лекциях.

### Задача 1: [Решение](https://github.com/konstantin-brudar/croc-java-school/tree/master/practical_task_1)

Реализовать иерархию классов для представления цвета в следующих моделях (подробности по моделям см. в wikipedia):
* 8-bit grayscale
* 24-bit RGB
* HSV

1. Для каждого вида представления выделить набор значимых свойств/полей, их допустимые значения и способы изменения.

2. Для всех вариантов задания цвета реализовать возможность получить соответствующее значение в RGB-модели:
```java
??? toRgb() {
    // return rgb color representation
}
```

RGB-значение может быть "упаковано" в int, массив из трех элементов или представлено классом.

3. Определить класс цветовой палитры - набора цветов фиксированного размера. Палитра может содержать цвета из различных моделей.

Определить метрику близости двух RGB-цветов как евклидово расстояние по компонентам r, g и b: ```d_rgb^2 = dr^2 + dg^2 + db^2```

Реализовать метод, позволяющий найти цвет из палитры, наиболее близкий заданному по значению. Если c - произвольный цвет, то pc - цвет из палитры, такой что ```d_rgb(pc, c)``` минимально среди всех цветов палитры.
