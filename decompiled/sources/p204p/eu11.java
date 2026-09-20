package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eu11 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62851a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vu11 f62852b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gu11 f62853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eu11(vu11 vu11Var, gu11 gu11Var, int i) {
        super(0);
        this.f62851a = i;
        this.f62852b = vu11Var;
        this.f62853c = gu11Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, p.eh00] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, p.eh00] */
    @Override // p204p.eh00
    public final Object invoke() {
        t9p0 t9p0Var;
        t9p0 t9p0Var2;
        switch (this.f62851a) {
            case 0:
                s9p0 s9p0Var = this.f62852b.f244829p;
                if (s9p0Var != null && (t9p0Var = (t9p0) this.f62853c.f84344j.invoke()) != null) {
                    t9p0Var.mo32673a(s9p0Var);
                }
                break;
            default:
                s9p0 s9p0Var2 = this.f62852b.f244829p;
                if (s9p0Var2 != null && (t9p0Var2 = (t9p0) this.f62853c.f84344j.invoke()) != null) {
                    t9p0Var2.mo32674b(s9p0Var2);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
