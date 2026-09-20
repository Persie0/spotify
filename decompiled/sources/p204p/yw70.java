package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class yw70 implements omy0 {

    /* JADX INFO: renamed from: y */
    public static final t9y0 f276887y = l7l.m58436q(new nm6(5), new bxp(1));

    /* JADX INFO: renamed from: b */
    public boolean f276889b;

    /* JADX INFO: renamed from: c */
    public sw70 f276890c;

    /* JADX INFO: renamed from: d */
    public boolean f276891d;

    /* JADX INFO: renamed from: e */
    public final qp4 f276892e;

    /* JADX INFO: renamed from: h */
    public float f276895h;

    /* JADX INFO: renamed from: i */
    public boolean f276896i;

    /* JADX INFO: renamed from: l */
    public lp70 f276899l;

    /* JADX INFO: renamed from: q */
    public final vv70 f276904q;

    /* JADX INFO: renamed from: u */
    public final yum0 f276908u;

    /* JADX INFO: renamed from: v */
    public final yum0 f276909v;

    /* JADX INFO: renamed from: w */
    public final kqi0 f276910w;

    /* JADX INFO: renamed from: x */
    public final bq70 f276911x;

    /* JADX INFO: renamed from: a */
    public final nnp f276888a = x0h1.m89564g();

    /* JADX INFO: renamed from: f */
    public final yum0 f276893f = sam.m77644A(bx70.f31799a, zhi0.f282936c);

    /* JADX INFO: renamed from: g */
    public final woi0 f276894g = hbg1.m47035f();

    /* JADX INFO: renamed from: j */
    public final r5q f276897j = j0g1.m52096x(new rv70(this, 2));

    /* JADX INFO: renamed from: k */
    public final boolean f276898k = true;

    /* JADX INFO: renamed from: m */
    public final xs70 f276900m = new xs70(this, 1);

    /* JADX INFO: renamed from: n */
    public final eb8 f276901n = new eb8();

    /* JADX INFO: renamed from: o */
    public final fv70 f276902o = new fv70();

    /* JADX INFO: renamed from: p */
    public final ae00 f276903p = new ae00(17);

    /* JADX INFO: renamed from: r */
    public final cdv f276905r = new cdv(this, 26);

    /* JADX INFO: renamed from: s */
    public final sv70 f276906s = new sv70();

    /* JADX INFO: renamed from: t */
    public final kqi0 f276907t = pqo0.m70671k();

    public yw70(int i, int i2) {
        this.f276892e = new qp4(i, i2);
        this.f276904q = new vv70(new ie40(this, i, 2));
        Boolean bool = Boolean.FALSE;
        this.f276908u = sam.m77645B(bool);
        this.f276909v = sam.m77645B(bool);
        this.f276910w = pqo0.m70671k();
        this.f276911x = new bq70();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r5.f276897j.mo28414a(r6, r7, r0) == r4) goto L23;
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
        xw70 xw70Var;
        th00 th00Var2;
        if (fbkVar instanceof xw70) {
            xw70Var = (xw70) fbkVar;
            int i = xw70Var.f266607e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xw70Var.f266607e = i - Integer.MIN_VALUE;
            } else {
                xw70Var = new xw70(this, fbkVar);
            }
        } else {
            xw70Var = new xw70(this, fbkVar);
        }
        Object obj = xw70Var.f266605c;
        int i2 = xw70Var.f266607e;
        Object obj2 = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                th00 th00Var3 = (th00) xw70Var.f266604b;
                xqi0Var = xw70Var.f266603a;
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
        if (this.f276893f.getValue() == bx70.f31799a) {
            xw70Var.f266603a = xqi0Var;
            xw70Var.f266604b = (mb61) th00Var;
            xw70Var.f266607e = 1;
            if (this.f276901n.m38360d(xw70Var) != obj2) {
            }
        }
        th00Var2 = th00Var;
        th00Var2 = th00Var;
        return obj2;
        th00Var2 = th00Var;
        th00Var2 = th00Var;
        th00Var2 = th00Var;
        xw70Var.f266603a = null;
        xw70Var.f266604b = null;
        xw70Var.f266607e = 2;
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: b */
    public final boolean mo28415b() {
        return this.f276897j.mo28415b();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: c */
    public final boolean mo28416c() {
        return ((Boolean) this.f276909v.getValue()).booleanValue();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: d */
    public final boolean mo28417d() {
        return ((Boolean) this.f276908u.getValue()).booleanValue();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: e */
    public final float mo28418e(float f) {
        return this.f276897j.mo28418e(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m94777f(int i, int i2, fbk fbkVar) {
        ww70 ww70Var;
        if (fbkVar instanceof ww70) {
            ww70Var = (ww70) fbkVar;
            int i3 = ww70Var.f255724c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ww70Var.f255724c = i3 - Integer.MIN_VALUE;
            } else {
                ww70Var = new ww70(this, fbkVar);
            }
        } else {
            ww70Var = new ww70(this, fbkVar);
        }
        Object obj = ww70Var.f255722a;
        int i4 = ww70Var.f255724c;
        try {
            if (i4 == 0) {
                bga.m29073P(obj);
                this.f276896i = true;
                th00 d05Var = new d05(this, i, i2, (fbk) null);
                ww70Var.f255724c = 1;
                Object objMo28414a = mo28414a(xqi0.f265055a, d05Var, ww70Var);
                Object obj2 = yuk.f276404a;
                if (objMo28414a == obj2) {
                    return obj2;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            this.f276896i = false;
            return w2a1.f247311a;
        } catch (Throwable th) {
            this.f276896i = false;
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: g */
    public final void m94778g(sw70 sw70Var, boolean z, boolean z2) {
        ?? r2 = sw70Var.f214605k;
        int i = sw70Var.f214608n;
        int i2 = sw70Var.f214596b;
        tw70 tw70Var = sw70Var.f214595a;
        this.f276904q.f245166e = r2.size();
        bq70 bq70Var = this.f276911x;
        qp4 qp4Var = this.f276892e;
        if (!z && this.f276889b) {
            this.f276890c = sw70Var;
            oa31 oa31VarM58610i = lb5.m58610i();
            gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
            oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
            try {
                if (bq70Var.m30188d() && tw70Var != null && tw70Var.f224325a == ((vum0) qp4Var.f191124b).m86437v() && i2 == ((vum0) qp4Var.f191125c).m86437v()) {
                    bq70Var.m30197m();
                }
                return;
            } finally {
                lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            }
        }
        if (z) {
            this.f276889b = true;
        }
        this.f276909v.setValue(Boolean.valueOf(((tw70Var != null ? tw70Var.f224325a : 0) == 0 && i2 == 0) ? false : true));
        this.f276908u.setValue(Boolean.valueOf(sw70Var.f214597c));
        this.f276895h -= sw70Var.f214598d;
        this.f276893f.setValue(sw70Var);
        if (z2) {
            qp4Var.getClass();
            if (!(((float) i2) >= 0.0f)) {
                pt40.m70893c("scrollOffset should be non-negative");
            }
            ((vum0) qp4Var.f191125c).m86438w(i2);
        } else {
            tw70 tw70Var2 = (tw70) g6f.m43745s0(r2);
            tw70 tw70Var3 = (tw70) g6f.m43689C0(r2);
            ds4.m36751f(tw70Var2 != null ? tw70Var2.f224325a : -1L, "firstVisibleItem:index");
            ds4.m36751f(tw70Var3 != null ? tw70Var3.f224325a : -1L, "lastVisibleItem:index");
            qp4Var.getClass();
            qp4Var.f191126d = tw70Var != null ? tw70Var.f224336l : null;
            if (qp4Var.f191123a || i > 0) {
                qp4Var.f191123a = true;
                if (!(((float) i2) >= 0.0f)) {
                    pt40.m70893c("scrollOffset should be non-negative");
                }
                qp4Var.m73428m(tw70Var != null ? tw70Var.f224325a : 0, i2);
            }
            if (this.f276898k) {
                nnp nnpVar = this.f276888a;
                int i3 = nnpVar.f156464a;
                boolean z3 = nnpVar.f156466c;
                if (i3 != -1 && !r2.isEmpty() && i3 != nnp.m65216a(sw70Var, z3)) {
                    nnpVar.f156464a = -1;
                    uv70 uv70Var = nnpVar.f156465b;
                    if (uv70Var != null) {
                        uv70Var.cancel();
                    }
                    nnpVar.f156465b = null;
                }
                int i4 = nnpVar.f156467d;
                if (i4 != -1 && nnpVar.f156468e != 0.0f && i4 != i && !r2.isEmpty()) {
                    int iM65216a = nnp.m65216a(sw70Var, nnpVar.f156468e < 0.0f);
                    if (iM65216a >= 0 && iM65216a < i) {
                        nnpVar.f156464a = iM65216a;
                        nnpVar.f156465b = cdv.m32460g(this.f276905r, iM65216a);
                    }
                }
                nnpVar.f156467d = i;
            }
        }
        if (z) {
            bq70Var.m30198n(sw70Var.f214600f, sw70Var.f214603i, sw70Var.f214602h);
        }
    }

    /* JADX INFO: renamed from: h */
    public final sw70 m94779h() {
        return (sw70) this.f276893f.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: i */
    public final void m94780i(float f, sw70 sw70Var) {
        uv70 uv70Var;
        uv70 uv70Var2;
        if (this.f276898k) {
            nnp nnpVar = this.f276888a;
            nnpVar.getClass();
            ?? r1 = sw70Var.f214605k;
            ?? r2 = sw70Var.f214605k;
            if (!r1.isEmpty()) {
                boolean z = f < 0.0f;
                int iM65216a = nnp.m65216a(sw70Var, z);
                if (iM65216a >= 0 && iM65216a < sw70Var.f214608n) {
                    if (iM65216a != nnpVar.f156464a) {
                        if (nnpVar.f156466c != z) {
                            nnpVar.f156464a = -1;
                            uv70 uv70Var3 = nnpVar.f156465b;
                            if (uv70Var3 != null) {
                                uv70Var3.cancel();
                            }
                            nnpVar.f156465b = null;
                        }
                        nnpVar.f156466c = z;
                        nnpVar.f156464a = iM65216a;
                        nnpVar.f156465b = cdv.m32460g(this.f276905r, iM65216a);
                    }
                    if (z) {
                        tw70 tw70Var = (tw70) g6f.m43687A0(r2);
                        if (((tw70Var.f224340p + tw70Var.f224341q) + sw70Var.f214612r) - sw70Var.f214607m < (-f) && (uv70Var2 = nnpVar.f156465b) != null) {
                            uv70Var2.mo72838a();
                        }
                    } else if (sw70Var.f214606l - ((tw70) g6f.m43741q0(r2)).f224340p < f && (uv70Var = nnpVar.f156465b) != null) {
                        uv70Var.mo72838a();
                    }
                }
            }
            nnpVar.f156468e = f;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m94781j(int i, int i2) {
        if (this.f276897j.mo28415b()) {
            x0h1.m89578u(((sw70) this.f276893f.getValue()).f214602h, null, 0, new wkh(2, null, this), 3);
        }
        m94783l(i, i2, false);
    }

    /* JADX INFO: renamed from: k */
    public final Object m94782k(int i, int i2, fbk fbkVar) {
        Object objMo28414a = mo28414a(xqi0.f265055a, new l8c(this, i, i2, (fbk) null), fbkVar);
        return objMo28414a == yuk.f276404a ? objMo28414a : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: l */
    public final void m94783l(int i, int i2, boolean z) {
        qp4 qp4Var = this.f276892e;
        if (((vum0) qp4Var.f191124b).m86437v() != i || ((vum0) qp4Var.f191125c).m86437v() != i2) {
            fv70 fv70Var = this.f276902o;
            fv70Var.m42769e();
            fv70Var.f73716b = null;
            fv70Var.f73717c = -1;
        }
        qp4Var.m73428m(i, i2);
        qp4Var.f191126d = null;
        if (!z) {
            pqo0.m70679s(this.f276907t);
            return;
        }
        lp70 lp70Var = this.f276899l;
        if (lp70Var != null) {
            lp70Var.m59635l();
        }
    }
}
