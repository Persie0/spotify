package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ziq0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f283226a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ajq0 f283227b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ziq0(ajq0 ajq0Var, int i) {
        super(0);
        this.f283226a = i;
        this.f283227b = ajq0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f283226a) {
            case 0:
                return Integer.valueOf(this.f283227b.f16338b.m43669v());
            default:
                return Boolean.valueOf(this.f283227b.f16338b.m43656i());
        }
    }
}
