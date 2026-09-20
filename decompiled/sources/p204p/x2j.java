package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x2j extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f257510a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vqg0 f257511b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2j(vqg0 vqg0Var, int i) {
        super(1);
        this.f257510a = i;
        this.f257511b = vqg0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f257510a) {
            case 0:
                ((Number) obj).intValue();
                return this.f257511b.mo24361d();
            default:
                return new oq91(new x2j(this.f257511b, 0));
        }
    }
}
