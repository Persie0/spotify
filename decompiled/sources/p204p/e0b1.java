package p204p;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e0b1 {

    /* JADX INFO: renamed from: a */
    public static final WeakHashMap f54934a = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public static boolean m37489a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized boolean m37490b(Context context) {
        Boolean boolValueOf;
        try {
            Configuration configuration = context.getResources().getConfiguration();
            WeakHashMap weakHashMap = f54934a;
            boolValueOf = (Boolean) weakHashMap.get(configuration);
            if (boolValueOf == null) {
                int i = configuration.smallestScreenWidthDp;
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                boolValueOf = Boolean.valueOf(((int) (((float) i) / (((float) DisplayMetrics.DENSITY_DEVICE_STABLE) / ((float) displayMetrics.densityDpi)))) >= 600);
                weakHashMap.put(configuration, boolValueOf);
            }
        } catch (Throwable th) {
            throw th;
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m37491c(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }
}
