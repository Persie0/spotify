package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class elj extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60723a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f60724b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ k8m f60725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ elj(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f60723a = i2;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        int i = this.f60723a;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        k8m k8mVar = (k8m) obj2;
        fbk fbkVar = (fbk) obj3;
        switch (i) {
            case 0:
                elj eljVar = new elj(3, 0, fbkVar);
                eljVar.f60724b = zBooleanValue;
                eljVar.f60725c = k8mVar;
                return eljVar.invokeSuspend(w2a1.f247311a);
            default:
                elj eljVar2 = new elj(3, 1, fbkVar);
                eljVar2.f60724b = zBooleanValue;
                eljVar2.f60725c = k8mVar;
                return eljVar2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f60723a) {
            case 0:
                boolean z = this.f60724b;
                k8m k8mVar = this.f60725c;
                bga.m29073P(obj);
                if (!z || !(k8mVar instanceof j8m)) {
                    k8mVar = null;
                }
                if (k8mVar instanceof j8m) {
                    return (j8m) k8mVar;
                }
                return null;
            default:
                boolean z2 = this.f60724b;
                k8m k8mVar2 = this.f60725c;
                bga.m29073P(obj);
                return Boolean.valueOf(!(k8mVar2 instanceof i8m) || z2);
        }
    }
}
