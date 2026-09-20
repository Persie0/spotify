package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rvs extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f203124a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wvs f203125b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rvs(wvs wvsVar, int i) {
        super(1);
        this.f203124a = i;
        this.f203125b = wvsVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f203124a) {
            case 0:
                ((Number) obj).intValue();
                return this.f203125b.f255587g;
            default:
                return new oq91(new rvs(this.f203125b, 0));
        }
    }
}
