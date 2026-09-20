package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class klu0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f123953a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qlu0 f123954b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ klu0(qlu0 qlu0Var, int i) {
        super(0);
        this.f123953a = i;
        this.f123954b = qlu0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f123953a) {
            case 0:
                qlu0 qlu0Var = this.f123954b;
                qlu0Var.f189925b.m55708u(0, "all");
                qlu0Var.f189930g.invoke(new kku0(0));
                break;
            case 1:
                this.f123954b.f189930g.invoke(gku0.f80915a);
                break;
            default:
                this.f123954b.f189930g.invoke(eku0.f60538a);
                break;
        }
        return w2a1.f247311a;
    }
}
