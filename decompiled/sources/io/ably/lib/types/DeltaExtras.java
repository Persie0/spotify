package io.ably.lib.types;

import com.google.gson.JsonObject;
import java.util.Map;
import java.util.Objects;
import org.msgpack.value.Value;
import org.msgpack.value.ValueFactory;

/* JADX INFO: loaded from: classes16.dex */
public final class DeltaExtras {
    private static final String FORMAT = "format";
    public static final String FORMAT_VCDIFF = "vcdiff";
    private static final String FROM = "from";
    private static final String TAG = "io.ably.lib.types.DeltaExtras";
    private final String format;
    private final String from;

    private DeltaExtras(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("format cannot be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("from cannot be null.");
        }
        this.format = str;
        this.from = str2;
    }

    public static DeltaExtras read(Map<Value, Value> map) {
        return new DeltaExtras(map.get(ValueFactory.newString(FORMAT)).asStringValue().asString(), map.get(ValueFactory.newString(FROM)).asStringValue().asString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DeltaExtras.class == obj.getClass()) {
            DeltaExtras deltaExtras = (DeltaExtras) obj;
            if (this.format.equals(deltaExtras.format) && this.from.equals(deltaExtras.from)) {
                return true;
            }
        }
        return false;
    }

    public String getFormat() {
        return this.format;
    }

    public String getFrom() {
        return this.from;
    }

    public int hashCode() {
        return Objects.hash(this.format, this.from);
    }

    public static DeltaExtras read(JsonObject jsonObject) {
        return new DeltaExtras(jsonObject.get(FORMAT).getAsString(), jsonObject.get(FROM).getAsString());
    }
}
