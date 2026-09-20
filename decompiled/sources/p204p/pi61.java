package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class pi61 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f177846a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hkm0 f177847b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f177848c;

    public pi61(fiz fizVar, hkm0 hkm0Var, int i) {
        this.f177846a = fizVar;
        this.f177847b = hkm0Var;
        this.f177848c = i;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, p.fiz] */
    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        Object objCollect = this.f177846a.collect(new oi61(nizVar, this.f177847b, this.f177848c, 0), fbkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
