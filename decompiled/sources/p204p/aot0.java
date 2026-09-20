package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class aot0 extends mb61 implements zh00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ cvt f17764a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lq0 f17765b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aot0(lq0 lq0Var, fbk fbkVar) {
        super(5, fbkVar);
        this.f17765b = lq0Var;
    }

    @Override // p204p.zh00
    /* JADX INFO: renamed from: e1 */
    public final Object mo25195e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        aot0 aot0Var = new aot0(this.f17765b, (fbk) obj5);
        aot0Var.f17764a = (cvt) obj4;
        w2a1 w2a1Var = w2a1.f247311a;
        aot0Var.invokeSuspend(w2a1Var);
        return w2a1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        cvt cvtVar = this.f17764a;
        bga.m29073P(obj);
        ydk0.m93461b(lq0.m59688g(this.f17765b), cvtVar != null ? m3h1.m60683w(cvtVar).f46380a : null, 2);
        return w2a1.f247311a;
    }
}
