package p204p;

import android.appwidget.AppWidgetManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public final class je5 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ le5 f111455a;

    public je5(le5 le5Var) {
        this.f111455a = le5Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AppWidgetManager appWidgetManager = this.f111455a.f132463b;
        boolean z = false;
        if (appWidgetManager != null && appWidgetManager.isRequestPinAppWidgetSupported()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
