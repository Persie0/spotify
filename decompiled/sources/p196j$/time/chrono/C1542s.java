package p196j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;
import p196j$.time.C1512b;
import p196j$.time.C1579h;
import p196j$.time.C1613w;
import p196j$.time.EnumC1585n;
import p196j$.time.Instant;
import p196j$.time.LocalDateTime;
import p196j$.time.ZoneId;
import p196j$.time.ZonedDateTime;
import p196j$.time.format.EnumC1575w;
import p196j$.time.temporal.C1610s;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1603l;

/* JADX INFO: renamed from: j$.time.chrono.s */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1542s extends AbstractC1514a implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final C1542s f10679c = new C1542s();
    private static final long serialVersionUID = -1440403870442975015L;

    private C1542s() {
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m24053b0(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: C */
    public final C1610s mo23999C(EnumC1592a enumC1592a) {
        return enumC1592a.f10817b;
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: D */
    public final List mo24000D() {
        return AbstractC1419g.m23830m(EnumC1543t.values());
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: F */
    public final InterfaceC1536m mo24001F(int i) {
        if (i == 0) {
            return EnumC1543t.BCE;
        }
        if (i == 1) {
            return EnumC1543t.f10680CE;
        }
        throw new C1512b("Invalid era: " + i);
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: H */
    public final int mo24002H(InterfaceC1536m interfaceC1536m, int i) {
        if (interfaceC1536m instanceof EnumC1543t) {
            return interfaceC1536m == EnumC1543t.f10680CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: L */
    public final InterfaceC1516b mo24003L(InterfaceC1603l interfaceC1603l) {
        return C1579h.m24111K(interfaceC1603l);
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: O */
    public final InterfaceC1516b mo24004O() {
        return C1579h.m24111K(C1579h.m24112g0(AbstractC1419g.m23840w()));
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: P */
    public final ChronoLocalDateTime mo24040P(InterfaceC1603l interfaceC1603l) {
        return LocalDateTime.m23954E(interfaceC1603l);
    }

    @Override // p196j$.time.chrono.AbstractC1514a
    /* JADX INFO: renamed from: T */
    public final void mo23995T(Map map, EnumC1575w enumC1575w) {
        EnumC1592a enumC1592a = EnumC1592a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(enumC1592a);
        if (l != null) {
            if (enumC1575w != EnumC1575w.LENIENT) {
                enumC1592a.m24165a0(l.longValue());
            }
            long j = 12;
            AbstractC1514a.m23994r(map, EnumC1592a.MONTH_OF_YEAR, ((int) Math.floorMod(l.longValue(), j)) + 1);
            AbstractC1514a.m23994r(map, EnumC1592a.YEAR, Math.floorDiv(l.longValue(), j));
        }
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: U */
    public final InterfaceC1516b mo24005U(int i, int i2, int i3) {
        return C1579h.m24113h0(i, i2, i3);
    }

    @Override // p196j$.time.chrono.AbstractC1514a, p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: W */
    public final InterfaceC1516b mo23996W(Map map, EnumC1575w enumC1575w) {
        return (C1579h) super.mo23996W(map, enumC1575w);
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: X */
    public final InterfaceC1530i mo24006X(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.m23984r(instant.f10611a, instant.f10612b, zoneId);
    }

    @Override // p196j$.time.chrono.AbstractC1514a
    /* JADX INFO: renamed from: Z */
    public final InterfaceC1516b mo23997Z(Map map, EnumC1575w enumC1575w) {
        EnumC1592a enumC1592a = EnumC1592a.YEAR;
        int iM24175a = enumC1592a.f10817b.m24175a(((Long) map.remove(enumC1592a)).longValue(), enumC1592a);
        boolean z = true;
        if (enumC1575w == EnumC1575w.LENIENT) {
            return C1579h.m24113h0(iM24175a, 1, 1).m24127m0(Math.subtractExact(((Long) map.remove(EnumC1592a.MONTH_OF_YEAR)).longValue(), 1L)).m24126l0(Math.subtractExact(((Long) map.remove(EnumC1592a.DAY_OF_MONTH)).longValue(), 1L));
        }
        EnumC1592a enumC1592a2 = EnumC1592a.MONTH_OF_YEAR;
        int iM24175a2 = enumC1592a2.f10817b.m24175a(((Long) map.remove(enumC1592a2)).longValue(), enumC1592a2);
        EnumC1592a enumC1592a3 = EnumC1592a.DAY_OF_MONTH;
        int iM24175a3 = enumC1592a3.f10817b.m24175a(((Long) map.remove(enumC1592a3)).longValue(), enumC1592a3);
        if (enumC1575w == EnumC1575w.SMART) {
            if (iM24175a2 == 4 || iM24175a2 == 6 || iM24175a2 == 9 || iM24175a2 == 11) {
                iM24175a3 = Math.min(iM24175a3, 30);
            } else if (iM24175a2 == 2) {
                EnumC1585n enumC1585n = EnumC1585n.FEBRUARY;
                long j = iM24175a;
                int i = C1613w.f10849b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iM24175a3 = Math.min(iM24175a3, enumC1585n.m24153E(z));
            }
        }
        return C1579h.m24113h0(iM24175a, iM24175a2, iM24175a3);
    }

    @Override // p196j$.time.chrono.AbstractC1514a
    /* JADX INFO: renamed from: a0 */
    public final InterfaceC1516b mo23998a0(Map map, EnumC1575w enumC1575w) {
        EnumC1592a enumC1592a = EnumC1592a.YEAR_OF_ERA;
        Long l = (Long) map.remove(enumC1592a);
        if (l == null) {
            EnumC1592a enumC1592a2 = EnumC1592a.ERA;
            if (!map.containsKey(enumC1592a2)) {
                return null;
            }
            enumC1592a2.m24165a0(((Long) map.get(enumC1592a2)).longValue());
            return null;
        }
        if (enumC1575w != EnumC1575w.LENIENT) {
            enumC1592a.m24165a0(l.longValue());
        }
        Long l2 = (Long) map.remove(EnumC1592a.ERA);
        if (l2 != null) {
            if (l2.longValue() == 1) {
                AbstractC1514a.m23994r(map, EnumC1592a.YEAR, l.longValue());
                return null;
            }
            if (l2.longValue() == 0) {
                AbstractC1514a.m23994r(map, EnumC1592a.YEAR, Math.subtractExact(1L, l.longValue()));
                return null;
            }
            throw new C1512b("Invalid value for era: " + l2);
        }
        EnumC1592a enumC1592a3 = EnumC1592a.YEAR;
        Long l3 = (Long) map.get(enumC1592a3);
        if (enumC1575w != EnumC1575w.STRICT) {
            AbstractC1514a.m23994r(map, enumC1592a3, (l3 == null || l3.longValue() > 0) ? l.longValue() : Math.subtractExact(1L, l.longValue()));
            return null;
        }
        if (l3 == null) {
            map.put(enumC1592a, l);
            return null;
        }
        long jLongValue = l3.longValue();
        long jLongValue2 = l.longValue();
        if (jLongValue <= 0) {
            jLongValue2 = Math.subtractExact(1L, jLongValue2);
        }
        AbstractC1514a.m23994r(map, enumC1592a3, jLongValue2);
        return null;
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: n */
    public final InterfaceC1516b mo24007n(long j) {
        return C1579h.m24114i0(j);
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: o */
    public final String mo24008o() {
        return "ISO";
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: w */
    public final String mo24009w() {
        return "iso8601";
    }

    public Object writeReplace() {
        return new C1523e0((byte) 1, this);
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: y */
    public final InterfaceC1530i mo24041y(InterfaceC1603l interfaceC1603l) {
        return ZonedDateTime.m23982E(interfaceC1603l);
    }

    @Override // p196j$.time.chrono.InterfaceC1535l
    /* JADX INFO: renamed from: z */
    public final InterfaceC1516b mo24010z(int i, int i2) {
        return C1579h.m24115j0(i, i2);
    }
}
