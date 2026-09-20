package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e4e1 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56072a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kmx f56073b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g4e1 f56074c;

    public /* synthetic */ e4e1(kmx kmxVar, g4e1 g4e1Var, int i) {
        this.f56072a = i;
        this.f56073b = kmxVar;
        this.f56074c = g4e1Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f56072a) {
            case 0:
                Object objCollect = this.f56073b.collect(new d4e1(nizVar, this.f56074c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f56073b.collect(new d4e1(nizVar, this.f56074c, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
