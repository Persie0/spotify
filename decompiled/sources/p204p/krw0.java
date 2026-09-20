package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class krw0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125735a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lrw0 f125736b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ krw0(lrw0 lrw0Var, int i) {
        super(0);
        this.f125735a = i;
        this.f125736b = lrw0Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v2, types: [p.gh00, p.qe70] */
    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f125735a) {
            case 0:
                lrw0 lrw0Var = this.f125736b;
                lrw0Var.f136366U1.invoke("lineup");
                lrw0Var.dismiss();
                break;
            case 1:
                lrw0 lrw0Var2 = this.f125736b;
                lrw0Var2.f136366U1.invoke("event_details");
                lrw0Var2.dismiss();
                break;
            default:
                lrw0 lrw0Var3 = this.f125736b;
                lrw0Var3.f136366U1.invoke("sold_out");
                lrw0Var3.dismiss();
                break;
        }
        return w2a1.f247311a;
    }
}
