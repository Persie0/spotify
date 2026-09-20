package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class cny0 {

    /* JADX INFO: renamed from: a */
    public final omy0 f40129a;

    /* JADX INFO: renamed from: b */
    public final xuk f40130b;

    /* JADX INFO: renamed from: c */
    public final gyc f40131c;

    /* JADX INFO: renamed from: d */
    public di41 f40132d;

    /* JADX INFO: renamed from: e */
    public final bqa f40133e = xtm0.m92080a(-1, 0, 6);

    public cny0(yw70 yw70Var, xuk xukVar, gyc gycVar) {
        this.f40129a = yw70Var;
        this.f40130b = xukVar;
        this.f40131c = gycVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [p.eh00] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r4v10, types: [p.gh00, p.mb61] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [p.qe70, p.xmy0] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ee -> B:19:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0132 -> B:56:0x0133). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m33473a(p204p.cny0 r22, p204p.ibk r23) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.cny0.m33473a(p.cny0, p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33474b(xmy0 xmy0Var, float f, eh00 eh00Var, gh00 gh00Var) {
        boolean zMo28416c;
        int iOrdinal = xmy0Var.ordinal();
        omy0 omy0Var = this.f40129a;
        if (iOrdinal == 0) {
            zMo28416c = omy0Var.mo28416c();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            zMo28416c = omy0Var.mo28417d();
        }
        if (!zMo28416c) {
            return false;
        }
        if (this.f40132d == null) {
            this.f40132d = x0h1.m89578u(this.f40130b, null, 0, new any0(this, null, 0), 3);
        }
        this.f40133e.mo30231j(new ymy0(xmy0Var, f, eh00Var, gh00Var));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (p204p.qlg1.m73213r(r6, r0) == r4) goto L23;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m33475c(ibk ibkVar) {
        bny0 bny0Var;
        if (ibkVar instanceof bny0) {
            bny0Var = (bny0) ibkVar;
            int i = bny0Var.f28945c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bny0Var.f28945c = i - Integer.MIN_VALUE;
            } else {
                bny0Var = new bny0(this, ibkVar);
            }
        } else {
            bny0Var = new bny0(this, ibkVar);
        }
        Object obj = bny0Var.f28943a;
        int i2 = bny0Var.f28945c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            ymy0 ymy0Var = ymy0.f274351e;
            bny0Var.f28945c = 1;
            if (this.f40133e.mo30229d(ymy0Var, bny0Var) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        this.f40132d = null;
        return w2a1.f247311a;
        di41 di41Var = this.f40132d;
        if (di41Var != null) {
            bny0Var.f28945c = 2;
        }
        this.f40132d = null;
        return w2a1.f247311a;
    }
}
