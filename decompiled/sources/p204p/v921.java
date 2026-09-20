package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v921 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f238829a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ onc f238830b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f238831c;

    public /* synthetic */ v921(onc oncVar, String str, int i) {
        this.f238829a = i;
        this.f238830b = oncVar;
        this.f238831c = str;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f238829a) {
            case 0:
                Object objCollect = this.f238830b.collect(new wli0(nizVar, this.f238831c, 19), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f238830b.collect(new wli0(nizVar, this.f238831c, 25), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
