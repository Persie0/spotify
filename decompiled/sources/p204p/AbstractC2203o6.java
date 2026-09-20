package p204p;

import android.view.KeyEvent;

/* JADX INFO: renamed from: p.o6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2203o6 extends xlq implements n6q0, ju60, apz0, ce91, osh, eqk0, wo40, h510 {

    /* JADX INFO: renamed from: i1 */
    public static final ykq0 f162160i1 = new ykq0(29);

    /* JADX INFO: renamed from: O0 */
    public voi0 f162161O0;

    /* JADX INFO: renamed from: P0 */
    public ho40 f162162P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f162163Q0;

    /* JADX INFO: renamed from: R0 */
    public String f162164R0;

    /* JADX INFO: renamed from: S0 */
    public tix0 f162165S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f162166T0;

    /* JADX INFO: renamed from: U0 */
    public eh00 f162167U0;

    /* JADX INFO: renamed from: V0 */
    public final vqz f162168V0;

    /* JADX INFO: renamed from: W0 */
    public ho40 f162169W0;

    /* JADX INFO: renamed from: X0 */
    public j510 f162170X0;

    /* JADX INFO: renamed from: Y0 */
    public jlq f162171Y0;

    /* JADX INFO: renamed from: Z0 */
    public m3r0 f162172Z0;

    /* JADX INFO: renamed from: a1 */
    public gc30 f162173a1;

    /* JADX INFO: renamed from: b1 */
    public final zoi0 f162174b1;

    /* JADX INFO: renamed from: c1 */
    public long f162175c1;

    /* JADX INFO: renamed from: d1 */
    public m3r0 f162176d1;

    /* JADX INFO: renamed from: e1 */
    public voi0 f162177e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f162178f1;

    /* JADX INFO: renamed from: g1 */
    public di41 f162179g1;

    /* JADX INFO: renamed from: h1 */
    public final ykq0 f162180h1;

    public AbstractC2203o6(voi0 voi0Var, ho40 ho40Var, boolean z, boolean z2, String str, tix0 tix0Var, eh00 eh00Var) {
        this.f162161O0 = voi0Var;
        this.f162162P0 = ho40Var;
        this.f162163Q0 = z;
        this.f162164R0 = str;
        this.f162165S0 = tix0Var;
        this.f162166T0 = z2;
        this.f162167U0 = eh00Var;
        this.f162168V0 = new vqz(voi0Var, 0, new C2401t5(this));
        int i = f2b0.f65145a;
        this.f162174b1 = new zoi0(6);
        this.f162175c1 = 0L;
        voi0 voi0Var2 = this.f162161O0;
        this.f162177e1 = voi0Var2;
        this.f162178f1 = voi0Var2 == null;
        this.f162180h1 = f162160i1;
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: A1 */
    public final void mo25064A1() {
        m66311L1();
        if (this.f162177e1 == null) {
            this.f162161O0 = null;
        }
        jlq jlqVar = this.f162171Y0;
        if (jlqVar != null) {
            m91438I1(jlqVar);
        }
        this.f162171Y0 = null;
        j510 j510Var = this.f162170X0;
        if (j510Var != null) {
            m91438I1(j510Var);
        }
        this.f162170X0 = null;
    }

    @Override // p204p.n6q0
    /* JADX INFO: renamed from: E0 */
    public void mo39625E0(e6q0 e6q0Var, f6q0 f6q0Var, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.f162175c1 = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        m66317R1();
        if (this.f162166T0) {
            if (this.f162170X0 == null) {
                j510 j510VarM51373n = iqg1.m51373n(this);
                m91437H1(j510VarM51373n);
                this.f162170X0 = j510VarM51373n;
            }
            if (f6q0Var == f6q0.f66486b) {
                int i = e6q0Var.f56709f;
                fbk fbkVar = null;
                if (gv90.m45878u(i, 4)) {
                    x0h1.m89578u(m40262v1(), null, 0, new C2153n6(this, fbkVar, 0), 3);
                } else if (gv90.m45878u(i, 5)) {
                    x0h1.m89578u(m40262v1(), null, 0, new C2153n6(this, fbkVar, 1), 3);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c A[RETURN] */
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
    @Override // p204p.ju60
    /* JADX INFO: renamed from: I0 */
    public final boolean mo46182I0(KeyEvent keyEvent) {
        boolean z;
        m66317R1();
        long jM39797o = erg1.m39797o(keyEvent);
        boolean z2 = this.f162166T0;
        fbk fbkVar = null;
        zoi0 zoi0Var = this.f162174b1;
        if (!z2 || !hdi.m47239p(keyEvent)) {
            if (this.f162166T0 && hdi.m47238o(keyEvent)) {
                m3r0 m3r0Var = (m3r0) zoi0Var.m96625f(jM39797o);
                if (m3r0Var != null) {
                    if (this.f162161O0 != null) {
                        x0h1.m89578u(m40262v1(), null, 0, new C2116m6(this, m3r0Var, fbkVar, 3), 3);
                    }
                    mo66320U1(keyEvent);
                }
                if (m3r0Var != null) {
                    return true;
                }
            }
            return false;
        }
        if (zoi0Var.m96621b(jM39797o)) {
            z = false;
        } else {
            m3r0 m3r0Var2 = new m3r0(this.f162175c1);
            zoi0Var.m96626g(jM39797o, m3r0Var2);
            if (this.f162161O0 != null) {
                x0h1.m89578u(m40262v1(), null, 0, new C2116m6(this, m3r0Var2, fbkVar, 2), 3);
            }
            z = true;
        }
        if (mo66319T1(keyEvent) || z) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    /* JADX INFO: renamed from: L1 */
    public final void m66311L1() {
        voi0 voi0Var = this.f162161O0;
        zoi0 zoi0Var = this.f162174b1;
        if (voi0Var != null) {
            m3r0 m3r0Var = this.f162172Z0;
            if (m3r0Var != null) {
                voi0Var.mo86072a(new l3r0(m3r0Var));
            }
            m3r0 m3r0Var2 = this.f162176d1;
            if (m3r0Var2 != null) {
                voi0Var.mo86072a(new l3r0(m3r0Var2));
            }
            gc30 gc30Var = this.f162173a1;
            if (gc30Var != null) {
                voi0Var.mo86072a(new hc30(gc30Var));
            }
            Object[] objArr = zoi0Var.f284797c;
            long[] jArr = zoi0Var.f284795a;
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
                            if ((255 & j) < 128) {
                                voi0Var.mo86072a(new l3r0((m3r0) objArr[(i << 3) + i3]));
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
        }
        this.f162172Z0 = null;
        this.f162176d1 = null;
        this.f162173a1 = null;
        zoi0Var.m96620a();
    }

    @Override // p204p.n6q0
    /* JADX INFO: renamed from: M0 */
    public void mo39628M0() {
        gc30 gc30Var;
        voi0 voi0Var = this.f162161O0;
        if (voi0Var != null && (gc30Var = this.f162173a1) != null) {
            voi0Var.mo86072a(new hc30(gc30Var));
        }
        this.f162173a1 = null;
    }

    /* JADX INFO: renamed from: M1 */
    public final long m66312M1(long j) {
        long jMo35991l1 = wjg1.m88315E(this).mo35991l1(((pec1) oqg1.m67639h(this, wsh.f254629t)).mo51232e());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jMo35991l1 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo35991l1 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    /* JADX INFO: renamed from: N1 */
    public final void m66313N1(boolean z) {
        voi0 voi0Var = this.f162161O0;
        if (voi0Var != null) {
            di41 di41Var = this.f162179g1;
            fbk fbkVar = null;
            if (di41Var == null || !di41Var.isActive()) {
                m3r0 m3r0Var = z ? this.f162176d1 : this.f162172Z0;
                if (m3r0Var != null) {
                    l3r0 l3r0Var = new l3r0(m3r0Var);
                    tf60 tf60Var = (tf60) ((c9k) m40262v1()).f35578a.mo26595B(gk40.f80712X0);
                    x0h1.m89578u(m40262v1(), null, 0, new C1968i6(voi0Var, l3r0Var, tf60Var != null ? tf60Var.mo26599N(new C1926h6(0, voi0Var, l3r0Var)) : null, fbkVar, 0), 3);
                }
            } else {
                di41 di41Var2 = this.f162179g1;
                if (di41Var2 != null) {
                    di41Var2.mo26601e(null);
                }
            }
            if (z) {
                this.f162176d1 = null;
            } else {
                this.f162172Z0 = null;
            }
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final void m66314O1(long j, boolean z) {
        voi0 voi0Var = this.f162161O0;
        if (voi0Var != null) {
            di41 di41Var = this.f162179g1;
            if (di41Var == null || !di41Var.isActive()) {
                m3r0 m3r0Var = z ? this.f162176d1 : this.f162172Z0;
                if (m3r0Var != null) {
                    x0h1.m89578u(m40262v1(), null, 0, new C2041k6(m3r0Var, voi0Var, null), 3);
                }
            } else {
                di41Var.mo26601e(null);
                x0h1.m89578u(m40262v1(), null, 0, new C2004j6(di41Var, j, voi0Var, (fbk) null, 0), 3);
            }
            if (z) {
                this.f162176d1 = null;
            } else {
                this.f162172Z0 = null;
            }
        }
    }

    /* JADX INFO: renamed from: P1 */
    public final void m66315P1(po40 po40Var) {
        voi0 voi0Var = this.f162161O0;
        if (voi0Var != null) {
            m3r0 m3r0Var = new m3r0(po40Var.m70472b());
            fbk fbkVar = null;
            if (hdi.m47211C(this, po40Var) || yie.m93735a(this)) {
                this.f162179g1 = x0h1.m89578u(m40262v1(), null, 0, new C2079l6(voi0Var, m3r0Var, this, fbkVar, 0), 3);
            } else {
                this.f162176d1 = m3r0Var;
                x0h1.m89578u(m40262v1(), null, 0, new C2041k6(voi0Var, m3r0Var, fbkVar, 1), 3);
            }
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m66316Q1(k6q0 k6q0Var) {
        voi0 voi0Var = this.f162161O0;
        if (voi0Var != null) {
            m3r0 m3r0Var = new m3r0(k6q0Var.m55605e());
            fbk fbkVar = null;
            if (hdi.m47212D(this, k6q0Var) || yie.m93735a(this)) {
                this.f162179g1 = x0h1.m89578u(m40262v1(), null, 0, new C2079l6(voi0Var, m3r0Var, this, fbkVar, 1), 3);
            } else {
                this.f162172Z0 = m3r0Var;
                x0h1.m89578u(m40262v1(), null, 0, new C2041k6(voi0Var, m3r0Var, fbkVar, 2), 3);
            }
        }
    }

    /* JADX INFO: renamed from: R1 */
    public final void m66317R1() {
        if (this.f162171Y0 != null) {
            return;
        }
        ho40 ho40Var = this.f162163Q0 ? this.f162169W0 : this.f162162P0;
        if (ho40Var != null) {
            if (this.f162161O0 == null) {
                this.f162161O0 = hbg1.m47035f();
            }
            this.f162168V0.m86258L1(this.f162161O0);
            voi0 voi0Var = this.f162161O0;
            wj50.m88279p(voi0Var);
            jlq jlqVarMo42260a = ho40Var.mo42260a(voi0Var);
            m91437H1(jlqVarMo42260a);
            this.f162171Y0 = jlqVarMo42260a;
        }
    }

    /* JADX INFO: renamed from: T1 */
    public abstract boolean mo66319T1(KeyEvent keyEvent);

    /* JADX INFO: renamed from: U1 */
    public abstract void mo66320U1(KeyEvent keyEvent);

    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX INFO: renamed from: V1 */
    public final void m66321V1(voi0 voi0Var, ho40 ho40Var, boolean z, boolean z2, String str, tix0 tix0Var, eh00 eh00Var) {
        boolean z3;
        boolean z4;
        jlq jlqVar;
        if (wj50.m88271j(this.f162177e1, voi0Var)) {
            z3 = false;
        } else {
            m66311L1();
            this.f162177e1 = voi0Var;
            this.f162161O0 = voi0Var;
            z3 = true;
        }
        if (!wj50.m88271j(this.f162162P0, ho40Var)) {
            this.f162162P0 = ho40Var;
            z3 = true;
        }
        if (this.f162163Q0 != z) {
            this.f162163Q0 = z;
            if (z) {
                mo25072j0();
            }
            z3 = true;
        }
        boolean z5 = this.f162166T0;
        vqz vqzVar = this.f162168V0;
        if (z5 != z2) {
            if (z2) {
                m91437H1(vqzVar);
            } else {
                m91438I1(vqzVar);
                m66311L1();
            }
            iig1.m50728o(this);
            this.f162166T0 = z2;
        }
        if (!wj50.m88271j(this.f162164R0, str)) {
            this.f162164R0 = str;
            iig1.m50728o(this);
        }
        if (!wj50.m88271j(this.f162165S0, tix0Var)) {
            this.f162165S0 = tix0Var;
            iig1.m50728o(this);
        }
        this.f162167U0 = eh00Var;
        boolean z6 = this.f162178f1;
        voi0 voi0Var2 = this.f162177e1;
        if (z6 != (voi0Var2 == null)) {
            boolean z7 = voi0Var2 == null;
            this.f162178f1 = z7;
            z4 = (z7 || this.f162171Y0 != null) ? z3 : true;
        }
        if (z4 && ((jlqVar = this.f162171Y0) != null || !this.f162178f1)) {
            if (jlqVar != null) {
                m91438I1(jlqVar);
            }
            this.f162171Y0 = null;
            m66317R1();
        }
        vqzVar.m86258L1(this.f162161O0);
    }

    @Override // p204p.apz0
    /* JADX INFO: renamed from: g */
    public final void mo26732g(mpz0 mpz0Var) {
        tix0 tix0Var = this.f162165S0;
        if (tix0Var != null) {
            jpz0.m54007u(mpz0Var, tix0Var.f220762a);
        }
        jpz0.m53993g(mpz0Var, this.f162164R0, new C1886g6(this, 1));
        if (this.f162166T0) {
            this.f162168V0.mo26732g(mpz0Var);
        } else {
            jpz0.m53987a(mpz0Var);
        }
        mo38723K1(mpz0Var);
    }

    @Override // p204p.eqk0
    /* JADX INFO: renamed from: j0 */
    public final void mo25072j0() {
        if (this.f162163Q0) {
            frz0.m42532q(this, new C1886g6(this, 0));
        }
    }

    @Override // p204p.apz0
    /* JADX INFO: renamed from: q1 */
    public final boolean mo26734q1() {
        return true;
    }

    @Override // p204p.ce91
    /* JADX INFO: renamed from: r */
    public final Object mo26917r() {
        return this.f162180h1;
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: w1 */
    public final boolean mo32896w1() {
        return false;
    }

    @Override // p204p.ju60
    /* JADX INFO: renamed from: y0 */
    public final boolean mo46184y0(KeyEvent keyEvent) {
        return false;
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: z1 */
    public final void mo25074z1() {
        mo25072j0();
        if (!this.f162178f1) {
            m66317R1();
        }
        if (this.f162166T0) {
            m91437H1(this.f162168V0);
        }
    }

    /* JADX INFO: renamed from: S1 */
    public void mo66318S1() {
    }

    /* JADX INFO: renamed from: K1 */
    public void mo38723K1(mpz0 mpz0Var) {
    }
}
