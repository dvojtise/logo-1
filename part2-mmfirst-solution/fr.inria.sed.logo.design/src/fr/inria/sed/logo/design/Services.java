package fr.inria.sed.logo.design;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.texteditor.AbstractTextEditor;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;


/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    /**
     * Try to retrieve an xtext resource for the given element and then get its String representation
     * @param any EObject
     * @return the xtext representation of the EObject or an empty string
     */
    public String xtextPrettyPrint(EObject any) {
    	if (any != null && any.eResource() instanceof XtextResource && any.eResource().getURI() != null) {
			String fileURI = any.eResource().getURI().toPlatformString(true);
			IFile workspaceFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(fileURI));
			if (workspaceFile != null) {
				ICompositeNode node = NodeModelUtils.findActualNodeFor(any);
				if (node != null) {
					return node.getText().trim();
				}
			}
    	}
    	return "";
    }
    
    public EObject openTextEditor(EObject any) {
		if (any != null && any.eResource() instanceof XtextResource && any.eResource().getURI() != null) {

			String fileURI = any.eResource().getURI().toPlatformString(true);
			IFile workspaceFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(fileURI));
			if (workspaceFile != null) {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IEditorPart openEditor = IDE.openEditor(page, workspaceFile,
							"fr.inria.sed.logo.xtext.Logo", true);
					if (openEditor instanceof AbstractTextEditor) {
						ICompositeNode node = NodeModelUtils.findActualNodeFor(any);
						if (node != null) {
							int offset = node.getOffset();
							int length = node.getTotalEndOffset() - offset;
							((AbstractTextEditor) openEditor).selectAndReveal(offset, length);
						}
					}
					// editorInput.
				} catch (PartInitException e) {
					Activator.error(e.getMessage(), e);
				}
			}
		}
		System.out.println(any);
		return any;
	}
	
	public EObject openBasicHoveringDialog(EObject any) {
		String xtextString = xtextPrettyPrint(any);
		if (xtextString != null && !xtextString.isEmpty()) {
			IEditorPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();							
			InfoPopUp pop = new InfoPopUp( part.getSite().getShell() , "Textual representation of the element","press ESC to close");
			pop.setText(xtextString);
			pop.open();
		}
		return any;
	}
}
