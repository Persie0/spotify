package p196j$.time.format;

import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import p196j$.time.C1512b;
import p196j$.time.C1580i;
import p196j$.time.ZoneId;
import p196j$.time.ZoneOffset;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.zone.C1624h;

/* JADX INFO: renamed from: j$.time.format.o */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public class C1567o implements InterfaceC1557e {

    /* JADX INFO: renamed from: c */
    public static volatile Map.Entry f10738c;

    /* JADX INFO: renamed from: d */
    public static volatile Map.Entry f10739d;

    /* JADX INFO: renamed from: a */
    public final C1580i f10740a;

    /* JADX INFO: renamed from: b */
    public final String f10741b;

    public C1567o(C1580i c1580i, String str) {
        this.f10740a = c1580i;
        this.f10741b = str;
    }

    /* JADX INFO: renamed from: b */
    public static int m24079b(C1570r c1570r, CharSequence charSequence, int i, int i2, C1561i c1561i) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            c1570r.m24097e(ZoneId.m23969E(upperCase, true));
            return i2;
        }
        if (charSequence.charAt(i2) == '0' || c1570r.m24094a(charSequence.charAt(i2), 'Z')) {
            c1570r.m24097e(ZoneId.m23969E(upperCase, true));
            return i2;
        }
        C1570r c1570r2 = new C1570r(c1570r.f10752a);
        c1570r2.f10753b = c1570r.f10753b;
        c1570r2.f10754c = c1570r.f10754c;
        int iMo24064E = c1561i.mo24064E(c1570r2, charSequence, i2);
        try {
            if (iMo24064E >= 0) {
                c1570r.m24097e(ZoneId.m23970K(upperCase, ZoneOffset.m23978d0((int) c1570r2.m24096d(EnumC1592a.OFFSET_SECONDS).longValue())));
                return iMo24064E;
            }
            if (c1561i == C1561i.f10722e) {
                return ~i;
            }
            c1570r.m24097e(ZoneId.m23969E(upperCase, true));
            return i2;
        } catch (C1512b unused) {
            return ~i;
        }
    }

    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: E */
    public final int mo24064E(C1570r c1570r, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            return m24079b(c1570r, charSequence, i, i, C1561i.f10722e);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char cCharAt2 = charSequence.charAt(i + 1);
            if (c1570r.m24094a(cCharAt, 'U') && c1570r.m24094a(cCharAt2, 'T')) {
                int i4 = i + 3;
                return (length < i4 || !c1570r.m24094a(charSequence.charAt(i3), 'C')) ? m24079b(c1570r, charSequence, i, i3, C1561i.f10723f) : m24079b(c1570r, charSequence, i, i4, C1561i.f10723f);
            }
            if (c1570r.m24094a(cCharAt, 'G') && length >= (i2 = i + 3) && c1570r.m24094a(cCharAt2, 'M') && c1570r.m24094a(charSequence.charAt(i3), 'T')) {
                int i5 = i + 4;
                if (length < i5 || !c1570r.m24094a(charSequence.charAt(i2), '0')) {
                    return m24079b(c1570r, charSequence, i, i2, C1561i.f10723f);
                }
                c1570r.m24097e(ZoneId.m23969E("GMT0", true));
                return i5;
            }
        }
        C1563k c1563kMo24080a = mo24080a(c1570r);
        ParsePosition parsePosition = new ParsePosition(i);
        String strM24078c = c1563kMo24080a.m24078c(charSequence, parsePosition);
        if (strM24078c != null) {
            c1570r.m24097e(ZoneId.m23969E(strM24078c, true));
            return parsePosition.getIndex();
        }
        if (!c1570r.m24094a(cCharAt, 'Z')) {
            return ~i;
        }
        c1570r.m24097e(ZoneOffset.UTC);
        return i + 1;
    }

    /* JADX INFO: renamed from: a */
    public C1563k mo24080a(C1570r c1570r) {
        Set<String> set = C1624h.f10892d;
        int size = set.size();
        Map.Entry simpleImmutableEntry = c1570r.f10753b ? f10738c : f10739d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = c1570r.f10753b ? f10738c : f10739d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        Integer numValueOf = Integer.valueOf(size);
                        C1563k c1563k = c1570r.f10753b ? new C1563k("", null, null) : new C1562j("", null, null);
                        for (String str : set) {
                            c1563k.m24077a(str, str);
                        }
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, c1563k);
                        if (c1570r.f10753b) {
                            f10738c = simpleImmutableEntry;
                        } else {
                            f10739d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (C1563k) simpleImmutableEntry.getValue();
    }

    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: r */
    public boolean mo24065r(C1571s c1571s, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) c1571s.m24101b(this.f10740a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.mo23974o());
        return true;
    }

    public final String toString() {
        return this.f10741b;
    }
}
