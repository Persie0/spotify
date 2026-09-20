package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f8q extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ey9 f67030b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n631 f67031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f8q(ey9 ey9Var, n631 n631Var, int i) {
        super(1);
        this.f67029a = i;
        this.f67030b = ey9Var;
        this.f67031c = n631Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f67029a) {
            case 0:
                this.f67030b.mo40292b();
                o631 o631Var = new o631("Failed to read SnackBar action text from SnackBarConfiguration.", (Throwable) obj, this.f67031c);
                na6.m63959g(o631Var.f162198a, o631Var);
                break;
            default:
                this.f67030b.mo40292b();
                o631 o631Var2 = new o631("Failed to read SnackBar message from SnackBarConfiguration.", (Throwable) obj, this.f67031c);
                na6.m63959g(o631Var2.f162198a, o631Var2);
                break;
        }
        return w2a1.f247311a;
    }
}
