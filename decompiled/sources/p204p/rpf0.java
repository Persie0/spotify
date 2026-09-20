package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rpf0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f201578a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f201579b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rsx f201580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rpf0(gh00 gh00Var, rsx rsxVar, int i) {
        super(0);
        this.f201578a = i;
        this.f201579b = gh00Var;
        this.f201580c = rsxVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f201578a) {
            case 0:
                this.f201579b.invoke(new oqf0(this.f201580c.f202446a));
                break;
            default:
                this.f201579b.invoke(new lqf0(this.f201580c.f202446a));
                break;
        }
        return w2a1.f247311a;
    }
}
