package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n8n0 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f151568a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vjz f151569b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s8n0 f151570c;

    public /* synthetic */ n8n0(vjz vjzVar, s8n0 s8n0Var, int i) {
        this.f151568a = i;
        this.f151569b = vjzVar;
        this.f151570c = s8n0Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f151568a) {
            case 0:
                Object objCollect = this.f151569b.collect(new m8n0(nizVar, this.f151570c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            case 1:
                Object objCollect2 = this.f151569b.collect(new m8n0(nizVar, this.f151570c, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
            default:
                Object objCollect3 = this.f151569b.collect(new m8n0(nizVar, this.f151570c, 2), fbkVar);
                return objCollect3 == yuk.f276404a ? objCollect3 : w2a1.f247311a;
        }
    }
}
