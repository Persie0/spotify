package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class hfz {

    /* JADX INFO: renamed from: a */
    public final i4t0 f90967a;

    public /* synthetic */ hfz(i4t0 i4t0Var) {
        this.f90967a = i4t0Var;
    }

    /* JADX INFO: renamed from: a */
    public int m47391a() {
        int iOrdinal = ((hsi) this.f90967a.get()).m48529w().ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
