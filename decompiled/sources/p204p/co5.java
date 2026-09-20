package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class co5 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40182a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f40183b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ io5 f40184c;

    public /* synthetic */ co5(fiz fizVar, io5 io5Var, int i) {
        this.f40182a = i;
        this.f40183b = fizVar;
        this.f40184c = io5Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f40182a) {
            case 0:
                Object objCollect = this.f40183b.collect(new bo5(nizVar, this.f40184c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f40183b.collect(new bo5(nizVar, this.f40184c, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
