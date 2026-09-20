package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class as3 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19286a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qs3 f19287b;

    public /* synthetic */ as3(qs3 qs3Var, int i) {
        this.f19286a = i;
        this.f19287b = qs3Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    @Override // p204p.eh00
    public final Object invoke() {
        float fM73668g;
        switch (this.f19286a) {
            case 0:
                qs3 qs3Var = this.f19287b;
                Object value = qs3Var.f191974l.getValue();
                if (value != null) {
                    return value;
                }
                float fM84031v = qs3Var.f191972j.m84031v();
                yum0 yum0Var = qs3Var.f191969g;
                if (Float.isNaN(fM84031v)) {
                    return yum0Var.getValue();
                }
                float fM38702f = qs3Var.m73664c().m38702f(yum0Var.getValue());
                if (Float.isNaN(fM38702f) || fM84031v == fM38702f) {
                    return yum0Var.getValue();
                }
                Object objM38697a = qs3Var.m73664c().m38697a(fM84031v);
                return objM38697a == null ? yum0Var.getValue() : objM38697a;
            case 1:
                qs3 qs3Var2 = this.f19287b;
                float fM38702f2 = qs3Var2.m73664c().m38702f(qs3Var2.f191970h.getValue());
                float fM38702f3 = qs3Var2.m73664c().m38702f(qs3Var2.f191971i.getValue()) - fM38702f2;
                float fAbs = Math.abs(fM38702f3);
                if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                    fM73668g = 1.0f;
                } else {
                    fM73668g = (qs3Var2.m73668g() - fM38702f2) / fM38702f3;
                    if (fM73668g < 1.0E-6f) {
                        fM73668g = 0.0f;
                    } else if (fM73668g > 0.999999f) {
                        fM73668g = 1.0f;
                    }
                }
                return Float.valueOf(fM73668g);
            case 2:
                return this.f19287b.m73664c();
            default:
                qs3 qs3Var3 = this.f19287b;
                return new pqm0(qs3Var3.m73664c(), qs3Var3.f191971i.getValue());
        }
    }
}
