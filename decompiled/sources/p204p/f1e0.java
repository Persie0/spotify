package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes9.dex */
public final class f1e0 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64879a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ fv41 f64880b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v5m f64881c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1e0(v5m v5mVar, fbk fbkVar, int i) {
        super(3, fbkVar);
        this.f64879a = i;
        this.f64881c = v5mVar;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        fv41 fv41Var = (fv41) obj2;
        fbk fbkVar = (fbk) obj3;
        switch (this.f64879a) {
            case 0:
                f1e0 f1e0Var = new f1e0(this.f64881c, fbkVar, 0);
                f1e0Var.f64880b = fv41Var;
                w2a1 w2a1Var = w2a1.f247311a;
                f1e0Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                f1e0 f1e0Var2 = new f1e0(this.f64881c, fbkVar, 1);
                f1e0Var2.f64880b = fv41Var;
                w2a1 w2a1Var2 = w2a1.f247311a;
                f1e0Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f64879a) {
            case 0:
                fv41 fv41Var = this.f64880b;
                bga.m29073P(obj);
                v3m v3mVar = fv41Var.f73663o;
                if (fv41Var.f73673y && v3mVar != null) {
                    this.f64881c.mo51090c(Collections.singleton(v3mVar.f236903a));
                }
                break;
            default:
                fv41 fv41Var2 = this.f64880b;
                bga.m29073P(obj);
                v3m v3mVar2 = fv41Var2.f73663o;
                if (fv41Var2.f73673y && v3mVar2 != null) {
                    this.f64881c.mo51090c(Collections.singleton(v3mVar2.f236903a));
                }
                break;
        }
        return w2a1.f247311a;
    }
}
