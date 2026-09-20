package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e2k implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55478a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC2524w8 f55479b;

    public /* synthetic */ e2k(int i, AbstractC2524w8 abstractC2524w8) {
        this.f55478a = i;
        this.f55479b = abstractC2524w8;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f55478a) {
            case 0:
                return ((f5k) this.f55479b.get(((Number) obj).intValue())).f66094a;
            default:
                this.f55479b.get(((Number) obj).intValue());
                return null;
        }
    }
}
