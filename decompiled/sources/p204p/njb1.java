package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class njb1 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pa9 f154550a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f154551b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f154552c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ l1p0 f154553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njb1(pa9 pa9Var, boolean z, boolean z2, l1p0 l1p0Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f154550a = pa9Var;
        this.f154551b = z;
        this.f154552c = z2;
        this.f154553d = l1p0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        return new njb1(this.f154550a, this.f154551b, this.f154552c, this.f154553d, fbkVar);
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        njb1 njb1Var = (njb1) create((xuk) obj, (fbk) obj2);
        w2a1 w2a1Var = w2a1.f247311a;
        njb1Var.invokeSuspend(w2a1Var);
        return w2a1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        bga.m29073P(obj);
        int i = this.f154551b ? 3 : 1;
        pa9 pa9Var = this.f154550a;
        pa9Var.m69450p(i);
        if (!this.f154552c) {
            pa9Var.m69441f();
        } else if (pa9Var.m69440e() == null) {
            pa9Var.m69442g(this.f154553d);
        } else {
            pa9Var.m69447l();
        }
        return w2a1.f247311a;
    }
}
