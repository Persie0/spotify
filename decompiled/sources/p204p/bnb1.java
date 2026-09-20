package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bnb1 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28780a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pa9 f28781b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bnb1(pa9 pa9Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f28780a = i;
        this.f28781b = pa9Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f28780a) {
            case 0:
                return new bnb1(this.f28781b, fbkVar, 0);
            default:
                return new bnb1(this.f28781b, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f28780a) {
            case 0:
                bnb1 bnb1Var = (bnb1) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                bnb1Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                bnb1 bnb1Var2 = (bnb1) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                bnb1Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f28780a) {
            case 0:
                bga.m29073P(obj);
                pa9 pa9Var = this.f28781b;
                pa9Var.m69455u();
                pa9Var.m69444i();
                break;
            default:
                bga.m29073P(obj);
                pa9 pa9Var2 = this.f28781b;
                pa9Var2.m69455u();
                pa9Var2.m69444i();
                break;
        }
        return w2a1.f247311a;
    }
}
