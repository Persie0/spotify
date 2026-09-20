package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tca0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f219055a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yac0 f219056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tca0(yac0 yac0Var, int i) {
        super(1);
        this.f219055a = i;
        this.f219056b = yac0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) throws Exception {
        switch (this.f219055a) {
            case 0:
                this.f219056b.mo24737a((String) obj);
                break;
            default:
                this.f219056b.mo24737a((String[]) obj);
                break;
        }
        return w2a1.f247311a;
    }
}
