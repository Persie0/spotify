package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class piu0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f178057a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f178058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f178059c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vum0 f178060d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ rv41 f178061e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ vum0 f178062f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public piu0(long j, int i, int i2, vum0 vum0Var, rv41 rv41Var, vum0 vum0Var2) {
        super(1);
        this.f178057a = j;
        this.f178058b = i;
        this.f178059c = i2;
        this.f178060d = vum0Var;
        this.f178061e = rv41Var;
        this.f178062f = vum0Var2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        long j = this.f178057a;
        int iIntBitsToFloat = ((((int) Float.intBitsToFloat((int) (j & 4294967295L))) - this.f178058b) - this.f178060d.m86437v()) + ((int) (((yqq) obj).mo35989Z0(27.0f) * (1.0f - ((Number) this.f178061e.getValue()).floatValue())));
        if (iIntBitsToFloat < 0) {
            iIntBitsToFloat = 0;
        }
        return new y350((((long) n0e1.m63437n((int) Float.intBitsToFloat((int) (j >> 32)), 0, this.f178059c - this.f178062f.m86437v())) << 32) | (4294967295L & ((long) iIntBitsToFloat)));
    }
}
