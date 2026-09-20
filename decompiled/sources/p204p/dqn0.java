package p204p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class dqn0 extends AbstractC2328r7 implements ern0 {

    /* JADX INFO: renamed from: c */
    public static final dqn0 f52040c = new dqn0(lj91.f134015e, 0);

    /* JADX INFO: renamed from: a */
    public final lj91 f52041a;

    /* JADX INFO: renamed from: b */
    public final int f52042b;

    public dqn0(lj91 lj91Var, int i) {
        this.f52041a = lj91Var;
        this.f52042b = i;
    }

    @Override // p204p.AbstractC2328r7
    /* JADX INFO: renamed from: a */
    public final Set mo36657a() {
        return new rqn0(this, 0);
    }

    @Override // p204p.AbstractC2328r7
    /* JADX INFO: renamed from: b */
    public final Set mo36658b() {
        return new rqn0(this, 1);
    }

    @Override // p204p.ern0
    public final crn0 builder() {
        return new hqn0(this);
    }

    @Override // p204p.AbstractC2328r7
    /* JADX INFO: renamed from: c */
    public final int mo36659c() {
        return this.f52042b;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f52041a.m59119d(obj == null ? 0 : obj.hashCode(), 0, obj);
    }

    @Override // p204p.AbstractC2328r7
    /* JADX INFO: renamed from: d */
    public final Collection mo36660d() {
        return new xqn0(this, 0);
    }

    @Override // p204p.ern0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final dqn0 mo36663m(Object obj, Object obj2) {
        t9w0 t9w0VarM59136v = this.f52041a.m59136v(obj == null ? 0 : obj.hashCode(), obj, obj2, 0);
        if (t9w0VarM59136v == null) {
            return this;
        }
        return new dqn0(t9w0VarM59136v.m80317b(), t9w0VarM59136v.m80319d() + this.f52042b);
    }

    @Override // p204p.AbstractC2328r7, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (mo36659c() != map.size()) {
            return false;
        }
        boolean z = map instanceof grn0;
        lj91 lj91Var = this.f52041a;
        if (z) {
            return lj91Var.m59122g(((grn0) obj).f83800c.f52041a, cqn0.f40946b);
        }
        if (map instanceof hrn0) {
            return lj91Var.m59122g(((hrn0) obj).m48400e().m48303g(), cqn0.f40948c);
        }
        if (map instanceof dqn0) {
            return lj91Var.m59122g(((dqn0) obj).f52041a, cqn0.f40950d);
        }
        return map instanceof hqn0 ? lj91Var.m59122g(((hqn0) obj).m48303g(), cqn0.f40951e) : super.equals(obj);
    }

    @Override // p204p.ern0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final dqn0 remove(Object obj) {
        int iHashCode = obj == null ? 0 : obj.hashCode();
        lj91 lj91Var = this.f52041a;
        lj91 lj91VarM59137w = lj91Var.m59137w(iHashCode, 0, obj);
        if (lj91Var == lj91VarM59137w) {
            return this;
        }
        if (lj91VarM59137w != null) {
            return new dqn0(lj91VarM59137w, this.f52042b - 1);
        }
        nwg1.m65786v();
        return f52040c;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f52041a.m59123h(obj == null ? 0 : obj.hashCode(), 0, obj);
    }
}
