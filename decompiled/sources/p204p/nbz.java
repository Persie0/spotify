package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nbz implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152378a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f152379b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pbz f152380c;

    public /* synthetic */ nbz(zv41 zv41Var, pbz pbzVar, int i) {
        this.f152378a = i;
        this.f152379b = zv41Var;
        this.f152380c = pbzVar;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f152378a) {
            case 0:
                Object objCollect = this.f152379b.collect(new efx(nizVar, this.f152380c, 24), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f152379b.collect(new efx(nizVar, this.f152380c, 25), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
