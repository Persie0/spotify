package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class c3g1 {

    /* JADX INFO: renamed from: a */
    public final t0f1 f33677a;

    /* JADX INFO: renamed from: c */
    public long f33679c;

    /* JADX INFO: renamed from: e */
    public boolean f33681e;

    /* JADX INFO: renamed from: f */
    public guf f33682f;

    /* JADX INFO: renamed from: g */
    public final okj0 f33683g;

    /* JADX INFO: renamed from: b */
    public hkr0 f33678b = hkr0.f92491Z0;

    /* JADX INFO: renamed from: d */
    public final lsi0 f33680d = msi0.m62770a();

    public c3g1(okj0 okj0Var, t0f1 t0f1Var) {
        this.f33683g = okj0Var;
        this.f33677a = t0f1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m31384d(c3g1 c3g1Var, ibk ibkVar) throws Throwable {
        a2g1 a2g1Var;
        if (ibkVar instanceof a2g1) {
            a2g1Var = (a2g1) ibkVar;
            int i = a2g1Var.f11674c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a2g1Var.f11674c = i - Integer.MIN_VALUE;
            } else {
                a2g1Var = new a2g1(c3g1Var, ibkVar);
            }
        } else {
            a2g1Var = new a2g1(c3g1Var, ibkVar);
        }
        Object obj = a2g1Var.f11672a;
        int i2 = a2g1Var.f11674c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        long j = c3g1Var.f33679c;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        if (b == 3) {
            guf gufVarM81018q = tkf1.m81018q(c3g1Var.f33677a.m79785a(new m2f1(j)));
            a2g1Var.f11674c = 1;
            Object objM38777P = gufVarM81018q.m38777P(a2g1Var);
            yuk yukVar = yuk.f276404a;
            return objM38777P == yukVar ? yukVar : objM38777P;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r8 == r5) goto L31;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m31387g(c3g1 c3g1Var, String str, ibk ibkVar) throws Throwable {
        j2g1 j2g1Var;
        if (ibkVar instanceof j2g1) {
            j2g1Var = (j2g1) ibkVar;
            int i = j2g1Var.f108073c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j2g1Var.f108073c = i - Integer.MIN_VALUE;
            } else {
                j2g1Var = new j2g1(c3g1Var, ibkVar);
            }
        } else {
            j2g1Var = new j2g1(c3g1Var, ibkVar);
        }
        Object objM38777P = j2g1Var.f108071a;
        int i2 = j2g1Var.f108073c;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                str = j2g1Var.f108074d;
                bga.m29073P(objM38777P);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM38777P);
            }
            return ((f1f1) objM38777P).f64888a;
        }
        bga.m29073P(objM38777P);
        guf gufVar = c3g1Var.f33682f;
        if (gufVar == null) {
            gufVar = null;
        }
        j2g1Var.f108074d = str;
        j2g1Var.f108073c = 1;
        objM38777P = gufVar.m38777P(j2g1Var);
        if (objM38777P != yukVar) {
        }
        return yukVar;
        g1f1 g1f1Var = (g1f1) objM38777P;
        int i3 = l0f1.f128420h;
        n0f1 n0f1Var = n0f1.f149047Y;
        if (n0f1Var == null) {
            throw new NullPointerException("Null verdictOptOut");
        }
        guf gufVarM81018q = tkf1.m81018q(g1f1Var.m43356a(new s2f1(str, n0f1Var)));
        j2g1Var.f108074d = null;
        j2g1Var.f108073c = 2;
        objM38777P = gufVarM81018q.m38777P(j2g1Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m31389a(long j) {
        this.f33679c = j;
    }

    /* JADX INFO: renamed from: b */
    public final cog1 m31390b() {
        return new cog1(new qt81(this, (fbk) null, 25));
    }
}
