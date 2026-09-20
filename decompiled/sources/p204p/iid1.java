package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iid1 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f102523a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f102524b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uum0 f102525c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uum0 f102526d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f102527e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iid1(boolean z, boolean z2, uum0 uum0Var, uum0 uum0Var2, float f, fbk fbkVar) {
        super(2, fbkVar);
        this.f102523a = z;
        this.f102524b = z2;
        this.f102525c = uum0Var;
        this.f102526d = uum0Var2;
        this.f102527e = f;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        return new iid1(this.f102523a, this.f102524b, this.f102525c, this.f102526d, this.f102527e, fbkVar);
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        iid1 iid1Var = (iid1) create((xuk) obj, (fbk) obj2);
        w2a1 w2a1Var = w2a1.f247311a;
        iid1Var.invokeSuspend(w2a1Var);
        return w2a1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        bga.m29073P(obj);
        boolean z = this.f102523a;
        uum0 uum0Var = this.f102525c;
        if (z && this.f102524b) {
            float fM84031v = uum0Var.m84031v();
            float f = this.f102527e;
            if (fM84031v > f) {
                uum0Var.m84032w(f);
            }
        } else {
            uum0Var.m84032w(1.0f);
            this.f102526d.m84032w(0.0f);
        }
        return w2a1.f247311a;
    }
}
