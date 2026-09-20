package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class by9 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32110a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j15 f32111b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f32112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ by9(j15 j15Var, eh00 eh00Var, int i) {
        super(1);
        this.f32110a = i;
        this.f32111b = j15Var;
        this.f32112c = eh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f32110a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                if (((i15) g6f.m43745s0(this.f32111b.m52114c(iIntValue, iIntValue, "SIGN_UP"))) != null) {
                    this.f32112c.invoke();
                }
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                if (((i15) g6f.m43745s0(this.f32111b.m52114c(iIntValue2, iIntValue2, "settings_link"))) != null) {
                    this.f32112c.invoke();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
