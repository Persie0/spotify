package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class sy2 implements w1k {

    /* JADX INFO: renamed from: a */
    public final mb80 f215087a;

    /* JADX INFO: renamed from: b */
    public final vmz f215088b;

    /* JADX INFO: renamed from: c */
    public final luv0 f215089c;

    /* JADX INFO: renamed from: d */
    public final ia70 f215090d;

    /* JADX INFO: renamed from: e */
    public final boolean f215091e;

    /* JADX INFO: renamed from: f */
    public final yse1 f215092f;

    /* JADX INFO: renamed from: g */
    public final lrt0 f215093g;

    /* JADX INFO: renamed from: h */
    public final u010 f215094h;

    /* JADX INFO: renamed from: i */
    public final luk f215095i;

    /* JADX INFO: renamed from: j */
    public final tln f215096j;

    /* JADX INFO: renamed from: k */
    public final wcw0 f215097k;

    /* JADX INFO: renamed from: l */
    public final fiz f215098l;

    /* JADX INFO: renamed from: m */
    public final el6 f215099m;

    /* JADX INFO: renamed from: n */
    public final u7q f215100n;

    /* JADX INFO: renamed from: o */
    public final boolean f215101o;

    /* JADX INFO: renamed from: p */
    public final k9l0 f215102p;

    /* JADX INFO: renamed from: q */
    public final xyx f215103q;

    /* JADX INFO: renamed from: r */
    public final dxk0 f215104r;

    /* JADX INFO: renamed from: s */
    public final kkn f215105s;

    public sy2(mb80 mb80Var, vmz vmzVar, luv0 luv0Var, ia70 ia70Var, boolean z, yse1 yse1Var, lrt0 lrt0Var, u010 u010Var, luk lukVar, tln tlnVar, wcw0 wcw0Var, fiz fizVar, el6 el6Var, u7q u7qVar, boolean z2, k9l0 k9l0Var, xyx xyxVar, dxk0 dxk0Var, kkn kknVar) {
        this.f215087a = mb80Var;
        this.f215088b = vmzVar;
        this.f215089c = luv0Var;
        this.f215090d = ia70Var;
        this.f215091e = z;
        this.f215092f = yse1Var;
        this.f215093g = lrt0Var;
        this.f215094h = u010Var;
        this.f215095i = lukVar;
        this.f215096j = tlnVar;
        this.f215097k = wcw0Var;
        this.f215098l = fizVar;
        this.f215099m = el6Var;
        this.f215100n = u7qVar;
        this.f215101o = z2;
        this.f215102p = k9l0Var;
        this.f215103q = xyxVar;
        this.f215104r = dxk0Var;
        this.f215105s = kknVar;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m79673b(ty2 ty2Var, prt0 prt0Var, int i) {
        boolean zM88271j;
        int iM38547C = edb.m38547C(i);
        if (iM38547C != 1) {
            zM88271j = iM38547C != 2 ? false : wj50.m88271j(ty2Var.f224803a.f271267l, Boolean.TRUE);
        } else {
            zM88271j = true;
        }
        return zM88271j && prt0Var.f180676k.contains(ort0.f168653c);
    }

    @Override // p204p.w1k
    /* JADX INFO: renamed from: a */
    public final Object mo32553a(m6k m6kVar, j6a j6aVar) {
        return x0h1.m89557A(this.f215095i, new fa2(this, (uy2) m6kVar, null, 9), j6aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m79674c(Object obj, gh00 gh00Var, ibk ibkVar) {
        qy2 qy2Var;
        if (ibkVar instanceof qy2) {
            qy2Var = (qy2) ibkVar;
            int i = qy2Var.f193789d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qy2Var.f193789d = i - Integer.MIN_VALUE;
            } else {
                qy2Var = new qy2(this, ibkVar);
            }
        } else {
            qy2Var = new qy2(this, ibkVar);
        }
        Object objM76980u = qy2Var.f193787b;
        int i2 = qy2Var.f193789d;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            ry2 ry2Var = new ry2(gh00Var, null, 0);
            qy2Var.f193786a = obj;
            qy2Var.f193789d = 1;
            objM76980u = s1h1.m76980u(2000L, ry2Var, qy2Var);
            yuk yukVar = yuk.f276404a;
            if (objM76980u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = qy2Var.f193786a;
            bga.m29073P(objM76980u);
        }
        return objM76980u == null ? obj : objM76980u;
    }
}
