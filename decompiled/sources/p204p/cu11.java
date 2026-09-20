package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cu11 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42016a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f42017b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vu11 f42018c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu11(gh00 gh00Var, vu11 vu11Var, int i) {
        super(1);
        this.f42016a = i;
        this.f42017b = gh00Var;
        this.f42018c = vu11Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f42016a) {
            case 0:
                this.f42017b.invoke(new rt11(((Boolean) obj).booleanValue(), stz0.m79352f(this.f42018c.f244836w)));
                break;
            case 1:
                this.f42017b.invoke(new rt11(((Boolean) obj).booleanValue(), stz0.m79352f(this.f42018c.f244836w)));
                break;
            default:
                this.f42017b.invoke(new rt11(((Boolean) obj).booleanValue(), stz0.m79352f(this.f42018c.f244836w)));
                break;
        }
        return w2a1.f247311a;
    }
}
