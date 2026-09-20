package p204p;

import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.p203bp.DateTimeException;
import org.threeten.p203bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes11.dex */
public final class yie1 extends xgg1 implements az61, cz61, Comparable, Serializable {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f273102f = 0;

    /* JADX INFO: renamed from: d */
    public final int f273103d;

    /* JADX INFO: renamed from: e */
    public final int f273104e;

    static {
        uno unoVar = new uno();
        unoVar.m83581m(dce.YEAR, 4, 10, 5);
        unoVar.m83571c('-');
        unoVar.m83580l(dce.MONTH_OF_YEAR, 2);
        unoVar.m83584p();
    }

    public yie1(int i, int i2) {
        this.f273103d = i;
        this.f273104e = i2;
    }

    /* JADX INFO: renamed from: l6 */
    public static yie1 m93739l6(bz61 bz61Var) {
        if (bz61Var instanceof yie1) {
            return (yie1) bz61Var;
        }
        try {
            if (!np50.f156881a.equals(ice.m50249a(bz61Var))) {
                bz61Var = jba0.m52882o6(bz61Var);
            }
            return m93741o6(bz61Var.mo30952h(dce.YEAR), bz61Var.mo30952h(dce.MONTH_OF_YEAR));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + bz61Var + ", type " + bz61Var.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: n6 */
    public static yie1 m93740n6(yre yreVar) {
        jba0 jba0VarM52884x6 = jba0.m52884x6(yreVar);
        int i = jba0VarM52884x6.f110722d;
        eyh0 eyh0VarM40311q = eyh0.m40311q(jba0VarM52884x6.f110723e);
        jlg1.m53716z(eyh0VarM40311q, "month");
        return m93741o6(i, eyh0VarM40311q.m40314n());
    }

    /* JADX INFO: renamed from: o6 */
    public static yie1 m93741o6(int i, int i2) {
        dce.YEAR.m35645f(i);
        dce.MONTH_OF_YEAR.m35645f(i2);
        return new yie1(i, i2);
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jtz0((byte) 68, this);
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: b */
    public final az61 mo27572b(jba0 jba0Var) {
        return (yie1) jba0Var.mo34411c(this);
    }

    @Override // p204p.cz61
    /* JADX INFO: renamed from: c */
    public final az61 mo34411c(az61 az61Var) {
        if (!ice.m50249a(az61Var).equals(np50.f156881a)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return az61Var.mo27575l(m93742m6(), dce.PROLEPTIC_MONTH);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        yie1 yie1Var = (yie1) obj;
        int i = this.f273103d - yie1Var.f273103d;
        return i == 0 ? this.f273104e - yie1Var.f273104e : i;
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: d */
    public final boolean mo26516d(dz61 dz61Var) {
        if (dz61Var instanceof dce) {
            return dz61Var == dce.YEAR || dz61Var == dce.MONTH_OF_YEAR || dz61Var == dce.PROLEPTIC_MONTH || dz61Var == dce.YEAR_OF_ERA || dz61Var == dce.ERA;
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
        if (obj instanceof yie1) {
            yie1 yie1Var = (yie1) obj;
            if (this.f273103d == yie1Var.f273103d && this.f273104e == yie1Var.f273104e) {
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
        int i = this.f273103d;
        switch (iOrdinal) {
            case 23:
                return this.f273104e;
            case 24:
                return m93742m6();
            case 25:
                if (i < 1) {
                    i = 1 - i;
                }
                return i;
            case 26:
                return i;
            case 27:
                return i < 1 ? 0 : 1;
            default:
                throw new UnsupportedTemporalTypeException(klh.m56836h("Unsupported field: ", dz61Var));
        }
    }

    @Override // p204p.xgg1, p204p.bz61
    /* JADX INFO: renamed from: h */
    public final int mo30952h(dz61 dz61Var) {
        return mo30953j(dz61Var).m24689a(mo26517g(dz61Var), dz61Var);
    }

    public final int hashCode() {
        return (this.f273104e << 27) ^ this.f273103d;
    }

    @Override // p204p.xgg1, p204p.bz61
    /* JADX INFO: renamed from: j */
    public final a4b1 mo30953j(dz61 dz61Var) {
        if (dz61Var == dce.YEAR_OF_ERA) {
            return a4b1.m24687d(1L, this.f273103d <= 0 ? 1000000000L : 999999999L);
        }
        return super.mo30953j(dz61Var);
    }

    @Override // p204p.xgg1, p204p.bz61
    /* JADX INFO: renamed from: k */
    public final Object mo26518k(fz61 fz61Var) {
        if (fz61Var == ez61.f64286b) {
            return np50.f156881a;
        }
        if (fz61Var == ez61.f64287c) {
            return gce.MONTHS;
        }
        if (fz61Var == ez61.f64290f || fz61Var == ez61.f64291g || fz61Var == ez61.f64288d || fz61Var == ez61.f64285a || fz61Var == ez61.f64289e) {
            return null;
        }
        return super.mo26518k(fz61Var);
    }

    public final int lengthOfMonth() {
        eyh0 eyh0VarM40311q = eyh0.m40311q(this.f273104e);
        np50 np50Var = np50.f156881a;
        return eyh0VarM40311q.m40315o(np50.isLeapYear(this.f273103d));
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: m */
    public final long mo27576m(az61 az61Var, gz61 gz61Var) {
        yie1 yie1VarM93739l6 = m93739l6(az61Var);
        if (!(gz61Var instanceof gce)) {
            return gz61Var.mo44317b(this, yie1VarM93739l6);
        }
        long jM93742m6 = yie1VarM93739l6.m93742m6() - m93742m6();
        switch (((gce) gz61Var).ordinal()) {
            case 9:
                return jM93742m6;
            case 10:
                return jM93742m6 / 12;
            case 11:
                return jM93742m6 / 120;
            case 12:
                return jM93742m6 / 1200;
            case 13:
                return jM93742m6 / 12000;
            case 14:
                dce dceVar = dce.ERA;
                return yie1VarM93739l6.mo26517g(dceVar) - mo26517g(dceVar);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + gz61Var);
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final long m93742m6() {
        return (((long) this.f273103d) * 12) + ((long) (this.f273104e - 1));
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: p6, reason: merged with bridge method [inline-methods] */
    public final yie1 mo27574i(long j, gz61 gz61Var) {
        if (!(gz61Var instanceof gce)) {
            return (yie1) gz61Var.mo44316a(this, j);
        }
        switch (((gce) gz61Var).ordinal()) {
            case 9:
                return m93744q6(j);
            case 10:
                return m93745r6(j);
            case 11:
                return m93745r6(jlg1.m53683B(10, j));
            case 12:
                return m93745r6(jlg1.m53683B(100, j));
            case 13:
                return m93745r6(jlg1.m53683B(1000, j));
            case 14:
                dce dceVar = dce.ERA;
                return mo27575l(jlg1.m53682A(mo26517g(dceVar), j), dceVar);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + gz61Var);
        }
    }

    /* JADX INFO: renamed from: q6 */
    public final yie1 m93744q6(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f273103d) * 12) + ((long) (this.f273104e - 1)) + j;
        dce dceVar = dce.YEAR;
        return m93746s6(dceVar.f47538b.m24689a(jlg1.m53707q(j2, 12L), dceVar), jlg1.m53709s(12, j2) + 1);
    }

    /* JADX INFO: renamed from: r6 */
    public final yie1 m93745r6(long j) {
        if (j == 0) {
            return this;
        }
        dce dceVar = dce.YEAR;
        return m93746s6(dceVar.f47538b.m24689a(((long) this.f273103d) + j, dceVar), this.f273104e);
    }

    /* JADX INFO: renamed from: s6 */
    public final yie1 m93746s6(int i, int i2) {
        return (this.f273103d == i && this.f273104e == i2) ? this : new yie1(i, i2);
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: t6, reason: merged with bridge method [inline-methods] */
    public final yie1 mo27575l(long j, dz61 dz61Var) {
        if (!(dz61Var instanceof dce)) {
            return (yie1) dz61Var.mo35641b(this, j);
        }
        dce dceVar = (dce) dz61Var;
        dceVar.m35645f(j);
        int iOrdinal = dceVar.ordinal();
        int i = this.f273104e;
        int i2 = this.f273103d;
        switch (iOrdinal) {
            case 23:
                int i3 = (int) j;
                dce.MONTH_OF_YEAR.m35645f(i3);
                return m93746s6(i2, i3);
            case 24:
                return m93744q6(j - mo26517g(dce.PROLEPTIC_MONTH));
            case 25:
                if (i2 < 1) {
                    j = 1 - j;
                }
                int i4 = (int) j;
                dce.YEAR.m35645f(i4);
                return m93746s6(i4, i);
            case 26:
                int i5 = (int) j;
                dce.YEAR.m35645f(i5);
                return m93746s6(i5, i);
            case 27:
                if (mo26517g(dce.ERA) == j) {
                    return this;
                }
                int i6 = 1 - i2;
                dce.YEAR.m35645f(i6);
                return m93746s6(i6, i);
            default:
                throw new UnsupportedTemporalTypeException(klh.m56836h("Unsupported field: ", dz61Var));
        }
    }

    public final String toString() {
        int i = this.f273103d;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i2 = this.f273104e;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }
}
