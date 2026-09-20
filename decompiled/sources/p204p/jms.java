package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jms implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113939a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nms f113940b;

    public /* synthetic */ jms(nms nmsVar, int i) {
        this.f113939a = i;
        this.f113940b = nmsVar;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) throws Throwable {
        switch (this.f113939a) {
            case 0:
                this.f113940b.m65159q(((Number) obj).intValue());
                break;
            default:
                nms nmsVar = this.f113940b;
                if (nmsVar.f156264n != null) {
                    nmsVar.m65158p();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
