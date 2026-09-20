package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dz50 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ez50 f54535b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ iz50 f54536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dz50(ez50 ez50Var, iz50 iz50Var, int i) {
        super(0);
        this.f54534a = i;
        this.f54535b = ez50Var;
        this.f54536c = iz50Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f54534a) {
            case 0:
                ((bd31) this.f54535b.f64276a).f26005p.onNext(new sh31(this.f54536c));
                break;
            default:
                ((bd31) this.f54535b.f64276a).f26005p.onNext(new ei31(this.f54536c));
                break;
        }
        return w2a1.f247311a;
    }
}
