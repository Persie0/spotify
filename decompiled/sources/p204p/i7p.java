package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i7p extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99598a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hxt f99599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i7p(hxt hxtVar, int i) {
        super(0);
        this.f99598a = i;
        this.f99599b = hxtVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        eh00 eh00VarM65830i;
        switch (this.f99598a) {
            case 0:
                return nxf1.m65842u(this.f99599b.f96307t);
            case 1:
                return this.f99599b.f96293f;
            case 2:
                u4l0 u4l0Var = this.f99599b.f96308u;
                if (u4l0Var != null) {
                    return ((m12) u4l0Var.f226773c).m60498M();
                }
                return null;
            case 3:
                u4l0 u4l0Var2 = this.f99599b.f96308u;
                boolean z = false;
                if (u4l0Var2 != null && !((m12) u4l0Var2.f226773c).f138796b) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                return Integer.valueOf(this.f99599b.f96291d.f71819s);
            case 5:
                return this.f99599b.f96289b;
            case 6:
                hxt hxtVar = this.f99599b;
                b250 b250VarM30652c = hxtVar.f96296i.m30652c();
                if (b250VarM30652c == null || (eh00VarM65830i = nxf1.m65830i(b250VarM30652c)) == null) {
                    eh00VarM65830i = hxtVar.f96309v;
                } else {
                    hxtVar.f96309v = eh00VarM65830i;
                }
                return (siv0) eh00VarM65830i.invoke();
            default:
                hxt hxtVar2 = this.f99599b;
                paq paqVarMo31972f = hxtVar2.f96289b.mo31972f();
                return new paq(paqVarMo31972f.f175594a, paqVarMo31972f.f175595b, paqVarMo31972f.m69496c(hxtVar2.f96289b.mo31974h()), null);
        }
    }
}
