package p204p;

import org.threeten.p203bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public final enum pp50 extends sp50 {
    public pp50() {
        super("QUARTER_OF_YEAR", 1);
    }

    @Override // p204p.dz61
    /* JADX INFO: renamed from: a */
    public final boolean mo35640a(bz61 bz61Var) {
        return bz61Var.mo26516d(dce.MONTH_OF_YEAR) && ice.m50249a(bz61Var).equals(np50.f156881a);
    }

    @Override // p204p.dz61
    /* JADX INFO: renamed from: b */
    public final az61 mo35641b(az61 az61Var, long j) {
        long jMo35644e = mo35644e(az61Var);
        range().m24690b(j, this);
        dce dceVar = dce.MONTH_OF_YEAR;
        return az61Var.mo27575l(((j - jMo35644e) * 3) + az61Var.mo26517g(dceVar), dceVar);
    }

    @Override // p204p.dz61
    /* JADX INFO: renamed from: e */
    public final long mo35644e(bz61 bz61Var) {
        if (bz61Var.mo26516d(this)) {
            return (bz61Var.mo26517g(dce.MONTH_OF_YEAR) + 2) / 3;
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
    }

    @Override // p204p.dz61
    public final a4b1 range() {
        return a4b1.m24687d(1L, 4L);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "QuarterOfYear";
    }
}
