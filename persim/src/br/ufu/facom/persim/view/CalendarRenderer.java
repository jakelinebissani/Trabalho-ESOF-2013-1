package br.ufu.facom.persim.view;

import com.javaswingcomponents.calendar.JSCCalendar;
import com.javaswingcomponents.calendar.cellrenderers.CalendarCellRenderer;
import com.javaswingcomponents.calendar.cellrenderers.CellRendererComponentParameter;
import java.awt.Color;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Alteracoes sobre o formato e cor do calendario sao controladas por esta classe
 */

public class CalendarRenderer extends JLabel implements CalendarCellRenderer {

    @Override
    public JComponent getCellRendererComponent(CellRendererComponentParameter parameterObject) {
        boolean isToday = parameterObject.isToday;
        boolean isSelected = parameterObject.isSelected;
        boolean isSelectable = parameterObject.isAllowSelection();
        boolean hasKeyboardFocus = parameterObject.isHasFocus();
        boolean isCurrentMonth = parameterObject.isCurrentMonth;
        
        String text = parameterObject.getText();
        Date date = parameterObject.getDate();
        JSCCalendar calendar = parameterObject.getCalendar();

        setHorizontalAlignment(JLabel.CENTER);
        setText(text);
        setOpaque(false);
        
        if (isSelectable) {
            setForeground(Color.BLACK);
        } else {
            setText(text);
            setForeground(Color.LIGHT_GRAY);
        }
        
        if (!isCurrentMonth) {
            setText("");
        }
        
        if (isSelected) {
            setBorder(BorderFactory.createDashedBorder(Color.BLACK, 3, 2));
        } else {
            setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        }
        
        if (isToday && isCurrentMonth) {
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }

        if (hasKeyboardFocus) {
            setBorder(BorderFactory.createDashedBorder(Color.BLACK, 6, 2));
            setOpaque(true);
        }
        return this;

    }

    @Override
    public JComponent getHeadingCellRendererComponent(JSCCalendar calendar, String text) {
        setHorizontalAlignment(JLabel.CENTER);
        setText(text);
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setForeground(Color.BLACK);
        return this;
    }
}
