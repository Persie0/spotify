package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class mzj {

    /* JADX INFO: renamed from: a */
    public static final mzj f148721a = new mzj();

    /* JADX INFO: renamed from: a */
    public static Rect m63252a(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }

    /* JADX INFO: renamed from: c */
    public static qxd1 m63253c(ContextWrapper contextWrapper) {
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        return new qxd1(windowManager.getCurrentWindowMetrics().getBounds(), swd1.m79536g(null, windowManager.getCurrentWindowMetrics().getWindowInsets()));
    }

    /* JADX INFO: renamed from: b */
    public final swd1 m63254b(Context context) {
        return swd1.m79536g(null, ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets());
    }
}
