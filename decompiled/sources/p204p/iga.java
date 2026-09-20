package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class iga extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101937a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rv41 f101938b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rv41 f101939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iga(rv41 rv41Var, rv41 rv41Var2, int i) {
        super(0);
        this.f101937a = i;
        this.f101938b = rv41Var;
        this.f101939c = rv41Var2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f101937a) {
            case 0:
                return Float.valueOf(((Boolean) this.f101938b.getValue()).booleanValue() ? ((Number) this.f101939c.getValue()).floatValue() : 1.0f);
            case 1:
                return Float.valueOf(((Boolean) this.f101938b.getValue()).booleanValue() ? ((Number) this.f101939c.getValue()).floatValue() : 1.0f);
            default:
                return Float.valueOf(n0e1.m63436m(((Number) this.f101938b.getValue()).floatValue(), 0.0f, f1h1.m40549o(this.f101939c)));
        }
    }
}
