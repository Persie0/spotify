package p204p;

import android.app.Activity;
import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c8g0 {

    /* JADX INFO: renamed from: b */
    public static final Object f35210b = new Object();

    /* JADX INFO: renamed from: c */
    public static c8g0 f35211c;

    /* JADX INFO: renamed from: a */
    public gxf f35212a;

    /* JADX INFO: renamed from: c */
    public static c8g0 m31786c() {
        c8g0 c8g0Var;
        synchronized (f35210b) {
            ig31.m50508z("MlKitContext has not been initialized", f35211c != null);
            c8g0Var = f35211c;
            ig31.m50506x(c8g0Var);
        }
        return c8g0Var;
    }

    /* JADX INFO: renamed from: d */
    public static c8g0 m31787d(Activity activity, Executor executor) {
        c8g0 c8g0Var;
        synchronized (f35210b) {
            ig31.m50508z("MlKitContext is already initialized", f35211c == null);
            c8g0 c8g0Var2 = new c8g0();
            f35211c = c8g0Var2;
            Context applicationContext = activity.getApplicationContext();
            if (applicationContext != null) {
                activity = applicationContext;
            }
            ArrayList arrayListM31895u = c97.m31871v(activity, MlKitComponentDiscoveryService.class).m31895u();
            uhc uhcVar = new uhc(executor);
            uhcVar.m83139c(arrayListM31895u);
            uhcVar.m83137a(svf.m79444c(activity, Context.class, new Class[0]));
            uhcVar.m83137a(svf.m79444c(c8g0Var2, c8g0.class, new Class[0]));
            gxf gxfVarM83140d = uhcVar.m83140d();
            c8g0Var2.f35212a = gxfVarM83140d;
            gxfVarM83140d.m46065i(true);
            c8g0Var = f35211c;
        }
        return c8g0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m31788a(Class cls) {
        ig31.m50508z("MlKitContext has been deleted", f35211c == this);
        ig31.m50506x(this.f35212a);
        return this.f35212a.mo54438a(cls);
    }

    /* JADX INFO: renamed from: b */
    public final Context m31789b() {
        return (Context) m31788a(Context.class);
    }
}
