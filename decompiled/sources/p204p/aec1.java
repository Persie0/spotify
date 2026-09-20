package p204p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class aec1 {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m25715a(View view, WindowInsets windowInsets) {
        int i = rhc1.f199192a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: b */
    public static WindowInsets m25716b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: c */
    public static void m25717c(View view) {
        view.requestApplyInsets();
    }
}
