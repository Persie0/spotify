package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fae extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67546a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k1e f67547b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fae(k1e k1eVar, int i) {
        super(1);
        this.f67546a = i;
        this.f67547b = k1eVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f67546a) {
            case 0:
                if (!(((yzd) obj) instanceof vzd)) {
                    this.f67547b.mo31129a();
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    this.f67547b.mo31129a();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
