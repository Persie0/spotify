package p196j$.time.chrono;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p196j$.time.C1512b;
import p196j$.time.C1580i;
import p196j$.time.EnumC1550d;
import p196j$.time.format.EnumC1575w;
import p196j$.time.temporal.C1605n;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1607p;
import p196j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.chrono.a */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC1514a implements InterfaceC1535l {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f10633a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f10634b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    /* JADX INFO: renamed from: E */
    public static InterfaceC1535l m23992E(InterfaceC1535l interfaceC1535l, String str) {
        String strMo24009w;
        InterfaceC1535l interfaceC1535l2 = (InterfaceC1535l) f10633a.putIfAbsent(str, interfaceC1535l);
        if (interfaceC1535l2 == null && (strMo24009w = interfaceC1535l.mo24009w()) != null) {
            f10634b.putIfAbsent(strMo24009w, interfaceC1535l);
        }
        return interfaceC1535l2;
    }

    /* JADX INFO: renamed from: K */
    public static InterfaceC1516b m23993K(InterfaceC1516b interfaceC1516b, long j, long j2, long j3) {
        long j4;
        InterfaceC1516b interfaceC1516bMo23950e = interfaceC1516b.mo23950e(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        InterfaceC1516b interfaceC1516bMo23950e2 = interfaceC1516bMo23950e.mo23950e(j2, (TemporalUnit) chronoUnit);
        if (j3 <= 7) {
            if (j3 < 1) {
                interfaceC1516bMo23950e2 = interfaceC1516bMo23950e2.mo23950e(Math.subtractExact(j3, 7L) / 7, (TemporalUnit) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return interfaceC1516bMo23950e2.mo23989k(new C1605n(EnumC1550d.m24061r((int) j3).getValue(), 0));
        }
        long j5 = j3 - 1;
        interfaceC1516bMo23950e2 = interfaceC1516bMo23950e2.mo23950e(j5 / 7, (TemporalUnit) chronoUnit);
        j4 = j5 % 7;
        j3 = j4 + 1;
        return interfaceC1516bMo23950e2.mo23989k(new C1605n(EnumC1550d.m24061r((int) j3).getValue(), 0));
    }

    /* JADX INFO: renamed from: r */
    public static void m23994r(Map map, EnumC1592a enumC1592a, long j) {
        Long l = (Long) map.get(enumC1592a);
        if (l == null || l.longValue() == j) {
            map.put(enumC1592a, Long.valueOf(j));
            return;
        }
        throw new C1512b("Conflict found: " + enumC1592a + " " + l + " differs from " + enumC1592a + " " + j);
    }

    /* JADX INFO: renamed from: T */
    public void mo23995T(Map map, EnumC1575w enumC1575w) {
        EnumC1592a enumC1592a = EnumC1592a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(enumC1592a);
        if (l != null) {
            if (enumC1575w != EnumC1575w.LENIENT) {
                enumC1592a.m24165a0(l.longValue());
            }
            InterfaceC1516b interfaceC1516bMo23948c = mo24004O().mo23948c(1L, (InterfaceC1607p) EnumC1592a.DAY_OF_MONTH).mo23948c(l.longValue(), (InterfaceC1607p) enumC1592a);
            EnumC1592a enumC1592a2 = EnumC1592a.MONTH_OF_YEAR;
            m23994r(map, enumC1592a2, interfaceC1516bMo23948c.mo23952g(enumC1592a2));
            EnumC1592a enumC1592a3 = EnumC1592a.YEAR;
            m23994r(map, enumC1592a3, interfaceC1516bMo23948c.mo23952g(enumC1592a3));
        }
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: W */
    public InterfaceC1516b mo23996W(Map map, EnumC1575w enumC1575w) {
        EnumC1592a enumC1592a = EnumC1592a.EPOCH_DAY;
        if (map.containsKey(enumC1592a)) {
            return mo24007n(((Long) map.remove(enumC1592a)).longValue());
        }
        mo23995T(map, enumC1575w);
        InterfaceC1516b interfaceC1516bMo23998a0 = mo23998a0(map, enumC1575w);
        if (interfaceC1516bMo23998a0 != null) {
            return interfaceC1516bMo23998a0;
        }
        EnumC1592a enumC1592a2 = EnumC1592a.YEAR;
        if (!map.containsKey(enumC1592a2)) {
            return null;
        }
        EnumC1592a enumC1592a3 = EnumC1592a.MONTH_OF_YEAR;
        if (map.containsKey(enumC1592a3)) {
            if (map.containsKey(EnumC1592a.DAY_OF_MONTH)) {
                return mo23997Z(map, enumC1575w);
            }
            EnumC1592a enumC1592a4 = EnumC1592a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(enumC1592a4)) {
                EnumC1592a enumC1592a5 = EnumC1592a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(enumC1592a5)) {
                    int iM24175a = mo23999C(enumC1592a2).m24175a(((Long) map.remove(enumC1592a2)).longValue(), enumC1592a2);
                    if (enumC1575w == EnumC1575w.LENIENT) {
                        long jSubtractExact = Math.subtractExact(((Long) map.remove(enumC1592a3)).longValue(), 1L);
                        return mo24005U(iM24175a, 1, 1).mo23950e(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).mo23950e(Math.subtractExact(((Long) map.remove(enumC1592a4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).mo23950e(Math.subtractExact(((Long) map.remove(enumC1592a5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iM24175a2 = mo23999C(enumC1592a3).m24175a(((Long) map.remove(enumC1592a3)).longValue(), enumC1592a3);
                    InterfaceC1516b interfaceC1516bMo23950e = mo24005U(iM24175a, iM24175a2, 1).mo23950e((mo23999C(enumC1592a5).m24175a(((Long) map.remove(enumC1592a5)).longValue(), enumC1592a5) - 1) + ((mo23999C(enumC1592a4).m24175a(((Long) map.remove(enumC1592a4)).longValue(), enumC1592a4) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (enumC1575w != EnumC1575w.STRICT || interfaceC1516bMo23950e.mo23952g(enumC1592a3) == iM24175a2) {
                        return interfaceC1516bMo23950e;
                    }
                    throw new C1512b("Strict mode rejected resolved date as it is in a different month");
                }
                EnumC1592a enumC1592a6 = EnumC1592a.DAY_OF_WEEK;
                if (map.containsKey(enumC1592a6)) {
                    int iM24175a3 = mo23999C(enumC1592a2).m24175a(((Long) map.remove(enumC1592a2)).longValue(), enumC1592a2);
                    if (enumC1575w == EnumC1575w.LENIENT) {
                        return m23993K(mo24005U(iM24175a3, 1, 1), Math.subtractExact(((Long) map.remove(enumC1592a3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(enumC1592a4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(enumC1592a6)).longValue(), 1L));
                    }
                    int iM24175a4 = mo23999C(enumC1592a3).m24175a(((Long) map.remove(enumC1592a3)).longValue(), enumC1592a3);
                    InterfaceC1516b interfaceC1516bMo24016k = mo24005U(iM24175a3, iM24175a4, 1).mo23950e((mo23999C(enumC1592a4).m24175a(((Long) map.remove(enumC1592a4)).longValue(), enumC1592a4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).mo23989k(new C1605n(EnumC1550d.m24061r(mo23999C(enumC1592a6).m24175a(((Long) map.remove(enumC1592a6)).longValue(), enumC1592a6)).getValue(), 0));
                    if (enumC1575w != EnumC1575w.STRICT || interfaceC1516bMo24016k.mo23952g(enumC1592a3) == iM24175a4) {
                        return interfaceC1516bMo24016k;
                    }
                    throw new C1512b("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        EnumC1592a enumC1592a7 = EnumC1592a.DAY_OF_YEAR;
        if (map.containsKey(enumC1592a7)) {
            int iM24175a5 = mo23999C(enumC1592a2).m24175a(((Long) map.remove(enumC1592a2)).longValue(), enumC1592a2);
            if (enumC1575w != EnumC1575w.LENIENT) {
                return mo24010z(iM24175a5, mo23999C(enumC1592a7).m24175a(((Long) map.remove(enumC1592a7)).longValue(), enumC1592a7));
            }
            return mo24010z(iM24175a5, 1).mo23950e(Math.subtractExact(((Long) map.remove(enumC1592a7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        EnumC1592a enumC1592a8 = EnumC1592a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(enumC1592a8)) {
            return null;
        }
        EnumC1592a enumC1592a9 = EnumC1592a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(enumC1592a9)) {
            int iM24175a6 = mo23999C(enumC1592a2).m24175a(((Long) map.remove(enumC1592a2)).longValue(), enumC1592a2);
            if (enumC1575w == EnumC1575w.LENIENT) {
                return mo24010z(iM24175a6, 1).mo23950e(Math.subtractExact(((Long) map.remove(enumC1592a8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).mo23950e(Math.subtractExact(((Long) map.remove(enumC1592a9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            InterfaceC1516b interfaceC1516bMo23950e2 = mo24010z(iM24175a6, 1).mo23950e((mo23999C(enumC1592a9).m24175a(((Long) map.remove(enumC1592a9)).longValue(), enumC1592a9) - 1) + ((mo23999C(enumC1592a8).m24175a(((Long) map.remove(enumC1592a8)).longValue(), enumC1592a8) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (enumC1575w != EnumC1575w.STRICT || interfaceC1516bMo23950e2.mo23952g(enumC1592a2) == iM24175a6) {
                return interfaceC1516bMo23950e2;
            }
            throw new C1512b("Strict mode rejected resolved date as it is in a different year");
        }
        EnumC1592a enumC1592a10 = EnumC1592a.DAY_OF_WEEK;
        if (!map.containsKey(enumC1592a10)) {
            return null;
        }
        int iM24175a7 = mo23999C(enumC1592a2).m24175a(((Long) map.remove(enumC1592a2)).longValue(), enumC1592a2);
        if (enumC1575w == EnumC1575w.LENIENT) {
            return m23993K(mo24010z(iM24175a7, 1), 0L, Math.subtractExact(((Long) map.remove(enumC1592a8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(enumC1592a10)).longValue(), 1L));
        }
        InterfaceC1516b interfaceC1516bMo24016k2 = mo24010z(iM24175a7, 1).mo23950e((mo23999C(enumC1592a8).m24175a(((Long) map.remove(enumC1592a8)).longValue(), enumC1592a8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).mo23989k(new C1605n(EnumC1550d.m24061r(mo23999C(enumC1592a10).m24175a(((Long) map.remove(enumC1592a10)).longValue(), enumC1592a10)).getValue(), 0));
        if (enumC1575w != EnumC1575w.STRICT || interfaceC1516bMo24016k2.mo23952g(enumC1592a2) == iM24175a7) {
            return interfaceC1516bMo24016k2;
        }
        throw new C1512b("Strict mode rejected resolved date as it is in a different year");
    }

    /* JADX INFO: renamed from: Z */
    public InterfaceC1516b mo23997Z(Map map, EnumC1575w enumC1575w) {
        EnumC1592a enumC1592a = EnumC1592a.YEAR;
        int iM24175a = mo23999C(enumC1592a).m24175a(((Long) map.remove(enumC1592a)).longValue(), enumC1592a);
        if (enumC1575w == EnumC1575w.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(EnumC1592a.MONTH_OF_YEAR)).longValue(), 1L);
            return mo24005U(iM24175a, 1, 1).mo23950e(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).mo23950e(Math.subtractExact(((Long) map.remove(EnumC1592a.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        EnumC1592a enumC1592a2 = EnumC1592a.MONTH_OF_YEAR;
        int iM24175a2 = mo23999C(enumC1592a2).m24175a(((Long) map.remove(enumC1592a2)).longValue(), enumC1592a2);
        EnumC1592a enumC1592a3 = EnumC1592a.DAY_OF_MONTH;
        int iM24175a3 = mo23999C(enumC1592a3).m24175a(((Long) map.remove(enumC1592a3)).longValue(), enumC1592a3);
        if (enumC1575w != EnumC1575w.SMART) {
            return mo24005U(iM24175a, iM24175a2, iM24175a3);
        }
        try {
            return mo24005U(iM24175a, iM24175a2, iM24175a3);
        } catch (C1512b unused) {
            return mo24005U(iM24175a, iM24175a2, 1).mo23989k(new C1580i(2));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public InterfaceC1516b mo23998a0(Map map, EnumC1575w enumC1575w) {
        EnumC1592a enumC1592a = EnumC1592a.YEAR_OF_ERA;
        Long l = (Long) map.remove(enumC1592a);
        if (l == null) {
            EnumC1592a enumC1592a2 = EnumC1592a.ERA;
            if (!map.containsKey(enumC1592a2)) {
                return null;
            }
            mo23999C(enumC1592a2).m24176b(((Long) map.get(enumC1592a2)).longValue(), enumC1592a2);
            return null;
        }
        EnumC1592a enumC1592a3 = EnumC1592a.ERA;
        Long l2 = (Long) map.remove(enumC1592a3);
        int iM24175a = enumC1575w != EnumC1575w.LENIENT ? mo23999C(enumC1592a).m24175a(l.longValue(), enumC1592a) : Math.toIntExact(l.longValue());
        if (l2 != null) {
            m23994r(map, EnumC1592a.YEAR, mo24002H(mo24001F(mo23999C(enumC1592a3).m24175a(l2.longValue(), enumC1592a3)), iM24175a));
            return null;
        }
        EnumC1592a enumC1592a4 = EnumC1592a.YEAR;
        if (map.containsKey(enumC1592a4)) {
            m23994r(map, enumC1592a4, mo24002H(mo24010z(mo23999C(enumC1592a4).m24175a(((Long) map.get(enumC1592a4)).longValue(), enumC1592a4), 1).mo24013Q(), iM24175a));
            return null;
        }
        if (enumC1575w == EnumC1575w.STRICT) {
            map.put(enumC1592a, l);
            return null;
        }
        List listMo24000D = mo24000D();
        if (listMo24000D.isEmpty()) {
            m23994r(map, enumC1592a4, iM24175a);
            return null;
        }
        m23994r(map, enumC1592a4, mo24002H((InterfaceC1536m) listMo24000D.get(listMo24000D.size() - 1), iM24175a));
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return mo24008o().compareTo(((InterfaceC1535l) obj).mo24008o());
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC1514a) && mo24008o().compareTo(((AbstractC1514a) obj).mo24008o()) == 0;
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    public final int hashCode() {
        return getClass().hashCode() ^ mo24008o().hashCode();
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    public final String toString() {
        return mo24008o();
    }
}
