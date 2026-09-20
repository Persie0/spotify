package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum tp50 implements gz61 {
    WEEK_BASED_YEARS("WeekBasedYears"),
    /* JADX INFO: Fake field, exist only in values array */
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a */
    public final String f222435a;

    static {
        dks dksVar = dks.f50018c;
    }

    tp50(String str) {
        this.f222435a = str;
    }

    @Override // p204p.gz61
    /* JADX INFO: renamed from: a */
    public final az61 mo44316a(az61 az61Var, long j) {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return az61Var.mo27574i(j / 256, gce.YEARS).mo27574i((j % 256) * 3, gce.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }
        tp50 tp50Var = up50.f232582a;
        rp50 rp50Var = sp50.f212737d;
        return az61Var.mo27575l(jlg1.m53682A(az61Var.mo30952h(rp50Var), j), rp50Var);
    }

    @Override // p204p.gz61
    /* JADX INFO: renamed from: b */
    public final long mo44317b(az61 az61Var, az61 az61Var2) {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return az61Var.mo27576m(az61Var2, gce.MONTHS) / 3;
            }
            throw new IllegalStateException("Unreachable");
        }
        tp50 tp50Var = up50.f232582a;
        rp50 rp50Var = sp50.f212737d;
        return jlg1.m53686E(az61Var2.mo26517g(rp50Var), az61Var.mo26517g(rp50Var));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f222435a;
    }
}
