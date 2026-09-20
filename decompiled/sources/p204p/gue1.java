package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gue1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f84463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mue1 f84464b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gue1(mue1 mue1Var, int i) {
        super(1);
        this.f84463a = i;
        this.f84464b = mue1Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f84463a) {
            case 0:
                String str = (String) obj;
                z9j0 z9j0Var = this.f84464b.f147331j;
                if (str == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                z9j0Var.mo63651f(new p6j0(str, "", false, false, 0, 0, false, null, null, null));
                return w2a1.f247311a;
            default:
                String str2 = (String) obj;
                z9j0 z9j0Var2 = this.f84464b.f147331j;
                if (str2 == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                z9j0Var2.mo63651f(new p6j0(str2, "", false, false, 0, 0, false, null, null, null));
                return w2a1.f247311a;
        }
    }
}
