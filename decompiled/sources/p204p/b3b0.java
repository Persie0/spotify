package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class b3b0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d3b0 f23009a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f23010b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f23011c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ v5o0 f23012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3b0(d3b0 d3b0Var, long j, long j2, v5o0 v5o0Var) {
        super(0);
        this.f23009a = d3b0Var;
        this.f23010b = j;
        this.f23011c = j2;
        this.f23012d = v5o0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        d3b0 d3b0Var = this.f23009a;
        d3b0Var.m34815A0().f11910a = false;
        d3b0Var.m34815A0().f11911b = this.f23010b;
        d3b0Var.m34815A0().f11912c = this.f23011c;
        gh00 gh00VarMo31376e = this.f23012d.f237541a.mo31376e();
        if (gh00VarMo31376e != null) {
            gh00VarMo31376e.invoke(d3b0Var.m34815A0());
        }
        return w2a1.f247311a;
    }
}
