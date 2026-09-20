package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r45 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f195657a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c581 f195658b;

    public /* synthetic */ r45(c581 c581Var, int i) {
        this.f195657a = i;
        this.f195658b = c581Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f195657a) {
            case 0:
                this.f195658b.m31458b(((Number) ((l05) obj).f128299e.getValue()).floatValue());
                break;
            default:
                float f = (int) (((g450) obj).f76347a & 4294967295L);
                c581 c581Var = this.f195658b;
                c581Var.f34105a = -(f - c581Var.f34107c.m84031v());
                break;
        }
        return w2a1.f247311a;
    }
}
