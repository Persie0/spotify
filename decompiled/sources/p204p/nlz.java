package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class nlz implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f155191a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz[] f155192b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f155193c;

    public /* synthetic */ nlz(fiz[] fizVarArr, ai00 ai00Var, int i) {
        this.f155191a = i;
        this.f155192b = fizVarArr;
        this.f155193c = ai00Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, p.ai00] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, p.ai00] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, p.ai00] */
    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f155191a) {
            case 0:
                Object objM85470k = vgg1.m85470k(fbkVar, nizVar, dgj.f48813c, new mlz(null, this.f155193c, 0), this.f155192b);
                return objM85470k == yuk.f276404a ? objM85470k : w2a1.f247311a;
            case 1:
                Object objM85470k2 = vgg1.m85470k(fbkVar, nizVar, dgj.f48813c, new mlz(null, this.f155193c, 1), this.f155192b);
                return objM85470k2 == yuk.f276404a ? objM85470k2 : w2a1.f247311a;
            default:
                Object objM85470k3 = vgg1.m85470k(fbkVar, nizVar, dgj.f48813c, new mlz(null, this.f155193c, 2), this.f155192b);
                return objM85470k3 == yuk.f276404a ? objM85470k3 : w2a1.f247311a;
        }
    }
}
