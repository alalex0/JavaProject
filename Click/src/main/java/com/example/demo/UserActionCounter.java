package com.example.demo;
/**
 * JavaFX приложение для подсчета действий пользователя
 *
 * Требования:
 * - Java 8 или выше
 * - JavaFX SDK (для Java 11+ необходимо установить JavaFX отдельно)
 *
 * Компиляция:
 * javac --module-path <путь_к_javafx_lib> --add-modules javafx.controls UserActionCounterFX.java
 *
 * Запуск:
 * java --module-path <путь_к_javafx_lib> --add-modules javafx.controls UserActionCounterFX
 *
 * Или для Java 8 (если JavaFX встроен):
 * javac UserActionCounterFX.java
 * java UserActionCounterFX
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class UserActionCounter extends Application {
    // Счетчики действий
    private int buttonClickCount = 0;
    private int textAreaScrollCount = 0;
    private int radioButtonChangeCount = 0;
    private int sliderChangeCount = 0;

    // Компоненты GUI
    private Label buttonClickLabel;
    private Label scrollLabel;
    private Label radioButtonLabel;
    private Label sliderLabel;
    private Label totalLabel;

    private Button actionButton;
    private TextArea textArea;
    private ScrollPane scrollPane;
    private ToggleGroup radioGroup;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private Slider slider;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Подсчет действий пользователя");

        // Главный контейнер
        VBox root = new VBox(10);
        root.setPadding(new Insets(15));
        root.setStyle("-fx-background-color: #f5f5f5;");

        // Панель со счетчиками
        VBox counterPanel = createCounterPanel();

        // Панель с элементами управления
        VBox controlPanel = createControlPanel();

        // Добавляем панели
        root.getChildren().addAll(counterPanel, controlPanel);

        Scene scene = new Scene(root, 600, 700);
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();
    }

    private VBox createCounterPanel() {
        VBox panel = new VBox(8);
        panel.setPadding(new Insets(10));
        panel.setStyle("-fx-background-color: white; -fx-border-color: #cccccc; -fx-border-width: 2; -fx-border-radius: 5;");

        Label titleLabel = new Label("Счетчики действий");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        buttonClickLabel = new Label("Нажатия на кнопку: 0");
        scrollLabel = new Label("Прокрутки текста: 0");
        radioButtonLabel = new Label("Переключения радио-кнопок: 0");
        sliderLabel = new Label("Изменения ползунка: 0");
        totalLabel = new Label("Всего действий: 0");

        // Стили для меток
        String labelStyle = "-fx-font-size: 14px; -fx-font-weight: bold;";
        buttonClickLabel.setStyle(labelStyle);
        scrollLabel.setStyle(labelStyle);
        radioButtonLabel.setStyle(labelStyle);
        sliderLabel.setStyle(labelStyle);
        totalLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #0066cc;");

        Separator separator = new Separator();

        panel.getChildren().addAll(
                titleLabel,
                buttonClickLabel,
                scrollLabel,
                radioButtonLabel,
                sliderLabel,
                separator,
                totalLabel
        );

        return panel;
    }

    private VBox createControlPanel() {
        VBox panel = new VBox(15);
        panel.setPadding(new Insets(10));
        panel.setStyle("-fx-background-color: white; -fx-border-color: #cccccc; -fx-border-width: 2; -fx-border-radius: 5;");

        Label titleLabel = new Label("Элементы управления");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        // Кнопка
        actionButton = new Button("Нажмите меня!");
        actionButton.setPrefSize(200, 40);
        actionButton.setStyle("-fx-font-size: 14px;");
        actionButton.setOnAction(e -> {
            buttonClickCount++;
            updateCounters();
        });

        HBox buttonBox = new HBox(actionButton);
        buttonBox.setAlignment(Pos.CENTER_LEFT);
        buttonBox.setPadding(new Insets(5));

        // Прокручиваемая область текста
        textArea = new TextArea();
        textArea.setWrapText(true);
        textArea.setPrefRowCount(8);
        textArea.setText("Это прокручиваемая область текста.\nПрокрутите этот текст, чтобы увеличить счетчик прокруток.\n\n" +
                "Вы можете добавить сюда свой текст.\nПопробуйте прокрутить вниз или вверх.\n\n" +
                "Счетчик будет увеличиваться при каждой прокрутке.\n\n" +
                "Добавьте еще больше текста, чтобы увидеть ползунок прокрутки.\n" +
                "Прокрутите вниз, чтобы увидеть больше контента.\n" +
                "И еще немного текста для демонстрации прокрутки.\n\n" +
                "Продолжайте прокручивать, чтобы увидеть, как работает счетчик.\n" +
                "Каждое движение прокрутки будет зафиксировано.\n" +
                "Попробуйте использовать колесико мыши или ползунок справа.\n\n" +
                "Еще больше текста для тестирования прокрутки...\n" +
                "И еще несколько строк, чтобы обеспечить достаточную длину текста.");

        // Отслеживание прокрутки через изменение значения scrollTop
        // Используем простой подход: считаем каждое значимое изменение
        final Double[] lastScrollValue = {0.0};
        textArea.scrollTopProperty().addListener((observable, oldValue, newValue) -> {
            if (oldValue != null && newValue != null) {
                double diff = Math.abs(newValue.doubleValue() - lastScrollValue[0]);
                // Учитываем только изменения больше небольшого порога, чтобы избежать лишних срабатываний
                if (diff > 0.5) {
                    textAreaScrollCount++;
                    lastScrollValue[0] = newValue.doubleValue();
                    updateCounters();
                }
            }
        });

        VBox textAreaBox = new VBox(5);
        textAreaBox.setPadding(new Insets(5));
        Label textAreaLabel = new Label("Прокручиваемая область текста:");
        textAreaLabel.setStyle("-fx-font-weight: bold;");
        textAreaBox.getChildren().addAll(textAreaLabel, textArea);

        // Радио-кнопки
        VBox radioBox = new VBox(8);
        radioBox.setPadding(new Insets(5));
        Label radioLabel = new Label("Радио-кнопки:");
        radioLabel.setStyle("-fx-font-weight: bold;");

        radioGroup = new ToggleGroup();
        radioButton1 = new RadioButton("Вариант 1");
        radioButton2 = new RadioButton("Вариант 2");
        radioButton3 = new RadioButton("Вариант 3");

        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
        radioButton3.setToggleGroup(radioGroup);
        radioButton1.setSelected(true);

        // Обработчик изменений для радио-кнопок
        radioGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null && newValue != oldValue) {
                radioButtonChangeCount++;
                updateCounters();
            }
        });

        HBox radioButtonsBox = new HBox(15);
        radioButtonsBox.getChildren().addAll(radioButton1, radioButton2, radioButton3);
        radioBox.getChildren().addAll(radioLabel, radioButtonsBox);

        // Ползунок
        VBox sliderBox = new VBox(5);
        sliderBox.setPadding(new Insets(5));
        Label sliderLabelTitle = new Label("Ползунок:");
        sliderLabelTitle.setStyle("-fx-font-weight: bold;");

        slider = new Slider(0, 100, 50);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(25);
        slider.setMinorTickCount(5);
        slider.setSnapToTicks(false);

        // Обработчик изменений для ползунка
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            if (oldValue != null && newValue != null && !oldValue.equals(newValue)) {
                // Учитываем только окончательные изменения (когда пользователь отпустил ползунок)
                // Но для более точного подсчета считаем каждое изменение
                sliderChangeCount++;
                updateCounters();
            }
        });

        Label sliderValueLabel = new Label("Значение: 50");
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            sliderValueLabel.setText("Значение: " + String.format("%.0f", newValue.doubleValue()));
        });

        sliderBox.getChildren().addAll(sliderLabelTitle, slider, sliderValueLabel);

        // Добавляем все элементы в панель
        panel.getChildren().addAll(
                titleLabel,
                buttonBox,
                textAreaBox,
                radioBox,
                sliderBox
        );

        return panel;
    }

    private void updateCounters() {
        buttonClickLabel.setText("Нажатия на кнопку: " + buttonClickCount);
        scrollLabel.setText("Прокрутки текста: " + textAreaScrollCount);
        radioButtonLabel.setText("Переключения радио-кнопок: " + radioButtonChangeCount);
        sliderLabel.setText("Изменения ползунка: " + sliderChangeCount);

        int total = buttonClickCount + textAreaScrollCount + radioButtonChangeCount + sliderChangeCount;
        totalLabel.setText("Всего действий: " + total);
    }


}

