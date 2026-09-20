package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kzj extends AbstractC1806e9 implements rzu0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f128138c;

    /* JADX INFO: renamed from: d */
    public final qti0 f128139d;

    /* JADX INFO: renamed from: e */
    public final Object f128140e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kzj(Object obj, gd70 gd70Var, qti0 qti0Var, int i) {
        super(gd70Var);
        this.f128138c = i;
        this.f128140e = obj;
        this.f128139d = qti0Var;
    }

    /* JADX INFO: renamed from: F1 */
    public final qti0 m57759F1() {
        switch (this.f128138c) {
            case 0:
                break;
        }
        return this.f128139d;
    }

    @Override // p204p.AbstractC1806e9
    public final String toString() {
        switch (this.f128138c) {
            case 0:
                return getType() + ": Ctx { " + ((nfe) this.f128140e) + " }";
            default:
                return "Cxt { " + ((cab) this.f128140e) + " }";
        }
    }
}
