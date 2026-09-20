package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xwa0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f266623a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ da80 f266624b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xwa0(da80 da80Var, int i) {
        super(0);
        this.f266623a = i;
        this.f266624b = da80Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f266623a) {
            case 0:
                return new lpg0(((ipg0) this.f266624b.f46997c).mo24361d());
            default:
                return (kv91) ((i4t0) this.f266624b.f46996b).get();
        }
    }
}
