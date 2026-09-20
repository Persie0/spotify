package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ug4 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f229977a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ner f229978b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f229979c;

    public /* synthetic */ ug4(ner nerVar, String str, int i) {
        this.f229977a = i;
        this.f229978b = nerVar;
        this.f229979c = str;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f229977a) {
            case 0:
                Object objCollect = this.f229978b.collect(new C2189nt(nizVar, this.f229979c, 7), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f229978b.collect(new C2189nt(nizVar, this.f229979c, 8), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
