package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bsc0 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30287a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f30288b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fiz f30289c;

    public /* synthetic */ bsc0(fiz fizVar, int i, int i2) {
        this.f30287a = i2;
        this.f30289c = fizVar;
        this.f30288b = i;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) throws Throwable {
        switch (this.f30287a) {
            case 0:
                Object objCollect = ((nzx0) this.f30289c).collect(new oox(nizVar, this.f30288b, 1), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = ((fnc) this.f30289c).collect(new oox(nizVar, this.f30288b, 2), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
