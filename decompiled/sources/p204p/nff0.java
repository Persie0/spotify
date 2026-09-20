package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nff0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153341a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ slv0 f153342b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f153343c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nff0(slv0 slv0Var, boolean z, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f153341a = i;
        this.f153342b = slv0Var;
        this.f153343c = z;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f153341a) {
            case 0:
                return new nff0(this.f153342b, this.f153343c, fbkVar, 0);
            default:
                return new nff0(this.f153342b, this.f153343c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f153341a) {
            case 0:
                nff0 nff0Var = (nff0) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                nff0Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                nff0 nff0Var2 = (nff0) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                nff0Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f153341a) {
            case 0:
                bga.m29073P(obj);
                this.f153342b.f210497a = Boolean.valueOf(this.f153343c);
                break;
            default:
                bga.m29073P(obj);
                this.f153342b.f210497a = Boolean.valueOf(this.f153343c);
                break;
        }
        return w2a1.f247311a;
    }
}
