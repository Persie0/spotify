package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gxp0 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f85314a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f85315b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sxp0 f85316c;

    public /* synthetic */ gxp0(fiz fizVar, sxp0 sxp0Var, int i) {
        this.f85314a = i;
        this.f85315b = fizVar;
        this.f85316c = sxp0Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f85314a) {
            case 0:
                Object objCollect = this.f85315b.collect(new fxp0(nizVar, this.f85316c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f85315b.collect(new fxp0(nizVar, this.f85316c, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
