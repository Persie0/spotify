package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zx7 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f287228a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lqi0 f287229b;

    public /* synthetic */ zx7(lqi0 lqi0Var, int i) {
        this.f287228a = i;
        this.f287229b = lqi0Var;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        switch (this.f287228a) {
            case 0:
                ((zv41) this.f287229b).m97090l(obj);
                break;
            default:
                Float f = new Float(((Number) obj).floatValue());
                zv41 zv41Var = (zv41) this.f287229b;
                zv41Var.getClass();
                zv41Var.m97091m(null, f);
                break;
        }
        return w2a1.f247311a;
    }
}
