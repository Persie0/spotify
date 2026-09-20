package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k22 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118469a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f118470b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f118471c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k22(boolean z, kqi0 kqi0Var, int i) {
        super(0);
        this.f118469a = i;
        this.f118470b = z;
        this.f118471c = kqi0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f118469a) {
            case 0:
                if (this.f118470b) {
                    this.f118471c.setValue(Boolean.FALSE);
                }
                break;
            case 1:
                if (!this.f118470b) {
                    kqi0 kqi0Var = this.f118471c;
                    kqi0Var.setValue(Boolean.valueOf(!((Boolean) kqi0Var.getValue()).booleanValue()));
                }
                break;
            default:
                if (!this.f118470b) {
                    aq7.m26751i(this.f118471c, true);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
