package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vt61 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f244563a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k3r0 f244564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt61(k3r0 k3r0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f244563a = i;
        this.f244564b = k3r0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f244563a) {
            case 0:
                return new vt61(this.f244564b, fbkVar, 0);
            case 1:
                return new vt61(this.f244564b, fbkVar, 1);
            case 2:
                return new vt61(this.f244564b, fbkVar, 2);
            case 3:
                return new vt61(this.f244564b, fbkVar, 3);
            case 4:
                return new vt61(this.f244564b, fbkVar, 4);
            case 5:
                return new vt61(this.f244564b, fbkVar, 5);
            case 6:
                return new vt61(this.f244564b, fbkVar, 6);
            default:
                return new vt61(this.f244564b, fbkVar, 7);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f244563a) {
            case 0:
                vt61 vt61Var = (vt61) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                vt61Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                vt61 vt61Var2 = (vt61) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                vt61Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            case 2:
                vt61 vt61Var3 = (vt61) create(xukVar, fbkVar);
                w2a1 w2a1Var3 = w2a1.f247311a;
                vt61Var3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
            case 3:
                vt61 vt61Var4 = (vt61) create(xukVar, fbkVar);
                w2a1 w2a1Var4 = w2a1.f247311a;
                vt61Var4.invokeSuspend(w2a1Var4);
                return w2a1Var4;
            case 4:
                vt61 vt61Var5 = (vt61) create(xukVar, fbkVar);
                w2a1 w2a1Var5 = w2a1.f247311a;
                vt61Var5.invokeSuspend(w2a1Var5);
                return w2a1Var5;
            case 5:
                vt61 vt61Var6 = (vt61) create(xukVar, fbkVar);
                w2a1 w2a1Var6 = w2a1.f247311a;
                vt61Var6.invokeSuspend(w2a1Var6);
                return w2a1Var6;
            case 6:
                vt61 vt61Var7 = (vt61) create(xukVar, fbkVar);
                w2a1 w2a1Var7 = w2a1.f247311a;
                vt61Var7.invokeSuspend(w2a1Var7);
                return w2a1Var7;
            default:
                vt61 vt61Var8 = (vt61) create(xukVar, fbkVar);
                w2a1 w2a1Var8 = w2a1.f247311a;
                vt61Var8.invokeSuspend(w2a1Var8);
                return w2a1Var8;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f244563a) {
            case 0:
                bga.m29073P(obj);
                this.f244564b.m55280a();
                break;
            case 1:
                bga.m29073P(obj);
                this.f244564b.m55281b();
                break;
            case 2:
                bga.m29073P(obj);
                this.f244564b.m55281b();
                break;
            case 3:
                bga.m29073P(obj);
                this.f244564b.m55280a();
                break;
            case 4:
                bga.m29073P(obj);
                this.f244564b.m55281b();
                break;
            case 5:
                bga.m29073P(obj);
                this.f244564b.m55281b();
                break;
            case 6:
                bga.m29073P(obj);
                this.f244564b.m55280a();
                break;
            default:
                bga.m29073P(obj);
                this.f244564b.m55281b();
                break;
        }
        return w2a1.f247311a;
    }
}
