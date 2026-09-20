package p196j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import p196j$.time.ZoneId;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1607p;

/* JADX INFO: renamed from: j$.time.format.r */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1570r {

    /* JADX INFO: renamed from: a */
    public final DateTimeFormatter f10752a;

    /* JADX INFO: renamed from: b */
    public boolean f10753b = true;

    /* JADX INFO: renamed from: c */
    public boolean f10754c = true;

    /* JADX INFO: renamed from: d */
    public final ArrayList f10755d;

    public C1570r(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f10755d = arrayList;
        this.f10752a = dateTimeFormatter;
        arrayList.add(new C1574v());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m24093b(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24094a(char c, char c2) {
        if (this.f10753b) {
            return c == c2;
        }
        return m24093b(c, c2);
    }

    /* JADX INFO: renamed from: c */
    public final C1574v m24095c() {
        ArrayList arrayList = this.f10755d;
        return (C1574v) arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: d */
    public final Long m24096d(EnumC1592a enumC1592a) {
        return (Long) ((HashMap) m24095c().f10760a).get(enumC1592a);
    }

    /* JADX INFO: renamed from: e */
    public final void m24097e(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        m24095c().f10761b = zoneId;
    }

    /* JADX INFO: renamed from: f */
    public final int m24098f(InterfaceC1607p interfaceC1607p, long j, int i, int i2) {
        Objects.requireNonNull(interfaceC1607p, "field");
        Long l = (Long) ((HashMap) m24095c().f10760a).put(interfaceC1607p, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m24099g(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 <= charSequence.length() && i2 + i3 <= charSequence2.length()) {
            if (this.f10753b) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (charSequence.charAt(i + i4) == charSequence2.charAt(i2 + i4)) {
                    }
                }
                return true;
            }
            for (int i5 = 0; i5 < i3; i5++) {
                char cCharAt = charSequence.charAt(i + i5);
                char cCharAt2 = charSequence2.charAt(i2 + i5);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return m24095c().toString();
    }
}
