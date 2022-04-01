package style;

import java.awt.*;

public class Style {
	private static final String FONTNAME = "Helvetica";
	public int indent;
	public Color color;
	protected Font font;
	protected int fontSize;
	public int leading;

	public Style(int indent, Color color, int points, int leading) {
		this.indent = indent;
		this.color = color;
		font = new Font(FONTNAME, Font.BOLD, fontSize=points);
		this.leading = leading;
	}

	public String toString() {
		return "["+ indent + "," + color + "; " + fontSize + " on " + leading +"]";
	}

	public Font getFont(float scale) {
		return font.deriveFont(fontSize * scale);
	}
}
