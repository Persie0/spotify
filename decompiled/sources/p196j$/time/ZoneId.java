package p196j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p196j$.desugar.sun.nio.p197fs.C1420h;
import p196j$.time.format.C1568p;
import p196j$.time.format.C1569q;
import p196j$.time.format.EnumC1575w;
import p196j$.time.format.TextStyle;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.InterfaceC1603l;
import p196j$.time.zone.ZoneRules;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public abstract class ZoneId implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final Map f10620a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        Map.Entry[] entryArr = {new AbstractMap.SimpleImmutableEntry("ACT", "Australia/Darwin"), new AbstractMap.SimpleImmutableEntry("AET", "Australia/Sydney"), new AbstractMap.SimpleImmutableEntry("AGT", "America/Argentina/Buenos_Aires"), new AbstractMap.SimpleImmutableEntry("ART", "Africa/Cairo"), new AbstractMap.SimpleImmutableEntry("AST", "America/Anchorage"), new AbstractMap.SimpleImmutableEntry("BET", "America/Sao_Paulo"), new AbstractMap.SimpleImmutableEntry("BST", "Asia/Dhaka"), new AbstractMap.SimpleImmutableEntry("CAT", "Africa/Harare"), new AbstractMap.SimpleImmutableEntry("CNT", "America/St_Johns"), new AbstractMap.SimpleImmutableEntry("CST", "America/Chicago"), new AbstractMap.SimpleImmutableEntry("CTT", "Asia/Shanghai"), new AbstractMap.SimpleImmutableEntry("EAT", "Africa/Addis_Ababa"), new AbstractMap.SimpleImmutableEntry("ECT", "Europe/Paris"), new AbstractMap.SimpleImmutableEntry("IET", "America/Indiana/Indianapolis"), new AbstractMap.SimpleImmutableEntry("IST", "Asia/Kolkata"), new AbstractMap.SimpleImmutableEntry("JST", "Asia/Tokyo"), new AbstractMap.SimpleImmutableEntry("MIT", "Pacific/Apia"), new AbstractMap.SimpleImmutableEntry("NET", "Asia/Yerevan"), new AbstractMap.SimpleImmutableEntry("NST", "Pacific/Auckland"), new AbstractMap.SimpleImmutableEntry("PLT", "Asia/Karachi"), new AbstractMap.SimpleImmutableEntry("PNT", "America/Phoenix"), new AbstractMap.SimpleImmutableEntry("PRT", "America/Puerto_Rico"), new AbstractMap.SimpleImmutableEntry("PST", "America/Los_Angeles"), new AbstractMap.SimpleImmutableEntry("SST", "Pacific/Guadalcanal"), new AbstractMap.SimpleImmutableEntry("VST", "Asia/Ho_Chi_Minh"), new AbstractMap.SimpleImmutableEntry("EST", "-05:00"), new AbstractMap.SimpleImmutableEntry("MST", "-07:00"), new AbstractMap.SimpleImmutableEntry("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        f10620a = Collections.unmodifiableMap(map);
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != C1616z.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    /* JADX INFO: renamed from: E */
    public static ZoneId m23969E(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.m23976b0(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return m23971T(str, 3, z);
        }
        return str.startsWith("UT") ? m23971T(str, 2, z) : C1616z.m24191a0(str, z);
    }

    /* JADX INFO: renamed from: K */
    public static ZoneId m23970K(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.getTotalSeconds() != 0) {
            str = str.concat(zoneOffset.f10626c);
        }
        return new C1616z(str, new ZoneRules(zoneOffset));
    }

    /* JADX INFO: renamed from: T */
    public static ZoneId m23971T(String str, int i, boolean z) {
        String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return m23970K(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return C1616z.m24191a0(str, z);
        }
        try {
            ZoneOffset zoneOffsetM23976b0 = ZoneOffset.m23976b0(str.substring(i));
            return zoneOffsetM23976b0 == ZoneOffset.UTC ? m23970K(strSubstring, zoneOffsetM23976b0) : m23970K(strSubstring, zoneOffsetM23976b0);
        } catch (C1512b e) {
            throw new C1512b("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    /* JADX INFO: renamed from: r */
    public static ZoneId m23972r(InterfaceC1603l interfaceC1603l) {
        ZoneId zoneId = (ZoneId) interfaceC1603l.mo23841b(AbstractC1608q.f10838e);
        if (zoneId != null) {
            return zoneId;
        }
        throw new C1512b("Unable to obtain ZoneId from TemporalAccessor: " + interfaceC1603l + " of type " + interfaceC1603l.getClass().getName());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1611u((byte) 7, this);
    }

    /* JADX INFO: renamed from: Z */
    public abstract void mo23973Z(DataOutput dataOutput);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return mo23974o().equals(((ZoneId) obj).mo23974o());
        }
        return false;
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        C1569q c1569q = new C1569q();
        c1569q.m24082b(new C1568p(textStyle));
        return c1569q.m24092l(locale, EnumC1575w.SMART, null).m24062a(new C1420h(this));
    }

    public abstract ZoneRules getRules();

    public int hashCode() {
        return mo23974o().hashCode();
    }

    /* JADX INFO: renamed from: o */
    public abstract String mo23974o();

    public String toString() {
        return mo23974o();
    }
}
