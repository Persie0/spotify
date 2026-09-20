package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b5e0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23567a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yb9 f23568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5e0(yb9 yb9Var, int i) {
        super(1);
        this.f23567a = i;
        this.f23568b = yb9Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f23567a) {
            case 0:
                return yyg1.m94891B((String) obj, this.f23568b);
            default:
                return yyg1.m94891B(((String) obj).replace(' ', (char) 160), this.f23568b);
        }
    }
}
