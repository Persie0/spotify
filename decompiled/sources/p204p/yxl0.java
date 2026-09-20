package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class yxl0 implements ayl0 {

    /* JADX INFO: renamed from: a */
    public final iby0 f277275a;

    /* JADX INFO: renamed from: b */
    public final ywl0 f277276b;

    public yxl0(iby0 iby0Var) {
        this.f277275a = iby0Var;
        boolean zEquals = iby0Var.equals(gby0.f78438a);
        ywl0 ywl0Var = xwl0.f266701a;
        if (!zEquals) {
            if (!(iby0Var instanceof hby0)) {
                throw new NoWhenBranchMatchedException();
            }
            hby0 hby0Var = (hby0) iby0Var;
            float f = hby0Var.f89629a;
            if (f != 0.0f) {
                ywl0Var = Math.abs(hby0Var.f89631c) <= 900000 ? uwl0.f234696a : f < 0.0f ? vwl0.f245505a : wwl0.f255787a;
            }
        }
        this.f277276b = ywl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxl0) && wj50.m88271j(this.f277275a, ((yxl0) obj).f277275a);
    }

    public final int hashCode() {
        return this.f277275a.hashCode();
    }
}
