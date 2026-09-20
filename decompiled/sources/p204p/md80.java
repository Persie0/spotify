package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class md80 {

    /* JADX INFO: renamed from: a */
    public final kv91 f142346a;

    public /* synthetic */ md80(kv91 kv91Var, boolean z) {
        this.f142346a = kv91Var;
    }

    /* JADX INFO: renamed from: a */
    public static i8g0 m61517a(int i) {
        int iM38547C = edb.m38547C(i);
        int i2 = 1;
        if (iM38547C != 0) {
            if (iM38547C == 1) {
                i2 = 2;
            } else {
                if (iM38547C != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 3;
            }
        }
        st91 st91Var = st91.f213865b;
        return new i8g0(i2);
    }

    public md80(kv91 kv91Var) {
        st91 st91Var = st91.f213865b;
        this.f142346a = kv91Var;
    }
}
