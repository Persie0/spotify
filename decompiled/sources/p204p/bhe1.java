package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bhe1 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27168a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fie1 f27169b;

    public /* synthetic */ bhe1(fie1 fie1Var, int i) {
        this.f27168a = i;
        this.f27169b = fie1Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) throws Throwable {
        switch (this.f27168a) {
            case 0:
                Object objCollect = this.f27169b.collect(new aae1(nizVar, 6), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f27169b.collect(new aae1(nizVar, 7), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
