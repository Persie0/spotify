package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hw70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95876a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iw70 f95877b;

    public /* synthetic */ hw70(iw70 iw70Var, int i) {
        this.f95876a = i;
        this.f95877b = iw70Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f95876a) {
            case 0:
                return Float.valueOf(this.f95877b.f106351N0.mo34093b());
            case 1:
                return Float.valueOf(this.f95877b.f106351N0.mo34094c());
            default:
                iw70 iw70Var = this.f95877b;
                return Float.valueOf(iw70Var.f106351N0.mo34096e() - iw70Var.f106351N0.mo34092a());
        }
    }
}
