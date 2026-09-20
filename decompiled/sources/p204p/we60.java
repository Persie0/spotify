package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class we60 extends g50 {

    /* JADX INFO: renamed from: L0 */
    public static final we60 f250456L0;

    /* JADX INFO: renamed from: M0 */
    public static final we60 f250457M0;

    /* JADX INFO: renamed from: X */
    public static final we60 f250459X;

    /* JADX INFO: renamed from: Y */
    public static final we60 f250460Y;

    /* JADX INFO: renamed from: Z */
    public static final we60 f250461Z;

    /* JADX INFO: renamed from: f */
    public static final we60 f250463f;

    /* JADX INFO: renamed from: g */
    public static final we60 f250464g;

    /* JADX INFO: renamed from: h */
    public static final we60 f250465h;

    /* JADX INFO: renamed from: i */
    public static final we60 f250466i;

    /* JADX INFO: renamed from: t */
    public static final we60 f250467t;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f250468d;

    /* JADX INFO: renamed from: e */
    public static final we60 f250462e = new we60("package", false, 0);

    /* JADX INFO: renamed from: N0 */
    public static final we60 f250458N0 = new we60("unknown", false, 11);

    static {
        boolean z = true;
        f250463f = new we60("protected_and_package", z, 1);
        f250464g = new we60("protected_static", z, 2);
        boolean z2 = false;
        f250465h = new we60("inherited", z2, 3);
        f250466i = new we60("internal", z2, 4);
        f250467t = new we60("invisible_fake", z2, 5);
        f250459X = new we60("local", z2, 6);
        f250460Y = new we60("private", z2, 7);
        f250461Z = new we60("private_to_this", z2, 8);
        boolean z3 = true;
        f250456L0 = new we60("protected", z3, 9);
        f250457M0 = new we60("public", z3, 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we60(String str, boolean z, int i) {
        super(str, z, 2);
        this.f250468d = i;
    }

    @Override // p204p.g50
    /* JADX INFO: renamed from: a */
    public Integer mo43564a(g50 g50Var) {
        int i = this.f250468d;
        we60 we60Var = f250461Z;
        we60 we60Var2 = f250460Y;
        switch (i) {
            case 0:
                if (this == g50Var) {
                    return 0;
                }
                mec0 mec0Var = wpc1.f253742a;
                return g50Var == we60Var2 || g50Var == we60Var ? 1 : -1;
            case 1:
                if (equals(g50Var)) {
                    return 0;
                }
                if (g50Var == f250466i) {
                    return null;
                }
                mec0 mec0Var2 = wpc1.f253742a;
                return g50Var == we60Var2 || g50Var == we60Var ? 1 : -1;
            default:
                return super.mo43564a(g50Var);
        }
    }

    @Override // p204p.g50
    /* JADX INFO: renamed from: d */
    public String mo43567d() {
        switch (this.f250468d) {
            case 0:
                return "public/*package*/";
            case 1:
                return "protected/*protected and package*/";
            case 2:
                return "protected/*protected static*/";
            case 8:
                return "private/*private to this*/";
            default:
                return super.mo43567d();
        }
    }

    @Override // p204p.g50
    /* JADX INFO: renamed from: k */
    public g50 mo43574k() {
        switch (this.f250468d) {
            case 0:
                return f250456L0;
            case 1:
                return f250456L0;
            case 2:
                return f250456L0;
            default:
                return this;
        }
    }
}
