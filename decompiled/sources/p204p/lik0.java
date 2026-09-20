package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class lik0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133816a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zl8 f133817b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lik0(zl8 zl8Var, int i) {
        super(0);
        this.f133816a = i;
        this.f133817b = zl8Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f133816a) {
            case 0:
                return this.f133817b.mo64734o();
            default:
                return this.f133817b.mo64729i();
        }
    }
}
