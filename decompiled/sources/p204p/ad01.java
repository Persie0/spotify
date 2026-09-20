package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ad01 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14485a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f14486b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qe70 f14487c;

    /* JADX WARN: Multi-variable type inference failed */
    public ad01(fiz fizVar, gh00 gh00Var, int i) {
        this.f14485a = i;
        switch (i) {
            case 1:
                this.f14486b = fizVar;
                this.f14487c = (qe70) gh00Var;
                break;
            default:
                this.f14486b = fizVar;
                this.f14487c = (qe70) gh00Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p.gh00, p.qe70] */
    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f14485a) {
            case 0:
                Object objCollect = this.f14486b.collect(new zc01(nizVar, this.f14487c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f14486b.collect(new zc01(nizVar, this.f14487c, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
