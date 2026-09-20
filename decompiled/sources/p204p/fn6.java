package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fn6 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71192a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jn6 f71193b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Throwable f71194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fn6(jn6 jn6Var, Throwable th, int i) {
        super(0);
        this.f71192a = i;
        this.f71193b = jn6Var;
        this.f71194c = th;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f71192a) {
            case 0:
                this.f71193b.f114025d.add(this.f71194c);
                break;
            default:
                this.f71193b.f114022a.mo53809c(this.f71194c);
                break;
        }
        return w2a1.f247311a;
    }
}
