package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kag extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f120896a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f120897b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lnk f120898c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kag(gh00 gh00Var, lnk lnkVar, int i) {
        super(0);
        this.f120896a = i;
        this.f120897b = gh00Var;
        this.f120898c = lnkVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f120896a) {
            case 0:
                this.f120897b.invoke(new ink(this.f120898c.f135175a));
                break;
            default:
                this.f120897b.invoke(new jnk(this.f120898c.f135175a));
                break;
        }
        return w2a1.f247311a;
    }
}
