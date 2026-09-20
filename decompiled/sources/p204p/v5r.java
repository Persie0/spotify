package p204p;

import android.app.AppOpsManager;
import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class v5r {

    /* JADX INFO: renamed from: b */
    public static final Method f237574b;

    /* JADX INFO: renamed from: a */
    public final Context f237575a;

    static {
        Method method;
        try {
            Class cls = Integer.TYPE;
            method = AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class);
        } catch (Exception unused) {
            method = null;
        }
        f237574b = method;
    }

    public v5r(Context context) {
        this.f237575a = context;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m84743a() {
        Context context = this.f237575a;
        Method method = f237574b;
        if (method == null) {
            return null;
        }
        try {
            return Boolean.valueOf(((Integer) method.invoke((AppOpsManager) context.getSystemService("appops"), 10017, Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName())).intValue() == 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
