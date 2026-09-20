package p204p;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i081 {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m49310a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m49311b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new x35(runnable, 3);
    }

    /* JADX INFO: renamed from: c */
    public static void m49312c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m49313d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
