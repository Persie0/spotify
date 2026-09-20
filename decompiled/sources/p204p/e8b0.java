package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class e8b0 extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f8b0 f57124a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u8b0 f57125b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f57126c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f57127d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f57128e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8b0(f8b0 f8b0Var, u8b0 u8b0Var, float f, int i, boolean z, fbk fbkVar) {
        super(1, fbkVar);
        this.f57124a = f8b0Var;
        this.f57125b = u8b0Var;
        this.f57126c = f;
        this.f57127d = i;
        this.f57128e = z;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        return new e8b0(this.f57124a, this.f57125b, this.f57126c, this.f57127d, this.f57128e, fbkVar);
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        e8b0 e8b0Var = (e8b0) create((fbk) obj);
        w2a1 w2a1Var = w2a1.f247311a;
        e8b0Var.invokeSuspend(w2a1Var);
        return w2a1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        bga.m29073P(obj);
        u8b0 u8b0Var = this.f57125b;
        f8b0 f8b0Var = this.f57124a;
        f8b0Var.f66948i.setValue(u8b0Var);
        f8b0Var.m41032o(this.f57126c);
        f8b0Var.m41031n(this.f57127d);
        f8b0Var.f66940a.setValue(Boolean.FALSE);
        if (this.f57128e) {
            f8b0Var.f66938Y.setValue(Long.MIN_VALUE);
        }
        return w2a1.f247311a;
    }
}
