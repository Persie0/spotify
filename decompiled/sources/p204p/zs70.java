package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zs70 implements omy0 {

    /* JADX INFO: renamed from: w */
    public static final t9y0 f285859w = l7l.m58436q(new f150(8), new xaf(13));

    /* JADX INFO: renamed from: b */
    public boolean f285861b;

    /* JADX INFO: renamed from: c */
    public qs70 f285862c;

    /* JADX INFO: renamed from: d */
    public final bsa f285863d;

    /* JADX INFO: renamed from: g */
    public float f285866g;

    /* JADX INFO: renamed from: j */
    public lp70 f285869j;

    /* JADX INFO: renamed from: o */
    public final vv70 f285874o;

    /* JADX INFO: renamed from: t */
    public final yum0 f285879t;

    /* JADX INFO: renamed from: u */
    public final yum0 f285880u;

    /* JADX INFO: renamed from: v */
    public final bq70 f285881v;

    /* JADX INFO: renamed from: a */
    public final lnp f285860a = qyg1.m74193h();

    /* JADX INFO: renamed from: e */
    public final yum0 f285864e = sam.m77644A(bt70.f30528a, zhi0.f282936c);

    /* JADX INFO: renamed from: f */
    public final woi0 f285865f = hbg1.m47035f();

    /* JADX INFO: renamed from: h */
    public final r5q f285867h = j0g1.m52096x(new C2245p6(this, 28));

    /* JADX INFO: renamed from: i */
    public final boolean f285868i = true;

    /* JADX INFO: renamed from: k */
    public final xs70 f285870k = new xs70(this, 0);

    /* JADX INFO: renamed from: l */
    public final eb8 f285871l = new eb8();

    /* JADX INFO: renamed from: m */
    public final fv70 f285872m = new fv70();

    /* JADX INFO: renamed from: n */
    public final ae00 f285873n = new ae00(17);

    /* JADX INFO: renamed from: p */
    public final z4y f285875p = new z4y(this, 19);

    /* JADX INFO: renamed from: q */
    public final sv70 f285876q = new sv70();

    /* JADX INFO: renamed from: r */
    public final kqi0 f285877r = pqo0.m70671k();

    /* JADX INFO: renamed from: s */
    public final kqi0 f285878s = pqo0.m70671k();

    public zs70(int i, int i2) {
        this.f285863d = new bsa(i, i2);
        this.f285874o = new vv70(new ie40(this, i, 1));
        Boolean bool = Boolean.FALSE;
        this.f285879t = sam.m77645B(bool);
        this.f285880u = sam.m77645B(bool);
        this.f285881v = new bq70();
    }

    /* JADX INFO: renamed from: f */
    public static Object m96821f(zs70 zs70Var, int i, mb61 mb61Var) {
        zs70Var.getClass();
        Object objMo28414a = zs70Var.mo28414a(xqi0.f265055a, new l92(i, 10, zs70Var, null), mb61Var);
        return objMo28414a == yuk.f276404a ? objMo28414a : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: i */
    public static Object m96822i(zs70 zs70Var, int i, mb61 mb61Var) {
        zs70Var.getClass();
        Object objMo28414a = zs70Var.mo28414a(xqi0.f265055a, new q950(i, 15, zs70Var, null), mb61Var);
        return objMo28414a == yuk.f276404a ? objMo28414a : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r5.f285867h.mo28414a(r6, r7, r0) == r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.omy0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo28414a(xqi0 xqi0Var, th00 th00Var, fbk fbkVar) {
        ys70 ys70Var;
        th00 th00Var2;
        if (fbkVar instanceof ys70) {
            ys70Var = (ys70) fbkVar;
            int i = ys70Var.f275712e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ys70Var.f275712e = i - Integer.MIN_VALUE;
            } else {
                ys70Var = new ys70(this, fbkVar);
            }
        } else {
            ys70Var = new ys70(this, fbkVar);
        }
        Object obj = ys70Var.f275710c;
        int i2 = ys70Var.f275712e;
        Object obj2 = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                th00 th00Var3 = (th00) ys70Var.f275709b;
                xqi0Var = ys70Var.f275708a;
                bga.m29073P(obj);
                th00Var2 = th00Var3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj);
        if (this.f285864e.getValue() == bt70.f30528a) {
            ys70Var.f275708a = xqi0Var;
            ys70Var.f275709b = (mb61) th00Var;
            ys70Var.f275712e = 1;
            if (this.f285871l.m38360d(ys70Var) != obj2) {
            }
        }
        th00Var2 = th00Var;
        th00Var2 = th00Var;
        return obj2;
        th00Var2 = th00Var;
        th00Var2 = th00Var;
        th00Var2 = th00Var;
        ys70Var.f275708a = null;
        ys70Var.f275709b = null;
        ys70Var.f275712e = 2;
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: b */
    public final boolean mo28415b() {
        return this.f285867h.mo28415b();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: c */
    public final boolean mo28416c() {
        return ((Boolean) this.f285880u.getValue()).booleanValue();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: d */
    public final boolean mo28417d() {
        return ((Boolean) this.f285879t.getValue()).booleanValue();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: e */
    public final float mo28418e(float f) {
        return this.f285867h.mo28418e(f);
    }

    /* JADX INFO: renamed from: g */
    public final void m96823g(qs70 qs70Var, boolean z, boolean z2) {
        ss70 ss70VarM73685l;
        rs70[] rs70VarArrM79188a;
        rs70 rs70Var;
        this.f285874o.f245166e = qs70Var.m73690q().size();
        bq70 bq70Var = this.f285881v;
        bsa bsaVar = this.f285863d;
        if (!z && this.f285861b) {
            this.f285862c = qs70Var;
            oa31 oa31VarM58610i = lb5.m58610i();
            gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
            oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
            try {
                if (bq70Var.m30188d() && qs70Var.m73686m() == bsaVar.m30388U() && (ss70VarM73685l = qs70Var.m73685l()) != null && (rs70VarArrM79188a = ss70VarM73685l.m79188a()) != null && (rs70Var = (rs70) bk5.m29584G0(rs70VarArrM79188a)) != null && rs70Var.getIndex() == bsaVar.m30386S()) {
                    bq70Var.m30197m();
                }
                return;
            } finally {
                lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            }
        }
        if (z) {
            this.f285861b = true;
        }
        this.f285866g -= qs70Var.m73682i();
        this.f285864e.setValue(qs70Var);
        this.f285880u.setValue(Boolean.valueOf(qs70Var.m73680g()));
        this.f285879t.setValue(Boolean.valueOf(qs70Var.m73681h()));
        if (z2) {
            bsaVar.m30422r0(qs70Var.m73686m());
        } else {
            bsaVar.m30420q0(qs70Var);
            if (this.f285868i) {
                this.f285860a.m59505d(this.f285875p, qs70Var);
            }
        }
        if (z) {
            bq70Var.m30198n(qs70Var.m73687n(), qs70Var.m73684k(), qs70Var.m73683j());
        }
    }

    /* JADX INFO: renamed from: h */
    public final qs70 m96824h() {
        return (qs70) this.f285864e.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final void m96825j(int i, int i2, boolean z) {
        bsa bsaVar = this.f285863d;
        if (bsaVar.m30386S() != i || bsaVar.m30388U() != i2) {
            fv70 fv70Var = this.f285872m;
            fv70Var.m42769e();
            fv70Var.f73716b = null;
            fv70Var.f73717c = -1;
        }
        bsaVar.m30408k0(i, i2);
        lp70 lp70Var = this.f285869j;
        if (lp70Var != null) {
            lp70Var.m59635l();
        }
    }
}
