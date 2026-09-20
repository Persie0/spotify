package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yem0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f272016a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zem0 f272017b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yem0(zem0 zem0Var, int i) {
        super(1);
        this.f272016a = i;
        this.f272017b = zem0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f272016a) {
            case 0:
                this.f272017b.f282059b = null;
                return w2a1.f247311a;
            default:
                olm0 olm0Var = (olm0) obj;
                return Boolean.valueOf(olm0Var instanceof apn0 ? this.f272017b.mo35686b(olm0Var) : false);
        }
    }
}
