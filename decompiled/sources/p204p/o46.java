package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o46 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f161564a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q46 f161565b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f161566c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o46(q46 q46Var, String str, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f161564a = i;
        this.f161565b = q46Var;
        this.f161566c = str;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f161564a) {
            case 0:
                return new o46(this.f161565b, this.f161566c, fbkVar, 0);
            default:
                return new o46(this.f161565b, this.f161566c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f161564a) {
            case 0:
                o46 o46Var = (o46) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                o46Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                o46 o46Var2 = (o46) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                o46Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f161564a) {
            case 0:
                bga.m29073P(obj);
                ((wr9) this.f161565b.f185084i).m88811a(this.f161566c, false);
                break;
            default:
                bga.m29073P(obj);
                ((emx) this.f161565b.f185073X).m39465a(this.f161566c);
                break;
        }
        return w2a1.f247311a;
    }
}
