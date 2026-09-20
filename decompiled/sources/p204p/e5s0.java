package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e5s0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56462a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f5s0 f56463b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e5s0(f5s0 f5s0Var, int i) {
        super(1);
        this.f56462a = i;
        this.f56463b = f5s0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f56462a) {
            case 0:
                c5s0 c5s0Var = (c5s0) obj;
                this.f56463b.getClass();
                a5s0 a5s0Var = c5s0Var instanceof a5s0 ? (a5s0) c5s0Var : null;
                if (a5s0Var != null) {
                    return a5s0Var.f12594a;
                }
                return null;
            default:
                c5s0 c5s0Var2 = (c5s0) obj;
                this.f56463b.getClass();
                b5s0 b5s0Var = c5s0Var2 instanceof b5s0 ? (b5s0) c5s0Var2 : null;
                if (b5s0Var != null) {
                    return b5s0Var.f23689a;
                }
                return null;
        }
    }
}
