package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class nhj0 extends ky8 {
    static {
        gaz.m44194g("NetworkMeteredCtrlr");
    }

    @Override // p204p.e6j
    /* JADX INFO: renamed from: b */
    public final boolean mo37942b(i1e1 i1e1Var) {
        return i1e1Var.f97508j.f13303a == 5;
    }

    @Override // p204p.ky8
    /* JADX INFO: renamed from: d */
    public final int mo57645d() {
        return 7;
    }

    @Override // p204p.ky8
    /* JADX INFO: renamed from: e */
    public final boolean mo57646e(Object obj) {
        aij0 aij0Var = (aij0) obj;
        boolean z = aij0Var.f16001a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z && aij0Var.f16003c) ? false : true;
        }
        gaz.m44190b().getClass();
        return !z;
    }
}
