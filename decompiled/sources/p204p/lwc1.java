package p204p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes.dex */
public interface lwc1 {
    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m60114b(lwc1 lwc1Var, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        lwc1Var.mo44586e(str, str2, null);
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m60115f(lwc1 lwc1Var, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        lwc1Var.mo44587h(str, str2, null);
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ void m60116g(lwc1 lwc1Var, double d, String str, String str2, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        lwc1Var.mo44583a(str, str2, d);
    }

    /* JADX INFO: renamed from: a */
    void mo44583a(String str, String str2, double d);

    /* JADX INFO: renamed from: c */
    Observable mo44584c();

    /* JADX INFO: renamed from: d */
    double mo44585d();

    /* JADX INFO: renamed from: e */
    void mo44586e(String str, String str2, z6p z6pVar);

    /* JADX INFO: renamed from: h */
    void mo44587h(String str, String str2, z6p z6pVar);
}
