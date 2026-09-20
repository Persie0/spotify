package p204p;

import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.p203bp.DateTimeException;

/* JADX INFO: loaded from: classes11.dex */
public final class d4l0 extends qlp implements cz61, Comparable, Serializable {

    /* JADX INFO: renamed from: f */
    public static final wej0 f45196f;

    /* JADX INFO: renamed from: d */
    public final lba0 f45197d;

    /* JADX INFO: renamed from: e */
    public final hze1 f45198e;

    static {
        lba0 lba0Var = lba0.f131608f;
        hze1 hze1Var = hze1.f96909h;
        lba0Var.getClass();
        m34919o6(lba0Var, hze1Var);
        lba0 lba0Var2 = lba0.f131609g;
        hze1 hze1Var2 = hze1.f96908g;
        lba0Var2.getClass();
        m34919o6(lba0Var2, hze1Var2);
        f45196f = new wej0(29);
    }

    public d4l0(lba0 lba0Var, hze1 hze1Var) {
        jlg1.m53716z(lba0Var, "dateTime");
        this.f45197d = lba0Var;
        jlg1.m53716z(hze1Var, "offset");
        this.f45198e = hze1Var;
    }

    /* JADX INFO: renamed from: m6 */
    public static d4l0 m34918m6(bz61 bz61Var) {
        if (bz61Var instanceof d4l0) {
            return (d4l0) bz61Var;
        }
        try {
            hze1 hze1VarM49266r = hze1.m49266r(bz61Var);
            try {
                return new d4l0(lba0.m58639q6(bz61Var), hze1VarM49266r);
            } catch (DateTimeException unused) {
                return m34920p6(z050.m95038n6(bz61Var), hze1VarM49266r);
            }
        } catch (DateTimeException unused2) {
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + bz61Var + ", type " + bz61Var.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: o6 */
    public static d4l0 m34919o6(lba0 lba0Var, hze1 hze1Var) {
        return new d4l0(lba0Var, hze1Var);
    }

    /* JADX INFO: renamed from: p6 */
    public static d4l0 m34920p6(z050 z050Var, gze1 gze1Var) {
        jlg1.m53716z(z050Var, "instant");
        jlg1.m53716z(gze1Var, "zone");
        hze1 hze1VarMo60301a = gze1Var.mo46200f().mo60301a(z050Var);
        return new d4l0(lba0.m58642w6(z050Var.f277962d, z050Var.f277963e, hze1VarMo60301a), hze1VarMo60301a);
    }

    /* JADX INFO: renamed from: q6 */
    public static d4l0 m34921q6(CharSequence charSequence, bno bnoVar) {
        jlg1.m53716z(bnoVar, "formatter");
        return (d4l0) bnoVar.m30061f(charSequence, f45196f);
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jtz0((byte) 69, this);
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: b */
    public final az61 mo27572b(jba0 jba0Var) {
        lba0 lba0Var = this.f45197d;
        return m34926t6(lba0Var.m58649E6(jba0Var, lba0Var.f131612e), this.f45198e);
    }

    @Override // p204p.cz61
    /* JADX INFO: renamed from: c */
    public final az61 mo34411c(az61 az61Var) {
        dce dceVar = dce.EPOCH_DAY;
        lba0 lba0Var = this.f45197d;
        return az61Var.mo27575l(lba0Var.f131611d.toEpochDay(), dceVar).mo27575l(lba0Var.f131612e.m35878z6(), dce.NANO_OF_DAY).mo27575l(this.f45198e.f96910b, dce.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d4l0 d4l0Var = (d4l0) obj;
        hze1 hze1Var = d4l0Var.f45198e;
        lba0 lba0Var = d4l0Var.f45197d;
        hze1 hze1Var2 = this.f45198e;
        boolean zEquals = hze1Var2.equals(hze1Var);
        lba0 lba0Var2 = this.f45197d;
        if (zEquals) {
            return lba0Var2.compareTo(lba0Var);
        }
        int iM53702l = jlg1.m53702l(lba0Var2.m41299l6(hze1Var2), lba0Var.m41299l6(d4l0Var.f45198e));
        if (iM53702l != 0) {
            return iM53702l;
        }
        int i = lba0Var2.f131612e.f48558g - lba0Var.f131612e.f48558g;
        return i == 0 ? lba0Var2.compareTo(lba0Var) : i;
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: d */
    public final boolean mo26516d(dz61 dz61Var) {
        if (dz61Var instanceof dce) {
            return true;
        }
        return dz61Var != null && dz61Var.mo35640a(this);
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: e */
    public final az61 mo27573e(long j, gz61 gz61Var) {
        return j == Long.MIN_VALUE ? mo27574i(Long.MAX_VALUE, gz61Var).mo27574i(1L, gz61Var) : mo27574i(-j, gz61Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d4l0) {
            d4l0 d4l0Var = (d4l0) obj;
            if (this.f45197d.equals(d4l0Var.f45197d) && this.f45198e.equals(d4l0Var.f45198e)) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: g */
    public final long mo26517g(dz61 dz61Var) {
        if (!(dz61Var instanceof dce)) {
            return dz61Var.mo35644e(this);
        }
        int iOrdinal = ((dce) dz61Var).ordinal();
        hze1 hze1Var = this.f45198e;
        lba0 lba0Var = this.f45197d;
        if (iOrdinal != 28) {
            return iOrdinal != 29 ? lba0Var.mo26517g(dz61Var) : hze1Var.f96910b;
        }
        return lba0Var.m41299l6(hze1Var);
    }

    @Override // p204p.xgg1, p204p.bz61
    /* JADX INFO: renamed from: h */
    public final int mo30952h(dz61 dz61Var) {
        if (!(dz61Var instanceof dce)) {
            return super.mo30952h(dz61Var);
        }
        int iOrdinal = ((dce) dz61Var).ordinal();
        if (iOrdinal != 28) {
            return iOrdinal != 29 ? this.f45197d.mo30952h(dz61Var) : this.f45198e.f96910b;
        }
        throw new DateTimeException(klh.m56836h("Field too large for an int: ", dz61Var));
    }

    public final int hashCode() {
        return this.f45197d.hashCode() ^ this.f45198e.f96910b;
    }

    @Override // p204p.xgg1, p204p.bz61
    /* JADX INFO: renamed from: j */
    public final a4b1 mo30953j(dz61 dz61Var) {
        if (dz61Var instanceof dce) {
            return (dz61Var == dce.INSTANT_SECONDS || dz61Var == dce.OFFSET_SECONDS) ? ((dce) dz61Var).f47538b : this.f45197d.mo30953j(dz61Var);
        }
        return dz61Var.mo35642c(this);
    }

    @Override // p204p.xgg1, p204p.bz61
    /* JADX INFO: renamed from: k */
    public final Object mo26518k(fz61 fz61Var) {
        if (fz61Var == ez61.f64286b) {
            return np50.f156881a;
        }
        if (fz61Var == ez61.f64287c) {
            return gce.NANOS;
        }
        if (fz61Var == ez61.f64289e || fz61Var == ez61.f64288d) {
            return this.f45198e;
        }
        lb5 lb5Var = ez61.f64290f;
        lba0 lba0Var = this.f45197d;
        if (fz61Var == lb5Var) {
            return lba0Var.f131611d;
        }
        if (fz61Var == ez61.f64291g) {
            return lba0Var.f131612e;
        }
        if (fz61Var == ez61.f64285a) {
            return null;
        }
        return super.mo26518k(fz61Var);
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: l */
    public final az61 mo27575l(long j, dz61 dz61Var) {
        if (!(dz61Var instanceof dce)) {
            return (d4l0) dz61Var.mo35641b(this, j);
        }
        dce dceVar = (dce) dz61Var;
        int iOrdinal = dceVar.ordinal();
        hze1 hze1Var = this.f45198e;
        lba0 lba0Var = this.f45197d;
        if (iOrdinal != 28) {
            return iOrdinal != 29 ? m34926t6(lba0Var.mo27575l(j, dz61Var), hze1Var) : m34926t6(lba0Var, hze1.m49269u(dceVar.f47538b.m24689a(j, dceVar)));
        }
        return m34920p6(z050.m95041q6(j, lba0Var.f131612e.f48558g), hze1Var);
    }

    /* JADX INFO: renamed from: l6 */
    public final String m34922l6(bno bnoVar) {
        jlg1.m53716z(bnoVar, "formatter");
        return bnoVar.m30060a(this);
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: m */
    public final long mo27576m(az61 az61Var, gz61 gz61Var) {
        d4l0 d4l0VarM34918m6 = m34918m6(az61Var);
        if (!(gz61Var instanceof gce)) {
            return gz61Var.mo44317b(this, d4l0VarM34918m6);
        }
        hze1 hze1Var = d4l0VarM34918m6.f45198e;
        hze1 hze1Var2 = this.f45198e;
        if (!hze1Var2.equals(hze1Var)) {
            d4l0VarM34918m6 = new d4l0(d4l0VarM34918m6.f45197d.m58646B6(hze1Var2.f96910b - hze1Var.f96910b), hze1Var2);
        }
        return this.f45197d.mo27576m(d4l0VarM34918m6.f45197d, gz61Var);
    }

    /* JADX INFO: renamed from: n6 */
    public final int m34923n6() {
        return this.f45197d.f131611d.f110724f;
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: r6, reason: merged with bridge method [inline-methods] */
    public final d4l0 mo27574i(long j, gz61 gz61Var) {
        return gz61Var instanceof gce ? m34926t6(this.f45197d.mo27574i(j, gz61Var), this.f45198e) : (d4l0) gz61Var.mo44316a(this, j);
    }

    /* JADX INFO: renamed from: s6 */
    public final d4l0 m34925s6(long j) {
        lba0 lba0Var = this.f45197d;
        return m34926t6(lba0Var.m58647C6(lba0Var.f131611d, 0L, j, 0L, 0L), this.f45198e);
    }

    /* JADX INFO: renamed from: t6 */
    public final d4l0 m34926t6(lba0 lba0Var, hze1 hze1Var) {
        return (this.f45197d == lba0Var && this.f45198e.equals(hze1Var)) ? this : new d4l0(lba0Var, hze1Var);
    }

    public final String toString() {
        return this.f45197d.toString() + this.f45198e.f96911c;
    }
}
