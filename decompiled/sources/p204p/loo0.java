package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class loo0 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f135485a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lqi0 f135486b;

    public /* synthetic */ loo0(lqi0 lqi0Var, int i) {
        this.f135485a = i;
        this.f135486b = lqi0Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f135485a) {
            case 0:
                Object objCollect = this.f135486b.collect(new pvn0(nizVar, 8), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f135486b.collect(new z0s0(nizVar, 22), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
