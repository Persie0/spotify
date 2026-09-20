package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e05 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54853a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f8b0 f54854b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f54855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e05(f8b0 f8b0Var, kqi0 kqi0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f54853a = i;
        this.f54854b = f8b0Var;
        this.f54855c = kqi0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f54853a) {
            case 0:
                return new e05(this.f54854b, this.f54855c, fbkVar, 0);
            default:
                return new e05(this.f54854b, this.f54855c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f54853a) {
            case 0:
                e05 e05Var = (e05) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                e05Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                e05 e05Var2 = (e05) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                e05Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f54853a) {
            case 0:
                bga.m29073P(obj);
                if (((Number) this.f54854b.getValue()).floatValue() >= 0.99f) {
                    this.f54855c.setValue(Boolean.TRUE);
                }
                break;
            default:
                bga.m29073P(obj);
                if (this.f54854b.m41030m()) {
                    this.f54855c.setValue(Boolean.TRUE);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
