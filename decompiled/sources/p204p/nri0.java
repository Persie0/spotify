package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nri0 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157566a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ cg21 f157567b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f157568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nri0(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f157566a = i2;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        int i = this.f157566a;
        cg21 cg21Var = (cg21) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        fbk fbkVar = (fbk) obj3;
        switch (i) {
            case 0:
                nri0 nri0Var = new nri0(3, 0, fbkVar);
                nri0Var.f157567b = cg21Var;
                nri0Var.f157568c = zBooleanValue;
                return nri0Var.invokeSuspend(w2a1.f247311a);
            default:
                nri0 nri0Var2 = new nri0(3, 1, fbkVar);
                nri0Var2.f157567b = cg21Var;
                nri0Var2.f157568c = zBooleanValue;
                return nri0Var2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f157566a) {
            case 0:
                cg21 cg21Var = this.f157567b;
                boolean z = this.f157568c;
                bga.m29073P(obj);
                return new iri0(cg21Var != null ? cg21Var.f37543g : true, (cg21Var != null ? cg21Var.f37544h : null) instanceof eg21, z);
            default:
                cg21 cg21Var2 = this.f157567b;
                boolean z2 = this.f157568c;
                bga.m29073P(obj);
                return new cg21(cg21Var2.f37537a, cg21Var2.f37538b, cg21Var2.f37539c, cg21Var2.f37540d, cg21Var2.f37541e, cg21Var2.f37542f, z2, cg21Var2.f37544h, cg21Var2.f37545i);
        }
    }
}
