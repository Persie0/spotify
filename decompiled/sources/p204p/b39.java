package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class b39 implements i4l0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d971 f22966b;

    public /* synthetic */ b39(d971 d971Var, int i) {
        this.f22965a = i;
        this.f22966b = d971Var;
    }

    @Override // p204p.i4l0
    /* JADX INFO: renamed from: a */
    public final long mo28001a() {
        switch (this.f22965a) {
            case 0:
                return this.f22966b.m35332j(true).f206021b;
            case 1:
                return this.f22966b.m35338p(true, true).f206021b;
            default:
                return this.f22966b.m35338p(false, true).f206021b;
        }
    }
}
