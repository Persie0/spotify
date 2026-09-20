package p204p;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public interface k5m0 {
    /* JADX INFO: renamed from: d */
    static /* synthetic */ void m55539d(k5m0 k5m0Var, p6j0 p6j0Var, Bundle bundle, int i) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        k5m0Var.mo55545e(p6j0Var, bundle, false);
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ void m55540h(k5m0 k5m0Var, String str, String str2, Bundle bundle, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        k5m0Var.mo55543b(str, str2, bundle);
    }

    /* JADX INFO: renamed from: i */
    static /* synthetic */ void m55541i(k5m0 k5m0Var, String str, String str2, Bundle bundle, boolean z, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        k5m0Var.mo55549k(str, str2, bundle, z);
    }

    /* JADX INFO: renamed from: b */
    void mo55543b(String str, String str2, Bundle bundle);

    /* JADX INFO: renamed from: c */
    void mo55544c();

    /* JADX INFO: renamed from: e */
    void mo55545e(p6j0 p6j0Var, Bundle bundle, boolean z);

    /* JADX INFO: renamed from: f */
    void mo55546f();

    /* JADX INFO: renamed from: g */
    boolean mo55547g(Activity activity);

    /* JADX INFO: renamed from: j */
    void mo55548j();

    /* JADX INFO: renamed from: k */
    void mo55549k(String str, String str2, Bundle bundle, boolean z);

    /* JADX INFO: renamed from: a */
    default void mo55542a(fka1 fka1Var) {
    }
}
