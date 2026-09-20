package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tbd1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f218827a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s9p0 f218828b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f218829c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ eh00 f218830d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tbd1(s9p0 s9p0Var, kqi0 kqi0Var, eh00 eh00Var, int i) {
        super(0);
        this.f218827a = i;
        this.f218828b = s9p0Var;
        this.f218829c = kqi0Var;
        this.f218830d = eh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        t9p0 t9p0Var;
        t9p0 t9p0Var2;
        switch (this.f218827a) {
            case 0:
                this.f218829c.setValue(Boolean.TRUE);
                s9p0 s9p0Var = this.f218828b;
                if (s9p0Var != null && (t9p0Var = (t9p0) this.f218830d.invoke()) != null) {
                    t9p0Var.mo32673a(s9p0Var);
                }
                break;
            default:
                this.f218829c.setValue(Boolean.FALSE);
                s9p0 s9p0Var2 = this.f218828b;
                if (s9p0Var2 != null && (t9p0Var2 = (t9p0) this.f218830d.invoke()) != null) {
                    t9p0Var2.mo32674b(s9p0Var2);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
