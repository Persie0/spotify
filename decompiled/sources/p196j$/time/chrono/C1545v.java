package p196j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;
import p196j$.time.C1512b;
import p196j$.time.C1579h;
import p196j$.time.C1580i;
import p196j$.time.Instant;
import p196j$.time.ZoneId;
import p196j$.time.format.EnumC1575w;
import p196j$.time.temporal.C1609r;
import p196j$.time.temporal.C1610s;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1603l;

/* JADX INFO: renamed from: j$.time.chrono.v */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1545v extends AbstractC1514a implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final C1545v f10683c = new C1545v();
    private static final long serialVersionUID = 459996390165777884L;

    private C1545v() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: C */
    public final C1610s mo23999C(EnumC1592a enumC1592a) {
        switch (AbstractC1544u.f10682a[enumC1592a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new C1609r("Unsupported field: " + enumC1592a);
            case 5:
                C1548y[] c1548yArr = C1548y.f10690e;
                int i = c1548yArr[c1548yArr.length - 1].f10692b.f10781a;
                int iMin = 1000000000 - c1548yArr[c1548yArr.length - 1].f10692b.f10781a;
                int i2 = c1548yArr[0].f10692b.f10781a;
                int i3 = 1;
                while (true) {
                    C1548y[] c1548yArr2 = C1548y.f10690e;
                    if (i3 >= c1548yArr2.length) {
                        return C1610s.m24174g(iMin, 999999999 - i);
                    }
                    C1548y c1548y = c1548yArr2[i3];
                    iMin = Math.min(iMin, (c1548y.f10692b.f10781a - i2) + 1);
                    i2 = c1548y.f10692b.f10781a;
                    i3++;
                }
                break;
            case 6:
                C1548y c1548y2 = C1548y.f10689d;
                long jMin = EnumC1592a.DAY_OF_YEAR.f10817b.f10843c;
                for (C1548y c1548y3 : C1548y.f10690e) {
                    jMin = Math.min(jMin, ((c1548y3.f10692b.m24122d0() ? 366 : 365) - c1548y3.f10692b.m24119a0()) + 1);
                    if (c1548y3.m24060o() != null) {
                        jMin = Math.min(jMin, c1548y3.m24060o().f10692b.m24119a0() - 1);
                    }
                }
                return C1610s.m24174g(jMin, EnumC1592a.DAY_OF_YEAR.f10817b.f10844d);
            case 7:
                return C1610s.m24173f(C1547x.f10685d.f10781a, 999999999L);
            case 8:
                long j = C1548y.f10689d.f10691a;
                C1548y[] c1548yArr3 = C1548y.f10690e;
                return C1610s.m24173f(j, c1548yArr3[c1548yArr3.length - 1].f10691a);
            default:
                return enumC1592a.f10817b;
        }
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: D */
    public final List mo24000D() {
        C1548y[] c1548yArr = C1548y.f10690e;
        return AbstractC1419g.m23830m((C1548y[]) Arrays.copyOf(c1548yArr, c1548yArr.length));
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: F */
    public final InterfaceC1536m mo24001F(int i) {
        return C1548y.m24059p(i);
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: H */
    public final int mo24002H(InterfaceC1536m interfaceC1536m, int i) {
        if (!(interfaceC1536m instanceof C1548y)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = ((C1548y) interfaceC1536m).f10692b.f10781a;
        int i3 = (i2 + i) - 1;
        if (i != 1 && (i3 < -999999999 || i3 > 999999999 || i3 < i2 || interfaceC1536m != C1548y.m24058n(C1579h.m24113h0(i3, 1, 1)))) {
            throw new C1512b("Invalid yearOfEra value");
        }
        return i3;
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: L */
    public final InterfaceC1516b mo24003L(InterfaceC1603l interfaceC1603l) {
        return interfaceC1603l instanceof C1547x ? (C1547x) interfaceC1603l : new C1547x(C1579h.m24111K(interfaceC1603l));
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: O */
    public final InterfaceC1516b mo24004O() {
        return new C1547x(C1579h.m24111K(C1579h.m24112g0(AbstractC1419g.m23840w())));
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: U */
    public final InterfaceC1516b mo24005U(int i, int i2, int i3) {
        return new C1547x(C1579h.m24113h0(i, i2, i3));
    }

    @Override // p196j$.time.chrono.AbstractC1514a, p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: W */
    public final InterfaceC1516b mo23996W(Map map, EnumC1575w enumC1575w) {
        return (C1547x) super.mo23996W(map, enumC1575w);
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: X */
    public final InterfaceC1530i mo24006X(Instant instant, ZoneId zoneId) {
        return C1534k.m24035K(this, instant, zoneId);
    }

    @Override // p196j$.time.chrono.AbstractC1514a
    /* JADX INFO: renamed from: a0 */
    public final InterfaceC1516b mo23998a0(Map map, EnumC1575w enumC1575w) {
        C1579h c1579hM24115j0;
        C1547x c1547xM24057d0;
        EnumC1592a enumC1592a = EnumC1592a.ERA;
        Long l = (Long) map.get(enumC1592a);
        C1548y c1548yM24059p = l != null ? C1548y.m24059p(mo23999C(enumC1592a).m24175a(l.longValue(), enumC1592a)) : null;
        EnumC1592a enumC1592a2 = EnumC1592a.YEAR_OF_ERA;
        Long l2 = (Long) map.get(enumC1592a2);
        int iM24175a = l2 != null ? mo23999C(enumC1592a2).m24175a(l2.longValue(), enumC1592a2) : 0;
        if (c1548yM24059p == null && l2 != null && !map.containsKey(EnumC1592a.YEAR) && enumC1575w != EnumC1575w.STRICT) {
            C1548y[] c1548yArr = C1548y.f10690e;
            c1548yM24059p = ((C1548y[]) Arrays.copyOf(c1548yArr, c1548yArr.length))[((C1548y[]) Arrays.copyOf(c1548yArr, c1548yArr.length)).length - 1];
        }
        if (l2 != null && c1548yM24059p != null) {
            EnumC1592a enumC1592a3 = EnumC1592a.MONTH_OF_YEAR;
            if (map.containsKey(enumC1592a3)) {
                EnumC1592a enumC1592a4 = EnumC1592a.DAY_OF_MONTH;
                if (map.containsKey(enumC1592a4)) {
                    map.remove(enumC1592a);
                    map.remove(enumC1592a2);
                    if (enumC1575w == EnumC1575w.LENIENT) {
                        return new C1547x(C1579h.m24113h0((c1548yM24059p.f10692b.f10781a + iM24175a) - 1, 1, 1)).m24054a0(Math.subtractExact(((Long) map.remove(enumC1592a3)).longValue(), 1L), ChronoUnit.MONTHS).m24054a0(Math.subtractExact(((Long) map.remove(enumC1592a4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iM24175a2 = mo23999C(enumC1592a3).m24175a(((Long) map.remove(enumC1592a3)).longValue(), enumC1592a3);
                    int iM24175a3 = mo23999C(enumC1592a4).m24175a(((Long) map.remove(enumC1592a4)).longValue(), enumC1592a4);
                    if (enumC1575w != EnumC1575w.SMART) {
                        C1579h c1579h = C1547x.f10685d;
                        C1579h c1579hM24113h0 = C1579h.m24113h0((c1548yM24059p.f10692b.f10781a + iM24175a) - 1, iM24175a2, iM24175a3);
                        if (c1579hM24113h0.m24121c0(c1548yM24059p.f10692b) || c1548yM24059p != C1548y.m24058n(c1579hM24113h0)) {
                            throw new C1512b("year, month, and day not valid for Era");
                        }
                        return new C1547x(c1548yM24059p, iM24175a, c1579hM24113h0);
                    }
                    if (iM24175a < 1) {
                        throw new C1512b("Invalid YearOfEra: " + iM24175a);
                    }
                    int i = (c1548yM24059p.f10692b.f10781a + iM24175a) - 1;
                    try {
                        c1547xM24057d0 = new C1547x(C1579h.m24113h0(i, iM24175a2, iM24175a3));
                    } catch (C1512b unused) {
                        c1547xM24057d0 = new C1547x(C1579h.m24113h0(i, iM24175a2, 1)).m24057d0(new C1580i(2));
                    }
                    if (c1547xM24057d0.f10687b == c1548yM24059p || c1547xM24057d0.mo23952g(EnumC1592a.YEAR_OF_ERA) <= 1 || iM24175a <= 1) {
                        return c1547xM24057d0;
                    }
                    throw new C1512b("Invalid YearOfEra for Era: " + c1548yM24059p + " " + iM24175a);
                }
            }
            EnumC1592a enumC1592a5 = EnumC1592a.DAY_OF_YEAR;
            if (map.containsKey(enumC1592a5)) {
                map.remove(enumC1592a);
                map.remove(enumC1592a2);
                if (enumC1575w == EnumC1575w.LENIENT) {
                    return new C1547x(C1579h.m24115j0((c1548yM24059p.f10692b.f10781a + iM24175a) - 1, 1)).m24054a0(Math.subtractExact(((Long) map.remove(enumC1592a5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iM24175a4 = mo23999C(enumC1592a5).m24175a(((Long) map.remove(enumC1592a5)).longValue(), enumC1592a5);
                C1579h c1579h2 = C1547x.f10685d;
                if (iM24175a == 1) {
                    C1579h c1579h3 = c1548yM24059p.f10692b;
                    c1579hM24115j0 = C1579h.m24115j0(c1579h3.f10781a, (c1579h3.m24119a0() + iM24175a4) - 1);
                } else {
                    c1579hM24115j0 = C1579h.m24115j0((c1548yM24059p.f10692b.f10781a + iM24175a) - 1, iM24175a4);
                }
                if (c1579hM24115j0.m24121c0(c1548yM24059p.f10692b) || c1548yM24059p != C1548y.m24058n(c1579hM24115j0)) {
                    throw new C1512b("Invalid parameters");
                }
                return new C1547x(c1548yM24059p, iM24175a, c1579hM24115j0);
            }
        }
        return null;
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: n */
    public final InterfaceC1516b mo24007n(long j) {
        return new C1547x(C1579h.m24114i0(j));
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: o */
    public final String mo24008o() {
        return "Japanese";
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: w */
    public final String mo24009w() {
        return "japanese";
    }

    public Object writeReplace() {
        return new C1523e0((byte) 1, this);
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: z */
    public final InterfaceC1516b mo24010z(int i, int i2) {
        return new C1547x(C1579h.m24115j0(i, i2));
    }
}
