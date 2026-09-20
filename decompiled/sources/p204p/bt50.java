package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bt50 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30515a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pv91 f30516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bt50(pv91 pv91Var, int i) {
        super(1);
        this.f30515a = i;
        this.f30516b = pv91Var;
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v20, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v28, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v8, types: [p.gh00, p.qe70] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f30515a) {
            case 0:
                ((Number) obj).intValue();
                return this.f30516b.mo24361d();
            case 1:
                ((Number) obj).intValue();
                return this.f30516b.mo24361d();
            case 2:
                return (av91) ((j701) obj).f109458b.invoke(this.f30516b);
            case 3:
                return (av91) ((o701) obj).f162446b.invoke(this.f30516b);
            case 4:
                return (av91) ((l701) obj).f130528b.invoke(this.f30516b);
            case 5:
                return (av91) ((j701) obj).f109459c.invoke(this.f30516b);
            case 6:
                return (av91) gxz0.f85380Z0.invoke(this.f30516b);
            default:
                return (av91) ((l701) obj).f130529c.invoke(this.f30516b);
        }
    }
}
