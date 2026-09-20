package p204p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class orn0 extends AbstractC2285q9 implements xrn0 {

    /* JADX INFO: renamed from: d */
    public static final orn0 f168627d;

    /* JADX INFO: renamed from: a */
    public final Object f168628a;

    /* JADX INFO: renamed from: b */
    public final Object f168629b;

    /* JADX INFO: renamed from: c */
    public final dqn0 f168630c;

    static {
        t6x0 t6x0Var = t6x0.f217624Q0;
        dqn0 dqn0Var = dqn0.f52040c;
        nwg1.m65786v();
        f168627d = new orn0(t6x0Var, t6x0Var, dqn0.f52040c);
    }

    public orn0(Object obj, Object obj2, dqn0 dqn0Var) {
        this.f168628a = obj;
        this.f168629b = obj2;
        this.f168630c = dqn0Var;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        return this.f168630c.mo36659c();
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f168630c.containsKey(obj);
    }

    @Override // p204p.AbstractC2285q9, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        dqn0 dqn0Var = this.f168630c;
        Set set = (Set) obj;
        if (dqn0Var.mo36659c() != set.size()) {
            return false;
        }
        if (set instanceof orn0) {
            return dqn0Var.f52041a.m59122g(((orn0) obj).f168630c.f52041a, cqn0.f40931P0);
        }
        return set instanceof qrn0 ? dqn0Var.f52041a.m59122g(((qrn0) obj).m73655d().m48303g(), cqn0.f40932Q0) : super.equals(obj);
    }

    @Override // p204p.AbstractC2285q9, java.util.Collection, java.util.Set
    public final int hashCode() {
        return yjg1.m93930v(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new srn0(this.f168628a, this.f168630c);
    }
}
