package p204p;

import android.app.Activity;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public final class b0k0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21938a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c0k0 f21939b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0k0(c0k0 c0k0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f21938a = i;
        this.f21939b = c0k0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f21938a) {
            case 0:
                return new b0k0(this.f21939b, fbkVar, 0);
            default:
                return new b0k0(this.f21939b, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f21938a) {
            case 0:
                b0k0 b0k0Var = (b0k0) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                b0k0Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                b0k0 b0k0Var2 = (b0k0) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                b0k0Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f21938a) {
            case 0:
                bga.m29073P(obj);
                c0k0 c0k0Var = this.f21939b;
                c0k0Var.f32808e.m30649a(c0k0Var.f32804a);
                break;
            default:
                bga.m29073P(obj);
                c0k0 c0k0Var2 = this.f21939b;
                z9j0 z9j0Var = c0k0Var2.f32811h;
                k5m0 k5m0Var = c0k0Var2.f32812i;
                Activity activity = c0k0Var2.f32805b;
                if (k5m0Var.mo55547g(activity)) {
                    k5m0Var.mo55546f();
                } else if (z9j0Var.mo47349j(activity)) {
                    z9j0Var.mo47343c();
                } else {
                    Logger.m3966b("DismissSheet dispatched with unexpected activity: ".concat(activity.getClass().getName()), new Object[0]);
                    activity.finish();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
