package p204p;

import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.p203bp.DateTimeException;
import org.threeten.p203bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes2.dex */
public final class jba0 extends ece implements Serializable {

    /* JADX INFO: renamed from: g */
    public static final jba0 f110719g = m52886z6(-999999999, 1, 1);

    /* JADX INFO: renamed from: h */
    public static final jba0 f110720h = m52886z6(999999999, 12, 31);

    /* JADX INFO: renamed from: i */
    public static final wej0 f110721i = new wej0(27);

    /* JADX INFO: renamed from: d */
    public final int f110722d;

    /* JADX INFO: renamed from: e */
    public final short f110723e;

    /* JADX INFO: renamed from: f */
    public final short f110724f;

    public jba0(int i, int i2, int i3) {
        this.f110722d = i;
        this.f110723e = (short) i2;
        this.f110724f = (short) i3;
    }

    /* JADX INFO: renamed from: A6 */
    public static jba0 m52878A6(long j) {
        long j2;
        dce.EPOCH_DAY.m35645f(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i2 / 10));
        dce dceVar = dce.YEAR;
        return new jba0(dceVar.f47538b.m24689a(j7, dceVar), i3, i4);
    }

    /* JADX INFO: renamed from: B6 */
    public static jba0 m52879B6(int i, int i2) {
        long j = i;
        dce.YEAR.m35645f(j);
        dce.DAY_OF_YEAR.m35645f(i2);
        np50 np50Var = np50.f156881a;
        boolean zIsLeapYear = np50.isLeapYear(j);
        if (i2 == 366 && !zIsLeapYear) {
            throw new DateTimeException(edb.m38563l("Invalid date 'DayOfYear 366' as '", i, "' is not a leap year"));
        }
        eyh0 eyh0VarM40311q = eyh0.m40311q(((i2 - 1) / 31) + 1);
        if (i2 > (eyh0VarM40311q.m40315o(zIsLeapYear) + eyh0VarM40311q.m40312a(zIsLeapYear)) - 1) {
            eyh0VarM40311q = eyh0.f64097b[((((int) 1) + 12) + eyh0VarM40311q.ordinal()) % 12];
        }
        return m52881n6(i, eyh0VarM40311q, (i2 - eyh0VarM40311q.m40312a(zIsLeapYear)) + 1);
    }

    /* JADX INFO: renamed from: H6 */
    public static jba0 m52880H6(int i, int i2, int i3) {
        if (i2 == 2) {
            np50 np50Var = np50.f156881a;
            i3 = Math.min(i3, np50.isLeapYear((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return m52886z6(i, i2, i3);
    }

    /* JADX INFO: renamed from: n6 */
    public static jba0 m52881n6(int i, eyh0 eyh0Var, int i2) {
        if (i2 > 28) {
            np50 np50Var = np50.f156881a;
            if (i2 > eyh0Var.m40315o(np50.isLeapYear(i))) {
                if (i2 == 29) {
                    throw new DateTimeException(edb.m38563l("Invalid date 'February 29' as '", i, "' is not a leap year"));
                }
                throw new DateTimeException("Invalid date '" + eyh0Var.name() + " " + i2 + "'");
            }
        }
        return new jba0(i, eyh0Var.m40314n(), i2);
    }

    /* JADX INFO: renamed from: o6 */
    public static jba0 m52882o6(bz61 bz61Var) {
        jba0 jba0Var = (jba0) bz61Var.mo26518k(ez61.f64290f);
        if (jba0Var != null) {
            return jba0Var;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + bz61Var + ", type " + bz61Var.getClass().getName());
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: renamed from: w6 */
    public static jba0 m52883w6() {
        return m52884x6(yre.m94418a());
    }

    private Object writeReplace() {
        return new jtz0((byte) 3, this);
    }

    /* JADX INFO: renamed from: x6 */
    public static jba0 m52884x6(yre yreVar) {
        jlg1.m53716z(yreVar, "clock");
        z050 z050VarM95040p6 = z050.m95040p6(System.currentTimeMillis());
        return m52878A6(jlg1.m53707q(z050VarM95040p6.f277962d + ((long) ((vre) yreVar).f244195a.mo46200f().mo60301a(z050VarM95040p6).f96910b), 86400L));
    }

    /* JADX INFO: renamed from: y6 */
    public static jba0 m52885y6(gze1 gze1Var) {
        jlg1.m53716z(gze1Var, "zone");
        return m52884x6(new vre(gze1Var));
    }

    /* JADX INFO: renamed from: z6 */
    public static jba0 m52886z6(int i, int i2, int i3) {
        dce.YEAR.m35645f(i);
        dce.MONTH_OF_YEAR.m35645f(i2);
        dce.DAY_OF_MONTH.m35645f(i3);
        return m52881n6(i, eyh0.m40311q(i2), i3);
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: C6, reason: merged with bridge method [inline-methods] */
    public final jba0 mo27574i(long j, gz61 gz61Var) {
        if (!(gz61Var instanceof gce)) {
            return (jba0) gz61Var.mo44316a(this, j);
        }
        switch (((gce) gz61Var).ordinal()) {
            case 7:
                return m52888D6(j);
            case 8:
                return m52890F6(j);
            case 9:
                return m52889E6(j);
            case 10:
                return m52891G6(j);
            case 11:
                return m52891G6(jlg1.m53683B(10, j));
            case 12:
                return m52891G6(jlg1.m53683B(100, j));
            case 13:
                return m52891G6(jlg1.m53683B(1000, j));
            case 14:
                dce dceVar = dce.ERA;
                return mo27575l(jlg1.m53682A(mo26517g(dceVar), j), dceVar);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + gz61Var);
        }
    }

    /* JADX INFO: renamed from: D6 */
    public final jba0 m52888D6(long j) {
        return j == 0 ? this : m52878A6(jlg1.m53682A(toEpochDay(), j));
    }

    /* JADX INFO: renamed from: E6 */
    public final jba0 m52889E6(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f110722d) * 12) + ((long) (this.f110723e - 1)) + j;
        dce dceVar = dce.YEAR;
        return m52880H6(dceVar.f47538b.m24689a(jlg1.m53707q(j2, 12L), dceVar), jlg1.m53709s(12, j2) + 1, this.f110724f);
    }

    /* JADX INFO: renamed from: F6 */
    public final jba0 m52890F6(long j) {
        return m52888D6(jlg1.m53683B(7, j));
    }

    /* JADX INFO: renamed from: G6 */
    public final jba0 m52891G6(long j) {
        if (j == 0) {
            return this;
        }
        dce dceVar = dce.YEAR;
        return m52880H6(dceVar.f47538b.m24689a(((long) this.f110722d) + j, dceVar), this.f110723e, this.f110724f);
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: I6, reason: merged with bridge method [inline-methods] */
    public final jba0 mo27575l(long j, dz61 dz61Var) {
        if (!(dz61Var instanceof dce)) {
            return (jba0) dz61Var.mo35641b(this, j);
        }
        dce dceVar = (dce) dz61Var;
        dceVar.m35645f(j);
        int iOrdinal = dceVar.ordinal();
        short s = this.f110724f;
        short s2 = this.f110723e;
        int i = this.f110722d;
        switch (iOrdinal) {
            case 15:
                return m52888D6(j - ((long) m52898q6().m51215f()));
            case 16:
                return m52888D6(j - mo26517g(dce.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 17:
                return m52888D6(j - mo26517g(dce.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 18:
                int i2 = (int) j;
                if (s != i2) {
                    return m52886z6(i, s2, i2);
                }
                return this;
            case 19:
                int i3 = (int) j;
                if (m52899r6() != i3) {
                    return m52879B6(i, i3);
                }
                return this;
            case 20:
                return m52878A6(j);
            case 21:
                return m52890F6(j - mo26517g(dce.ALIGNED_WEEK_OF_MONTH));
            case 22:
                return m52890F6(j - mo26517g(dce.ALIGNED_WEEK_OF_YEAR));
            case 23:
                int i4 = (int) j;
                if (s2 != i4) {
                    dce.MONTH_OF_YEAR.m35645f(i4);
                    return m52880H6(i, i4, s);
                }
                return this;
            case 24:
                return m52889E6(j - mo26517g(dce.PROLEPTIC_MONTH));
            case 25:
                if (i < 1) {
                    j = 1 - j;
                }
                return m52894K6((int) j);
            case 26:
                return m52894K6((int) j);
            case 27:
                if (mo26517g(dce.ERA) != j) {
                    return m52894K6(1 - i);
                }
                return this;
            default:
                throw new UnsupportedTemporalTypeException(klh.m56836h("Unsupported field: ", dz61Var));
        }
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: J6, reason: merged with bridge method [inline-methods] */
    public final jba0 mo27572b(cz61 cz61Var) {
        return cz61Var instanceof jba0 ? (jba0) cz61Var : (jba0) cz61Var.mo34411c(this);
    }

    /* JADX INFO: renamed from: K6 */
    public final jba0 m52894K6(int i) {
        if (this.f110722d == i) {
            return this;
        }
        dce.YEAR.m35645f(i);
        return m52880H6(i, this.f110723e, this.f110724f);
    }

    @Override // p204p.cz61
    /* JADX INFO: renamed from: c */
    public final az61 mo34411c(az61 az61Var) {
        return az61Var.mo27575l(toEpochDay(), dce.EPOCH_DAY);
    }

    @Override // p204p.ece, p204p.bz61
    /* JADX INFO: renamed from: d */
    public final boolean mo26516d(dz61 dz61Var) {
        if (dz61Var instanceof dce) {
            return ((dce) dz61Var).isDateBased();
        }
        return dz61Var != null && dz61Var.mo35640a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jba0) && m52896m6((jba0) obj) == 0;
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: g */
    public final long mo26517g(dz61 dz61Var) {
        if (!(dz61Var instanceof dce)) {
            return dz61Var.mo35644e(this);
        }
        if (dz61Var == dce.EPOCH_DAY) {
            return toEpochDay();
        }
        return dz61Var == dce.PROLEPTIC_MONTH ? m52900s6() : m52897p6(dz61Var);
    }

    @Override // p204p.xgg1, p204p.bz61
    /* JADX INFO: renamed from: h */
    public final int mo30952h(dz61 dz61Var) {
        return dz61Var instanceof dce ? m52897p6(dz61Var) : super.mo30952h(dz61Var);
    }

    public final int hashCode() {
        int i = this.f110722d;
        return (((i << 11) + (this.f110723e << 6)) + this.f110724f) ^ (i & (-2048));
    }

    public final boolean isLeapYear() {
        np50 np50Var = np50.f156881a;
        return np50.isLeapYear(this.f110722d);
    }

    @Override // p204p.xgg1, p204p.bz61
    /* JADX INFO: renamed from: j */
    public final a4b1 mo30953j(dz61 dz61Var) {
        if (!(dz61Var instanceof dce)) {
            return dz61Var.mo35642c(this);
        }
        dce dceVar = (dce) dz61Var;
        if (!dceVar.isDateBased()) {
            throw new UnsupportedTemporalTypeException(klh.m56836h("Unsupported field: ", dz61Var));
        }
        int iOrdinal = dceVar.ordinal();
        if (iOrdinal == 18) {
            return a4b1.m24687d(1L, lengthOfMonth());
        }
        if (iOrdinal == 19) {
            return a4b1.m24687d(1L, isLeapYear() ? 366 : 365);
        }
        if (iOrdinal == 21) {
            return a4b1.m24687d(1L, (eyh0.m40311q(this.f110723e) != eyh0.f64096a || isLeapYear()) ? 5L : 4L);
        }
        if (iOrdinal != 25) {
            return dceVar.f47538b;
        }
        return this.f110722d <= 0 ? a4b1.m24687d(1L, 1000000000L) : a4b1.m24687d(1L, 999999999L);
    }

    @Override // p204p.ece, p204p.xgg1, p204p.bz61
    /* JADX INFO: renamed from: k */
    public final Object mo26518k(fz61 fz61Var) {
        return fz61Var == ez61.f64290f ? this : super.mo26518k(fz61Var);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: l6, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ece eceVar) {
        if (eceVar instanceof jba0) {
            return m52896m6((jba0) eceVar);
        }
        int iM53702l = jlg1.m53702l(toEpochDay(), eceVar.toEpochDay());
        if (iM53702l != 0) {
            return iM53702l;
        }
        np50 np50Var = np50.f156881a;
        return 0;
    }

    public final int lengthOfMonth() {
        short s = this.f110723e;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return isLeapYear() ? 29 : 28;
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: m */
    public final long mo27576m(az61 az61Var, gz61 gz61Var) {
        jba0 jba0VarM52882o6 = m52882o6(az61Var);
        if (!(gz61Var instanceof gce)) {
            return gz61Var.mo44317b(this, jba0VarM52882o6);
        }
        switch (((gce) gz61Var).ordinal()) {
            case 7:
                return jba0VarM52882o6.toEpochDay() - toEpochDay();
            case 8:
                return (jba0VarM52882o6.toEpochDay() - toEpochDay()) / 7;
            case 9:
                return m52903v6(jba0VarM52882o6);
            case 10:
                return m52903v6(jba0VarM52882o6) / 12;
            case 11:
                return m52903v6(jba0VarM52882o6) / 120;
            case 12:
                return m52903v6(jba0VarM52882o6) / 1200;
            case 13:
                return m52903v6(jba0VarM52882o6) / 12000;
            case 14:
                dce dceVar = dce.ERA;
                return jba0VarM52882o6.mo26517g(dceVar) - mo26517g(dceVar);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + gz61Var);
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final int m52896m6(jba0 jba0Var) {
        int i = this.f110722d - jba0Var.f110722d;
        if (i != 0) {
            return i;
        }
        int i2 = this.f110723e - jba0Var.f110723e;
        return i2 == 0 ? this.f110724f - jba0Var.f110724f : i2;
    }

    /* JADX INFO: renamed from: p6 */
    public final int m52897p6(dz61 dz61Var) {
        int iOrdinal = ((dce) dz61Var).ordinal();
        short s = this.f110724f;
        int i = this.f110722d;
        switch (iOrdinal) {
            case 15:
                return m52898q6().m51215f();
            case 16:
                return ((s - 1) % 7) + 1;
            case 17:
                return ((m52899r6() - 1) % 7) + 1;
            case 18:
                return s;
            case 19:
                return m52899r6();
            case 20:
                throw new DateTimeException(klh.m56836h("Field too large for an int: ", dz61Var));
            case 21:
                return edb.m38556e(s, 1, 7, 1);
            case 22:
                return ((m52899r6() - 1) / 7) + 1;
            case 23:
                return this.f110723e;
            case 24:
                throw new DateTimeException(klh.m56836h("Field too large for an int: ", dz61Var));
            case 25:
                return i >= 1 ? i : 1 - i;
            case 26:
                return i;
            case 27:
                return i >= 1 ? 1 : 0;
            default:
                throw new UnsupportedTemporalTypeException(klh.m56836h("Unsupported field: ", dz61Var));
        }
    }

    /* JADX INFO: renamed from: q6 */
    public final ioo m52898q6() {
        return ioo.m51213n(jlg1.m53709s(7, toEpochDay() + 3) + 1);
    }

    /* JADX INFO: renamed from: r6 */
    public final int m52899r6() {
        return (eyh0.m40311q(this.f110723e).m40312a(isLeapYear()) + this.f110724f) - 1;
    }

    /* JADX INFO: renamed from: s6 */
    public final long m52900s6() {
        return (((long) this.f110722d) * 12) + ((long) (this.f110723e - 1));
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: t6, reason: merged with bridge method [inline-methods] */
    public final jba0 mo27573e(long j, gz61 gz61Var) {
        return j == Long.MIN_VALUE ? mo27574i(Long.MAX_VALUE, gz61Var).mo27574i(1L, gz61Var) : mo27574i(-j, gz61Var);
    }

    @Override // p204p.ece
    public final long toEpochDay() {
        long j;
        long j2 = this.f110722d;
        long j3 = this.f110723e;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.f110724f - 1));
        if (j3 > 2) {
            j5 = !isLeapYear() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    public final String toString() {
        int i = this.f110722d;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s = this.f110723e;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.f110724f;
        return s571.m77248g(s2, s2 < 10 ? "-0" : "-", sb);
    }

    /* JADX INFO: renamed from: u6 */
    public final jba0 m52902u6(long j) {
        return j == Long.MIN_VALUE ? m52888D6(Long.MAX_VALUE).m52888D6(1L) : m52888D6(-j);
    }

    /* JADX INFO: renamed from: v6 */
    public final long m52903v6(jba0 jba0Var) {
        return (((jba0Var.m52900s6() * 32) + ((long) jba0Var.f110724f)) - ((m52900s6() * 32) + ((long) this.f110724f))) / 32;
    }
}
