package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f98 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67192a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f67193b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f98(int i, int i2) {
        super(0);
        this.f67192a = i2;
        this.f67193b = i;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f67192a) {
            case 0:
                return new vum0(this.f67193b);
            case 1:
                return zag1.m95787i(this.f67193b);
            case 2:
                return new mpt0(this.f67193b);
            default:
                return new q311(this.f67193b);
        }
    }
}
