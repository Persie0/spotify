package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mkp extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f144620a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eo50 f144621b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pkp f144622c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mkp(eo50 eo50Var, pkp pkpVar, int i) {
        super(1);
        this.f144620a = i;
        this.f144621b = eo50Var;
        this.f144622c = pkpVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f144620a) {
            case 0:
                this.f144622c.f178503d.m82453a(this.f144621b.mo39546s(), false);
                break;
            case 1:
                this.f144621b.mo39544f();
                ((mcq) this.f144622c.f178501b).m61470e();
                break;
            default:
                this.f144621b.mo39545p();
                ((mcq) this.f144622c.f178501b).m61470e();
                break;
        }
        return w2a1.f247311a;
    }
}
