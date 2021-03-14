package net.buildtheearth.terraminusminus.dataset.osm.mapper;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.buildtheearth.terraminusminus.dataset.osm.JsonParser;

import java.util.Map;

/**
 * @author DaPorkchop_
 */
public class LineParser extends JsonParser.Typed<LineMapper> {
    public static final Map<String, Class<? extends LineMapper>> TYPES = new Object2ObjectOpenHashMap<>();

    static {
        TYPES.put("all", All.Line.class);
        TYPES.put("any", Any.Line.class);
        TYPES.put("condition", Condition.Line.class);
        TYPES.put("first", First.Line.class);
        TYPES.put("nothing", Nothing.Line.class);

        TYPES.put("narrow", LineNarrow.class);
        TYPES.put("wide", LineWide.class);
    }

    public LineParser() {
        super("line", TYPES);
    }
}