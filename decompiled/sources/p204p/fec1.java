package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class fec1 {
    /* JADX INFO: renamed from: a */
    public static int m41421a(View view) {
        return view.getImportantForAutofill();
    }

    /* JADX INFO: renamed from: b */
    public static void m41422b(View view, int i) {
        view.setImportantForAutofill(i);
    }

    /* JADX INFO: renamed from: c */
    public static void m41423c(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }
}
