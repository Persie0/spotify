package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m4p extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f139999a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f140000b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cxd f140001c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4p(gh00 gh00Var, cxd cxdVar, int i) {
        super(0);
        this.f139999a = i;
        this.f140000b = gh00Var;
        this.f140001c = cxdVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f139999a) {
            case 0:
                this.f140000b.invoke(new xwd(((dh60) this.f140001c.f42983a).f48991a));
                break;
            case 1:
                this.f140000b.invoke(new zwd(((fh60) this.f140001c.f42983a).f69590a));
                break;
            case 2:
                this.f140000b.invoke(new wwd(((bh60) this.f140001c.f42983a).f27091a));
                break;
            default:
                eh60 eh60Var = (eh60) this.f140001c.f42983a;
                this.f140000b.invoke(new ywd(eh60Var.f59506a, eh60Var.f59507b));
                break;
        }
        return w2a1.f247311a;
    }
}
