package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class js2 implements p9d0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f115363a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ayn f115364b;

    public /* synthetic */ js2(ayn aynVar, int i) {
        this.f115363a = i;
        this.f115364b = aynVar;
    }

    @Override // p204p.p9d0
    /* JADX INFO: renamed from: a */
    public final o9d0 mo30897a(hji hjiVar, uzx uzxVar, xnd0 xnd0Var) {
        switch (this.f115363a) {
            case 0:
                return this.f115364b.m27526a(hjiVar, uzxVar, xnd0Var, vco0.UNKNOWN_PLATFORM);
            default:
                return this.f115364b.m27526a(hjiVar, uzxVar, xnd0Var, vco0.SNAP_SPECS);
        }
    }
}
