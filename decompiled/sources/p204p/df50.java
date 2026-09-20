package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class df50 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48462a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lf50 f48463b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f48464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df50(lf50 lf50Var, boolean z, int i) {
        super(1);
        this.f48462a = i;
        this.f48463b = lf50Var;
        this.f48464c = z;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f48462a) {
            case 0:
                boolean z = this.f48464c;
                this.f48463b.m58843D0(new Integer[]{3}, z);
                break;
            default:
                boolean z2 = this.f48464c;
                this.f48463b.m58843D0(new Integer[]{2, 5}, z2);
                break;
        }
        return w2a1.f247311a;
    }
}
