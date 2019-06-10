//package cs20viewcontroller;
//
//import java.io.File;
//import javax.swing.JFileChooser;
//import javax.swing.*;
///**
// * Write methods in this class for displaying data in the DrawnView.
// *
// * You can use all the public instance variables you defined in AllModelsForView
// * and DrawnView as though they were part of this class! This is due to the
// * magic of subclassing (i.e. using the extends keyword).
// *
// * The methods for displaying data in the DrawnView are written as methods in
// * this class.
// *
// * Make sure to use these methods in the ViewUserActions class though, or else
// * they will be defined but never used!
// *
// * @author cheng
// */
//import javax.swing.JApplet;
//import java.util.*;
//
//public class ViewOutputs extends DrawnView {
//
//    public void changeGui() {
//        NewViewer showView = new NewViewer();
//        DrawnView oldView = new DrawnView();
//        showView.field1.setText(Integer.toString(dayPlanModel.getQuestion5()));
//        showView.field2.setText(Integer.toString(dayPlanModel.getQuestion4()));
//        showView.field3.setText(Integer.toString(dayPlanModel.getQuestion2()));
//        showView.field4.setText(Integer.toString(dayPlanModel.getQuestion3()));
//        showView.field5.setText(Integer.toString(dayPlanModel.getQuestion4()));
//        showView.field6.setText(Integer.toString(dayPlanModel.getQuestion1()));
//        showView.setVisible(true);
//        
//        this.dispose();
//
//    }
//
//    public String showSaveDialog() {
//
//        JFileChooser jfc = new JFileChooser();
//        int status = jfc.showSaveDialog(this);
//        if (status == JFileChooser.APPROVE_OPTION) {
//            File theFile = jfc.getSelectedFile();
//            String thePath = theFile.getAbsolutePath();
//            return thePath;
//        }
//
//        return null;
//
//    }
//
//    public void displayResult() {
//        JOptionPane newDialog = new JOptionPane();
//        JOptionPane dialog = new JOptionPane();
//        if (this.Button1.isSelected() || this.Button2.isSelected() || this.Button3.isSelected() || this.Button4.isSelected()
//                || this.OtherButton.isSelected()) {
//
//            if (this.OtherButton.isSelected()) {
//                int x = Integer.parseInt(otherText.getText());
//                dayPlanModel.setAddUp(x);
//            }
//            if (dayPlanModel.setQuestionsAsked() == 1) {
//                if (dayPlanModel.getAddUp() < 8) {
//                    dayPlanModel.setHintTotal(dayPlanModel.setHints(0));
//                    this.HintField.add(dayPlanModel.getHintTotal());
//
//                }
//
//                dayPlanModel.setQuestion1(dayPlanModel.getAddUp());
//            } else if (dayPlanModel.setQuestionsAsked() == 2) {
//                if (dayPlanModel.getAddUp() < 8) {
//                    dayPlanModel.setHintTotal(dayPlanModel.setHints(1));
//                    this.HintField.add(dayPlanModel.getHintTotal());
//                }
//
//                dayPlanModel.setQuestion2(dayPlanModel.getAddUp());
//            } else if (dayPlanModel.setQuestionsAsked() == 3) {
//                if (dayPlanModel.getAddUp() < 6) {
//                    dayPlanModel.setHintTotal(dayPlanModel.setHints(2));
//                    this.HintField.add(dayPlanModel.getHintTotal());
//                }
//
//                dayPlanModel.setQuestion3(dayPlanModel.getAddUp());
//            } else if (dayPlanModel.setQuestionsAsked() == 4) {
//                if (dayPlanModel.getAddUp() < 5) {
//                    dayPlanModel.setHintTotal(dayPlanModel.setHints(3));
//                    this.HintField.add(dayPlanModel.getHintTotal());
//
//                }
//                dayPlanModel.setQuestion4((int) Math.floor(dayPlanModel.getAddUp() / 2));
//
//            } else if (dayPlanModel.setQuestionsAsked() == 5) {
//                if (dayPlanModel.getAddUp() < 3) {
//                    dayPlanModel.setHintTotal(dayPlanModel.setHints(4));
//                    this.HintField.add(dayPlanModel.getHintTotal());
//
//                }
//
//                dayPlanModel.setQuestion5(dayPlanModel.getAddUp());
//                dayPlanModel.setTotal(dayPlanModel.getQuestion1() + dayPlanModel.getQuestion2() + dayPlanModel.getQuestion3() + dayPlanModel.getQuestion4()
//                        + dayPlanModel.getQuestion4() + dayPlanModel.getQuestion5());
//                if (dayPlanModel.getTotal() != 24) {
//                    newDialog.showMessageDialog(this.manyHours, "You have too many hours\n Please click the list with your times and click change when "
//                            + "you click on one of the hours \n" + "You have " + dayPlanModel.getTotal() + " hours.");
//                    this.changeButton.setEnabled(true);
//                    this.selectButton.setEnabled(false);
//                } else if (dayPlanModel.getTotal() == 24) {
//                    this.changeGui.setEnabled(true);
//                    JFrame switchDialog = new JFrame();
//                    String message = "Would you like to switch any of your answers? If yes click yes. If no, click no";
//                    int answer = JOptionPane.showConfirmDialog(switchDialog, message);
//                    if (answer == JOptionPane.YES_OPTION) {
//                        this.changeButton.setEnabled(true);
//                    }
//                    this.selectButton.setEnabled(false);
//                }
//            }
//            dayPlanModel.setTotal(dayPlanModel.getQuestion1() + dayPlanModel.getQuestion2() + dayPlanModel.getQuestion3() + dayPlanModel.getQuestion4()
//                    + dayPlanModel.getQuestion4() + dayPlanModel.getQuestion5());
//            String ans = Integer.toString(dayPlanModel.getTotal());
//
//            this.totalHours.setText("Total Hours: " + dayPlanModel.getTotal());
//            this.buttonGroup1.clearSelection();
//            dayPlanModel.setSaveString(this.QuestionField.getText());
//            this.saveList.add(dayPlanModel.getSaveString());
//            dayPlanModel.setAddUp(0);
//            this.otherText.setText("");
//            this.QuestionField.setText(dayPlanModel.setQuestion(dayPlanModel.setQuestionsAsked()));
//            dayPlanModel.getQuestionsAsked();
//        }
//
//    }
//
//    public void changeAnswer() {
//
//        String[] arrayList = this.HintField.getItems();
//        int x = 0;
//        String field = "";
//        while (x < this.HintField.getItems().length) {
//
//            field += " " + arrayList[x];
//            x++;
//
//        }
//
//        this.QuestionField.setText(dayPlanModel.getQuestions(this.saveList.getSelectedIndex()));
//        if (dayPlanModel.getQuestions(this.saveList.getSelectedIndex()).indexOf("stay at school") >= 0) {
//
//            this.QuestionField.setText(dayPlanModel.setQuestion(1));
//            dayPlanModel.setQuestion2(dayPlanModel.getAddUp());
//            if (dayPlanModel.getQuestion2() == 8) {
//                this.HintField.remove(dayPlanModel.getHints(1));
//            } else if (!field.contains(dayPlanModel.getHints(1))) {
//                this.HintField.add(dayPlanModel.getHints(1));
//            }
//
//        } else if (dayPlanModel.getQuestions(this.saveList.getSelectedIndex()).indexOf("free time") >= 0) {
//
//            this.QuestionField.setText(dayPlanModel.setQuestion(2));
//            dayPlanModel.setQuestion3(dayPlanModel.getAddUp());
//            if (dayPlanModel.getQuestion3() == 6) {
//                this.HintField.remove(dayPlanModel.getHints(2));
//            } else if (!field.contains(dayPlanModel.getHints(2))) {
//                this.HintField.add(dayPlanModel.getHints(2));
//            }
//        } else if (dayPlanModel.getQuestions(this.saveList.getSelectedIndex()).indexOf("eat your meals") >= 0) {
//
//            this.QuestionField.setText(dayPlanModel.setQuestion(3));
//            dayPlanModel.setQuestion4((int) Math.floor(dayPlanModel.getAddUp() / 2));
//            if (dayPlanModel.getQuestion4() == 4) {
//                this.HintField.remove(dayPlanModel.getHints(3));
//            } else if (!field.contains(dayPlanModel.getHints(3))) {
//                this.HintField.add(dayPlanModel.getHints(3));
//            }
//        } else if (dayPlanModel.getQuestions(this.saveList.getSelectedIndex()).indexOf("prepare for school") >= 0) {
//
//            this.QuestionField.setText(dayPlanModel.setQuestion(4));
//            dayPlanModel.setQuestion5(dayPlanModel.getAddUp());
//            if (dayPlanModel.getQuestion5() == 2) {
//                this.HintField.remove(dayPlanModel.getHints(4));
//            } else if (!field.contains(dayPlanModel.getHints(4))) {
//                this.HintField.add(dayPlanModel.getHints(4));
//            }
//        } else if (dayPlanModel.getQuestions(this.saveList.getSelectedIndex()).indexOf("sleep") >= 0) {
//            this.QuestionField.setText(dayPlanModel.getQuestions(0));
//            dayPlanModel.setQuestion1(dayPlanModel.getAddUp());
//            if (dayPlanModel.getQuestion1() == 8) {
//                this.HintField.remove(dayPlanModel.getHints(0));
//            } else if (!field.contains(dayPlanModel.getHints(0))) {
//                this.HintField.add(dayPlanModel.getHints(0));
//            }
//        }
//
//        dayPlanModel.setTotal(dayPlanModel.getQuestion1() + dayPlanModel.getQuestion2() + dayPlanModel.getQuestion3() + dayPlanModel.getQuestion4()
//                + dayPlanModel.getQuestion4() + dayPlanModel.getQuestion5());
//        if (dayPlanModel.getTotal() == 24) {
//            this.changeGui.setEnabled(true);
//        } else {
//            this.changeGui.setEnabled(false);
//        }
//        this.totalHours.setText("Total hours: " + Integer.toString(dayPlanModel.getTotal()));
//        this.saveList.replaceItem(this.QuestionField.getText() + " " + dayPlanModel.getAddUp() + " hours", this.saveList.getSelectedIndex());
//        this.buttonGroup1.clearSelection();
//        System.out.println(dayPlanModel.getTotal());
//        dayPlanModel.setAddUp(0);
//        this.otherText.setText("");
//        this.QuestionField.setText("");
//
//    }
//}
