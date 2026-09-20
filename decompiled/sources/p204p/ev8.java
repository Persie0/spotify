package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ev8 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63177a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nuu0 f63178b;

    public /* synthetic */ ev8(nuu0 nuu0Var, int i) {
        this.f63177a = i;
        this.f63178b = nuu0Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f63177a) {
            case 0:
                Object objCollect = this.f63178b.f158717a.collect(new s98(nizVar, 4), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f63178b.f158717a.collect(new cgm0(nizVar, 5), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
