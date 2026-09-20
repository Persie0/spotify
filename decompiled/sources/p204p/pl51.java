package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pl51 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f178645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ew31 f178646b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f178647c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f178648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl51(ew31 ew31Var, String str, gh00 gh00Var, int i) {
        super(2);
        this.f178645a = i;
        this.f178646b = ew31Var;
        this.f178647c = str;
        this.f178648d = gh00Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f178645a) {
            case 0:
                g15 g15Var = (g15) obj;
                String str = (String) obj2;
                gh00 gh00Var = this.f178648d;
                String str2 = this.f178647c;
                ew31 ew31Var = this.f178646b;
                if (ew31Var != null) {
                    vie.m85608a(g15Var, str, str2, ew31Var, gh00Var);
                } else {
                    vie.m85608a(g15Var, str, str2, vie.f241686a, gh00Var);
                }
                break;
            default:
                g15 g15Var2 = (g15) obj;
                String str3 = (String) obj2;
                gh00 gh00Var2 = this.f178648d;
                String str4 = this.f178647c;
                ew31 ew31Var2 = this.f178646b;
                if (ew31Var2 != null) {
                    vie.m85610c(g15Var2, str3, str4, ew31Var2, gh00Var2);
                } else {
                    vie.m85610c(g15Var2, str3, str4, vie.f241686a, gh00Var2);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
