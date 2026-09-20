package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public final class ql70 {

    /* JADX INFO: renamed from: a */
    public final hc80 f189749a;

    /* JADX INFO: renamed from: b */
    public final er70 f189750b;

    /* JADX INFO: renamed from: c */
    public final ll70 f189751c;

    /* JADX INFO: renamed from: d */
    public final wg61 f189752d = new wg61(new ag70(this, 4));

    /* JADX INFO: renamed from: e */
    public final String f189753e = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: f */
    public xuk f189754f;

    /* JADX INFO: renamed from: g */
    public di41 f189755g;

    /* JADX INFO: renamed from: h */
    public lg21 f189756h;

    /* JADX INFO: renamed from: i */
    public String f189757i;

    /* JADX INFO: renamed from: j */
    public boolean f189758j;

    /* JADX INFO: renamed from: k */
    public final zv41 f189759k;

    /* JADX INFO: renamed from: l */
    public final zv41 f189760l;

    public ql70(hc80 hc80Var, er70 er70Var, ll70 ll70Var) {
        this.f189749a = hc80Var;
        this.f189750b = er70Var;
        this.f189751c = ll70Var;
        zv41 zv41VarM52819d = jag1.m52819d(pcr0.f176217a);
        this.f189759k = zv41VarM52819d;
        this.f189760l = zv41VarM52819d;
        x0h1.m89578u(n5h1.m63737m(hc80Var), null, 0, new q950(this, null, 14), 3);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0068 -> B:22:0x006b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m73162a(p204p.ql70 r7, p204p.r7i0 r8, p204p.ibk r9) {
        /*
            p.wg61 r0 = r7.f189752d
            boolean r1 = r9 instanceof p204p.ol70
            if (r1 == 0) goto L15
            r1 = r9
            p.ol70 r1 = (p204p.ol70) r1
            int r2 = r1.f166779f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f166779f = r2
            goto L1a
        L15:
            p.ol70 r1 = new p.ol70
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f166777d
            int r2 = r1.f166779f
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            int r8 = r1.f166776c
            int r2 = r1.f166775b
            p.r7i0 r4 = r1.f166774a
            p204p.bga.m29073P(r9)
            r9 = r4
            goto L6b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            p204p.bga.m29073P(r9)
            r9 = 0
            r2 = 3
            r6 = r9
            r9 = r8
            r8 = r6
        L3e:
            if (r8 >= r2) goto L6d
            java.lang.Object r4 = r0.getValue()
            p.s9p0 r4 = (p204p.s9p0) r4
            r9.mo32673a(r4)
            java.lang.Object r4 = r0.getValue()
            p.s9p0 r4 = (p204p.s9p0) r4
            p.lg21 r5 = r7.f189756h
            p.lg21 r4 = p204p.dv9.m37072u(r4, r5)
            if (r4 == 0) goto L58
            return r4
        L58:
            r1.f166774a = r9
            r1.f166775b = r2
            r1.f166776c = r8
            r1.f166779f = r3
            r4 = 200(0xc8, double:9.9E-322)
            java.lang.Object r4 = p204p.njg1.m64619l(r4, r1)
            p.yuk r5 = p204p.yuk.f276404a
            if (r4 != r5) goto L6b
            return r5
        L6b:
            int r8 = r8 + r3
            goto L3e
        L6d:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ql70.m73162a(p.ql70, p.r7i0, p.ibk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final void m73163b(ql70 ql70Var, lg21 lg21Var, ibk ibkVar) {
        pl70 pl70Var;
        if (ibkVar instanceof pl70) {
            pl70Var = (pl70) ibkVar;
            int i = pl70Var.f178658c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pl70Var.f178658c = i - Integer.MIN_VALUE;
            } else {
                pl70Var = new pl70(ql70Var, ibkVar);
            }
        } else {
            pl70Var = new pl70(ql70Var, ibkVar);
        }
        Object obj = pl70Var.f178656a;
        int i2 = pl70Var.f178658c;
        if (i2 != 0) {
            if (i2 == 1) {
                throw edb.m38575x(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        zv41 zv41Var = lg21Var.f133060f;
        ylz ylzVar = new ylz(25, ql70Var, lg21Var);
        pl70Var.f178658c = 1;
        zv41Var.collect(ylzVar, pl70Var);
    }

    /* JADX INFO: renamed from: c */
    public static final void m73164c(ql70 ql70Var, lg21 lg21Var) {
        ql70Var.f189757i = null;
        ql70Var.f189758j = false;
        zv41 zv41Var = ql70Var.f189759k;
        zv41Var.getClass();
        zv41Var.m97091m(null, pcr0.f176217a);
        lg21Var.m58925c();
    }

    /* JADX INFO: renamed from: d */
    public final void m73165d(lg21 lg21Var) {
        di41 di41Var = null;
        if (this.f189756h != lg21Var) {
            di41 di41Var2 = this.f189755g;
            if (di41Var2 != null) {
                di41Var2.mo26601e(null);
            }
            this.f189755g = null;
            this.f189756h = lg21Var;
        }
        if (lg21Var == null || this.f189755g != null) {
            return;
        }
        xuk xukVar = this.f189754f;
        this.f189755g = xukVar != null ? x0h1.m89578u(xukVar, null, 0, new n860(this, lg21Var, di41Var, 8), 3) : null;
    }

    /* JADX INFO: renamed from: e */
    public final void m73166e() {
        this.f189757i = null;
        this.f189758j = false;
        zv41 zv41Var = this.f189759k;
        zv41Var.getClass();
        zv41Var.m97091m(null, pcr0.f176217a);
        lg21 lg21Var = this.f189756h;
        if (lg21Var != null) {
            lg21Var.m58932k();
        }
        lg21 lg21Var2 = this.f189756h;
        if (lg21Var2 != null) {
            lg21Var2.m58925c();
        }
    }
}
