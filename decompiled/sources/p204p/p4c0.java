package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class p4c0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f173891a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p7x0 f173892b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4c0(p7x0 p7x0Var, int i) {
        super(2);
        this.f173891a = i;
        this.f173892b = p7x0Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f173891a) {
            case 0:
                toq toqVar = new toq((String) obj);
                this.f173892b.mo25060a(toqVar, (String) obj2);
                break;
            case 1:
                xv10 xv10Var = new xv10((String) obj);
                this.f173892b.mo25060a(xv10Var, (String) obj2);
                break;
            case 2:
                xv10 xv10Var2 = new xv10((String) obj, ss10.f213452b);
                this.f173892b.mo25060a(xv10Var2, (String) obj2);
                break;
            case 3:
                toq toqVar2 = new toq((String) obj);
                this.f173892b.mo25060a(toqVar2, (String) obj2);
                break;
            case 4:
                xv10 xv10Var3 = new xv10((String) obj);
                this.f173892b.mo25060a(xv10Var3, (String) obj2);
                break;
            default:
                xv10 xv10Var4 = new xv10((String) obj, ss10.f213452b);
                this.f173892b.mo25060a(xv10Var4, (String) obj2);
                break;
        }
        return w2a1.f247311a;
    }
}
