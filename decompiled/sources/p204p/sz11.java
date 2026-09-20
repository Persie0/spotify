package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class sz11 {

    /* JADX INFO: renamed from: a */
    public final c74 f215366a;

    public sz11(c74 c74Var) {
        this.f215366a = c74Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m79719a() {
        int iOrdinal = this.f215366a.m31680a().ordinal();
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
