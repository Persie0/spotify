package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rw8 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f203301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qt8 f203302b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rw8(qt8 qt8Var, int i) {
        super(2);
        this.f203301a = i;
        this.f203302b = qt8Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f203301a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                ((Number) obj2).intValue();
                xq00Var.m91771i0(-247757961);
                j15 j15VarMo26895b = this.f203302b.mo26895b(xq00Var);
                xq00Var.m91788r(false);
                return j15VarMo26895b;
            default:
                xq00 xq00Var2 = (xq00) obj;
                ((Number) obj2).intValue();
                xq00Var2.m91771i0(-1448133466);
                j15 j15VarMo26895b2 = this.f203302b.mo26895b(xq00Var2);
                xq00Var2.m91788r(false);
                return j15VarMo26895b2;
        }
    }
}
