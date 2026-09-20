package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p5j0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174178a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xxi0 f174179b;

    public /* synthetic */ p5j0(xxi0 xxi0Var, int i) {
        this.f174178a = i;
        this.f174179b = xxi0Var;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        switch (this.f174178a) {
            case 0:
                this.f174179b.m92337a(new oem0((afm0) obj));
                break;
            default:
                this.f174179b.m92337a(new mem0(((Boolean) obj).booleanValue() ? hnm0.f93363a : new inm0(3)));
                break;
        }
        return w2a1.f247311a;
    }
}
