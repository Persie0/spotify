package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vly0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f242623a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yw70 f242624b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rv41 f242625c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vly0(yw70 yw70Var, rv41 rv41Var, int i) {
        super(0);
        this.f242623a = i;
        this.f242624b = yw70Var;
        this.f242625c = rv41Var;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.List] */
    @Override // p204p.eh00
    public final Object invoke() {
        int iM78167e;
        switch (this.f242623a) {
            case 0:
                return Boolean.valueOf(this.f242624b.mo28417d() && !((Boolean) this.f242625c.getValue()).booleanValue());
            default:
                tw70 tw70Var = (tw70) g6f.m43745s0(this.f242624b.m94779h().f214605k);
                if (tw70Var != null) {
                    iM78167e = si5.m78167e(this.f242625c) * tw70Var.f224341q;
                } else {
                    iM78167e = 0;
                }
                return Integer.valueOf(iM78167e);
        }
    }
}
