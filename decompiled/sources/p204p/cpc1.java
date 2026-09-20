package p204p;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class cpc1 {

    /* JADX INFO: renamed from: a */
    public static final Method f40541a;

    /* JADX INFO: renamed from: b */
    public static final boolean f40542b;

    static {
        f40542b = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f40541a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m33562a(View view) {
        WeakHashMap weakHashMap = mec1.f142677a;
        return view.getLayoutDirection() == 1;
    }
}
