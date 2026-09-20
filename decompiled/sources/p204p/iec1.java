package p204p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class iec1 {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m50372a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m50373b(View view) {
        return view.getStateDescription();
    }

    /* JADX INFO: renamed from: c */
    public static void m50374c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
