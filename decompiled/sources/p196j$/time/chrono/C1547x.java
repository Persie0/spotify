package p196j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import p196j$.time.AbstractC1513c;
import p196j$.time.C1512b;
import p196j$.time.C1579h;
import p196j$.time.C1580i;
import p196j$.time.C1583l;
import p196j$.time.temporal.C1609r;
import p196j$.time.temporal.C1610s;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1604m;
import p196j$.time.temporal.InterfaceC1606o;
import p196j$.time.temporal.InterfaceC1607p;
import p196j$.time.temporal.Temporal;
import p196j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.chrono.x */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1547x extends AbstractC1520d {

    /* JADX INFO: renamed from: d */
    public static final C1579h f10685d = C1579h.m24113h0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a */
    public final transient C1579h f10686a;

    /* JADX INFO: renamed from: b */
    public final transient C1548y f10687b;

    /* JADX INFO: renamed from: c */
    public final transient int f10688c;

    public C1547x(C1579h c1579h) {
        if (c1579h.m24121c0(f10685d)) {
            throw new C1512b("JapaneseDate before Meiji 6 is not supported");
        }
        C1548y c1548yM24058n = C1548y.m24058n(c1579h);
        this.f10687b = c1548yM24058n;
        this.f10688c = (c1579h.f10781a - c1548yM24058n.f10692b.f10781a) + 1;
        this.f10686a = c1579h;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1523e0((byte) 4, this);
    }

    @Override // p196j$.time.chrono.AbstractC1520d
    /* JADX INFO: renamed from: K */
    public final InterfaceC1516b mo24017K(long j) {
        return m24056c0(this.f10686a.m24126l0(j));
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    /* JADX INFO: renamed from: M */
    public final long mo24011M() {
        return this.f10686a.mo24011M();
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    /* JADX INFO: renamed from: N */
    public final ChronoLocalDateTime mo24012N(C1583l c1583l) {
        return new C1524f(this, c1583l);
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    /* JADX INFO: renamed from: Q */
    public final InterfaceC1536m mo24013Q() {
        return this.f10687b;
    }

    @Override // p196j$.time.chrono.AbstractC1520d
    /* JADX INFO: renamed from: T */
    public final InterfaceC1516b mo24018T(long j) {
        return m24056c0(this.f10686a.m24127m0(j));
    }

    @Override // p196j$.time.chrono.AbstractC1520d, p196j$.time.chrono.InterfaceC1516b
    /* JADX INFO: renamed from: V */
    public final InterfaceC1516b mo24014V(InterfaceC1606o interfaceC1606o) {
        return (C1547x) super.mo24014V(interfaceC1606o);
    }

    @Override // p196j$.time.chrono.AbstractC1520d
    /* JADX INFO: renamed from: Z */
    public final InterfaceC1516b mo24019Z(long j) {
        return m24056c0(this.f10686a.m24129o0(j));
    }

    @Override // p196j$.time.chrono.AbstractC1520d, p196j$.time.chrono.InterfaceC1516b, p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final InterfaceC1516b mo23946a(long j, TemporalUnit temporalUnit) {
        return (C1547x) super.mo23946a(j, temporalUnit);
    }

    /* JADX INFO: renamed from: a0 */
    public final C1547x m24054a0(long j, ChronoUnit chronoUnit) {
        return (C1547x) super.mo23950e(j, (TemporalUnit) chronoUnit);
    }

    @Override // p196j$.time.chrono.AbstractC1520d, p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C1547x mo23948c(long j, InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return (C1547x) super.mo23948c(j, interfaceC1607p);
        }
        EnumC1592a enumC1592a = (EnumC1592a) interfaceC1607p;
        if (mo23843i(enumC1592a) == j) {
            return this;
        }
        int[] iArr = AbstractC1546w.f10684a;
        int i = iArr[enumC1592a.ordinal()];
        if (i == 3 || i == 8 || i == 9) {
            C1545v c1545v = C1545v.f10683c;
            int iM24175a = c1545v.mo23999C(enumC1592a).m24175a(j, enumC1592a);
            int i2 = iArr[enumC1592a.ordinal()];
            if (i2 == 3) {
                return m24056c0(this.f10686a.m24133s0(c1545v.mo24002H(this.f10687b, iM24175a)));
            }
            if (i2 == 8) {
                return m24056c0(this.f10686a.m24133s0(c1545v.mo24002H(C1548y.m24059p(iM24175a), this.f10688c)));
            }
            if (i2 == 9) {
                return m24056c0(this.f10686a.m24133s0(iM24175a));
            }
        }
        return m24056c0(this.f10686a.mo23948c(j, interfaceC1607p));
    }

    /* JADX INFO: renamed from: c0 */
    public final C1547x m24056c0(C1579h c1579h) {
        return c1579h.equals(this.f10686a) ? this : new C1547x(c1579h);
    }

    @Override // p196j$.time.chrono.AbstractC1520d, p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d */
    public final Temporal mo23989k(C1579h c1579h) {
        return (C1547x) super.mo23989k(c1579h);
    }

    /* JADX INFO: renamed from: d0 */
    public final C1547x m24057d0(C1580i c1580i) {
        return (C1547x) super.mo23989k(c1580i);
    }

    @Override // p196j$.time.chrono.AbstractC1520d, p196j$.time.chrono.InterfaceC1516b, p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final InterfaceC1516b mo23950e(long j, TemporalUnit temporalUnit) {
        return (C1547x) super.mo23950e(j, temporalUnit);
    }

    @Override // p196j$.time.chrono.AbstractC1520d, p196j$.time.chrono.InterfaceC1516b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1547x) {
            return this.f10686a.equals(((C1547x) obj).f10686a);
        }
        return false;
    }

    @Override // p196j$.time.chrono.InterfaceC1516b
    public final InterfaceC1535l getChronology() {
        return C1545v.f10683c;
    }

    @Override // p196j$.time.chrono.InterfaceC1516b, p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    public final boolean mo23842h(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p == EnumC1592a.ALIGNED_DAY_OF_WEEK_IN_MONTH || interfaceC1607p == EnumC1592a.ALIGNED_DAY_OF_WEEK_IN_YEAR || interfaceC1607p == EnumC1592a.ALIGNED_WEEK_OF_MONTH || interfaceC1607p == EnumC1592a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (interfaceC1607p instanceof EnumC1592a) {
            return ((EnumC1592a) interfaceC1607p).isDateBased();
        }
        return interfaceC1607p != null && interfaceC1607p.mo24167r(this);
    }

    @Override // p196j$.time.chrono.AbstractC1520d, p196j$.time.chrono.InterfaceC1516b
    public final int hashCode() {
        C1545v.f10683c.getClass();
        return this.f10686a.hashCode() ^ (-688086063);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: i */
    public final long mo23843i(InterfaceC1607p interfaceC1607p) {
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return interfaceC1607p.mo24163T(this);
        }
        switch (AbstractC1546w.f10684a[((EnumC1592a) interfaceC1607p).ordinal()]) {
            case 2:
                return this.f10688c == 1 ? (this.f10686a.m24119a0() - this.f10687b.f10692b.m24119a0()) + 1 : this.f10686a.m24119a0();
            case 3:
                return this.f10688c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
            case 8:
                return this.f10687b.f10691a;
            default:
                return this.f10686a.mo23843i(interfaceC1607p);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: j */
    public final C1610s mo23920j(InterfaceC1607p interfaceC1607p) {
        int iM24119a0;
        if (!(interfaceC1607p instanceof EnumC1592a)) {
            return interfaceC1607p.mo24162E(this);
        }
        if (!mo23842h(interfaceC1607p)) {
            throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
        }
        EnumC1592a enumC1592a = (EnumC1592a) interfaceC1607p;
        int i = AbstractC1546w.f10684a[enumC1592a.ordinal()];
        if (i == 1) {
            return C1610s.m24173f(1L, this.f10686a.m24123e0());
        }
        if (i != 2) {
            if (i != 3) {
                return C1545v.f10683c.mo23999C(enumC1592a);
            }
            C1548y c1548y = this.f10687b;
            int i2 = c1548y.f10692b.f10781a;
            C1548y c1548yM24060o = c1548y.m24060o();
            return c1548yM24060o != null ? C1610s.m24173f(1L, (c1548yM24060o.f10692b.f10781a - i2) + 1) : C1610s.m24173f(1L, 999999999 - i2);
        }
        C1548y c1548yM24060o2 = this.f10687b.m24060o();
        if (c1548yM24060o2 != null) {
            C1579h c1579h = c1548yM24060o2.f10692b;
            if (c1579h.f10781a == this.f10686a.f10781a) {
                iM24119a0 = c1579h.m24119a0() - 1;
            } else if (this.f10686a.m24122d0()) {
                iM24119a0 = 366;
            } else {
                iM24119a0 = 365;
            }
        } else if (this.f10686a.m24122d0()) {
            iM24119a0 = 366;
        } else {
            iM24119a0 = 365;
        }
        if (this.f10688c == 1) {
            iM24119a0 -= this.f10687b.f10692b.m24119a0() - 1;
        }
        return C1610s.m24173f(1L, iM24119a0);
    }

    @Override // p196j$.time.chrono.AbstractC1520d, p196j$.time.chrono.InterfaceC1516b
    /* JADX INFO: renamed from: k */
    public final InterfaceC1516b mo23989k(InterfaceC1604m interfaceC1604m) {
        return (C1547x) super.mo23989k(interfaceC1604m);
    }

    @Override // p196j$.time.chrono.AbstractC1520d, p196j$.time.chrono.InterfaceC1516b, p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a */
    public final Temporal mo23946a(long j, TemporalUnit temporalUnit) {
        return (C1547x) super.mo23946a(j, temporalUnit);
    }

    @Override // p196j$.time.chrono.AbstractC1520d, p196j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal mo23950e(long j, TemporalUnit temporalUnit) {
        return (C1547x) super.mo23950e(j, temporalUnit);
    }

    public C1547x(C1548y c1548y, int i, C1579h c1579h) {
        if (!c1579h.m24121c0(f10685d)) {
            this.f10687b = c1548y;
            this.f10688c = i;
            this.f10686a = c1579h;
            return;
        }
        throw new C1512b("JapaneseDate before Meiji 6 is not supported");
    }
}
