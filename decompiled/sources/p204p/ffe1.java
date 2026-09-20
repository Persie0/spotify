package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ffe1 {

    /* JADX INFO: renamed from: b */
    public static final ffe1 f68995b;

    /* JADX INFO: renamed from: a */
    public w2y0 f68996a;

    static {
        ffe1 ffe1Var = new ffe1();
        ffe1Var.f68996a = null;
        f68995b = ffe1Var;
    }

    /* JADX INFO: renamed from: a */
    public static w2y0 m41527a(Context context) {
        w2y0 w2y0Var;
        ffe1 ffe1Var = f68995b;
        synchronized (ffe1Var) {
            try {
                if (ffe1Var.f68996a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    ffe1Var.f68996a = new w2y0(context, false);
                }
                w2y0Var = ffe1Var.f68996a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return w2y0Var;
    }
}
