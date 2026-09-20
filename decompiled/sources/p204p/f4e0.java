package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f4e0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ th00 f65769b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ezs0 f65770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4e0(th00 th00Var, ezs0 ezs0Var, int i) {
        super(1);
        this.f65768a = i;
        this.f65769b = th00Var;
        this.f65770c = ezs0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f65768a) {
            case 0:
                String str = this.f65770c.f64459a;
                this.f65769b.invoke(str, (String) obj);
                break;
            case 1:
                String str2 = this.f65770c.f64459a;
                this.f65769b.invoke(str2, (String) obj);
                break;
            case 2:
                String str3 = this.f65770c.f64459a;
                this.f65769b.invoke(str3, (String) obj);
                break;
            default:
                ezs0 ezs0Var = this.f65770c;
                this.f65769b.invoke(ezs0Var.f64459a, ezs0Var.f64462d);
                break;
        }
        return w2a1.f247311a;
    }
}
