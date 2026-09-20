package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zux implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f286551a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f286552b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f286553c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f286554d;

    public /* synthetic */ zux(fiz fizVar, Object obj, Object obj2, int i) {
        this.f286551a = i;
        this.f286552b = fizVar;
        this.f286553c = obj;
        this.f286554d = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [p.gh00, p.qe70] */
    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        int i = this.f286551a;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        Object obj = this.f286554d;
        Object obj2 = this.f286553c;
        fiz fizVar = this.f286552b;
        switch (i) {
            case 0:
                Object objCollect = ((nnc) fizVar).collect(new pfu(nizVar, (gh00) obj2, obj), fbkVar);
                return objCollect == yukVar ? objCollect : w2a1Var;
            case 1:
                Object objM85470k = vgg1.m85470k(fbkVar, nizVar, dgj.f48813c, new zos((vh00) obj, (fbk) null, 1), new fiz[]{fizVar, (fiz) obj2});
                return objM85470k == yukVar ? objM85470k : w2a1Var;
            case 2:
                Object objCollect2 = fizVar.collect(new fwj(nizVar, (String) obj2, (String) obj, 4), fbkVar);
                return objCollect2 == yukVar ? objCollect2 : w2a1Var;
            case 3:
                Object objCollect3 = ((ur0) fizVar).collect(new fwj(nizVar, (String) obj2, (mu80) obj, 6), fbkVar);
                return objCollect3 == yukVar ? objCollect3 : w2a1Var;
            default:
                Object objCollect4 = fizVar.collect(new pfu(nizVar, (u490) obj2, (String) obj, 27), fbkVar);
                return objCollect4 == yukVar ? objCollect4 : w2a1Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zux(nnc nncVar, gh00 gh00Var, Object obj) {
        this.f286551a = 0;
        this.f286552b = nncVar;
        this.f286553c = (qe70) gh00Var;
        this.f286554d = obj;
    }
}
