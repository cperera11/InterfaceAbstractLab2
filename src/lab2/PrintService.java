/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author Chathuri Perera
 */
public class PrintService {

    private String report;

    public String getReport() {
        return report;
    }

    public void setReport(String text) {
        this.report = text;
    }

    public void printReport(String text) {
        setReport(text);
        JOptionPane.showMessageDialog(null, getReport());
    }

}
