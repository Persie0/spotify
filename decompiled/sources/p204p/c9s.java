package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c9s implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35626a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f35627b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f35628c;

    public /* synthetic */ c9s(fiz fizVar, gh00 gh00Var, int i) {
        this.f35626a = i;
        this.f35627b = fizVar;
        this.f35628c = gh00Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f35626a) {
            case 0:
                Object objCollect = this.f35627b.collect(new b9s(nizVar, this.f35628c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            case 1:
                Object objCollect2 = this.f35627b.collect(new b9s(nizVar, this.f35628c, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
            case 2:
                Object objCollect3 = this.f35627b.collect(new b9s(nizVar, this.f35628c, 2), fbkVar);
                return objCollect3 == yuk.f276404a ? objCollect3 : w2a1.f247311a;
            case 3:
                Object objCollect4 = this.f35627b.collect(new b9s(nizVar, this.f35628c, 3), fbkVar);
                return objCollect4 == yuk.f276404a ? objCollect4 : w2a1.f247311a;
            case 4:
                Object objCollect5 = this.f35627b.collect(new b9s(nizVar, this.f35628c, 4), fbkVar);
                return objCollect5 == yuk.f276404a ? objCollect5 : w2a1.f247311a;
            case 5:
                Object objCollect6 = this.f35627b.collect(new b9s(nizVar, this.f35628c, 5), fbkVar);
                return objCollect6 == yuk.f276404a ? objCollect6 : w2a1.f247311a;
            default:
                Object objCollect7 = this.f35627b.collect(new b9s(nizVar, this.f35628c, 6), fbkVar);
                return objCollect7 == yuk.f276404a ? objCollect7 : w2a1.f247311a;
        }
    }
}
