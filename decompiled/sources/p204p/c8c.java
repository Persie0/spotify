package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class c8c extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35180a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r7i0 f35181b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s9p0 f35182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8c(r7i0 r7i0Var, s9p0 s9p0Var) {
        super(1);
        this.f35181b = r7i0Var;
        this.f35182c = s9p0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f35180a) {
            case 0:
                r7i0 r7i0Var = this.f35181b;
                s9p0 s9p0Var = this.f35182c;
                if (s9p0Var != null) {
                    r7i0Var.mo32673a(s9p0Var);
                }
                return new b8c(s9p0Var, r7i0Var);
            default:
                r7i0 r7i0Var2 = this.f35181b;
                s9p0 s9p0Var2 = this.f35182c;
                r7i0Var2.mo32673a(s9p0Var2);
                return new b8c(r7i0Var2, s9p0Var2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8c(s9p0 s9p0Var, r7i0 r7i0Var) {
        super(1);
        this.f35182c = s9p0Var;
        this.f35181b = r7i0Var;
    }
}
