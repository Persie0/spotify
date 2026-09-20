package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class osh0 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ float f168821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f168822b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osh0(fbk fbkVar, gh00 gh00Var) {
        super(3, fbkVar);
        this.f168822b = gh00Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        osh0 osh0Var = new osh0((fbk) obj3, this.f168822b);
        osh0Var.f168821a = fFloatValue;
        w2a1 w2a1Var = w2a1.f247311a;
        osh0Var.invokeSuspend(w2a1Var);
        return w2a1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        bga.m29073P(obj);
        this.f168822b.invoke(new Float(this.f168821a));
        return w2a1.f247311a;
    }
}
