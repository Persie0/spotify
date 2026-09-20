package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mt00 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146920a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ay7 f146921b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ su00 f146922c;

    public /* synthetic */ mt00(ay7 ay7Var, su00 su00Var, int i) {
        this.f146920a = i;
        this.f146921b = ay7Var;
        this.f146922c = su00Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f146920a) {
            case 0:
                this.f146921b.collect(new lt00(nizVar, this.f146922c, 0), fbkVar);
                break;
            default:
                this.f146921b.collect(new lt00(nizVar, this.f146922c, 1), fbkVar);
                break;
        }
        return yuk.f276404a;
    }
}
