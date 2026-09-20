package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class k6c1 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f119722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l6c1 f119723b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6c1(l6c1 l6c1Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f119722a = i;
        this.f119723b = l6c1Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f119722a) {
            case 0:
                return new k6c1(this.f119723b, fbkVar, 0);
            default:
                return new k6c1(this.f119723b, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f119722a) {
            case 0:
                k6c1 k6c1Var = (k6c1) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                k6c1Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                k6c1 k6c1Var2 = (k6c1) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                k6c1Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f119722a) {
            case 0:
                bga.m29073P(obj);
                this.f119723b.f130310c.m63782a(bda.f26062b);
                break;
            default:
                bga.m29073P(obj);
                this.f119723b.f130310c.m63782a(bda.f26063c);
                break;
        }
        return w2a1.f247311a;
    }
}
