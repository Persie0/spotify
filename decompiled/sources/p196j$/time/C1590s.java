package p196j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.C1609r;
import p196j$.time.temporal.C1610s;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1604m;
import p196j$.time.temporal.InterfaceC1607p;
import p196j$.time.temporal.Temporal;
import p196j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.s */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1590s implements Temporal, InterfaceC1604m, Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f10805c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a */
    public final C1583l f10806a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset f10807b;

    static {
        C1583l c1583l = C1583l.f10788e;
        ZoneOffset zoneOffset = ZoneOffset.f10624g;
        c1583l.getClass();
        new C1590s(c1583l, zoneOffset);
        C1583l c1583l2 = C1583l.f10789f;
        ZoneOffset zoneOffset2 = ZoneOffset.f10623f;
        c1583l2.getClass();
        new C1590s(c1583l2, zoneOffset2);
    }

    public C1590s(C1583l c1583l, ZoneOffset zoneOffset) {
        Objects.requireNonNull(c1583l, "time");
        this.f10806a = c1583l;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f10807b = zoneOffset;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1611u((byte) 9, this);
    }

    /* JADX INFO: renamed from: E */
    public final long m24156E() {
        return this.f10806a.m24146h0() - (((long) this.f10807b.getTotalSeconds()) * 1000000000);
    }

    /* JADX INFO: renamed from: K */
    public final C1590s m24157K(C1583l c1583l, ZoneOffset zoneOffset) {
        return (this.f10806a == c1583l && this.f10807b.equals(zoneOffset)) ? this : new C1590s(c1583l, zoneOffset);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final Temporal mo23946a(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? mo23950e(Long.MAX_VALUE, temporalUnit).mo23950e(1L, temporalUnit) : mo23950e(-j, temporalUnit);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    public final Object mo23841b(C1580i c1580i) {
        if (c1580i == AbstractC1608q.f10837d || c1580i == AbstractC1608q.f10838e) {
            return this.f10807b;
        }
        if (((c1580i == AbstractC1608q.f10834a) || (c1580i == AbstractC1608q.f10835b)) || c1580i == AbstractC1608q.f10839f) {
            return null;
        }
        if (c1580i == AbstractC1608q.f10840g) {
            return this.f10806a;
        }
        return c1580i == AbstractC1608q.f10836c ? ChronoUnit.NANOS : c1580i.m24134j(this);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal mo23948c(long j, InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return (C1590s) interfaceC1607p.mo24164Z(this, j);
        }
        if (interfaceC1607p != EnumC1592a.OFFSET_SECONDS) {
            return m24157K(this.f10806a.mo23948c(j, interfaceC1607p), this.f10807b);
        }
        EnumC1592a enumC1592a = (EnumC1592a) interfaceC1607p;
        return m24157K(this.f10806a, ZoneOffset.m23978d0(enumC1592a.f10817b.m24175a(j, enumC1592a)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1590s c1590s = (C1590s) obj;
        if (this.f10807b.equals(c1590s.f10807b)) {
            return this.f10806a.compareTo(c1590s.f10806a);
        }
        int iCompare = Long.compare(m24156E(), c1590s.m24156E());
        return iCompare == 0 ? this.f10806a.compareTo(c1590s.f10806a) : iCompare;
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d */
    public final Temporal mo23989k(C1579h c1579h) {
        return (C1590s) c1579h.mo23951f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1590s) {
            C1590s c1590s = (C1590s) obj;
            if (this.f10806a.equals(c1590s.f10806a) && this.f10807b.equals(c1590s.f10807b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p196j$.time.temporal.InterfaceC1604m
    /* JADX INFO: renamed from: f */
    public final Temporal mo23951f(Temporal temporal) {
        return temporal.mo23948c(this.f10806a.m24146h0(), EnumC1592a.NANO_OF_DAY).mo23948c(this.f10807b.getTotalSeconds(), EnumC1592a.OFFSET_SECONDS);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    public final boolean mo23842h(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return ((EnumC1592a) interfaceC1607p).m24166b0() || interfaceC1607p == EnumC1592a.OFFSET_SECONDS;
        }
        return interfaceC1607p != null && interfaceC1607p.mo24167r(this);
    }

    public final int hashCode() {
        return this.f10806a.hashCode() ^ this.f10807b.f10625b;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: i */
    public final long mo23843i(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return interfaceC1607p == EnumC1592a.OFFSET_SECONDS ? this.f10807b.getTotalSeconds() : this.f10806a.mo23843i(interfaceC1607p);
        }
        return interfaceC1607p.mo24163T(this);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: j */
    public final C1610s mo23920j(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return interfaceC1607p == EnumC1592a.OFFSET_SECONDS ? ((EnumC1592a) interfaceC1607p).f10817b : this.f10806a.mo23920j(interfaceC1607p);
        }
        return interfaceC1607p.mo24162E(this);
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: l */
    public final long mo23953l(Temporal temporal, TemporalUnit temporalUnit) {
        C1590s c1590s;
        if (temporal instanceof C1590s) {
            c1590s = (C1590s) temporal;
        } else {
            try {
                c1590s = new C1590s(C1583l.m24136K(temporal), ZoneOffset.m23975a0(temporal));
            } catch (C1512b e) {
                throw new C1512b("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo24161r(this, c1590s);
        }
        long jM24156E = c1590s.m24156E() - m24156E();
        switch (AbstractC1589r.f10804a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jM24156E;
            case 2:
                return jM24156E / 1000;
            case 3:
                return jM24156E / 1000000;
            case 4:
                return jM24156E / 1000000000;
            case 5:
                return jM24156E / 60000000000L;
            case 6:
                return jM24156E / 3600000000000L;
            case 7:
                return jM24156E / 43200000000000L;
            default:
                throw new C1609r("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final C1590s mo23950e(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? m24157K(this.f10806a.mo23950e(j, temporalUnit), this.f10807b) : (C1590s) temporalUnit.mo24160E(this, j);
    }

    public final String toString() {
        return this.f10806a.toString() + this.f10807b.f10626c;
    }
}
