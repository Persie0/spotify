package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qkk0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f189612a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zl8 f189613b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qkk0(zl8 zl8Var, int i) {
        super(0);
        this.f189612a = i;
        this.f189613b = zl8Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f189612a) {
            case 0:
                return this.f189613b.mo64734o();
            default:
                return this.f189613b.mo64729i();
        }
    }
}
