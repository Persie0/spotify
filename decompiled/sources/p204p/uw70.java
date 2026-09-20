package p204p;

/* JADX INFO: loaded from: classes.dex */
public interface uw70 {
    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m84090b(uw70 uw70Var, int i, gh00 gh00Var, fyf fyfVar, int i2) {
        if ((i2 & 2) != 0) {
            gh00Var = null;
        }
        uw70Var.mo30902e(i, gh00Var, mxq.f148154b1, fyfVar);
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ void m84091c(uw70 uw70Var, Object obj, vh00 vh00Var, int i) {
        if ((i & 1) != 0) {
            obj = null;
        }
        uw70Var.mo30901d(obj, null, vh00Var);
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m84092f(uw70 uw70Var, Object obj, fyf fyfVar, int i) {
        if ((i & 1) != 0) {
            obj = null;
        }
        uw70Var.mo30900a(obj, null, fyfVar);
    }

    /* JADX INFO: renamed from: a */
    default void mo30900a(Object obj, Object obj2, xh00 xh00Var) {
        mo30901d(obj, obj2, rkk.m75763o(new x29((fyf) xh00Var, 2), true, 1691919627));
    }

    /* JADX INFO: renamed from: d */
    void mo30901d(Object obj, Object obj2, vh00 vh00Var);

    /* JADX INFO: renamed from: e */
    void mo30902e(int i, gh00 gh00Var, gh00 gh00Var2, fyf fyfVar);
}
