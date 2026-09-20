package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gso0 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f83997a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f83998b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f83999c;

    public /* synthetic */ gso0(fiz fizVar, String str, int i) {
        this.f83997a = i;
        this.f83998b = fizVar;
        this.f83999c = str;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f83997a) {
            case 0:
                Object objCollect = this.f83998b.collect(new wli0(nizVar, this.f83999c, 6), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            case 1:
                Object objCollect2 = this.f83998b.collect(new wli0(nizVar, this.f83999c, 7), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
            case 2:
                Object objCollect3 = this.f83998b.collect(new wli0(nizVar, this.f83999c, 9), fbkVar);
                return objCollect3 == yuk.f276404a ? objCollect3 : w2a1.f247311a;
            case 3:
                Object objCollect4 = this.f83998b.collect(new wli0(nizVar, this.f83999c, 15), fbkVar);
                return objCollect4 == yuk.f276404a ? objCollect4 : w2a1.f247311a;
            case 4:
                Object objCollect5 = this.f83998b.collect(new wli0(nizVar, this.f83999c, 20), fbkVar);
                return objCollect5 == yuk.f276404a ? objCollect5 : w2a1.f247311a;
            case 5:
                Object objCollect6 = this.f83998b.collect(new m2p(nizVar, this.f83999c, 1), fbkVar);
                return objCollect6 == yuk.f276404a ? objCollect6 : w2a1.f247311a;
            case 6:
                Object objCollect7 = this.f83998b.collect(new wli0(nizVar, this.f83999c, 27), fbkVar);
                return objCollect7 == yuk.f276404a ? objCollect7 : w2a1.f247311a;
            case 7:
                Object objCollect8 = this.f83998b.collect(new wli0(nizVar, this.f83999c, 28), fbkVar);
                return objCollect8 == yuk.f276404a ? objCollect8 : w2a1.f247311a;
            default:
                Object objCollect9 = this.f83998b.collect(new t091(nizVar, this.f83999c, 1), fbkVar);
                return objCollect9 == yuk.f276404a ? objCollect9 : w2a1.f247311a;
        }
    }
}
