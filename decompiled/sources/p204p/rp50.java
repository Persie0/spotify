package p204p;

import org.threeten.p203bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public final enum rp50 extends sp50 {
    public rp50() {
        super("WEEK_BASED_YEAR", 3);
    }

    @Override // p204p.dz61
    /* JADX INFO: renamed from: a */
    public final boolean mo35640a(bz61 bz61Var) {
        return bz61Var.mo26516d(dce.EPOCH_DAY) && ice.m50249a(bz61Var).equals(np50.f156881a);
    }

    @Override // p204p.dz61
    /* JADX INFO: renamed from: b */
    public final az61 mo35641b(az61 az61Var, long j) {
        if (!mo35640a(az61Var)) {
            throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
        }
        int iM24689a = dce.YEAR.f47538b.m24689a(j, sp50.f212737d);
        jba0 jba0VarM52882o6 = jba0.m52882o6(az61Var);
        dce dceVar = dce.DAY_OF_WEEK;
        int iMo30952h = jba0VarM52882o6.mo30952h(dceVar);
        int iM78856f = sp50.m78856f(jba0VarM52882o6);
        if (iM78856f == 53 && sp50.m78858h(iM24689a) == 52) {
            iM78856f = 52;
        }
        jba0 jba0VarM52886z6 = jba0.m52886z6(iM24689a, 1, 4);
        return az61Var.mo27572b(jba0VarM52886z6.m52888D6(((iM78856f - 1) * 7) + (iMo30952h - jba0VarM52886z6.mo30952h(dceVar))));
    }

    @Override // p204p.sp50, p204p.dz61
    /* JADX INFO: renamed from: c */
    public final a4b1 mo35642c(bz61 bz61Var) {
        return dce.YEAR.f47538b;
    }

    @Override // p204p.dz61
    /* JADX INFO: renamed from: e */
    public final long mo35644e(bz61 bz61Var) {
        if (bz61Var.mo26516d(this)) {
            return sp50.m78857g(jba0.m52882o6(bz61Var));
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
    }

    @Override // p204p.dz61
    public final a4b1 range() {
        return dce.YEAR.f47538b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "WeekBasedYear";
    }
}
