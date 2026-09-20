package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class iv8 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f106169a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nv8 f106170b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iv8(nv8 nv8Var, int i) {
        super(0);
        this.f106169a = i;
        this.f106170b = nv8Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f106169a) {
            case 0:
                nv8 nv8Var = this.f106170b;
                fw8 fw8Var = nv8Var.f158835i;
                if (fw8Var != null) {
                    fw8Var.m42953a();
                }
                nv8Var.f158835i = null;
                break;
            default:
                nv8 nv8Var2 = this.f106170b;
                fw8 fw8Var2 = nv8Var2.f158835i;
                if (fw8Var2 != null) {
                    fw8Var2.m42953a();
                }
                nv8Var2.f158835i = null;
                break;
        }
        return w2a1.f247311a;
    }
}
