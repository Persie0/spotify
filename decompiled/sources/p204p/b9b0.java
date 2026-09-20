package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class b9b0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24819a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c9b0 f24820b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9b0(c9b0 c9b0Var, int i) {
        super(0);
        this.f24819a = i;
        this.f24820b = c9b0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f24819a) {
            case 0:
                c9b0 c9b0Var = this.f24820b;
                return Boolean.valueOf((c9b0Var.m31917a() == null && ((Throwable) c9b0Var.f35446c.getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) this.f24820b.f35446c.getValue()) != null);
            case 2:
                c9b0 c9b0Var2 = this.f24820b;
                return Boolean.valueOf(c9b0Var2.m31917a() == null && ((Throwable) c9b0Var2.f35446c.getValue()) == null);
            default:
                return Boolean.valueOf(this.f24820b.m31917a() != null);
        }
    }
}
