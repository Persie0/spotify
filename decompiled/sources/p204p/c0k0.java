package p204p;

import android.app.Activity;
import android.content.Context;
import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: classes10.dex */
public final class c0k0 {

    /* JADX INFO: renamed from: a */
    public final Context f32804a;

    /* JADX INFO: renamed from: b */
    public final Activity f32805b;

    /* JADX INFO: renamed from: c */
    public final xgq0 f32806c;

    /* JADX INFO: renamed from: d */
    public final v1k0 f32807d;

    /* JADX INFO: renamed from: e */
    public final bvp f32808e;

    /* JADX INFO: renamed from: f */
    public final t0k0 f32809f;

    /* JADX INFO: renamed from: g */
    public final q831 f32810g;

    /* JADX INFO: renamed from: h */
    public final z9j0 f32811h;

    /* JADX INFO: renamed from: i */
    public final k5m0 f32812i;

    /* JADX INFO: renamed from: j */
    public final luk f32813j;

    /* JADX INFO: renamed from: k */
    public final luk f32814k;

    public c0k0(Context context, Activity activity, xgq0 xgq0Var, v1k0 v1k0Var, bvp bvpVar, t0k0 t0k0Var, q831 q831Var, z9j0 z9j0Var, k5m0 k5m0Var, luk lukVar, luk lukVar2) {
        this.f32804a = context;
        this.f32805b = activity;
        this.f32806c = xgq0Var;
        this.f32807d = v1k0Var;
        this.f32808e = bvpVar;
        this.f32809f = t0k0Var;
        this.f32810g = q831Var;
        this.f32811h = z9j0Var;
        this.f32812i = k5m0Var;
        this.f32813j = lukVar;
        this.f32814k = lukVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m31183a(c0k0 c0k0Var, String str, ibk ibkVar) {
        szj0 szj0Var;
        if (ibkVar instanceof szj0) {
            szj0Var = (szj0) ibkVar;
            int i = szj0Var.f215605c;
            if ((i & Integer.MIN_VALUE) != 0) {
                szj0Var.f215605c = i - Integer.MIN_VALUE;
            } else {
                szj0Var = new szj0(c0k0Var, ibkVar);
            }
        } else {
            szj0Var = new szj0(c0k0Var, ibkVar);
        }
        Object obj = szj0Var.f215603a;
        int i2 = szj0Var.f215605c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                Completable completableM90935d = c0k0Var.f32806c.m90935d(new yrl0[]{new yrl0(lmc.f134854b, srl0.PROMPTED_EXPERIENCES, true)}, 3, str);
                szj0Var.f215605c = 1;
                Object objM96565n = zn91.m96565n(completableM90935d, szj0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return f0k0.f64679a;
        } catch (Throwable th) {
            na6.m63972t("Failed to enable PROMPTED_EXPERIENCES notification", th);
            return new e0k0(th);
        }
    }
}
