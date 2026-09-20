package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class si9 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f209380a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s5u f209381b;

    public /* synthetic */ si9(s5u s5uVar, int i) {
        this.f209380a = i;
        this.f209381b = s5uVar;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f209380a) {
            case 0:
                Object objCollect = this.f209381b.collect(new s98(nizVar, 10), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            case 1:
                Object objCollect2 = this.f209381b.collect(new hql(nizVar, 24), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
            case 2:
                Object objCollect3 = this.f209381b.collect(new gxo(nizVar, 14), fbkVar);
                return objCollect3 == yuk.f276404a ? objCollect3 : w2a1.f247311a;
            case 3:
                Object objCollect4 = this.f209381b.collect(new hop(nizVar, 11), fbkVar);
                return objCollect4 == yuk.f276404a ? objCollect4 : w2a1.f247311a;
            default:
                Object objCollect5 = this.f209381b.collect(new efx(nizVar, 10), fbkVar);
                return objCollect5 == yuk.f276404a ? objCollect5 : w2a1.f247311a;
        }
    }
}
