package p204p;

import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.p203bp.DateTimeException;
import org.threeten.p203bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes2.dex */
public final class lba0 extends fce implements Serializable {

    /* JADX INFO: renamed from: f */
    public static final lba0 f131608f = m58641v6(jba0.f110719g, dfa0.f48552h);

    /* JADX INFO: renamed from: g */
    public static final lba0 f131609g = m58641v6(jba0.f110720h, dfa0.f48553i);

    /* JADX INFO: renamed from: h */
    public static final zhi0 f131610h = new zhi0(28);

    /* JADX INFO: renamed from: d */
    public final jba0 f131611d;

    /* JADX INFO: renamed from: e */
    public final dfa0 f131612e;

    public lba0(jba0 jba0Var, dfa0 dfa0Var) {
        this.f131611d = jba0Var;
        this.f131612e = dfa0Var;
    }

    /* JADX INFO: renamed from: q6 */
    public static lba0 m58639q6(bz61 bz61Var) {
        if (bz61Var instanceof lba0) {
            return (lba0) bz61Var;
        }
        if (bz61Var instanceof pze1) {
            return ((pze1) bz61Var).f183683d;
        }
        try {
            return new lba0(jba0.m52882o6(bz61Var), dfa0.m35861n6(bz61Var));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + bz61Var + ", type " + bz61Var.getClass().getName());
        }
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: renamed from: u6 */
    public static lba0 m58640u6(yre yreVar) {
        jlg1.m53716z(yreVar, "clock");
        z050 z050VarM95040p6 = z050.m95040p6(System.currentTimeMillis());
        return m58642w6(z050VarM95040p6.f277962d, z050VarM95040p6.f277963e, ((vre) yreVar).f244195a.mo46200f().mo60301a(z050VarM95040p6));
    }

    /* JADX INFO: renamed from: v6 */
    public static lba0 m58641v6(jba0 jba0Var, dfa0 dfa0Var) {
        jlg1.m53716z(jba0Var, "date");
        jlg1.m53716z(dfa0Var, "time");
        return new lba0(jba0Var, dfa0Var);
    }

    /* JADX INFO: renamed from: w6 */
    public static lba0 m58642w6(long j, int i, hze1 hze1Var) {
        jlg1.m53716z(hze1Var, "offset");
        long j2 = j + ((long) hze1Var.f96910b);
        long jM53707q = jlg1.m53707q(j2, 86400L);
        int iM53709s = jlg1.m53709s(86400, j2);
        jba0 jba0VarM52878A6 = jba0.m52878A6(jM53707q);
        long j3 = iM53709s;
        dfa0 dfa0Var = dfa0.f48552h;
        dce.SECOND_OF_DAY.m35645f(j3);
        dce.NANO_OF_SECOND.m35645f(i);
        int i2 = (int) (j3 / 3600);
        long j4 = j3 - ((long) (i2 * 3600));
        int i3 = (int) (j4 / 60);
        return new lba0(jba0VarM52878A6, dfa0.m35860m6(i2, i3, (int) (j4 - ((long) (i3 * 60))), i));
    }

    private Object writeReplace() {
        return new jtz0((byte) 4, this);
    }

    /* JADX INFO: renamed from: x6 */
    public static lba0 m58643x6(z050 z050Var, gze1 gze1Var) {
        jlg1.m53716z(z050Var, "instant");
        jlg1.m53716z(gze1Var, "zone");
        return m58642w6(z050Var.f277962d, z050Var.f277963e, gze1Var.mo46200f().mo60301a(z050Var));
    }

    /* JADX INFO: renamed from: y6 */
    public static lba0 m58644y6(CharSequence charSequence, bno bnoVar) {
        jlg1.m53716z(bnoVar, "formatter");
        return (lba0) bnoVar.m30061f(charSequence, f131610h);
    }

