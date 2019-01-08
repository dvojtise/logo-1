package fr.inria.sed.logo.design;

import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

/**
 * This class is used to create a popup dialog
 * box to display the contents as information
 * to the user. This dialog is same as infopopup
 * dialog provided by Eclipse.
 * 
 *
 */
public class InfoPopUp extends PopupDialog {

    /**
     * The text control that displays the text.
     */
    private Text text;

    /**
     * The String shown in the popup.
     */
    private String contents = "";

    private final static int SHELL_STYLE = PopupDialog.INFOPOPUP_SHELLSTYLE;

    public InfoPopUp(Shell parent, String infoText) {
        this(parent, SHELL_STYLE, false, false, false, false, false, null,
                infoText);
    }

    public InfoPopUp(Shell parent, String titleText, String infoText) {
        this(parent, SHELL_STYLE, false, false, false, true, true, titleText,
                infoText);
    }

    public InfoPopUp(Shell parent, int shellStyle, boolean takeFocusOnOpen,
            boolean persistSize, boolean persistLocation,
            boolean showDialogMenu, boolean showPersistActions,
            String titleText, String infoText) {
        super(parent, shellStyle, takeFocusOnOpen, persistSize,
                persistLocation, showDialogMenu, showPersistActions, titleText,
                infoText);
    }

    /**
     * This method is used to show the animation by decreasing the x and y
     * coordinates and by setting the size dynamically.
     * 
     * @param shell
     *            of type {@link Shell}
     */
    private static void doAnimation(Shell shell) {
        Point shellArea = shell.getSize();
        int x = shellArea.x;
        int y = shellArea.y;
        while (x != -200) {
            try {
                shell.setSize(x--, y--);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void fillDialogMenu(IMenuManager dialogMenu) {
        dialogMenu.addMenuListener(new IMenuListener() {
            public void menuAboutToShow(IMenuManager arg0) {
                handleShellCloseEvent();
            }
        });
    }

    protected void handleShellCloseEvent() {
        // Comment out the following if do not want any kind of animated effect.
        doAnimation(getShell());
        super.handleShellCloseEvent();
    }

    protected Control createDialogArea(Composite parent) {
        text = new Text(parent, SWT.MULTI | SWT.READ_ONLY | SWT.WRAP | SWT.NO_FOCUS );
        text.setText(contents);
        return text;
    }

    protected void adjustBounds() {
        super.adjustBounds();
        // Point pt = getShell().getDisplay().getCursorLocation();
        // getShell().setBounds(pt.x,pt.y,rectangle.width,rectangle.height);
    }

    /**
     * Method to set the text contents of the InfoPop dialog
     * 
     * @param textContents
     *            of type String indicating the message
     */
    public void setText(String textContents) {
        this.contents = textContents;
    }

    protected Control createTitleMenuArea(Composite arg0) {
        Control ctrl = super.createTitleMenuArea(arg0);
        Composite composite = (Composite) ctrl;
        Control[] ctrls = composite.getChildren();

        ToolBar toolBar = (ToolBar) ctrls[1];
        ToolItem[] toolItems = toolBar.getItems();
        toolItems[0].setImage(Display.getDefault().getSystemImage(SWT.ICON_INFORMATION));

        return ctrl;
    }
}