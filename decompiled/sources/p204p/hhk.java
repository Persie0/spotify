package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hhk implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f91407a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f91408b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fiz f91409c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f91410d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f91411e;

    public hhk(ay7 ay7Var, String str, ock ockVar, boolean z) {
        this.f91409c = ay7Var;
        this.f91410d = str;
        this.f91411e = ockVar;
        this.f91408b = z;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f91407a) {
            case 0:
                ((ay7) this.f91409c).collect(new jl1(nizVar, (String) this.f91410d, (ock) this.f91411e, this.f91408b, 1), fbkVar);
                return yuk.f276404a;
            default:
                Object objCollect = ((kxr) this.f91409c).collect(new jl1(nizVar, this.f91408b, (xre) this.f91410d, (o040) this.f91411e), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
        }
    }

    public hhk(kxr kxrVar, boolean z, xre xreVar, o040 o040Var) {
        this.f91409c = kxrVar;
        this.f91408b = z;
        this.f91410d = xreVar;
        this.f91411e = o040Var;
    }
}
