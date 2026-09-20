package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class md1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142289a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f142290b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kf1 f142291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ md1(int i, kf1 kf1Var, gh00 gh00Var) {
        super(0);
        this.f142289a = i;
        this.f142290b = gh00Var;
        this.f142291c = kf1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f142289a) {
            case 0:
                this.f142290b.invoke(this.f142291c.f122029e.f132025c.f246610e);
                break;
            case 1:
                this.f142290b.invoke(this.f142291c.f122029e.f132025c.f246610e);
                break;
            case 2:
                this.f142290b.invoke(new ye1(this.f142291c.f122034j.f246610e));
                break;
            default:
                this.f142290b.invoke(new ze1(this.f142291c.f122031g.f246610e));
                break;
        }
        return w2a1.f247311a;
    }
}
