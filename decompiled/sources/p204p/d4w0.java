package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d4w0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45252a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k4w0 f45253b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ry8 f45254c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ v6w0 f45255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4w0(k4w0 k4w0Var, ry8 ry8Var, v6w0 v6w0Var, int i) {
        super(2);
        this.f45252a = i;
        this.f45253b = k4w0Var;
        this.f45254c = ry8Var;
        this.f45255d = v6w0Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f45252a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k4w0.m55407g(this.f45253b, this.f45254c, this.f45255d, xq00Var, 0);
                } else {
                    xq00Var.m91757b0();
                }
                break;
            default:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k4w0.m55407g(this.f45253b, this.f45254c, this.f45255d, xq00Var2, 0);
                } else {
                    xq00Var2.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
