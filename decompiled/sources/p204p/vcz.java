package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vcz extends qe70 implements hh00 {

    /* JADX INFO: renamed from: b */
    public static final vcz f240279b;

    /* JADX INFO: renamed from: c */
    public static final vcz f240280c;

    /* JADX INFO: renamed from: d */
    public static final vcz f240281d;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f240282a;

    static {
        int i = 11;
        f240279b = new vcz(i, 0);
        f240280c = new vcz(i, 1);
        f240281d = new vcz(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vcz(int i, int i2) {
        super(i);
        this.f240282a = i2;
    }

    @Override // p204p.hh00
    /* JADX INFO: renamed from: p */
    public final Object mo38486p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        n3e0 n3e0Var;
        switch (this.f240282a) {
            case 0:
                pob pobVar = (pob) obj11;
                return new vko((v140) obj, (erc1) obj2, (daj) obj3, (jcl0) obj4, (y7t0) obj5, (bob1) obj6, (String) obj7, (String) obj8, (String) obj9, (uu41) obj10, pobVar != null ? pobVar.f179667e.contains(b5x0.f23781b) : false);
            case 1:
                f5r0 f5r0Var = (f5r0) obj;
                x430 x430Var = (x430) obj2;
                v140 v140Var = (v140) obj3;
                yfj yfjVar = (yfj) obj4;
                f5r0 f5r0Var2 = (f5r0) obj7;
                erc1 erc1Var = (erc1) obj8;
                e4e0 e4e0Var = new e4e0(f5r0Var, x430Var, v140Var, yfjVar, (erc1) obj5, (p9c1) obj6, (ok11) obj9, erc1Var, (g0w) obj10, (thj) obj11);
                if (x430Var != null) {
                    n3e0Var = new n3e0(f5r0Var2 == null ? f5r0Var : f5r0Var2, x430Var, v140Var, yfjVar, erc1Var);
                } else {
                    n3e0Var = null;
                }
                return new n1e0(e4e0Var, n3e0Var);
            default:
                return new uko((v140) obj, (erc1) obj2, (daj) obj3, (jcl0) obj4, (y7t0) obj5, (byv) obj6, (uff0) obj7, (uy80) obj8, (bob1) obj9, (thj) obj10, (Boolean) obj11);
        }
    }
}
