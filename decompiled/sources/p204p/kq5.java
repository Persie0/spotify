package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kq5 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125215a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yab f125216b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ d7m0 f125217c;

    public /* synthetic */ kq5(yab yabVar, d7m0 d7m0Var, int i) {
        this.f125215a = i;
        this.f125216b = yabVar;
        this.f125217c = d7m0Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f125215a) {
            case 0:
                Object objCollect = this.f125216b.collect(new jq5(nizVar, this.f125217c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f125216b.collect(new jq5(nizVar, this.f125217c, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
