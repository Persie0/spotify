package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mlb1 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f144806a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f144807b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f144808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mlb1(gh00 gh00Var, boolean z, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f144806a = i;
        this.f144807b = gh00Var;
        this.f144808c = z;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f144806a) {
            case 0:
                return new mlb1(this.f144807b, this.f144808c, fbkVar, 0);
            case 1:
                return new mlb1(this.f144807b, this.f144808c, fbkVar, 1);
            case 2:
                return new mlb1(this.f144807b, this.f144808c, fbkVar, 2);
            default:
                return new mlb1(this.f144807b, this.f144808c, fbkVar, 3);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f144806a) {
            case 0:
                mlb1 mlb1Var = (mlb1) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                mlb1Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                mlb1 mlb1Var2 = (mlb1) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                mlb1Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            case 2:
                mlb1 mlb1Var3 = (mlb1) create(xukVar, fbkVar);
                w2a1 w2a1Var3 = w2a1.f247311a;
                mlb1Var3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
            default:
                mlb1 mlb1Var4 = (mlb1) create(xukVar, fbkVar);
                w2a1 w2a1Var4 = w2a1.f247311a;
                mlb1Var4.invokeSuspend(w2a1Var4);
                return w2a1Var4;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f144806a) {
            case 0:
                bga.m29073P(obj);
                this.f144807b.invoke(new ovd1(this.f144808c));
                break;
            case 1:
                bga.m29073P(obj);
                this.f144807b.invoke(new ovd1(this.f144808c));
                break;
            case 2:
                bga.m29073P(obj);
                this.f144807b.invoke(new nvd1(this.f144808c));
                break;
            default:
                bga.m29073P(obj);
                this.f144807b.invoke(Boolean.valueOf(this.f144808c));
                break;
        }
        return w2a1.f247311a;
    }
}
