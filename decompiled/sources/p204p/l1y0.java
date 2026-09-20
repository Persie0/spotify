package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l1y0 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f128845a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ onc f128846b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o1y0 f128847c;

    public /* synthetic */ l1y0(onc oncVar, o1y0 o1y0Var, int i) {
        this.f128845a = i;
        this.f128846b = oncVar;
        this.f128847c = o1y0Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f128845a) {
            case 0:
                Object objCollect = this.f128846b.collect(new k1y0(nizVar, this.f128847c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f128846b.collect(new k1y0(nizVar, this.f128847c, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
