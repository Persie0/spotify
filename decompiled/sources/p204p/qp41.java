package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qp41 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f191129a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f191130b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sp41 f191131c;

    public /* synthetic */ qp41(fiz fizVar, sp41 sp41Var, int i) {
        this.f191129a = i;
        this.f191130b = fizVar;
        this.f191131c = sp41Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f191129a) {
            case 0:
                Object objCollect = this.f191130b.collect(new pp41(nizVar, this.f191131c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f191130b.collect(new pp41(nizVar, this.f191131c, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
