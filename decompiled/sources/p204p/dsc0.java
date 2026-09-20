package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class dsc0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f52535b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dsc0(View view, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f52534a = i;
        this.f52535b = view;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f52534a) {
            case 0:
                return new dsc0(this.f52535b, fbkVar, 0);
            default:
                return new dsc0(this.f52535b, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f52534a) {
            case 0:
                dsc0 dsc0Var = (dsc0) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                dsc0Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                dsc0 dsc0Var2 = (dsc0) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                dsc0Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f52534a) {
            case 0:
                bga.m29073P(obj);
                this.f52535b.setClickable(true);
                break;
            default:
                bga.m29073P(obj);
                this.f52535b.setClickable(true);
                break;
        }
        return w2a1.f247311a;
    }
}
