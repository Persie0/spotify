package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ei50 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59790a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hzq0 f59791b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei50(hzq0 hzq0Var, int i) {
        super(0);
        this.f59790a = i;
        this.f59791b = hzq0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f59790a) {
            case 0:
                return (Boolean) ((i4t0) this.f59791b.mo49280e(di50.f49249b)).get();
            default:
                return (Boolean) ((i4t0) this.f59791b.mo49280e(di50.f49256i)).get();
        }
    }
}
