package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class l0o0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f128481a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yse1 f128482b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0o0(yse1 yse1Var, int i) {
        super(0);
        this.f128481a = i;
        this.f128482b = yse1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f128481a) {
            case 0:
                return new k0o0(this.f128482b, 0);
            default:
                return new k0o0(this.f128482b, 1);
        }
    }
}
