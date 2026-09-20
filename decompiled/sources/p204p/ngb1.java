package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ngb1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153634a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s9p0 f153635b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f153636c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e651 f153637d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ngb1(s9p0 s9p0Var, kqi0 kqi0Var, e651 e651Var, int i) {
        super(0);
        this.f153634a = i;
        this.f153635b = s9p0Var;
        this.f153636c = kqi0Var;
        this.f153637d = e651Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        t9p0 t9p0Var;
        t9p0 t9p0Var2;
        switch (this.f153634a) {
            case 0:
                this.f153636c.setValue(Boolean.TRUE);
                s9p0 s9p0Var = this.f153635b;
                if (s9p0Var != null && (t9p0Var = (t9p0) this.f153637d.invoke()) != null) {
                    t9p0Var.mo32673a(s9p0Var);
                }
                break;
            default:
                this.f153636c.setValue(Boolean.FALSE);
                s9p0 s9p0Var2 = this.f153635b;
                if (s9p0Var2 != null && (t9p0Var2 = (t9p0) this.f153637d.invoke()) != null) {
                    t9p0Var2.mo32674b(s9p0Var2);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
