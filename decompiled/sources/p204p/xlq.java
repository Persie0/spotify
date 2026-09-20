package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class xlq extends exh0 {

    /* JADX INFO: renamed from: M0 */
    public final int f263223M0 = cnj0.m33458e(this);

    /* JADX INFO: renamed from: N0 */
    public exh0 f263224N0;

    @Override // p204p.exh0
    /* JADX INFO: renamed from: C1 */
    public final void mo40257C1() {
        super.mo40257C1();
        for (exh0 exh0Var = this.f263224N0; exh0Var != null; exh0Var = exh0Var.f63775f) {
            exh0Var.mo40257C1();
        }
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: D1 */
    public final void mo40258D1() {
        for (exh0 exh0Var = this.f263224N0; exh0Var != null; exh0Var = exh0Var.f63775f) {
            exh0Var.mo40258D1();
        }
        super.mo40258D1();
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: E1 */
    public final void mo40259E1() {
        super.mo40259E1();
        for (exh0 exh0Var = this.f263224N0; exh0Var != null; exh0Var = exh0Var.f63775f) {
            exh0Var.mo40259E1();
        }
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: F1 */
    public final void mo40260F1(exh0 exh0Var) {
        this.f63770a = exh0Var;
        for (exh0 exh0Var2 = this.f263224N0; exh0Var2 != null; exh0Var2 = exh0Var2.f63775f) {
            exh0Var2.mo40260F1(exh0Var);
        }
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: G1 */
    public final void mo40261G1(bnj0 bnj0Var) {
        this.f63777h = bnj0Var;
        for (exh0 exh0Var = this.f263224N0; exh0Var != null; exh0Var = exh0Var.f63775f) {
            exh0Var.mo40261G1(bnj0Var);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m91437H1(jlq jlqVar) {
        exh0 exh0Var = ((exh0) jlqVar).f63770a;
        if (exh0Var != jlqVar) {
            exh0 exh0Var2 = jlqVar instanceof exh0 ? (exh0) jlqVar : null;
            exh0 exh0Var3 = exh0Var2 != null ? exh0Var2.f63774e : null;
            if (exh0Var != this.f63770a || !wj50.m88271j(exh0Var3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (exh0Var.f63766L0) {
            mt40.m62791c("Cannot delegate to an already attached node");
        }
        exh0Var.mo40260F1(this.f63770a);
        int i = this.f63772c;
        int iM33459f = cnj0.m33459f(exh0Var);
        exh0Var.f63772c = iM33459f;
        int i2 = this.f63772c;
        int i3 = iM33459f & 2;
        if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof dp70)) {
            mt40.m62791c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + exh0Var);
        }
        exh0Var.f63775f = this.f263224N0;
        this.f263224N0 = exh0Var;
        exh0Var.f63774e = this;
        m91439J1(iM33459f | this.f63772c, false);
        if (this.f63766L0) {
            if (i3 == 0 || (i & 2) != 0) {
                mo40261G1(this.f63777h);
            } else {
                xmj0 xmj0Var = wjg1.m88319I(this).f135674c1;
                this.f63770a.mo40261G1(null);
                xmj0Var.m91469g();
            }
            exh0Var.mo40263x1();
            exh0Var.mo40258D1();
            if (!exh0Var.f63766L0) {
                mt40.m62791c("autoInvalidateInsertedNode called on unattached node");
            }
            cnj0.m33454a(exh0Var, -1, 1);
        }
    }

    /* JADX INFO: renamed from: I1 */
    public final void m91438I1(jlq jlqVar) {
        exh0 exh0Var = null;
        for (exh0 exh0Var2 = this.f263224N0; exh0Var2 != null; exh0Var2 = exh0Var2.f63775f) {
            if (exh0Var2 == jlqVar) {
                boolean z = exh0Var2.f63766L0;
                if (z) {
                    fpi0 fpi0Var = cnj0.f40034a;
                    if (!z) {
                        mt40.m62791c("autoInvalidateRemovedNode called on unattached node");
                    }
                    cnj0.m33454a(exh0Var2, -1, 2);
                    exh0Var2.mo40259E1();
                    exh0Var2.mo40264y1();
                }
                exh0Var2.mo40260F1(exh0Var2);
                exh0Var2.f63773d = 0;
                if (exh0Var == null) {
                    this.f263224N0 = exh0Var2.f63775f;
                } else {
                    exh0Var.f63775f = exh0Var2.f63775f;
                }
                exh0Var2.f63775f = null;
                exh0Var2.f63774e = null;
                int i = this.f63772c;
                int iM33459f = cnj0.m33459f(this);
                m91439J1(iM33459f, true);
                if (this.f63766L0 && (i & 2) != 0 && (iM33459f & 2) == 0) {
                    xmj0 xmj0Var = wjg1.m88319I(this).f135674c1;
                    this.f63770a.mo40261G1(null);
                    xmj0Var.m91469g();
                    return;
                }
                return;
            }
            exh0Var = exh0Var2;
        }
        throw new IllegalStateException(("Could not find delegate: " + jlqVar).toString());
    }

    /* JADX INFO: renamed from: J1 */
    public final void m91439J1(int i, boolean z) {
        exh0 exh0Var;
        int i2 = this.f63772c;
        this.f63772c = i;
        if (i2 != i) {
            if (wjg1.m88340v(this)) {
                this.f63773d = i;
            }
            if (this.f63766L0) {
                exh0 exh0Var2 = this.f63770a;
                exh0 exh0Var3 = this;
                while (exh0Var3 != null) {
                    i |= exh0Var3.f63772c;
                    exh0Var3.f63772c = i;
                    if (exh0Var3 == exh0Var2) {
                        break;
                    } else {
                        exh0Var3 = exh0Var3.f63774e;
                    }
                }
                if (z && exh0Var3 == exh0Var2) {
                    i = cnj0.m33459f(exh0Var2);
                    exh0Var2.f63772c = i;
                }
                int i3 = i | ((exh0Var3 == null || (exh0Var = exh0Var3.f63775f) == null) ? 0 : exh0Var.f63773d);
                while (exh0Var3 != null) {
                    i3 |= exh0Var3.f63772c;
                    exh0Var3.f63773d = i3;
                    exh0Var3 = exh0Var3.f63774e;
                }
            }
        }
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: x1 */
    public final void mo40263x1() {
        super.mo40263x1();
        for (exh0 exh0Var = this.f263224N0; exh0Var != null; exh0Var = exh0Var.f63775f) {
            exh0Var.mo40261G1(this.f63777h);
            if (!exh0Var.f63766L0) {
                exh0Var.mo40263x1();
            }
        }
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: y1 */
    public final void mo40264y1() {
        for (exh0 exh0Var = this.f263224N0; exh0Var != null; exh0Var = exh0Var.f63775f) {
            exh0Var.mo40264y1();
        }
        super.mo40264y1();
    }
}
