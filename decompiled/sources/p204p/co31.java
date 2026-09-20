package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class co31 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40174a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nuu0 f40175b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fo31 f40176c;

    public /* synthetic */ co31(nuu0 nuu0Var, fo31 fo31Var, int i) {
        this.f40174a = i;
        this.f40175b = nuu0Var;
        this.f40176c = fo31Var;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f40174a) {
            case 0:
                Object objCollect = this.f40175b.f158717a.collect(new bo31(nizVar, this.f40176c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f40175b.f158717a.collect(new bo31(nizVar, this.f40176c, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
