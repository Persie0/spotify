package p204p;

import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.p203bp.DateTimeException;
import org.threeten.p203bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes2.dex */
public final class z050 extends xgg1 implements az61, cz61, Comparable, Serializable {

    /* JADX INFO: renamed from: f */
    public static final z050 f277960f = new z050(0, 0);

    /* JADX INFO: renamed from: g */
    public static final a7j0 f277961g;

    /* JADX INFO: renamed from: d */
    public final long f277962d;

    /* JADX INFO: renamed from: e */
    public final int f277963e;

    static {
        m95041q6(-31557014167219200L, 0L);
        m95041q6(31556889864403199L, 999999999L);
        f277961g = new a7j0(27);
    }

    public z050(int i, long j) {
        this.f277962d = j;
        this.f277963e = i;
    }

    /* JADX INFO: renamed from: m6 */
    public static z050 m95037m6(int i, long j) {
        if ((((long) i) | j) == 0) {
            return f277960f;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new z050(i, j);
    }

    /* JADX INFO: renamed from: n6 */
    public static z050 m95038n6(bz61 bz61Var) {
        try {
            return m95041q6(bz61Var.mo26517g(dce.INSTANT_SECONDS), bz61Var.mo30952h(dce.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + bz61Var + ", type " + bz61Var.getClass().getName(), e);
        }
    }

    /* JADX INFO: renamed from: o6 */
    public static z050 m95039o6() {
        yre.m94419b();
        return m95040p6(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: p6 */
    public static z050 m95040p6(long j) {
        return m95037m6(jlg1.m53709s(1000, j) * 1000000, jlg1.m53707q(j, 1000L));
    }

    /* JADX INFO: renamed from: q6 */
    public static z050 m95041q6(long j, long j2) {
        return m95037m6(jlg1.m53709s(1000000000, j2), jlg1.m53682A(j, jlg1.m53707q(j2, 1000000000L)));
    }

    /* JADX INFO: renamed from: r6 */
    public static z050 m95042r6(CharSequence charSequence) {
        return (z050) bno.f28902k.m30061f(charSequence, f277961g);
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jtz0((byte) 2, this);
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: b */
    public final az61 mo27572b(jba0 jba0Var) {
        return (z050) jba0Var.mo34411c(this);
    }

    @Override // p204p.cz61
    /* JADX INFO: renamed from: c */
    public final az61 mo34411c(az61 az61Var) {
        return az61Var.mo27575l(this.f277962d, dce.INSTANT_SECONDS).mo27575l(this.f277963e, dce.NANO_OF_SECOND);
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: d */
    public final boolean mo26516d(dz61 dz61Var) {
        if (dz61Var instanceof dce) {
            return dz61Var == dce.INSTANT_SECONDS || dz61Var == dce.NANO_OF_SECOND || dz61Var == dce.MICRO_OF_SECOND || dz61Var == dce.MILLI_OF_SECOND;
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
        if (obj instanceof z050) {
            z050 z050Var = (z050) obj;
            if (this.f277962d == z050Var.f277962d && this.f277963e == z050Var.f277963e) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: g */
    public final long mo26517g(dz61 dz61Var) {
        int i;
        if (!(dz61Var instanceof dce)) {
            return dz61Var.mo35644e(this);
        }
        int iOrdinal = ((dce) dz61Var).ordinal();
        int i2 = this.f277963e;
        if (iOrdinal == 0) {
            return i2;
        }
        if (iOrdinal == 2) {
            i = i2 / 1000;
        } else {
            if (iOrdinal != 4) {
                if (iOrdinal == 28) {
                    return this.f277962d;
                }
                throw new UnsupportedTemporalTypeException(klh.m56836h("Unsupported field: ", dz61Var));
            }
            i = i2 / 1000000;
        }
        return i;
    }

    @Override // p204p.xgg1, p204p.bz61
    /* JADX INFO: renamed from: h */
    public final int mo30952h(dz61 dz61Var) {
        if (!(dz61Var instanceof dce)) {
            return super.mo30953j(dz61Var).m24689a(dz61Var.mo35644e(this), dz61Var);
        }
        int iOrdinal = ((dce) dz61Var).ordinal();
        int i = this.f277963e;
        if (iOrdinal == 0) {
            return i;
        }
        if (iOrdinal == 2) {
            return i / 1000;
        }
        if (iOrdinal == 4) {
            return i / 1000000;
        }
        throw new UnsupportedTemporalTypeException(klh.m56836h("Unsupported field: ", dz61Var));
    }

    public final int hashCode() {
        long j = this.f277962d;
        return (this.f277963e * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // p204p.xgg1, p204p.bz61
    /* JADX INFO: renamed from: k */
    public final Object mo26518k(fz61 fz61Var) {
        if (fz61Var == ez61.f64287c) {
            return gce.NANOS;
        }
        if (fz61Var == ez61.f64290f || fz61Var == ez61.f64291g || fz61Var == ez61.f64286b || fz61Var == ez61.f64285a || fz61Var == ez61.f64288d || fz61Var == ez61.f64289e) {
            return null;
        }
        return fz61Var.mo24968w(this);
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: l */
    public final az61 mo27575l(long j, dz61 dz61Var) {
        if (!(dz61Var instanceof dce)) {
            return (z050) dz61Var.mo35641b(this, j);
        }
        dce dceVar = (dce) dz61Var;
        dceVar.m35645f(j);
        int iOrdinal = dceVar.ordinal();
        int i = this.f277963e;
        long j2 = this.f277962d;
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                int i2 = ((int) j) * 1000;
                if (i2 != i) {
                    return m95037m6(i2, j2);
                }
            } else if (iOrdinal == 4) {
                int i3 = ((int) j) * 1000000;
                if (i3 != i) {
                    return m95037m6(i3, j2);
                }
            } else {
                if (iOrdinal != 28) {
                    throw new UnsupportedTemporalTypeException(klh.m56836h("Unsupported field: ", dz61Var));
                }
                if (j != j2) {
                    return m95037m6(i, j);
                }
            }
        } else if (j != i) {
            return m95037m6((int) j, j2);
        }
        return this;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: l6, reason: merged with bridge method [inline-methods] */
    public final int compareTo(z050 z050Var) {
        int iM53702l = jlg1.m53702l(this.f277962d, z050Var.f277962d);
        return iM53702l != 0 ? iM53702l : this.f277963e - z050Var.f277963e;
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: m */
    public final long mo27576m(az61 az61Var, gz61 gz61Var) {
        z050 z050VarM95038n6 = m95038n6(az61Var);
        if (!(gz61Var instanceof gce)) {
            return gz61Var.mo44317b(this, z050VarM95038n6);
        }
        int iOrdinal = ((gce) gz61Var).ordinal();
        int i = this.f277963e;
        long j = this.f277962d;
        switch (iOrdinal) {
            case 0:
                return jlg1.m53682A(jlg1.m53683B(1000000000, jlg1.m53686E(z050VarM95038n6.f277962d, j)), z050VarM95038n6.f277963e - i);
            case 1:
                return jlg1.m53682A(jlg1.m53683B(1000000000, jlg1.m53686E(z050VarM95038n6.f277962d, j)), z050VarM95038n6.f277963e - i) / 1000;
            case 2:
                return jlg1.m53686E(z050VarM95038n6.m95047v6(), m95047v6());
            case 3:
                return m95046u6(z050VarM95038n6);
            case 4:
                return m95046u6(z050VarM95038n6) / 60;
            case 5:
                return m95046u6(z050VarM95038n6) / 3600;
            case 6:
                return m95046u6(z050VarM95038n6) / 43200;
            case 7:
                return m95046u6(z050VarM95038n6) / 86400;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + gz61Var);
        }
    }

    /* JADX INFO: renamed from: s6 */
    public final z050 m95044s6(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return m95041q6(jlg1.m53682A(jlg1.m53682A(this.f277962d, j), j2 / 1000000000), ((long) this.f277963e) + (j2 % 1000000000));
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: t6, reason: merged with bridge method [inline-methods] */
    public final z050 mo27574i(long j, gz61 gz61Var) {
        if (!(gz61Var instanceof gce)) {
            return (z050) gz61Var.mo44316a(this, j);
        }
        switch ((gce) gz61Var) {
            case NANOS:
                return m95044s6(0L, j);
            case MICROS:
                return m95044s6(j / 1000000, (j % 1000000) * 1000);
            case MILLIS:
                return m95044s6(j / 1000, (j % 1000) * 1000000);
            case SECONDS:
                return m95044s6(j, 0L);
            case MINUTES:
                return m95044s6(jlg1.m53683B(60, j), 0L);
            case HOURS:
                return m95044s6(jlg1.m53683B(3600, j), 0L);
            case HALF_DAYS:
                return m95044s6(jlg1.m53683B(43200, j), 0L);
            case DAYS:
                return m95044s6(jlg1.m53683B(86400, j), 0L);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + gz61Var);
        }
    }

    public final String toString() {
        return bno.f28902k.m30060a(this);
    }

    /* JADX INFO: renamed from: u6 */
    public final long m95046u6(z050 z050Var) {
        long jM53686E = jlg1.m53686E(z050Var.f277962d, this.f277962d);
        long j = z050Var.f277963e - this.f277963e;
        if (jM53686E <= 0 || j >= 0) {
            return (jM53686E >= 0 || j <= 0) ? jM53686E : jM53686E + 1;
        }
        return jM53686E - 1;
    }

    /* JADX INFO: renamed from: v6 */
    public final long m95047v6() {
        long j = this.f277962d;
        int i = this.f277963e;
        return j >= 0 ? jlg1.m53682A(jlg1.m53684C(j, 1000L), i / 1000000) : jlg1.m53686E(jlg1.m53684C(j + 1, 1000L), 1000 - ((long) (i / 1000000)));
    }
}
