package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n3e implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f150035a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2373se f150036b;

    public /* synthetic */ n3e(C2373se c2373se, int i) {
        this.f150035a = i;
        this.f150036b = c2373se;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f150035a) {
            case 0:
                Object objCollect = this.f150036b.collect(new kqc(nizVar, 20), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f150036b.collect(new kqc(nizVar, 21), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
