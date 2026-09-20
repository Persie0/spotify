package p204p;

import androidx.compose.p002ui.geometry.Offset;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class xom0 implements omy0 {

    /* JADX INFO: renamed from: A */
    public final kqi0 f264306A;

    /* JADX INFO: renamed from: B */
    public final kqi0 f264307B;

    /* JADX INFO: renamed from: C */
    public final yum0 f264308C;

    /* JADX INFO: renamed from: D */
    public final yum0 f264309D;

    /* JADX INFO: renamed from: E */
    public final yum0 f264310E;

    /* JADX INFO: renamed from: F */
    public final yum0 f264311F;

    /* JADX INFO: renamed from: a */
    public boolean f264312a;

    /* JADX INFO: renamed from: b */
    public lom0 f264313b;

    /* JADX INFO: renamed from: c */
    public final yum0 f264314c;

    /* JADX INFO: renamed from: d */
    public final i82 f264315d;

    /* JADX INFO: renamed from: e */
    public int f264316e;

    /* JADX INFO: renamed from: f */
    public int f264317f;

    /* JADX INFO: renamed from: g */
    public long f264318g;

    /* JADX INFO: renamed from: h */
    public long f264319h;

    /* JADX INFO: renamed from: i */
    public float f264320i;

    /* JADX INFO: renamed from: j */
    public float f264321j;

    /* JADX INFO: renamed from: k */
    public final r5q f264322k;

    /* JADX INFO: renamed from: l */
    public final boolean f264323l;

    /* JADX INFO: renamed from: m */
    public final yum0 f264324m;

    /* JADX INFO: renamed from: n */
    public yqq f264325n;

    /* JADX INFO: renamed from: o */
    public int f264326o;

    /* JADX INFO: renamed from: p */
    public final woi0 f264327p;

    /* JADX INFO: renamed from: q */
    public final vum0 f264328q;

    /* JADX INFO: renamed from: r */
    public final vum0 f264329r;

    /* JADX INFO: renamed from: s */
    public final rtq f264330s;

    /* JADX INFO: renamed from: t */
    public final vv70 f264331t;

    /* JADX INFO: renamed from: u */
    public final vnm0 f264332u;

    /* JADX INFO: renamed from: v */
    public final ae00 f264333v;

    /* JADX INFO: renamed from: w */
    public final eb8 f264334w;

    /* JADX INFO: renamed from: x */
    public final yum0 f264335x;

    /* JADX INFO: renamed from: y */
    public final vom0 f264336y;

    /* JADX INFO: renamed from: z */
    public final sv70 f264337z;

    public xom0(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            pt40.m70891a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.f264314c = sam.m77645B(new Offset(0L));
        this.f264315d = new i82(i, f, this);
        this.f264316e = i;
        this.f264318g = Long.MAX_VALUE;
        final int i2 = 0;
        this.f264322k = j0g1.m52096x(new gh00(this) { // from class: p.som0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ xom0 f211224b;

            {
                this.f211224b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // p204p.gh00
            public final Object invoke(Object obj) {
                lom0 lom0Var;
                switch (i2) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        xom0 xom0Var = this.f211224b;
                        long jM83386t = ulg1.m83386t(xom0Var);
                        float f2 = xom0Var.f264320i + fFloatValue;
                        long jM72084O = q3d0.m72084O(f2);
                        xom0Var.f264320i = f2 - jM72084O;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jM83386t + jM72084O;
                            long jM63439p = n0e1.m63439p(j, xom0Var.f264319h, xom0Var.f264318g);
                            boolean z = j != jM63439p;
                            long j2 = jM63439p - jM83386t;
                            float f3 = j2;
                            xom0Var.f264321j = f3;
                            if (Math.abs(j2) != 0) {
                                xom0Var.f264310E.setValue(Boolean.valueOf(f3 > 0.0f));
                                xom0Var.f264311F.setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i3 = (int) j2;
                            int i4 = -i3;
                            lom0 lom0VarM59575f = ((lom0) xom0Var.f264324m.getValue()).m59575f(i4);
                            if (lom0VarM59575f != null && (lom0Var = xom0Var.f264313b) != null) {
                                lom0 lom0VarM59575f2 = lom0Var.m59575f(i4);
                                if (lom0VarM59575f2 != null) {
                                    xom0Var.f264313b = lom0VarM59575f2;
                                } else {
                                    lom0VarM59575f = null;
                                }
                            }
                            if (lom0VarM59575f != null) {
                                xom0Var.m91551h(lom0VarM59575f, xom0Var.f264312a, true);
                                pqo0.m70679s(xom0Var.f264306A);
                            } else {
                                i82 i82Var = xom0Var.f264315d;
                                uum0 uum0Var = (uum0) i82Var.f99668d;
                                xom0 xom0Var2 = (xom0) i82Var.f99666b;
                                uum0Var.m84032w(uum0Var.m84031v() + (xom0Var2.m91557o() != 0 ? i3 / xom0Var2.m91557o() : 0.0f));
                                lp70 lp70Var = (lp70) xom0Var.f264335x.getValue();
                                if (lp70Var != null) {
                                    lp70Var.m59635l();
                                }
                            }
                            if (z) {
                                ValueOf = Long.valueOf(j2);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        xom0 xom0Var3 = this.f211224b;
                        tv70 tv70Var = (tv70) obj;
                        oa31 oa31VarM58610i = lb5.m58610i();
                        gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
                        oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
                        try {
                            tv70Var.m81605a(xom0Var3.f264316e);
                            return w2a1.f247311a;
                        } finally {
                            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
                        }
                }
            }
        });
        this.f264323l = true;
        this.f264324m = sam.m77644A(zom0.f284849c, zhi0.f282936c);
        this.f264325n = zom0.f284848b;
        this.f264327p = hbg1.m47035f();
        this.f264328q = bul.m30574z(-1);
        this.f264329r = bul.m30574z(i);
        tjr0 tjr0Var = tjr0.f220989Q0;
        this.f264330s = sam.m77675n(new ov70(this, 2), tjr0Var);
        sam.m77675n(new ov70(this, 3), tjr0Var);
        final int i3 = 1;
        vv70 vv70Var = new vv70(new gh00(this) { // from class: p.som0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ xom0 f211224b;

            {
                this.f211224b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // p204p.gh00
            public final Object invoke(Object obj) {
                lom0 lom0Var;
                switch (i3) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        xom0 xom0Var = this.f211224b;
                        long jM83386t = ulg1.m83386t(xom0Var);
                        float f2 = xom0Var.f264320i + fFloatValue;
                        long jM72084O = q3d0.m72084O(f2);
                        xom0Var.f264320i = f2 - jM72084O;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jM83386t + jM72084O;
                            long jM63439p = n0e1.m63439p(j, xom0Var.f264319h, xom0Var.f264318g);
                            boolean z = j != jM63439p;
                            long j2 = jM63439p - jM83386t;
                            float f3 = j2;
                            xom0Var.f264321j = f3;
                            if (Math.abs(j2) != 0) {
                                xom0Var.f264310E.setValue(Boolean.valueOf(f3 > 0.0f));
                                xom0Var.f264311F.setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i4 = (int) j2;
                            int i5 = -i4;
                            lom0 lom0VarM59575f = ((lom0) xom0Var.f264324m.getValue()).m59575f(i5);
                            if (lom0VarM59575f != null && (lom0Var = xom0Var.f264313b) != null) {
                                lom0 lom0VarM59575f2 = lom0Var.m59575f(i5);
                                if (lom0VarM59575f2 != null) {
                                    xom0Var.f264313b = lom0VarM59575f2;
                                } else {
                                    lom0VarM59575f = null;
                                }
                            }
                            if (lom0VarM59575f != null) {
                                xom0Var.m91551h(lom0VarM59575f, xom0Var.f264312a, true);
                                pqo0.m70679s(xom0Var.f264306A);
                            } else {
                                i82 i82Var = xom0Var.f264315d;
                                uum0 uum0Var = (uum0) i82Var.f99668d;
                                xom0 xom0Var2 = (xom0) i82Var.f99666b;
                                uum0Var.m84032w(uum0Var.m84031v() + (xom0Var2.m91557o() != 0 ? i4 / xom0Var2.m91557o() : 0.0f));
                                lp70 lp70Var = (lp70) xom0Var.f264335x.getValue();
                                if (lp70Var != null) {
                                    lp70Var.m59635l();
                                }
                            }
                            if (z) {
                                ValueOf = Long.valueOf(j2);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        xom0 xom0Var3 = this.f211224b;
                        tv70 tv70Var = (tv70) obj;
                        oa31 oa31VarM58610i = lb5.m58610i();
                        gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
                        oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
                        try {
                            tv70Var.m81605a(xom0Var3.f264316e);
                            return w2a1.f247311a;
                        } finally {
                            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
                        }
                }
            }
        });
        this.f264331t = vv70Var;
        this.f264332u = new vnm0(new fbk0(this, 9), vv70Var, new ov70(this, 4));
        this.f264333v = new ae00(17);
        this.f264334w = new eb8();
        this.f264335x = sam.m77645B(null);
        this.f264336y = new vom0(this);
        e8j.m38111b(0, 0, 0, 0, 15);
        this.f264337z = new sv70();
        this.f264306A = pqo0.m70671k();
        this.f264307B = pqo0.m70671k();
        Boolean bool = Boolean.FALSE;
        this.f264308C = sam.m77645B(bool);
        this.f264309D = sam.m77645B(bool);
        this.f264310E = sam.m77645B(bool);
        this.f264311F = sam.m77645B(bool);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m91547g(xom0 xom0Var, int i, pg41 pg41Var, fbk fbkVar, int i2) {
        if ((i2 & 4) != 0) {
            pg41Var = jg31.m53286y(0.0f, 0.0f, null, 7);
        }
        return xom0Var.m91550f(i, pg41Var, fbkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r8.mo28414a(r6, r7, r0) == r4) goto L24;
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
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m91548s(xom0 xom0Var, xqi0 xqi0Var, th00 th00Var, fbk fbkVar) {
        wom0 wom0Var;
        th00 th00Var2;
        if (fbkVar instanceof wom0) {
            wom0Var = (wom0) fbkVar;
            int i = wom0Var.f253510f;
            if ((i & Integer.MIN_VALUE) != 0) {
                wom0Var.f253510f = i - Integer.MIN_VALUE;
            } else {
                wom0Var = new wom0(xom0Var, fbkVar);
            }
        } else {
            wom0Var = new wom0(xom0Var, fbkVar);
        }
        Object obj = wom0Var.f253508d;
        int i2 = wom0Var.f253510f;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            wom0Var.f253505a = xom0Var;
            wom0Var.f253506b = xqi0Var;
            wom0Var.f253507c = (mb61) th00Var;
            wom0Var.f253510f = 1;
            if (xom0Var.m91552i(wom0Var) != obj2) {
            }
            th00Var2 = th00Var;
            return obj2;
        }
        if (i2 == 1) {
            th00 th00Var3 = (th00) wom0Var.f253507c;
            xqi0Var = wom0Var.f253506b;
            xom0Var = wom0Var.f253505a;
            bga.m29073P(obj);
            th00Var2 = th00Var3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xom0Var = wom0Var.f253505a;
            bga.m29073P(obj);
        }
        xom0Var.f264328q.m86438w(-1);
        return w2a1.f247311a;
        th00Var2 = th00Var;
        if (!xom0Var.f264322k.mo28415b()) {
            xom0Var.f264329r.m86438w(xom0Var.f264315d.m49922o());
        }
        r5q r5qVar = xom0Var.f264322k;
        wom0Var.f253505a = xom0Var;
        wom0Var.f253506b = null;
        wom0Var.f253507c = null;
        wom0Var.f253510f = 2;
    }

    /* JADX INFO: renamed from: t */
    public static Object m91549t(xom0 xom0Var, int i, mb61 mb61Var) {
        xom0Var.getClass();
        Object objMo28414a = xom0Var.mo28414a(xqi0.f265055a, new i86(xom0Var, i, null, 1), mb61Var);
        return objMo28414a == yuk.f276404a ? objMo28414a : w2a1.f247311a;
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: a */
    public final Object mo28414a(xqi0 xqi0Var, th00 th00Var, fbk fbkVar) {
        return m91548s(this, xqi0Var, th00Var, fbkVar);
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: b */
    public final boolean mo28415b() {
        return this.f264322k.mo28415b();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: c */
    public final boolean mo28416c() {
        return ((Boolean) this.f264309D.getValue()).booleanValue();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: d */
    public final boolean mo28417d() {
        return ((Boolean) this.f264308C.getValue()).booleanValue();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: e */
    public final float mo28418e(float f) {
        return this.f264322k.mo28418e(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: f */
    public final Object m91550f(int i, n05 n05Var, fbk fbkVar) {
        tom0 tom0Var;
        n05 n05Var2;
        if (fbkVar instanceof tom0) {
            tom0Var = (tom0) fbkVar;
            int i2 = tom0Var.f222290e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tom0Var.f222290e = i2 - Integer.MIN_VALUE;
            } else {
                tom0Var = new tom0(this, fbkVar);
            }
        } else {
            tom0Var = new tom0(this, fbkVar);
        }
        Object obj = tom0Var.f222288c;
        int i3 = tom0Var.f222290e;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(obj);
            i82 i82Var = this.f264315d;
            if ((i != i82Var.m49922o() || i82Var.m49923p() != 0.0f) && mo37269m() != 0) {
                tom0Var.f222287b = n05Var;
                tom0Var.f222286a = i;
                tom0Var.f222290e = 1;
                if (m91552i(tom0Var) != obj2) {
                    n05Var2 = n05Var;
                }
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        i = tom0Var.f222286a;
        n05 n05Var3 = tom0Var.f222287b;
        bga.m29073P(obj);
        n05Var2 = n05Var3;
        double d = 0.0f;
        if (-0.5d > d || d > 0.5d) {
            pt40.m70891a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
        }
        th00 uom0Var = new uom0(this, m91553j(i), 0.0f * m91557o(), n05Var2, null);
        tom0Var.f222287b = null;
        tom0Var.f222290e = 2;
        return mo28414a(xqi0.f265055a, uom0Var, tom0Var) == obj2 ? obj2 : w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x02f5 A[Catch: all -> 0x034e, TryCatch #0 {all -> 0x034e, blocks: (B:124:0x02a3, B:127:0x02ac, B:130:0x02b9, B:132:0x02c5, B:144:0x0303, B:138:0x02f5, B:135:0x02dd), top: B:159:0x02a3 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:143:0x0302  */
    /* JADX WARN: Code duplicated, block: B:144:0x0303 A[Catch: all -> 0x034e, TRY_LEAVE, TryCatch #0 {all -> 0x034e, blocks: (B:124:0x02a3, B:127:0x02ac, B:130:0x02b9, B:132:0x02c5, B:144:0x0303, B:138:0x02f5, B:135:0x02dd), top: B:159:0x02a3 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ea A[LOOP:1: B:84:0x01e8->B:85:0x01ea, LOOP_END] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h */
    public final void m91551h(lom0 lom0Var, boolean z, boolean z2) {
        boolean z3;
        int i;
        Object obj;
        int i2;
        boolean z4;
        f5b f5bVar;
        List list;
        int size;
        int i3;
        boolean z5;
        List list2 = lom0Var.f135459a;
        int i4 = lom0Var.f135470l;
        s6d0 s6d0Var = lom0Var.f135467i;
        this.f264331t.f245166e = list2.size();
        int i5 = lom0Var.f135460b;
        this.f264326o = lom0Var.f135461c + i5;
        if (!z && this.f264312a) {
            this.f264313b = lom0Var;
            return;
        }
        if (z) {
            this.f264312a = true;
        }
        vnm0 vnm0Var = this.f264332u;
        boolean z6 = this.f264323l;
        i82 i82Var = this.f264315d;
        if (z2) {
            i82Var.m49930z(lom0Var.f135469k);
        } else {
            i82Var.m49908B(lom0Var);
            if (z6) {
                dii0 dii0Var = vnm0Var.f243178o;
                dii0Var.m36097L(lom0Var);
                dii0Var.m36098M(vnm0Var.f243177n);
                toi0 toi0Var = vnm0Var.f243168e;
                fbk0 fbk0Var = vnm0Var.f243164a;
                int i6 = vnm0Var.f243170g;
                float f = 0.0f;
                int i7 = -1;
                boolean z7 = true;
                if (i6 != -1 && i6 != dii0Var.m36117v()) {
                    vnm0Var.f243175l = true;
                    if (dii0Var.m36112q()) {
                        int i8 = vnm0Var.f243171h;
                        if (i8 < 0) {
                            i8 = 0;
                        }
                        vnm0Var.f243171h = i8;
                        int iM36117v = dii0Var.m36114s().f135459a.isEmpty() ? -1 : dii0Var.m36117v() - 1;
                        if (iM36117v != -1) {
                            int i9 = vnm0Var.f243172i;
                            if (i9 <= iM36117v) {
                                iM36117v = i9;
                            }
                            vnm0Var.f243172i = iM36117v;
                        }
                        if (vnm0Var.f243169f <= 0.0f) {
                            vnm0Var.m86047f(dii0Var.m36113r(), vnm0Var.f243176m - 1);
                        } else {
                            vnm0Var.m86047f(0, dii0Var.m36110o());
                        }
                    }
                }
                vnm0Var.f243176m = dii0Var.m36117v();
                if (dii0Var.m36112q()) {
                    int size2 = dii0Var.m36114s().f135476r.size() + dii0Var.m36114s().f135459a.size() + dii0Var.m36114s().f135475q.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        float f2 = f;
                        int size3 = dii0Var.m36114s().f135475q.size();
                        int size4 = dii0Var.m36114s().f135459a.size();
                        if (i10 < size3) {
                            i = ((s6d0) dii0Var.m36114s().f135475q.get(i10)).f206085a;
                        } else if (i10 < size3 || i10 >= size3 + size4) {
                            i = i10 >= size3 + size4 ? ((s6d0) dii0Var.m36114s().f135476r.get((i10 - size3) - size4)).f206085a : i7;
                        } else {
                            i = ((s6d0) dii0Var.m36114s().f135459a.get(i10 - size3)).f206085a;
                        }
                        int size5 = dii0Var.m36114s().f135475q.size();
                        int size6 = dii0Var.m36114s().f135459a.size();
                        if (i10 < size5) {
                            obj = ((s6d0) dii0Var.m36114s().f135475q.get(i10)).f206088d;
                        } else if (i10 < size5 || i10 >= size5 + size6) {
                            obj = i10 >= size5 + size6 ? ((s6d0) dii0Var.m36114s().f135476r.get((i10 - size5) - size6)).f206088d : f5b.f66002c;
                        } else {
                            obj = ((s6d0) dii0Var.m36114s().f135459a.get(i10 - size5)).f206088d;
                        }
                        int i11 = dii0Var.m36114s().f135460b;
                        if (i != -1) {
                            if (toi0Var.m87102a(i)) {
                                Object objM87103b = toi0Var.m87103b(i);
                                wj50.m88279p(objM87103b);
                                int i12 = ((f5b) objM87103b).f66004b;
                                Object objM87103b2 = toi0Var.m87103b(i);
                                wj50.m88279p(objM87103b2);
                                i2 = size2;
                                Object obj2 = ((f5b) objM87103b2).f66003a;
                                if (i12 != i11 || !wj50.m88271j(obj2, obj)) {
                                    z4 = true;
                                    vnm0Var.f243175l = true;
                                }
                                f5bVar = (f5b) toi0Var.m87103b(i);
                                if (f5bVar != null) {
                                    f5bVar.f66004b = i11;
                                    f5bVar.f66003a = obj;
                                } else {
                                    f5bVar = new f5b();
                                    f5bVar.f66003a = obj;
                                    f5bVar.f66004b = i11;
                                }
                                toi0Var.m81201i(i, f5bVar);
                                vnm0Var.f243171h = Math.min(vnm0Var.f243171h, i);
                                vnm0Var.f243172i = Math.max(vnm0Var.f243172i, i);
                                list = (List) vnm0Var.f243165b.m81199g(i);
                                if (list != null) {
                                    size = list.size();
                                    for (i3 = 0; i3 < size; i3++) {
                                        ((uv70) list.get(i3)).cancel();
                                    }
                                }
                            } else {
                                i2 = size2;
                            }
                            z4 = true;
                            f5bVar = (f5b) toi0Var.m87103b(i);
                            if (f5bVar != null) {
                                f5bVar.f66004b = i11;
                                f5bVar.f66003a = obj;
                            } else {
                                f5bVar = new f5b();
                                f5bVar.f66003a = obj;
                                f5bVar.f66004b = i11;
                            }
                            toi0Var.m81201i(i, f5bVar);
                            vnm0Var.f243171h = Math.min(vnm0Var.f243171h, i);
                            vnm0Var.f243172i = Math.max(vnm0Var.f243172i, i);
                            list = (List) vnm0Var.f243165b.m81199g(i);
                            if (list != null) {
                                size = list.size();
                                while (i3 < size) {
                                    ((uv70) list.get(i3)).cancel();
                                }
                            }
                        } else {
                            i2 = size2;
                            z4 = true;
                        }
                        i10++;
                        f = f2;
                        z7 = z4;
                        size2 = i2;
                        i7 = -1;
                    }
                    float f3 = f;
                    boolean z8 = z7;
                    if (vnm0Var.f243175l) {
                        boolean z9 = vnm0Var.f243169f <= f3 ? z8 : false;
                        if (dii0Var.m36112q()) {
                            mlg1.m62230w(dii0Var.m36114s());
                            z3 = false;
                            vnm0Var.m86045d(dii0Var, dii0Var.m36110o(), dii0Var.m36113r(), dii0Var.m36114s().f135478t != null ? ((xom0) fbk0Var.f67847b).f264326o : 0, dii0Var.m36115t(), dii0Var.m36116u(), 0.0f, z9);
                        } else {
                            z3 = false;
                        }
                        vnm0Var.f243175l = z3;
                    }
                } else {
                    vnm0Var.m86048g();
                }
                vnm0Var.f243170g = dii0Var.m36117v();
            }
        }
        this.f264324m.setValue(lom0Var);
        this.f264308C.setValue(Boolean.valueOf(lom0Var.f135471m));
        this.f264309D.setValue(Boolean.valueOf(((s6d0Var != null ? s6d0Var.f206085a : 0) == 0 && i4 == 0) ? false : true));
        if (s6d0Var != null) {
            this.f264316e = s6d0Var.f206085a;
        }
        this.f264317f = i4;
        oa31 oa31VarM58610i = lb5.m58610i();
        gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
        oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
        if (z6) {
            try {
                if (lom0Var.f135466h < mo37269m() && Math.abs(this.f264321j) > 0.5f) {
                    float f4 = this.f264321j;
                    if (m91555l().f135463e == vvl0.f245248a) {
                        if (Math.signum(f4) != Math.signum(-Float.intBitsToFloat((int) (m91559q() & 4294967295L)))) {
                            if (m91560r()) {
                                z5 = false;
                            }
                            if (z5) {
                                float f5 = this.f264321j;
                                dii0 dii0Var2 = vnm0Var.f243178o;
                                dii0Var2.m36097L(lom0Var);
                                dii0Var2.m36098M(vnm0Var.f243177n);
                                vnm0Var.m86046e(dii0Var2, -f5);
                            }
                        }
                    } else if (Math.signum(f4) != Math.signum(-Float.intBitsToFloat((int) (m91559q() >> 32)))) {
                        if (m91560r()) {
                            z5 = false;
                        }
                        if (z5) {
                            float f6 = this.f264321j;
                            dii0 dii0Var3 = vnm0Var.f243178o;
                            dii0Var3.m36097L(lom0Var);
                            dii0Var3.m36098M(vnm0Var.f243177n);
                            vnm0Var.m86046e(dii0Var3, -f6);
                        }
                    }
                    z5 = true;
                    if (z5) {
                        float f7 = this.f264321j;
                        dii0 dii0Var4 = vnm0Var.f243178o;
                        dii0Var4.m36097L(lom0Var);
                        dii0Var4.m36098M(vnm0Var.f243177n);
                        vnm0Var.m86046e(dii0Var4, -f7);
                    }
                }
            } catch (Throwable th) {
                lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
                throw th;
            }
        }
        lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
        this.f264318g = zom0.m96629a(lom0Var, mo37269m());
        mo37269m();
        int iM59576g = (int) (lom0Var.f135463e == vvl0.f245249b ? lom0Var.m59576g() >> 32 : lom0Var.m59576g() & 4294967295L);
        long jM63437n = n0e1.m63437n(lom0Var.f135472n.mo41135a(iM59576g, i5, -lom0Var.f135464f, lom0Var.f135462d), 0, iM59576g);
        long j = this.f264318g;
        if (jM63437n > j) {
            jM63437n = j;
        }
        this.f264319h = jM63437n;
    }

    /* JADX INFO: renamed from: i */
    public final Object m91552i(ibk ibkVar) {
        Object objM38360d;
        return (this.f264324m.getValue() == zom0.f284849c && (objM38360d = this.f264334w.m38360d(ibkVar)) == yuk.f276404a) ? objM38360d : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: j */
    public final int m91553j(int i) {
        if (mo37269m() > 0) {
            return n0e1.m63437n(i, 0, mo37269m() - 1);
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m91554k() {
        return ((Boolean) this.f264310E.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public final lom0 m91555l() {
        return (lom0) this.f264324m.getValue();
    }

    /* JADX INFO: renamed from: m */
    public abstract int mo37269m();

    /* JADX INFO: renamed from: n */
    public final int m91556n() {
        return ((lom0) this.f264324m.getValue()).f135460b;
    }

    /* JADX INFO: renamed from: o */
    public final int m91557o() {
        return ((lom0) this.f264324m.getValue()).f135461c + m91556n();
    }

    /* JADX INFO: renamed from: p */
    public final int m91558p() {
        return ((Number) this.f264330s.getValue()).intValue();
    }

    /* JADX INFO: renamed from: q */
    public final long m91559q() {
        return ((Offset) this.f264314c.getValue()).f493a;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m91560r() {
        return ((int) Float.intBitsToFloat((int) (m91559q() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (m91559q() & 4294967295L))) == 0;
    }

    /* JADX INFO: renamed from: u */
    public final void m91561u(float f, int i, boolean z) {
        i82 i82Var = this.f264315d;
        if (i82Var.m49922o() != i || i82Var.m49923p() != f) {
            this.f264332u.m86048g();
        }
        i82Var.m49927v(f, i);
        if (!z) {
            pqo0.m70679s(this.f264307B);
            return;
        }
        lp70 lp70Var = (lp70) this.f264335x.getValue();
        if (lp70Var != null) {
            lp70Var.m59635l();
        }
    }
}
