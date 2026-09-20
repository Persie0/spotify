package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jk2 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113183a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qlv0 f113184b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qlv0 f113185c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pir0 f113186d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk2(qlv0 qlv0Var, qlv0 qlv0Var2, pir0 pir0Var, int i) {
        super(1);
        this.f113183a = i;
        this.f113184b = qlv0Var;
        this.f113185c = qlv0Var2;
        this.f113186d = pir0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f113183a) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                qlv0 qlv0Var = this.f113184b;
                long j = qlv0Var.f189932a;
                qlv0 qlv0Var2 = this.f113185c;
                if (j < 0) {
                    qlv0Var.f189932a = jLongValue;
                    qlv0Var2.f189932a = jLongValue;
                } else if (jLongValue - qlv0Var2.f189932a >= 66666667) {
                    this.f113186d.setValue(Float.valueOf((jLongValue - j) / 1.0E9f));
                    qlv0Var2.f189932a = jLongValue;
                }
                break;
            default:
                long jLongValue2 = ((Number) obj).longValue();
                qlv0 qlv0Var3 = this.f113184b;
                long j2 = qlv0Var3.f189932a;
                qlv0 qlv0Var4 = this.f113185c;
                if (j2 == 0) {
                    qlv0Var3.f189932a = jLongValue2;
                    qlv0Var4.f189932a = jLongValue2;
                } else if (jLongValue2 - qlv0Var4.f189932a >= 66666667) {
                    pir0 pir0Var = this.f113186d;
                    pir0Var.setValue(Float.valueOf((((jLongValue2 - qlv0Var3.f189932a) / 1.0E9f) * 1.5f) + ((Number) pir0Var.f178006a.getValue()).floatValue()));
                    qlv0Var3.f189932a = jLongValue2;
                    qlv0Var4.f189932a = jLongValue2;
                }
                break;
        }
        return w2a1.f247311a;
    }
}