    /* JADX INFO: renamed from: A6 */
    public final lba0 m58645A6(long j) {
        return m58649E6(this.f131611d.m52888D6(j), this.f131612e);
    }

    /* JADX INFO: renamed from: B6 */
    public final lba0 m58646B6(long j) {
        return m58647C6(this.f131611d, 0L, 0L, j, 0L);
    }

    /* JADX INFO: renamed from: C6 */
    public final lba0 m58647C6(jba0 jba0Var, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        dfa0 dfa0VarM35864r6 = this.f131612e;
        if (j5 == 0) {
            return m58649E6(jba0Var, dfa0VarM35864r6);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jM35878z6 = dfa0VarM35864r6.m35878z6();
        long j10 = (j9 * j8) + jM35878z6;
        long jM53707q = jlg1.m53707q(j10, 86400000000000L) + (j7 * j8);
        long jM53710t = jlg1.m53710t(j10, 86400000000000L);
        if (jM53710t != jM35878z6) {
            dfa0VarM35864r6 = dfa0.m35864r6(jM53710t);
        }
        return m58649E6(jba0Var.m52888D6(jM53707q), dfa0VarM35864r6);
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: D6, reason: merged with bridge method [inline-methods] */
    public final lba0 mo27575l(long j, dz61 dz61Var) {
        if (!(dz61Var instanceof dce)) {
            return (lba0) dz61Var.mo35641b(this, j);
        }
        boolean zM35646g = ((dce) dz61Var).m35646g();
        dfa0 dfa0Var = this.f131612e;
        jba0 jba0Var = this.f131611d;
        return zM35646g ? m58649E6(jba0Var, dfa0Var.mo27575l(j, dz61Var)) : m58649E6(jba0Var.mo27575l(j, dz61Var), dfa0Var);
    }

    /* JADX INFO: renamed from: E6 */
    public final lba0 m58649E6(jba0 jba0Var, dfa0 dfa0Var) {
        return (this.f131611d == jba0Var && this.f131612e == dfa0Var) ? this : new lba0(jba0Var, dfa0Var);
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: b */
    public final az61 mo27572b(jba0 jba0Var) {
        return m58649E6(jba0Var, this.f131612e);
    }

    @Override // p204p.cz61
    /* JADX INFO: renamed from: c */
    public final az61 mo34411c(az61 az61Var) {
        return az61Var.mo27575l(this.f131611d.toEpochDay(), dce.EPOCH_DAY).mo27575l(this.f131612e.m35878z6(), dce.NANO_OF_DAY);
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: d */
    public final boolean mo26516d(dz61 dz61Var) {
        if (!(dz61Var instanceof dce)) {
            return dz61Var != null && dz61Var.mo35640a(this);
        }
        dce dceVar = (dce) dz61Var;
        return dceVar.isDateBased() || dceVar.m35646g();
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
        if (obj instanceof lba0) {
            lba0 lba0Var = (lba0) obj;
            if (this.f131611d.equals(lba0Var.f131611d) && this.f131612e.equals(lba0Var.f131612e)) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: g */
    public final long mo26517g(dz61 dz61Var) {
        if (dz61Var instanceof dce) {
            return ((dce) dz61Var).m35646g() ? this.f131612e.mo26517g(dz61Var) : this.f131611d.mo26517g(dz61Var);
        }
        return dz61Var.mo35644e(this);
    }

    @Override // p204p.xgg1, p204p.bz61
    /* JADX INFO: renamed from: h */
    public final int mo30952h(dz61 dz61Var) {
        if (dz61Var instanceof dce) {
            return ((dce) dz61Var).m35646g() ? this.f131612e.mo30952h(dz61Var) : this.f131611d.mo30952h(dz61Var);
        }
        return super.mo30952h(dz61Var);
    }

    public final int hashCode() {
        return this.f131611d.hashCode() ^ this.f131612e.hashCode();
    }

    @Override // p204p.xgg1, p204p.bz61
    /* JADX INFO: renamed from: j */
    public final a4b1 mo30953j(dz61 dz61Var) {
        if (dz61Var instanceof dce) {
            return ((dce) dz61Var).m35646g() ? this.f131612e.mo30953j(dz61Var) : this.f131611d.mo30953j(dz61Var);
        }
        return dz61Var.mo35642c(this);
    }

    @Override // p204p.fce, p204p.xgg1, p204p.bz61
    /* JADX INFO: renamed from: k */
    public final Object mo26518k(fz61 fz61Var) {
        return fz61Var == ez61.f64290f ? this.f131611d : super.mo26518k(fz61Var);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
    @Override // p204p.az61
    /* JADX INFO: renamed from: m */
    public final long mo27576m(az61 az61Var, gz61 gz61Var) {
        boolean z;
        lba0 lba0VarM58639q6 = m58639q6(az61Var);
        if (!(gz61Var instanceof gce)) {
            return gz61Var.mo44317b(this, lba0VarM58639q6);
        }
        gce gceVar = (gce) gz61Var;
        int iCompareTo = gceVar.compareTo(gce.DAYS);
        dfa0 dfa0Var = this.f131612e;
        jba0 jba0Var = this.f131611d;
        if (iCompareTo >= 0) {
            jba0 jba0VarM52902u6 = lba0VarM58639q6.f131611d;
            dfa0 dfa0Var2 = lba0VarM58639q6.f131612e;
            if (jba0Var == null ? jba0VarM52902u6.toEpochDay() <= jba0Var.toEpochDay() : jba0VarM52902u6.m52896m6(jba0Var) <= 0) {
                z = false;
                if (jba0Var != null ? jba0VarM52902u6.toEpochDay() < jba0Var.toEpochDay() : jba0VarM52902u6.m52896m6(jba0Var) < 0) {
                }
                if (z && dfa0Var2.compareTo(dfa0Var) > 0) {
                    jba0VarM52902u6 = jba0VarM52902u6.m52888D6(1L);
                }
            } else if (dfa0Var2.compareTo(dfa0Var) < 0) {
                jba0VarM52902u6 = jba0VarM52902u6.m52902u6(1L);
            } else {
                z = false;
                z = jba0Var != null ? true : true;
                if (z) {
                    jba0VarM52902u6 = jba0VarM52902u6.m52888D6(1L);
                }
            }
            return jba0Var.mo27576m(jba0VarM52902u6, gz61Var);
        }
        jba0 jba0Var2 = lba0VarM58639q6.f131611d;
        jba0Var.getClass();
        long epochDay = jba0Var2.toEpochDay() - jba0Var.toEpochDay();
        long jM35878z6 = lba0VarM58639q6.f131612e.m35878z6() - dfa0Var.m35878z6();
        if (epochDay > 0 && jM35878z6 < 0) {
            epochDay--;
            jM35878z6 += 86400000000000L;
        } else if (epochDay < 0 && jM35878z6 > 0) {
            epochDay++;
            jM35878z6 -= 86400000000000L;
        }
        switch (gceVar) {
            case NANOS:
                return jlg1.m53682A(jlg1.m53684C(epochDay, 86400000000000L), jM35878z6);
            case MICROS:
                return jlg1.m53682A(jlg1.m53684C(epochDay, 86400000000L), jM35878z6 / 1000);
            case MILLIS:
                return jlg1.m53682A(jlg1.m53684C(epochDay, 86400000L), jM35878z6 / 1000000);
            case SECONDS:
                return jlg1.m53682A(jlg1.m53683B(86400, epochDay), jM35878z6 / 1000000000);
            case MINUTES:
                return jlg1.m53682A(jlg1.m53683B(1440, epochDay), jM35878z6 / 60000000000L);
            case HOURS:
                return jlg1.m53682A(jlg1.m53683B(24, epochDay), jM35878z6 / 3600000000000L);
            case HALF_DAYS:
                return jlg1.m53682A(jlg1.m53683B(2, epochDay), jM35878z6 / 43200000000000L);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + gz61Var);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n6, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fce fceVar) {
        if (fceVar instanceof lba0) {
            return m58651o6((lba0) fceVar);
        }
        lba0 lba0Var = (lba0) fceVar;
        jba0 jba0Var = lba0Var.f131611d;
        jba0 jba0Var2 = this.f131611d;
        int iCompareTo = jba0Var2.compareTo(jba0Var);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f131612e.compareTo(lba0Var.f131612e);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        jba0Var2.getClass();
        np50 np50Var = np50.f156881a;
        fceVar.getClass();
        ((lba0) fceVar).f131611d.getClass();
        return 0;
    }

    /* JADX INFO: renamed from: o6 */
    public final int m58651o6(lba0 lba0Var) {
        int iM52896m6 = this.f131611d.m52896m6(lba0Var.f131611d);
        return iM52896m6 == 0 ? this.f131612e.compareTo(lba0Var.f131612e) : iM52896m6;
    }

    /* JADX INFO: renamed from: p6 */
    public final String m58652p6(bno bnoVar) {
        jlg1.m53716z(bnoVar, "formatter");
        return bnoVar.m30060a(this);
    }

    /* JADX INFO: renamed from: r6 */
    public final eyh0 m58653r6() {
        return eyh0.m40311q(this.f131611d.f110723e);
    }

    /* JADX INFO: renamed from: s6 */
    public final boolean m58654s6(lba0 lba0Var) {
        if (lba0Var != null) {
            return m58651o6(lba0Var) > 0;
        }
        long epochDay = this.f131611d.toEpochDay();
        long epochDay2 = lba0Var.f131611d.toEpochDay();
        if (epochDay <= epochDay2) {
            return epochDay == epochDay2 && this.f131612e.m35878z6() > lba0Var.f131612e.m35878z6();
        }
        return true;
    }

    /* JADX INFO: renamed from: t6 */
    public final boolean m58655t6(lba0 lba0Var) {
        if (lba0Var != null) {
            return m58651o6(lba0Var) < 0;
        }
        long epochDay = this.f131611d.toEpochDay();
        long epochDay2 = lba0Var.f131611d.toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && this.f131612e.m35878z6() < lba0Var.f131612e.m35878z6();
        }
        return true;
    }

    public final String toString() {
        return this.f131611d.toString() + 'T' + this.f131612e.toString();
    }

    @Override // p204p.az61
    /* JADX INFO: renamed from: z6, reason: merged with bridge method [inline-methods] */
    public final lba0 mo27574i(long j, gz61 gz61Var) {
        if (!(gz61Var instanceof gce)) {
            return (lba0) gz61Var.mo44316a(this, j);
        }
        switch ((gce) gz61Var) {
            case NANOS:
                return m58647C6(this.f131611d, 0L, 0L, 0L, j);
            case MICROS:
                lba0 lba0VarM58645A6 = m58645A6(j / 86400000000L);
                return lba0VarM58645A6.m58647C6(lba0VarM58645A6.f131611d, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case MILLIS:
                lba0 lba0VarM58645A7 = m58645A6(j / 86400000);
                return lba0VarM58645A7.m58647C6(lba0VarM58645A7.f131611d, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case SECONDS:
                return m58646B6(j);
            case MINUTES:
                return m58647C6(this.f131611d, 0L, j, 0L, 0L);
            case HOURS:
                return m58647C6(this.f131611d, j, 0L, 0L, 0L);
            case HALF_DAYS:
                lba0 lba0VarM58645A8 = m58645A6(j / 256);
                return lba0VarM58645A8.m58647C6(lba0VarM58645A8.f131611d, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return m58649E6(this.f131611d.mo27574i(j, gz61Var), this.f131612e);
        }
    }
}
