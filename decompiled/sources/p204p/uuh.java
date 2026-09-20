package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uuh extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f234200a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f234201b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ phb f234202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uuh(gh00 gh00Var, phb phbVar, int i) {
        super(0);
        this.f234200a = i;
        this.f234201b = gh00Var;
        this.f234202c = phbVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f234200a) {
            case 0:
                this.f234201b.invoke(((nhb) this.f234202c).f153916b);
                break;
            default:
                this.f234201b.invoke(((hhb) this.f234202c).f91323b);
                break;
        }
        return w2a1.f247311a;
    }
}
