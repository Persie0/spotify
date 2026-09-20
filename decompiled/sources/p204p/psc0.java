package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class psc0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f180811a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f180812b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f180813c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f180814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ psc0(boolean z, boolean z2, kqi0 kqi0Var, int i) {
        super(0);
        this.f180811a = i;
        this.f180812b = z;
        this.f180813c = z2;
        this.f180814d = kqi0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f180811a) {
            case 0:
                if (!this.f180812b || this.f180813c) {
                    this.f180814d.setValue(Boolean.FALSE);
                }
                break;
            default:
                if (!this.f180812b || this.f180813c) {
                    this.f180814d.setValue(Boolean.FALSE);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
