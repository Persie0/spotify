package p204p;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class g65 {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m43674a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m43675b(Object obj, l65 l65Var) {
        Objects.requireNonNull(l65Var);
        x35 x35Var = new x35(l65Var, 1);
        px3.m71351h(obj).registerOnBackInvokedCallback(1000000, x35Var);
        return x35Var;
    }

    /* JADX INFO: renamed from: c */
    public static void m43676c(Object obj, Object obj2) {
        px3.m71351h(obj).unregisterOnBackInvokedCallback(px3.m71350g(obj2));
    }
}
