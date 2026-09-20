package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gnz implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fiz f82797a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ljx0 f82798b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f82799c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f82800d;

    public gnz(fiz fizVar, ljx0 ljx0Var, boolean z, gh00 gh00Var) {
        this.f82797a = fizVar;
        this.f82798b = ljx0Var;
        this.f82799c = z;
        this.f82800d = gh00Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        Object objCollect = this.f82797a.collect(new fnz(nizVar, this.f82798b, this.f82799c, this.f82800d), fbkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
