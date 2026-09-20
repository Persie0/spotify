package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ks80 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125866a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hs80 f125867b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f125868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks80(gh00 gh00Var, hs80 hs80Var) {
        super(0);
        this.f125868c = gh00Var;
        this.f125867b = hs80Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f125866a) {
            case 0:
                this.f125868c.invoke(new jr80(((es80) this.f125867b).f62307a.f212768a));
                break;
            default:
                ur80 ur80Var = (ur80) this.f125867b;
                ur80Var.f233276b.getClass();
                this.f125868c.invoke(new jr80(ur80Var.f233276b.f212768a));
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks80(hs80 hs80Var, gh00 gh00Var) {
        super(0);
        this.f125867b = hs80Var;
        this.f125868c = gh00Var;
    }
}
