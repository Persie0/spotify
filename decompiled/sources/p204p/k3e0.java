package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k3e0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118866a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f118867b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ezs0 f118868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k3e0(th00 th00Var, ezs0 ezs0Var, int i) {
        super(1);
        this.f118866a = i;
        switch (i) {
            case 1:
                this.f118867b = (qe70) th00Var;
                this.f118868c = ezs0Var;
                super(1);
                break;
            case 2:
                this.f118867b = (qe70) th00Var;
                this.f118868c = ezs0Var;
                super(1);
                break;
            case 3:
                this.f118867b = (qe70) th00Var;
                this.f118868c = ezs0Var;
                super(1);
                break;
            default:
                this.f118867b = (qe70) th00Var;
                this.f118868c = ezs0Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r1v2, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r1v3, types: [p.qe70, p.th00] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f118866a) {
            case 0:
                String str = this.f118868c.f64459a;
                this.f118867b.invoke(str, (String) obj);
                break;
            case 1:
                String str2 = this.f118868c.f64459a;
                this.f118867b.invoke(str2, (String) obj);
                break;
            case 2:
                String str3 = this.f118868c.f64459a;
                this.f118867b.invoke(str3, (String) obj);
                break;
            default:
                String str4 = this.f118868c.f64459a;
                this.f118867b.invoke(str4, (String) obj);
                break;
        }
        return w2a1.f247311a;
    }
}
