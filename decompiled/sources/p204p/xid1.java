package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xid1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f261847a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f261848b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f261849c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rv41 f261850d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ rv41 f261851e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ rv41 f261852f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xid1(int i, float f, float f2, rv41 rv41Var, rv41 rv41Var2, rv41 rv41Var3) {
        super(0);
        this.f261847a = i;
        this.f261848b = f;
        this.f261849c = f2;
        this.f261850d = rv41Var;
        this.f261851e = rv41Var2;
        this.f261852f = rv41Var3;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        float f = this.f261847a;
        float f2 = this.f261848b;
        float f3 = this.f261849c;
        return new sb91(f * f2, f3 * f2, f3, ((Number) this.f261850d.getValue()).floatValue(), ((Number) this.f261851e.getValue()).floatValue(), ((Number) this.f261852f.getValue()).floatValue());
    }
}
