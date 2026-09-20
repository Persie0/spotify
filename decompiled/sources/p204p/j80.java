package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j80 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f109746a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f109747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fiz f109748c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f109749d;

    public j80(pv4 pv4Var, boolean z, e330 e330Var) {
        this.f109748c = pv4Var;
        this.f109747b = z;
        this.f109749d = e330Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f109746a) {
            case 0:
                Object objCollect = this.f109748c.collect(new i80(nizVar, (String) this.f109749d, this.f109747b, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = ((pv4) this.f109748c).collect(new tja(nizVar, this.f109747b, (e330) this.f109749d), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }

    public j80(nuu0 nuu0Var, String str, boolean z) {
        this.f109748c = nuu0Var;
        this.f109749d = str;
        this.f109747b = z;
    }
}
