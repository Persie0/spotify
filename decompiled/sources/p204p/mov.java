package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mov implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f145756a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ay7 f145757b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pov f145758c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bov f145759d;

    public /* synthetic */ mov(ay7 ay7Var, pov povVar, bov bovVar, int i) {
        this.f145756a = i;
        this.f145757b = ay7Var;
        this.f145758c = povVar;
        this.f145759d = bovVar;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f145756a) {
            case 0:
                this.f145757b.collect(new lov(nizVar, this.f145758c, this.f145759d, 0), fbkVar);
                break;
            default:
                this.f145757b.collect(new lov(nizVar, this.f145758c, this.f145759d, 1), fbkVar);
                break;
        }
        return yuk.f276404a;
    }
}
