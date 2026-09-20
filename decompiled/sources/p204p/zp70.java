package p204p;

import android.os.Handler;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class zp70 implements glh {

    /* JADX INFO: renamed from: L0 */
    public int f284995L0;

    /* JADX INFO: renamed from: M0 */
    public int f284996M0;

    /* JADX INFO: renamed from: N0 */
    public final String f284997N0;

    /* JADX INFO: renamed from: X */
    public final as51 f284998X;

    /* JADX INFO: renamed from: Y */
    public final cqi0 f284999Y;

    /* JADX INFO: renamed from: Z */
    public final qqi0 f285000Z;

    /* JADX INFO: renamed from: a */
    public final lp70 f285001a;

    /* JADX INFO: renamed from: b */
    public hsh f285002b;

    /* JADX INFO: renamed from: c */
    public bs51 f285003c;

    /* JADX INFO: renamed from: d */
    public int f285004d;

    /* JADX INFO: renamed from: e */
    public int f285005e;

    /* JADX INFO: renamed from: f */
    public final cqi0 f285006f;

    /* JADX INFO: renamed from: g */
    public final cqi0 f285007g;

    /* JADX INFO: renamed from: h */
    public final tp70 f285008h;

    /* JADX INFO: renamed from: i */
    public final qp70 f285009i;

    /* JADX INFO: renamed from: t */
    public final cqi0 f285010t;

    public zp70(lp70 lp70Var, bs51 bs51Var) {
        this.f285001a = lp70Var;
        this.f285003c = bs51Var;
        long[] jArr = rdy0.f198228a;
        this.f285006f = new cqi0();
        this.f285007g = new cqi0();
        this.f285008h = new tp70(this);
        this.f285009i = new qp70(this);
        this.f285010t = new cqi0();
        this.f284998X = new as51();
        this.f284999Y = new cqi0();
        this.f285000Z = new qqi0(0, new Object[16]);
        this.f284997N0 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX INFO: renamed from: d */
    public static final void m96665d(zp70 zp70Var, Object obj) {
        lp70 lp70Var = zp70Var.f285001a;
        zp70Var.m96670i();
        lp70 lp70Var2 = (lp70) zp70Var.f285010t.m33627k(obj);
        if (lp70Var2 != null) {
            if (zp70Var.f284996M0 <= 0) {
                mt40.m62791c("No pre-composed items to dispose");
            }
            int iIndexOf = ((pqi0) lp70Var.m59639p()).indexOf(lp70Var2);
            if (iIndexOf < ((pqi0) lp70Var.m59639p()).size() - zp70Var.f284996M0) {
                mt40.m62791c("Item is not in pre-composed item range");
            }
            zp70Var.f284995L0++;
            zp70Var.f284996M0--;
            rp70 rp70Var = (rp70) zp70Var.f285006f.m33623g(lp70Var2);
            if (rp70Var != null) {
                m96666f(rp70Var);
            }
            int size = (((pqi0) lp70Var.m59639p()).size() - zp70Var.f284996M0) - zp70Var.f284995L0;
            zp70Var.m96672k(iIndexOf, size);
            zp70Var.m96669h(size);
        }
        if (zp70Var.f285000Z.m73562i(obj)) {
            lp70.m59596V(lp70Var, true, 6);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m96666f(rp70 rp70Var) {
        ldn0 ldn0Var = rp70Var.f201446f;
        if (ldn0Var != null) {
            ldn0Var.m58749c();
            rp70Var.f201446f = null;
            msh mshVar = rp70Var.f201443c;
            if (mshVar != null) {
                mshVar.dispose();
            }
            rp70Var.f201443c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // p204p.glh
    /* JADX INFO: renamed from: a */
    public final void mo45176a() {
        msh mshVar;
        lp70 lp70Var = this.f285001a;
        lp70Var.f135655P0 = true;
        cqi0 cqi0Var = this.f285006f;
        Object[] objArr = cqi0Var.f40898c;
        long[] jArr = cqi0Var.f40896a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (mshVar = ((rp70) objArr[(i << 3) + i3]).f201443c) != null) {
                            mshVar.dispose();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        lp70Var.m59614P();
        lp70Var.f135655P0 = false;
        cqi0Var.m33617a();
        this.f285007g.m33617a();
        this.f284996M0 = 0;
        this.f284995L0 = 0;
        this.f285010t.m33617a();
        m96670i();
    }

    @Override // p204p.glh
    /* JADX INFO: renamed from: b */
    public final void mo45177b() {
        m96671j(true);
    }

    @Override // p204p.glh
    /* JADX INFO: renamed from: c */
    public final void mo45178c() {
        m96671j(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m96667e(rp70 rp70Var, boolean z) {
        ldn0 ldn0Var = rp70Var.f201446f;
        if (ldn0Var != null) {
            oa31 oa31VarM58610i = lb5.m58610i();
            gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
            oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
            try {
                lp70 lp70Var = this.f285001a;
                lp70Var.f135655P0 = true;
                if (z) {
                    while (!ldn0Var.m58752f()) {
                        try {
                            ldn0Var.m58756j(new abz(23));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                ldn0Var.m58747a();
                rp70Var.f201446f = null;
                lp70Var.f135655P0 = false;
                lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            } catch (Throwable th2) {
                lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final wr51 m96668g(Object obj) {
        return !this.f285001a.m59606H() ? new xp70() : new yp70(this, obj);
    }

    /* JADX INFO: renamed from: h */
    public final void m96669h(int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        this.f284995L0 = 0;
        lp70 lp70Var = this.f285001a;
        pqi0 pqi0Var = (pqi0) lp70Var.m59639p();
        boolean z4 = true;
        int size = (pqi0Var.size() - this.f284996M0) - 1;
        if (i <= size) {
            as51 as51Var = this.f284998X;
            as51Var.clear();
            cqi0 cqi0Var = this.f285006f;
            if (i <= size) {
                int i2 = i;
                while (true) {
                    Object objM33623g = cqi0Var.m33623g((lp70) pqi0Var.get(i2));
                    wj50.m88279p(objM33623g);
                    as51Var.m27064a(((rp70) objM33623g).f201441a);
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f285003c.mo30352b(as51Var);
            oa31 oa31VarM58610i = lb5.m58610i();
            gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
            oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
            boolean z5 = false;
            while (size >= i) {
                try {
                    lp70 lp70Var2 = (lp70) pqi0Var.get(size);
                    Object objM33623g2 = cqi0Var.m33623g(lp70Var2);
                    wj50.m88279p(objM33623g2);
                    rp70 rp70Var = (rp70) objM33623g2;
                    Object obj = rp70Var.f201441a;
                    if (as51Var.contains(obj)) {
                        boolean z6 = z4;
                        this.f284995L0++;
                        if (((Boolean) rp70Var.f201447g.getValue()).booleanValue()) {
                            pp70 pp70Var = lp70Var2.f135676d1;
                            pp70Var.f179937p.f130344k1 = 3;
                            i3b0 i3b0Var = pp70Var.f179938q;
                            if (i3b0Var != null) {
                                i3b0Var.f98113t = 3;
                            }
                            m96674m(rp70Var, false);
                            if (rp70Var.f201448h) {
                                z = z6;
                                z5 = z;
                            } else {
                                z = z6;
                            }
                            z2 = false;
                        } else {
                            z2 = z3;
                            z = z6;
                        }
                    } else {
                        lp70Var.f135655P0 = z4;
                        cqi0Var.m33627k(lp70Var2);
                        msh mshVar = rp70Var.f201443c;
                        if (mshVar != null) {
                            mshVar.dispose();
                        }
                        z = true;
                        lp70Var.m59615Q(size, 1);
                        z2 = false;
                        lp70Var.f135655P0 = false;
                    }
                    this.f285007g.m33627k(obj);
                    size--;
                    boolean z7 = z2;
                    z4 = z;
                    z3 = z7;
                } catch (Throwable th) {
                    lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
                    throw th;
                }
            }
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            z3 = z5;
        }
        if (z3) {
            lb5.m58616o();
        }
        m96670i();
    }

    /* JADX INFO: renamed from: i */
    public final void m96670i() {
        int size = ((pqi0) this.f285001a.m59639p()).size();
        cqi0 cqi0Var = this.f285006f;
        if (cqi0Var.f40900e != size) {
            mt40.m62789a("Inconsistency between the count of nodes tracked by the state (" + cqi0Var.f40900e + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((size - this.f284995L0) - this.f284996M0 < 0) {
            StringBuilder sbM56838j = klh.m56838j(size, "Incorrect state. Total children ", ". Reusable children ");
            sbM56838j.append(this.f284995L0);
            sbM56838j.append(". Precomposed children ");
            sbM56838j.append(this.f284996M0);
            mt40.m62789a(sbM56838j.toString());
        }
        cqi0 cqi0Var2 = this.f285010t;
        if (cqi0Var2.f40900e == this.f284996M0) {
            return;
        }
        mt40.m62789a("Incorrect state. Precomposed children " + this.f284996M0 + ". Map size " + cqi0Var2.f40900e);
    }

    /* JADX INFO: renamed from: j */
    public final void m96671j(boolean z) {
        this.f284996M0 = 0;
        this.f285010t.m33617a();
        pqi0 pqi0Var = (pqi0) this.f285001a.m59639p();
        int size = pqi0Var.size();
        if (this.f284995L0 != size) {
            this.f284995L0 = size;
            oa31 oa31VarM58610i = lb5.m58610i();
            gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
            oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
            for (int i = 0; i < size; i++) {
                try {
                    lp70 lp70Var = (lp70) pqi0Var.get(i);
                    rp70 rp70Var = (rp70) this.f285006f.m33623g(lp70Var);
                    if (rp70Var != null && ((Boolean) rp70Var.f201447g.getValue()).booleanValue()) {
                        pp70 pp70Var = lp70Var.f135676d1;
                        pp70Var.f179937p.f130344k1 = 3;
                        i3b0 i3b0Var = pp70Var.f179938q;
                        if (i3b0Var != null) {
                            i3b0Var.f98113t = 3;
                        }
                        m96674m(rp70Var, z);
                        rp70Var.f201441a = pag1.f175528a;
                    }
                } catch (Throwable th) {
                    lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
                    throw th;
                }
            }
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            this.f285007g.m33617a();
        }
        m96670i();
    }

    /* JADX INFO: renamed from: k */
    public final void m96672k(int i, int i2) {
        lp70 lp70Var = this.f285001a;
        lp70Var.f135655P0 = true;
        lp70Var.m59610L(i, i2, 1);
        lp70Var.f135655P0 = false;
    }

    /* JADX INFO: renamed from: l */
    public final void m96673l(Object obj, th00 th00Var, boolean z) {
        lp70 lp70Var = this.f285001a;
        if (lp70Var.m59606H()) {
            m96670i();
            if (this.f285007g.m33619c(obj)) {
                return;
            }
            this.f284999Y.m33627k(obj);
            cqi0 cqi0Var = this.f285010t;
            Object objM33623g = cqi0Var.m33623g(obj);
            if (objM33623g == null) {
                objM33623g = m96676o(obj);
                if (objM33623g != null) {
                    m96672k(((pqi0) lp70Var.m59639p()).indexOf(objM33623g), ((pqi0) lp70Var.m59639p()).size());
                    this.f284996M0++;
                } else {
                    int size = ((pqi0) lp70Var.m59639p()).size();
                    lp70 lp70Var2 = new lp70(2);
                    lp70Var.f135655P0 = true;
                    lp70Var.m59600B(size, lp70Var2);
                    lp70Var.f135655P0 = false;
                    this.f284996M0++;
                    objM33623g = lp70Var2;
                }
                cqi0Var.m33629m(obj, objM33623g);
            }
            m96675n((lp70) objM33623g, obj, z, th00Var);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m96674m(rp70 rp70Var, boolean z) {
        msh mshVar;
        if (z || !rp70Var.f201448h) {
            rp70Var.f201447g = sam.m77645B(Boolean.FALSE);
        } else {
            rp70Var.f201447g.setValue(Boolean.FALSE);
        }
        if (rp70Var.f201446f != null) {
            m96666f(rp70Var);
            return;
        }
        if (z) {
            msh mshVar2 = rp70Var.f201443c;
            if (mshVar2 != null) {
                mshVar2.m62758o();
                return;
            }
            return;
        }
        pwl0 pwl0VarM98389getOutOfFrameExecutor = ((oz3) op70.m67517a(this.f285001a)).m98389getOutOfFrameExecutor();
        if (pwl0VarM98389getOutOfFrameExecutor == null) {
            if (rp70Var.f201448h || (mshVar = rp70Var.f201443c) == null) {
                return;
            }
            mshVar.m62758o();
            return;
        }
        ag70 ag70Var = new ag70(rp70Var, 6);
        oz3 oz3Var = (oz3) pwl0VarM98389getOutOfFrameExecutor;
        hj5 hj5Var = oz3Var.f172039i;
        boolean zIsEmpty = hj5Var.isEmpty();
        hj5Var.addLast(ag70Var);
        if (zIsEmpty) {
            Handler handler = oz3Var.getHandler();
            if (handler == null) {
                throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(oz3Var.f172055t);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:58:0x009b, B:60:0x00ad, B:63:0x00c1, B:65:0x00c5, B:71:0x00f9, B:66:0x00d2, B:67:0x00dd, B:69:0x00e1, B:70:0x00f6, B:61:0x00b0, B:56:0x0092, B:57:0x0097, B:74:0x0103, B:75:0x010d), top: B:78:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0097 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:58:0x009b, B:60:0x00ad, B:63:0x00c1, B:65:0x00c5, B:71:0x00f9, B:66:0x00d2, B:67:0x00dd, B:69:0x00e1, B:70:0x00f6, B:61:0x00b0, B:56:0x0092, B:57:0x0097, B:74:0x0103, B:75:0x010d), top: B:78:0x0076 }] */
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
    /* JADX INFO: renamed from: n */
    public final void m96675n(lp70 lp70Var, Object obj, boolean z, th00 th00Var) {
        boolean z2;
        cqi0 cqi0Var = this.f285006f;
        Object objM33623g = cqi0Var.m33623g(lp70Var);
        Object obj2 = objM33623g;
        if (objM33623g == null) {
            fyf fyfVar = qbh.f187093a;
            rp70 rp70Var = new rp70();
            rp70Var.f201441a = obj;
            rp70Var.f201442b = fyfVar;
            rp70Var.f201443c = null;
            rp70Var.f201447g = sam.m77645B(Boolean.TRUE);
            cqi0Var.m33629m(lp70Var, rp70Var);
            obj2 = rp70Var;
        }
        rp70 rp70Var2 = (rp70) obj2;
        boolean z3 = rp70Var2.f201442b != th00Var;
        if (rp70Var2.f201446f != null) {
            if (z3) {
                m96666f(rp70Var2);
            } else if (z) {
                return;
            } else {
                m96667e(rp70Var2, true);
            }
        }
        msh mshVar = rp70Var2.f201443c;
        if (mshVar != null) {
            synchronized (mshVar.f146794d) {
                z2 = mshVar.f146778L0.f40900e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || rp70Var2.f201444d) {
            rp70Var2.f201442b = th00Var;
            if (rp70Var2.f201446f != null) {
                mt40.m62789a("new subcompose call while paused composition is still active");
            }
            oa31 oa31VarM58610i = lb5.m58610i();
            gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
            oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
            try {
                lp70 lp70Var2 = this.f285001a;
                lp70Var2.f135655P0 = true;
                msh mshVarM44511r = rp70Var2.f201443c;
                hsh hshVar = this.f285002b;
                if (hshVar == null) {
                    mt40.m62792d("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                if (mshVarM44511r != null) {
                    if (mshVarM44511r.f146787U0 == 3) {
                        if (z) {
                            mshVarM44511r = geg1.m44510q(lp70Var, hshVar);
                        } else {
                            mshVarM44511r = geg1.m44511r(lp70Var, hshVar);
                        }
                    }
                } else if (z) {
                    mshVarM44511r = geg1.m44510q(lp70Var, hshVar);
                } else {
                    mshVarM44511r = geg1.m44511r(lp70Var, hshVar);
                }
                rp70Var2.f201443c = mshVarM44511r;
                th00 th00VarM75763o = rp70Var2.f201442b;
                if (((oz3) op70.m67517a(this.f285001a)).m98389getOutOfFrameExecutor() != null) {
                    rp70Var2.f201448h = false;
                } else {
                    rp70Var2.f201448h = true;
                    th00VarM75763o = rkk.m75763o(new ca70(3, rp70Var2, th00VarM75763o), true, 1524156494);
                }
                if (z) {
                    if (rp70Var2.f201445e) {
                        mshVarM44511r.m62755l();
                        mshVarM44511r.m62762s();
                        rp70Var2.f201446f = mshVarM44511r.m62757n(true, th00VarM75763o);
                    } else {
                        rp70Var2.f201446f = mshVarM44511r.m62757n(mshVarM44511r.m62755l(), th00VarM75763o);
                    }
                } else if (rp70Var2.f201445e) {
                    mshVarM44511r.m62755l();
                    mshVarM44511r.m62762s();
                    xq00 xq00Var = mshVarM44511r.f146786T0;
                    xq00Var.f264836z = 0;
                    xq00Var.f264835y = true;
                    mshVarM44511r.f146791a.mo48459a(mshVarM44511r, th00VarM75763o);
                    xq00Var.m91798w();
                } else {
                    mshVarM44511r.m62743A(th00VarM75763o);
                }
                rp70Var2.f201445e = false;
                lp70Var2.f135655P0 = false;
                lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
                rp70Var2.f201444d = false;
            } catch (Throwable th) {
                lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final lp70 m96676o(Object obj) {
        cqi0 cqi0Var;
        int i;
        if (this.f284995L0 == 0) {
            return null;
        }
        pqi0 pqi0Var = (pqi0) this.f285001a.m59639p();
        int size = pqi0Var.size() - this.f284996M0;
        int i2 = size - this.f284995L0;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            cqi0Var = this.f285006f;
            if (i4 < i2) {
                i = -1;
                break;
            }
            Object objM33623g = cqi0Var.m33623g((lp70) pqi0Var.get(i4));
            wj50.m88279p(objM33623g);
            if (wj50.m88271j(((rp70) objM33623g).f201441a, obj)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (true) {
                if (i3 < i2) {
                    i4 = i3;
                    break;
                }
                Object objM33623g2 = cqi0Var.m33623g((lp70) pqi0Var.get(i3));
                wj50.m88279p(objM33623g2);
                rp70 rp70Var = (rp70) objM33623g2;
                Object obj2 = rp70Var.f201441a;
                if (obj2 == pag1.f175528a || this.f285003c.mo30353i(obj, obj2)) {
                    rp70Var.f201441a = obj;
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            m96672k(i4, i2);
        }
        this.f284995L0--;
        lp70 lp70Var = (lp70) pqi0Var.get(i2);
        Object objM33623g3 = cqi0Var.m33623g(lp70Var);
        wj50.m88279p(objM33623g3);
        rp70 rp70Var2 = (rp70) objM33623g3;
        rp70Var2.f201447g = sam.m77645B(Boolean.TRUE);
        rp70Var2.f201445e = true;
        rp70Var2.f201444d = true;
        return lp70Var;
    }
}
