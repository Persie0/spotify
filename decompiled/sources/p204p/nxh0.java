package p204p;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;

/* JADX INFO: loaded from: classes11.dex */
public final class nxh0 extends pqo implements mxh0 {

    /* JADX INFO: renamed from: X */
    public final vma0 f159473X;

    /* JADX INFO: renamed from: Y */
    public final wg61 f159474Y;

    /* JADX INFO: renamed from: d */
    public final bna0 f159475d;

    /* JADX INFO: renamed from: e */
    public final ib70 f159476e;

    /* JADX INFO: renamed from: f */
    public final Map f159477f;

    /* JADX INFO: renamed from: g */
    public final w3m0 f159478g;

    /* JADX INFO: renamed from: h */
    public q06 f159479h;

    /* JADX INFO: renamed from: i */
    public o3m0 f159480i;

    /* JADX INFO: renamed from: t */
    public final boolean f159481t;

    public nxh0(qti0 qti0Var, bna0 bna0Var, ib70 ib70Var, int i) {
        super(e370.f55667h, qti0Var);
        this.f159475d = bna0Var;
        this.f159476e = ib70Var;
        if (!qti0Var.f192388b) {
            throw new IllegalArgumentException("Module name must be special: " + qti0Var);
        }
        this.f159477f = nau.f152117a;
        w3m0 w3m0Var = (w3m0) mo53210Z(uty.f234013R0);
        this.f159478g = w3m0Var == null ? w3m0.f247615a : w3m0Var;
        this.f159481t = true;
        this.f159473X = bna0Var.m29937b(new jt70(this, 5));
        this.f159474Y = new wg61(new kn60(this, 1));
    }

    /* JADX INFO: renamed from: G1 */
    public final void m65845G1() {
        if (this.f159481t) {
            return;
        }
        if (mo53210Z(dt71.f52745a) != null) {
            throw new ClassCastException();
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + this);
    }

    @Override // p204p.mxh0
    /* JADX INFO: renamed from: I */
    public final v3m0 mo53208I(y400 y400Var) {
        m65845G1();
        return (v3m0) this.f159473X.invoke(y400Var);
    }

    @Override // p204p.mxh0
    /* JADX INFO: renamed from: U */
    public final boolean mo53209U(mxh0 mxh0Var) {
        if (equals(mxh0Var)) {
            return true;
        }
        wj50.m88279p(this.f159479h);
        if (g6f.m43725i0(gbu.f78413a, mxh0Var)) {
            return true;
        }
        mo53213r0();
        return mxh0Var.mo53213r0().contains(this);
    }

    @Override // p204p.mxh0
    /* JADX INFO: renamed from: Z */
    public final Object mo53210Z(l06 l06Var) {
        Object obj = this.f159477f.get(l06Var);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // p204p.mxh0
    /* JADX INFO: renamed from: g */
    public final ib70 mo53211g() {
        return this.f159476e;
    }

    @Override // p204p.mxh0
    /* JADX INFO: renamed from: m */
    public final Collection mo53212m(y400 y400Var, gh00 gh00Var) {
        m65845G1();
        m65845G1();
        return ((qrh) this.f159474Y.getValue()).mo66192m(y400Var, gh00Var);
    }

    @Override // p204p.oqo
    /* JADX INFO: renamed from: o */
    public final /* bridge */ oqo mo27379o() {
        return null;
    }

    @Override // p204p.mxh0
    /* JADX INFO: renamed from: r0 */
    public final List mo53213r0() {
        if (this.f159479h != null) {
            return lau.f131415a;
        }
        throw new AssertionError(dq60.m36616p(getName().f192387a, " were not set", new StringBuilder("Dependencies of module ")));
    }

    @Override // p204p.pqo, p204p.AbstractC1806e9
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(pqo.m70659F1(this));
        if (!this.f159481t) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        o3m0 o3m0Var = this.f159480i;
        sb.append(o3m0Var != null ? o3m0Var.getClass().getSimpleName() : null);
        return sb.toString();
    }

    @Override // p204p.oqo
    /* JADX INFO: renamed from: y */
    public final Object mo27381y(sqo sqoVar, Object obj) {
        return sqoVar.mo28178a(obj, this);
    }
}
