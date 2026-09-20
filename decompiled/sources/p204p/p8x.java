package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p8x implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f175077a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f175078b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f175079c;

    public /* synthetic */ p8x(fiz fizVar, boolean z, int i) {
        this.f175077a = i;
        this.f175078b = fizVar;
        this.f175079c = z;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f175077a) {
            case 0:
                Object objCollect = this.f175078b.collect(new o8x(nizVar, this.f175079c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            case 1:
                Object objCollect2 = this.f175078b.collect(new q190(nizVar, this.f175079c), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
            default:
                Object objCollect3 = ((onc) this.f175078b).collect(new o8x(nizVar, this.f175079c, 1), fbkVar);
                return objCollect3 == yuk.f276404a ? objCollect3 : w2a1.f247311a;
        }
    }
}
