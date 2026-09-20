package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jpx0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114743a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f114744b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gpx0 f114745c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jpx0(gh00 gh00Var, gpx0 gpx0Var, int i) {
        super(0);
        this.f114743a = i;
        this.f114744b = gh00Var;
        this.f114745c = gpx0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f114743a) {
            case 0:
                this.f114744b.invoke(this.f114745c.f83265c ? rox0.f201359a : wox0.f253610a);
                break;
            default:
                this.f114744b.invoke(this.f114745c.f83265c ? sox0.f212669a : tox0.f222339a);
                break;
        }
        return w2a1.f247311a;
    }
}
