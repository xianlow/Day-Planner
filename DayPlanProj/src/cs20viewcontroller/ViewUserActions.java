///*
// * The controller classes (like the ViewUserActions class) provides actions
// * that the user can trigger through the view classes.  Those actions are 
// * written in this class as private inner classes (i.e. classes 
// * declared inside another class).
// *
// * You can use all the public instance variables you defined in AllModelsForView, 
// * DrawnView, and ViewOutputs as though they were part of this class! This is 
// * due to the magic of subclassing (i.e. using the extends keyword).
// */
//package cs20viewcontroller;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// * ViewUserActions is a class that contains actions users can trigger.
// *
// * User actions are written as private inner classes that implements the
// * ActionListener interface. These actions must be "wired" into the DrawnView in
// * the ViewUserActions constructor, or else they won't be triggered by the user.
// *
// * Actions that the user can trigger are meant to manipulate some model classes
// * by sending messages to them to tell them to update their data members.
// *
// * Actions that the user can trigger can also be used to manipulate the GUI by
// * sending messages to the view classes (e.g. the DrawnView class) to tell them
// * to update themselves (e.g. to redraw themselves on the screen).
// *
// * @author cheng
// */
//public class ViewUserActions extends ViewOutputs {
//
//    /*
//     * Step 1 of 2 for writing user actions.
//     * -------------------------------------
//     *
//     * User actions are written as private inner classes that implement
//     * ActionListener, and override the actionPerformed method.
//     *
//     * Use the following as a template for writting more user actions.
//     */
//    
//    private class changeAnswer implements ActionListener {
//        
//        @Override
//        public void actionPerformed(ActionEvent ae){
//            changeAnswer();
//        }
//    }
//    
//    
//    
//    private class SaveToFileAction implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//
//            try {
//                String pathToFile = showSaveDialog();
//                if (pathToFile == null) {
//                    return;
//                }
//                
//                dayPlanModel.saveToFile(pathToFile);
//            } catch (IOException ex) {
//                Logger.getLogger(ViewUserActions.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//            
//    }
//    
//    
//    /*
//    private class SaveAction implements ActionListener{
//        
//        @Override
//        public void actionPerformed(ActionEvent ae){
//            showSaved();
//        }
//    }
//    */
//    private class button1 implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//            
//            dayPlanModel.setAddUp(2);
//            
//        }
//    }
//    private class button2 implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//            dayPlanModel.setAddUp(4);
//            
//        }
//    }
//    private class button3 implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//            dayPlanModel.setAddUp(6);
//            
//        }
//    }
//    private class button4 implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//            dayPlanModel.setAddUp(8);
//            
//        }
//    }
//    
//    private class selectButtonAction implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//            
//            displayResult();
//        }
//    }
//    
//    private class changeGuiAction implements ActionListener{
//        
//        @Override
//        public void actionPerformed(ActionEvent ae){
//            changeGui();
//        }
//    }
//    
//    
//
//    /*public void showSaved(){
//        
//    }
//     * ViewUserActions constructor used for wiring user actions to GUI elements
//     */
//    public ViewUserActions() {
//        /*
//         * Step 2 of 2 for writing user actions.
//         * -------------------------------------
//         *
//         * Once a private inner class has been written for a user action, you
//         * can wire it to a GUI element (i.e. one of GUI elements you drew in
//         * the DrawnView class and which you gave a memorable public variable
//         * name!).
//         *
//         * Use the following as a template for wiring more user actions.
//         */
//        
//        Button1.addActionListener(new button1());
//        Button2.addActionListener(new button2());
//        Button3.addActionListener(new button3());
//        Button4.addActionListener(new button4());
//        selectButton.addActionListener(new selectButtonAction());
//        SaveButton.addActionListener(new SaveToFileAction());
//        changeGui.addActionListener(new changeGuiAction());
//        changeButton.addActionListener(new changeAnswer());
//    }
//}
