package cc.xuloo.ds;


public class Fonts {
	
	public static final String DEFAULT_FONT_NAME = "sans-serif";

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
