package p204p;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class o8f0 {

    /* JADX INFO: renamed from: a */
    public final SparseArray f162797a;

    /* JADX INFO: renamed from: b */
    public ep91 f162798b;

    public o8f0(int i) {
        this.f162797a = new SparseArray(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m66428a(ep91 ep91Var, int i, int i2) {
        int iM39639a = ep91Var.m39639a(i);
        SparseArray sparseArray = this.f162797a;
        o8f0 o8f0Var = sparseArray == null ? null : (o8f0) sparseArray.get(iM39639a);
        if (o8f0Var == null) {
            o8f0Var = new o8f0(1);
            sparseArray.put(ep91Var.m39639a(i), o8f0Var);
        }
        if (i2 > i) {
            o8f0Var.m66428a(ep91Var, i + 1, i2);
        } else {
            o8f0Var.f162798b = ep91Var;
        }
    }
}
