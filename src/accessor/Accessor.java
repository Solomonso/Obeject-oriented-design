package accessor;

import presentation.DemoPresentation;
import xml.LoadSaveXml;

public abstract class Accessor implements LoadSaveXml {

	public static Accessor getDemoAccessor() {
		return new DemoPresentation();
	}

	public Accessor() {
	}


}
