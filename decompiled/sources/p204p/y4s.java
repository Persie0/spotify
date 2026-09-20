package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class y4s implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f269212a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f269213b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t4s f269214c;

    public /* synthetic */ y4s(xv41 xv41Var, t4s t4sVar, int i) {
        this.f269212a = i;
        this.f269213b = xv41Var;
        this.f269214c = t4sVar;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f269212a) {
            case 0:
                Object objCollect = this.f269213b.collect(new x4s(nizVar, this.f269214c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f269213b.collect(new x4s(nizVar, this.f269214c, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
