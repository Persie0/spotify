package p204p;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class o6k {

    /* JADX INFO: renamed from: a */
    public final Set f162355a;

    public o6k(LinkedHashSet linkedHashSet) {
        this.f162355a = linkedHashSet;
    }

    /* JADX INFO: renamed from: a */
    public boolean m66350a(Object obj) {
        Set set = this.f162355a;
        if (set != null) {
            return set.contains(obj);
        }
        return true;
    }

    public o6k(l8t0 l8t0Var, k1b0 k1b0Var, ym40 ym40Var, ym40 ym40Var2, ym40 ym40Var3) {
        this.f162355a = bk5.m29624m1(new h5k[]{l8t0Var, ym40Var2, ym40Var, k1b0Var, ym40Var3});
    }
}
