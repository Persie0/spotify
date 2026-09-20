package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qs40 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f191985a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ slv0 f191986b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f191987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qs40(slv0 slv0Var, gh00 gh00Var, int i) {
        super(1);
        this.f191985a = i;
        this.f191986b = slv0Var;
        this.f191987c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f191985a) {
            case 0:
                boolean z = ((Number) obj).intValue() > 50;
                slv0 slv0Var = this.f191986b;
                if (!wj50.m88271j(slv0Var.f210497a, Boolean.valueOf(z))) {
                    slv0Var.f210497a = Boolean.valueOf(z);
                    if (z) {
                        this.f191987c.invoke(a0f0.f11071a);
                    }
                }
                break;
            case 1:
                boolean z2 = ((Number) obj).intValue() > 50;
                slv0 slv0Var2 = this.f191986b;
                if (!wj50.m88271j(slv0Var2.f210497a, Boolean.valueOf(z2))) {
                    slv0Var2.f210497a = Boolean.valueOf(z2);
                    if (z2) {
                        this.f191987c.invoke(a0f0.f11071a);
                    }
                }
                break;
            default:
                boolean z3 = ((Number) obj).intValue() > 50;
                slv0 slv0Var3 = this.f191986b;
                if (!wj50.m88271j(slv0Var3.f210497a, Boolean.valueOf(z3))) {
                    slv0Var3.f210497a = Boolean.valueOf(z3);
                    if (z3) {
                        this.f191987c.invoke(a0f0.f11071a);
                    }
                }
                break;
        }
        return w2a1.f247311a;
    }
}
