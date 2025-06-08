package Utilities;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class RegisterFont {

    private static final Map<String, Font> fonts = new HashMap<>();

    static {
        loadFont("nstr", "/Fonts/Instruction.otf");
        loadFont("jack", "/Fonts/JAi_____.TTF");
        loadFont("jost", "/Fonts/Jost-Black.ttf");
        loadFont("vouge", "/Fonts/Vogue.ttf");
    }

    private static void loadFont(String key, String path) {
        try (InputStream is = RegisterFont.class.getResourceAsStream(path)) {
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(font);
            fonts.put(key, font);
        } catch (Exception e) {
            System.err.println("Failed to load font: " + path);
            e.printStackTrace();
        }
    }

    public static Font getFont(String name, float size) {
        Font base = fonts.getOrDefault(name, new Font("SansSerif", Font.PLAIN, (int) size));
        return base.deriveFont(size);
    }

}
