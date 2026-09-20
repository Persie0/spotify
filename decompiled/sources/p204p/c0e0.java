package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c0e0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32753a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f32754b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ oqi0 f32755c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0e0(oqi0 oqi0Var, boolean z, fbk fbkVar) {
        super(2, fbkVar);
        this.f32755c = oqi0Var;
        this.f32754b = z;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f32753a) {
            case 0:
                return new c0e0(this.f32755c, this.f32754b, fbkVar);
            default:
                return new c0e0(this.f32754b, this.f32755c, fbkVar);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f32753a) {
            case 0:
                c0e0 c0e0Var = (c0e0) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                c0e0Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                c0e0 c0e0Var2 = (c0e0) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                c0e0Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f32753a) {
            case 0:
                bga.m29073P(obj);
                this.f32755c.m67648F1(Boolean.valueOf(this.f32754b));
                break;
            default:
                bga.m29073P(obj);
                if (this.f32754b) {
                    this.f32755c.m67648F1(Boolean.TRUE);
                }
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0e0(boolean z, oqi0 oqi0Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f32754b = z;
        this.f32755c = oqi0Var;
    }
}
