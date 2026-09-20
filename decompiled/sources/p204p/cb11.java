package p204p;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class cb11 implements e9w0 {

    /* JADX INFO: renamed from: X */
    public cb11 f35967X;

    /* JADX INFO: renamed from: Y */
    public a911 f35968Y;

    /* JADX INFO: renamed from: Z */
    public final yum0 f35969Z;

    /* JADX INFO: renamed from: a */
    public final yum0 f35970a = sam.m77645B(Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public final uum0 f35971b = new uum0(0.0f);

    /* JADX INFO: renamed from: c */
    public final yum0 f35972c;

    /* JADX INFO: renamed from: d */
    public final yum0 f35973d;

    /* JADX INFO: renamed from: e */
    public final yum0 f35974e;

    /* JADX INFO: renamed from: f */
    public final yum0 f35975f;

    /* JADX INFO: renamed from: g */
    public final yum0 f35976g;

    /* JADX INFO: renamed from: h */
    public final yum0 f35977h;

    /* JADX INFO: renamed from: i */
    public final yum0 f35978i;

    /* JADX INFO: renamed from: t */
    public vbn0 f35979t;

    public cb11(bb11 bb11Var, xga xgaVar, hd11 hd11Var, ed11 ed11Var) {
        Boolean bool = Boolean.TRUE;
        this.f35972c = sam.m77645B(bool);
        this.f35973d = sam.m77645B(bb11Var);
        this.f35974e = sam.m77645B(xgaVar);
        this.f35975f = sam.m77645B(cd11.f36712b);
        this.f35976g = sam.m77645B(bool);
        this.f35977h = sam.m77645B(hd11Var);
        this.f35978i = sam.m77645B(ed11Var);
        this.f35969Z = sam.m77645B(null);
    }

    /* JADX INFO: renamed from: a */
    public final xga m32121a() {
        return (xga) this.f35974e.getValue();
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: b */
    public final void mo32122b() {
        gd11 gd11Var = m32128h().f25387b;
        gd11Var.getClass();
        bb11 bb11VarM32128h = m32128h();
        bb11VarM32128h.f25389d.setValue(g6f.m43701O0(this, bb11VarM32128h.m28608b()));
        bb11VarM32128h.m28611e();
        gd11Var.m44330f();
        gb31 gb31Var = gd11Var.f78707g;
        ListIterator listIterator = gb31Var.listIterator();
        int i = 0;
        while (true) {
            e030 e030Var = (e030) listIterator;
            if (!e030Var.hasNext()) {
                i = -1;
                break;
            }
            cb11 cb11Var = (cb11) e030Var.next();
            if (!(cb11Var instanceof cb11)) {
                cb11Var = null;
            }
            if (wj50.m88271j(cb11Var != null ? cb11Var.m32128h() : null, m32128h())) {
                break;
            } else {
                i++;
            }
        }
        if (i == gb31Var.size() - 1 || i == -1) {
            gb31Var.add(this);
        } else {
            gb31Var.add(i + 1, this);
        }
        m32128h().f25388c.m69633w();
    }

    /* JADX INFO: renamed from: c */
    public final rx10 m32123c() {
        return (rx10) this.f35969Z.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final hd11 m32125e() {
        return (hd11) this.f35977h.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final dd11 m32126f() {
        return (dd11) this.f35975f.getValue();
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: g */
    public final void mo32127g() {
        gd11 gd11Var = m32128h().f25387b;
        gd11Var.getClass();
        bb11 bb11VarM32128h = m32128h();
        bb11VarM32128h.f25389d.setValue(g6f.m43696J0(bb11VarM32128h.m28608b(), this));
        bb11VarM32128h.f25390e.setValue(g6f.m43696J0(bb11VarM32128h.m28609c(), this));
        bb11VarM32128h.m28611e();
        gd11Var.m44330f();
        gd11Var.f78707g.remove(this);
        if (bb11VarM32128h.m28608b().isEmpty()) {
            x0h1.m89578u(bb11VarM32128h.f25387b.f78702b, null, 0, new eqv0(bb11VarM32128h, this, null, 24), 3);
        }
        m32128h().f25388c.m69633w();
    }

    /* JADX INFO: renamed from: h */
    public final bb11 m32128h() {
        return (bb11) this.f35973d.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m32129i() {
        if (m32121a().m90561b()) {
            return true;
        }
        return (m32128h().f25388c.m69632v().mo66734d() && !m32128h().f25388c.m69632v().mo66732b()) || !((Boolean) this.f35976g.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m32130j() {
        return m32129i() && m32128h().f25388c.m69632v().mo66734d() && m32133m() && ((Boolean) this.f35972c.getValue()).booleanValue() && m32128h().f25387b.m44329c();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m32131k() {
        if (m32128h().f25388c.m69632v().mo66734d()) {
            return !m32130j() && m32129i();
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final ed11 m32132l() {
        return (ed11) this.f35978i.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m32133m() {
        ed11 ed11VarM32132l = m32132l();
        if (!((Boolean) this.f35970a.getValue()).booleanValue()) {
            return false;
        }
        ((bd11) ed11VarM32132l.f58422b.getValue()).getClass();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m32134n(boolean z) {
        this.f35970a.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: o */
    public final void m32135o(a911 a911Var) {
        this.f35968Y = a911Var;
    }

    /* JADX INFO: renamed from: p */
    public final void m32136p(vbn0 vbn0Var) {
        this.f35979t = vbn0Var;
    }

    /* JADX INFO: renamed from: q */
    public final void m32137q(rx10 rx10Var) {
        this.f35969Z.setValue(rx10Var);
    }

    /* JADX INFO: renamed from: r */
    public final void m32138r(cb11 cb11Var) {
        this.f35967X = cb11Var;
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: d */
    public final void mo32124d() {
    }
}
