package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class weq implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f250602a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ si9 f250603b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hfq f250604c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rui f250605d;

    public /* synthetic */ weq(si9 si9Var, hfq hfqVar, rui ruiVar, int i) {
        this.f250602a = i;
        this.f250603b = si9Var;
        this.f250604c = hfqVar;
        this.f250605d = ruiVar;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f250602a) {
            case 0:
                Object objCollect = this.f250603b.collect(new veq(nizVar, this.f250604c, this.f250605d, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f250603b.collect(new veq(nizVar, this.f250604c, this.f250605d, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
