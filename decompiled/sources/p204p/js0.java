package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class js0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ l1p0 f115349a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pa9 f115350b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f115351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(l1p0 l1p0Var, pa9 pa9Var, long j, fbk fbkVar) {
        super(2, fbkVar);
        this.f115349a = l1p0Var;
        this.f115350b = pa9Var;
        this.f115351c = j;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        return new js0(this.f115349a, this.f115350b, this.f115351c, fbkVar);
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        js0 js0Var = (js0) create((xuk) obj, (fbk) obj2);
        w2a1 w2a1Var = w2a1.f247311a;
        js0Var.invokeSuspend(w2a1Var);
        return w2a1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        bga.m29073P(obj);
        w2a1 w2a1Var = w2a1.f247311a;
        l1p0 l1p0Var = this.f115349a;
        if (l1p0Var == null) {
            return w2a1Var;
        }
        this.f115350b.m69443h(l1p0Var, new noo0(this.f115351c, 0L, false, false, null, null, false, 254));
        return w2a1Var;
    }
}
