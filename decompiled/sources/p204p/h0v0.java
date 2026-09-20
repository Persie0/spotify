package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h0v0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f86358a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f86359b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f86360c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f86361d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0v0(boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.f86358a = z;
        this.f86359b = z2;
        this.f86360c = z3;
        this.f86361d = z4;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        n0v0 n0v0Var = (n0v0) obj;
        boolean z = this.f86358a || this.f86359b || this.f86360c;
        String str = n0v0Var.f149183b;
        gn80[] gn80VarArr = tgv.f220263a;
        if (((str != null ? xoc1.f263950O.m83613a(str) : false) && z) || (tgv.m80786g(str) && this.f86361d)) {
            return str;
        }
        return null;
    }
}
