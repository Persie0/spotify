package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u9q0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228252a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w5c f228253b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9q0(w5c w5cVar, int i) {
        super(1);
        this.f228252a = i;
        this.f228253b = w5cVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f228252a) {
            case 0:
                ((icp) obj).f100858d = new t9q0(this.f228253b, null, 0);
                break;
            default:
                ((icp) obj).f100858d = new t9q0(this.f228253b, null, 1);
                break;
        }
        return w2a1.f247311a;
    }
}
