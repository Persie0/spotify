package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nvx extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f158975a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zh50 f158976b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nvx(zh50 zh50Var, int i) {
        super(1);
        this.f158975a = i;
        this.f158976b = zh50Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f158975a) {
            case 0:
                q381 q381Var = this.f158976b.f282812e;
                if (q381Var != null) {
                    q381Var.mo33779a();
                }
                break;
            default:
                q381 q381Var2 = this.f158976b.f282812e;
                if (q381Var2 != null) {
                    q381Var2.mo33780c();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
