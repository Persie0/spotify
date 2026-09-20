package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hyd0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f96569a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zuu0 f96570b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hyd0(zuu0 zuu0Var, int i) {
        super(1);
        this.f96569a = i;
        this.f96570b = zuu0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f96569a) {
            case 0:
                this.f96570b.cancel();
                break;
            default:
                this.f96570b.cancel();
                break;
        }
        return w2a1.f247311a;
    }
}
