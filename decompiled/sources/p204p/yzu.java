package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yzu extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f277897a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f277898b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ko70 f277899c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f277900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzu(long j, boolean z, ko70 ko70Var, boolean z2) {
        super(1);
        this.f277897a = j;
        this.f277898b = z;
        this.f277899c = ko70Var;
        this.f277900d = z2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ges gesVar = (ges) obj;
        float f = (int) (this.f277897a >> 32);
        boolean z = this.f277898b;
        ko70 ko70Var = this.f277899c;
        if (z) {
            gesVar.m44522a(fcs.f68249a, ufc1.m82978u(f * 0.45f, ko70Var));
        }
        gesVar.m44522a(fcs.f68250b, 0.0f);
        if (this.f277900d) {
            gesVar.m44522a(fcs.f68251c, ufc1.m82978u((-f) * 0.45f, ko70Var));
        }
        return w2a1.f247311a;
    }
}
