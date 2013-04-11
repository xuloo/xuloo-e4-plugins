package cc.xuloo.ds;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

public class Fonts {
	
	public static final String DEFAULT_FONT_NAME = "sans-serif";
	
	public static final Font bold14;
	public static final Font bold12;
	public static final Font normal;
	public static final Font small;
	
	public static final Font white;
	public static final Font grey;
	public static final Font big;
	
	public static final Font dateFont;
	public static final Font iconFont;
	public static final Font fixtureFont;
	public static final Font competitionFont;
	public static final Font scoreFont;
	
	public static final Font largeFont;
	public static final Font smallFont;

	static {
		bold14 = new Font(Display.getDefault(), DEFAULT_FONT_NAME, 10, SWT.BOLD);
		bold12 = new Font(Display.getDefault(), DEFAULT_FONT_NAME, 10, SWT.BOLD);
		normal = new Font(Display.getDefault(), DEFAULT_FONT_NAME, 10, SWT.NONE);
		small = new Font(Display.getDefault(), DEFAULT_FONT_NAME, 9, SWT.NONE);
		
		white = new Font(Display.getDefault(), Fonts.DEFAULT_FONT_NAME, 16, SWT.BOLD);
		grey = new Font(Display.getDefault(), Fonts.DEFAULT_FONT_NAME, 12, SWT.NONE);
		big = new Font(Display.getDefault(), Fonts.DEFAULT_FONT_NAME, 20, SWT.BOLD);
		
		dateFont = new Font(Display.getDefault(), Fonts.DEFAULT_FONT_NAME, 8, SWT.NONE);
		iconFont = new Font(Display.getDefault(), Fonts.DEFAULT_FONT_NAME, 6, SWT.NONE);
		fixtureFont = new Font(Display.getDefault(), Fonts.DEFAULT_FONT_NAME, 12, SWT.BOLD);
		competitionFont = new Font(Display.getDefault(), Fonts.DEFAULT_FONT_NAME, 10, SWT.NONE);
		scoreFont = new Font(Display.getDefault(), Fonts.DEFAULT_FONT_NAME, 11, SWT.BOLD);
		
		largeFont = new Font(null, Fonts.DEFAULT_FONT_NAME, 12, SWT.BOLD);
		smallFont = new Font(null, Fonts.DEFAULT_FONT_NAME, 10, SWT.BOLD);
	}

//	public static final String HELVETICA_NEUE_LT_PRO_LIGHT = "HelveticaNeueLTPro-Lt.otf";
//
//	public static boolean fontsLoaded = false;
//	
//	public static void loadFonts() {
//		if (!fontsLoaded) {
//			Bundle bundle = FrameworkUtil.getBundle(Fonts.class);
//			
//			File file = null;
//			try {
//				URL fileURL = bundle.getEntry("fonts");
//			    file = new File(FileLocator.resolve(fileURL).toURI());
//			    
//			    if (file != null && file.isDirectory()) {
//			    	String[] children = file.list();
//			    	
//			    	for (String child : children) {
//			    		loadFont(bundle, "fonts/" + child);
//			    	}
//			    }
//			} catch (URISyntaxException e1) {
//			    e1.printStackTrace();
//			} catch (IOException e1) {
//			    e1.printStackTrace();
//			}
//			
//			fontsLoaded = true;
//		}
//	}
//	
//	public static void loadFont(Bundle bundle, String key) {
//		File file = null;
//		try {
//			URL fileURL = bundle.getEntry(key);
//		    file = new File(FileLocator.resolve(fileURL).toURI());
//
//			boolean loaded = Display.getDefault().loadFont(file.getAbsolutePath());
//		} catch (URISyntaxException e1) {
//		    e1.printStackTrace();
//		} catch (IOException e1) {
//		    e1.printStackTrace();
//		}
//	}
}
