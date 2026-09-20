package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lsp implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136574a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nuu0 f136575b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nsp f136576c;

    public /* synthetic */ lsp(nuu0 nuu0Var, nsp nspVar, int i) {
        this.f136574a = i;
        this.f136575b = nuu0Var;
        this.f136576c = nspVar;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f136574a) {
            case 0:
                Object objCollect = this.f136575b.f158717a.collect(new ksp(nizVar, this.f136576c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f136575b.f158717a.collect(new ksp(nizVar, this.f136576c, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
