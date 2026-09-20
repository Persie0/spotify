package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xxa0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f266927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e6a0 f266928b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xxa0(e6a0 e6a0Var, int i) {
        super(0);
        this.f266927a = i;
        this.f266928b = e6a0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f266927a) {
            case 0:
                return (kv91) ((i4t0) this.f266928b.f56598b).get();
            default:
                return new mpg0(2, ((ipg0) this.f266928b.f56599c).mo24361d());
        }
    }
}
