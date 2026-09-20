package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class liq extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133861a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ whp f133862b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ liq(whp whpVar, int i) {
        super(1);
        this.f133861a = i;
        this.f133862b = whpVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f133861a) {
            case 0:
                ((Number) obj).intValue();
                return ((ukh0) ((wg61) this.f133862b.f251421d).getValue()).mo24361d();
            default:
                return new oq91(new liq(this.f133862b, 0));
        }
    }
}
