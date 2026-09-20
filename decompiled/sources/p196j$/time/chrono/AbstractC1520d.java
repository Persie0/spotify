package p196j$.time.chrono;

import java.io.Serializable;
import java.util.Objects;
import p196j$.time.AbstractC1513c;
import p196j$.time.temporal.C1609r;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1604m;
import p196j$.time.temporal.InterfaceC1606o;
import p196j$.time.temporal.InterfaceC1607p;
import p196j$.time.temporal.Temporal;
import p196j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.chrono.d */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC1520d implements InterfaceC1516b, Temporal, InterfaceC1604m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* JADX INFO: renamed from: r */
    public static InterfaceC1516b m24023r(InterfaceC1535l interfaceC1535l, Temporal temporal) {
        InterfaceC1516b interfaceC1516b = (InterfaceC1516b) temporal;
        if (interfaceC1535l.equals(interfaceC1516b.getChronology())) {
            return interfaceC1516b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + interfaceC1535l.mo24008o() + ", actual: " + interfaceC1516b.getChronology().mo24008o());
    }

    /* JADX INFO: renamed from: E */
    public final long m24024E(InterfaceC1516b interfaceC1516b) {
        if (getChronology().mo23999C(EnumC1592a.MONTH_OF_YEAR).f10844d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        EnumC1592a enumC1592a = EnumC1592a.PROLEPTIC_MONTH;
        long jMo23843i = mo23843i(enumC1592a) * 32;
        EnumC1592a enumC1592a2 = EnumC1592a.DAY_OF_MONTH;
        return (((interfaceC1516b.mo23843i(enumC1592a) * 32) + ((long) interfaceC1516b.mo23952g(enumC1592a2))) - (jMo23843i + ((long) mo23952g(enumC1592a2)))) / 32;
    }

    /* JADX INFO: renamed from: K */
    public abstract InterfaceC1516b mo24017K(long j);

    /* JADX INFO: renamed from: T */
    public abstract InterfaceC1516b mo24018T(long j);

    @Override // p196j$.time.chrono.InterfaceC1516b
    /* JADX INFO: renamed from: V */
    public InterfaceC1516b mo24014V(InterfaceC1606o interfaceC1606o) {
        return m24023r(getChronology(), interfaceC1606o.mo23940r(this));
    }

    /* JADX INFO: renamed from: Z */
    public abstract InterfaceC1516b mo24019Z(long j);

    @Override // p196j$.time.chrono.InterfaceC1516b, p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ Temporal mo23946a(long j, TemporalUnit temporalUnit) {
        return mo23946a(j, temporalUnit);
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1516b) && compareTo((InterfaceC1516b) obj) == 0;
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    public int hashCode() {
        long jMo24011M = mo24011M();
        return ((int) (jMo24011M ^ (jMo24011M >>> 32))) ^ getChronology().hashCode();
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public InterfaceC1516b mo23989k(InterfaceC1604m interfaceC1604m) {
        return m24023r(getChronology(), interfaceC1604m.mo23951f(this));
    }

    @Override // p196j$.time.chrono.InterfaceC1516b, p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: l */
    public final long mo23953l(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC1516b interfaceC1516bMo24003L = getChronology().mo24003L(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.mo24161r(this, interfaceC1516bMo24003L);
        }
        switch (AbstractC1518c.f10637a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return interfaceC1516bMo24003L.mo24011M() - mo24011M();
            case 2:
                return (interfaceC1516bMo24003L.mo24011M() - mo24011M()) / 7;
            case 3:
                return m24024E(interfaceC1516bMo24003L);
            case 4:
                return m24024E(interfaceC1516bMo24003L) / 12;
            case 5:
                return m24024E(interfaceC1516bMo24003L) / 120;
            case 6:
                return m24024E(interfaceC1516bMo24003L) / 1200;
            case 7:
                return m24024E(interfaceC1516bMo24003L) / 12000;
            case 8:
                EnumC1592a enumC1592a = EnumC1592a.ERA;
                return interfaceC1516bMo24003L.mo23843i(enumC1592a) - mo23843i(enumC1592a);
            default:
                throw new C1609r("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    public final String toString() {
        long jMo23843i = mo23843i(EnumC1592a.YEAR_OF_ERA);
        long jMo23843i2 = mo23843i(EnumC1592a.MONTH_OF_YEAR);
        long jMo23843i3 = mo23843i(EnumC1592a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(mo24013Q());
        sb.append(" ");
        sb.append(jMo23843i);
        sb.append(jMo23843i2 < 10 ? "-0" : "-");
        sb.append(jMo23843i2);
        sb.append(jMo23843i3 < 10 ? "-0" : "-");
        sb.append(jMo23843i3);
        return sb.toString();
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public InterfaceC1516b mo23948c(long j, InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
        }
        return m24023r(getChronology(), interfaceC1607p.mo24164Z(this, j));
    }

    @Override // p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public InterfaceC1516b mo23950e(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (!z) {
                return m24023r(getChronology(), temporalUnit.mo24160E(this, j));
            }
            throw new C1609r("Unsupported unit: " + temporalUnit);
        }
        switch (AbstractC1518c.f10637a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return mo24017K(j);
            case 2:
                return mo24017K(Math.multiplyExact(j, 7));
            case 3:
                return mo24018T(j);
            case 4:
                return mo24019Z(j);
            case 5:
                return mo24019Z(Math.multiplyExact(j, 10));
            case 6:
                return mo24019Z(Math.multiplyExact(j, 100));
            case 7:
                return mo24019Z(Math.multiplyExact(j, 1000));
            case 8:
                EnumC1592a enumC1592a = EnumC1592a.ERA;
                return mo23948c(Math.addExact(mo23843i(enumC1592a), j), (InterfaceC1607p) enumC1592a);
            default:
                throw new C1609r("Unsupported unit: " + temporalUnit);
        }
    }
}
