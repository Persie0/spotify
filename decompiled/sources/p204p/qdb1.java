package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qdb1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f187530a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ buy f187531b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qdb1(buy buyVar, int i) {
        super(1);
        this.f187530a = i;
        this.f187531b = buyVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f187530a) {
            case 0:
                return this.f187531b.f31237d;
            default:
                ((icp) obj).f100858d = new flp0(this.f187531b, (fbk) null, 14);
                return w2a1.f247311a;
        }
    }
}
