package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xga1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f261260a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ymn0 f261261b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xga1(ymn0 ymn0Var, int i) {
        super(1);
        this.f261260a = i;
        this.f261261b = ymn0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f261260a) {
            case 0:
                return (u2s) this.f261261b.f274313c;
            default:
                ((icp) obj).f100858d = new flp0(this.f261261b, (fbk) null, 12);
                return w2a1.f247311a;
        }
    }
}
