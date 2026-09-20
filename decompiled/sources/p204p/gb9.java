package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gb9 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78236a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f78237b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f78238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gb9(Object obj, long j, int i) {
        super(0);
        this.f78236a = i;
        this.f78238c = obj;
        this.f78237b = j;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f78236a) {
            case 0:
                ((jb9) this.f78238c).m52877a(this.f78237b);
                break;
            case 1:
                lfw lfwVar = (lfw) this.f78238c;
                om0 om0Var = lfwVar.f133022u1;
                qm0 qm0Var = qm0.IMPRESSION;
                dt0 dt0Var = lfwVar.f133021t1;
                f0p0.m40496W(lfwVar, om0Var, qm0Var, dt0Var.f52681a, Long.valueOf(this.f78237b), null, dt0Var.f52683c, 8);
                break;
            default:
                n6s0 n6s0Var = (n6s0) this.f78238c;
                n6s0Var.m40499V(n6s0Var.f150949u1, qm0.PROGRESS, n6s0Var.f150947s1.f52681a, Long.valueOf(this.f78237b), n6s0Var.f150948t1.f62535a.f277862d, n6s0Var.f150947s1.f52683c);
                break;
        }
        return w2a1.f247311a;
    }
}
