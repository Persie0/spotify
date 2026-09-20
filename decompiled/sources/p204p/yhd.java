package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yhd implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f272819a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qf40 f272820b;

    public /* synthetic */ yhd(int i, qf40 qf40Var) {
        this.f272819a = i;
        this.f272820b = qf40Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f272819a) {
            case 0:
                return ((akk) this.f272820b.get(((Number) obj).intValue())).f16560a.f178681a;
            case 1:
                this.f272820b.get(((Number) obj).intValue());
                return null;
            case 2:
                return ((wn50) this.f272820b.get(((Number) obj).intValue())).f253066a;
            case 3:
                this.f272820b.get(((Number) obj).intValue());
                return null;
            case 4:
                return String.valueOf(((obl0) this.f272820b.get(((Number) obj).intValue())).m87673g().f47707a);
            default:
                this.f272820b.get(((Number) obj).intValue());
                return null;
        }
    }
}
