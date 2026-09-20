package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ler implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132665a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f132666b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uer f132667c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ddr f132668d;

    public /* synthetic */ ler(zv41 zv41Var, uer uerVar, ddr ddrVar, int i) {
        this.f132665a = i;
        this.f132666b = zv41Var;
        this.f132667c = uerVar;
        this.f132668d = ddrVar;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f132665a) {
            case 0:
                Object objCollect = this.f132666b.collect(new ker(nizVar, this.f132667c, this.f132668d, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            case 1:
                Object objCollect2 = this.f132666b.collect(new ker(nizVar, this.f132667c, this.f132668d, 2), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
            default:
                Object objCollect3 = this.f132666b.collect(new ker(nizVar, this.f132667c, this.f132668d, 3), fbkVar);
                return objCollect3 == yuk.f276404a ? objCollect3 : w2a1.f247311a;
        }
    }
}
