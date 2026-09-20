package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ess0 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62461a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f62462b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kss0 f62463c;

    public /* synthetic */ ess0(fiz fizVar, kss0 kss0Var, int i) {
        this.f62461a = i;
        this.f62462b = fizVar;
        this.f62463c = kss0Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f62461a) {
            case 0:
                Object objCollect = this.f62462b.collect(new dss0(nizVar, this.f62463c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f62462b.collect(new dss0(nizVar, this.f62463c, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
