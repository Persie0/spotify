package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class frt0 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f72662a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f72663b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w0p0 f72664c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f72665d;

    public /* synthetic */ frt0(onc oncVar, w0p0 w0p0Var, String str, int i) {
        this.f72662a = i;
        this.f72663b = oncVar;
        this.f72664c = w0p0Var;
        this.f72665d = str;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f72662a) {
            case 0:
                Object objCollect = this.f72663b.collect(new ert0(nizVar, this.f72664c, this.f72665d, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f72663b.collect(new ert0(nizVar, this.f72664c, this.f72665d, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
