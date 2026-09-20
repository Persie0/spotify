package p204p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class grn0 extends AbstractC2328r7 implements ern0 {

    /* JADX INFO: renamed from: d */
    public static final grn0 f83797d;

    /* JADX INFO: renamed from: a */
    public final Object f83798a;

    /* JADX INFO: renamed from: b */
    public final Object f83799b;

    /* JADX INFO: renamed from: c */
    public final dqn0 f83800c;

    static {
        t6x0 t6x0Var = t6x0.f217624Q0;
        dqn0 dqn0Var = dqn0.f52040c;
        nwg1.m65786v();
        f83797d = new grn0(t6x0Var, t6x0Var, dqn0.f52040c);
    }

    public grn0(Object obj, Object obj2, dqn0 dqn0Var) {
        this.f83798a = obj;
        this.f83799b = obj2;
        this.f83800c = dqn0Var;
    }

    @Override // p204p.AbstractC2328r7
    /* JADX INFO: renamed from: a */
    public final Set mo36657a() {
        return new rqn0(this, 2);
    }

    @Override // p204p.AbstractC2328r7
    /* JADX INFO: renamed from: b */
    public final Set mo36658b() {
        return new lrn0(this);
    }

    @Override // p204p.ern0
    public final crn0 builder() {
        return new hrn0(this);
    }

    @Override // p204p.AbstractC2328r7
    /* JADX INFO: renamed from: c */
    public final int mo36659c() {
        return this.f83800c.size();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f83800c.containsKey(obj);
    }

    @Override // p204p.AbstractC2328r7
    /* JADX INFO: renamed from: d */
    public final Collection mo36660d() {
        return new xqn0(this, 1);
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
        dqn0 dqn0Var = this.f83800c;
        if (z) {
            return dqn0Var.f52041a.m59122g(((grn0) obj).f83800c.f52041a, cqn0.f40956t);
        }
        if (map instanceof hrn0) {
            return dqn0Var.f52041a.m59122g(((hrn0) obj).m48400e().m48303g(), cqn0.f40939X);
        }
        if (map instanceof dqn0) {
            return dqn0Var.f52041a.m59122g(((dqn0) obj).f52041a, cqn0.f40941Y);
        }
        return map instanceof hqn0 ? dqn0Var.f52041a.m59122g(((hqn0) obj).m48303g(), cqn0.f40943Z) : super.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        tn80 tn80Var = (tn80) this.f83800c.get(obj);
        if (tn80Var == null) {
            return null;
        }
        return tn80Var.m81165e();
    }

    @Override // p204p.ern0
    /* JADX INFO: renamed from: m */
    public final ern0 mo36663m(Object obj, ac1 ac1Var) {
        boolean zIsEmpty = isEmpty();
        dqn0 dqn0Var = this.f83800c;
        if (zIsEmpty) {
            return new grn0(obj, obj, dqn0Var.mo36663m(obj, new tn80(ac1Var)));
        }
        tn80 tn80Var = (tn80) dqn0Var.get(obj);
        Object obj2 = this.f83799b;
        Object obj3 = this.f83798a;
        if (tn80Var != null) {
            return tn80Var.m81165e() == ac1Var ? this : new grn0(obj3, obj2, dqn0Var.mo36663m(obj, tn80Var.m81168h(ac1Var)));
        }
        Object obj4 = dqn0Var.get(obj2);
        wj50.m88279p(obj4);
        return new grn0(obj3, obj, dqn0Var.mo36663m(obj2, ((tn80) obj4).m81166f(obj)).mo36663m(obj, new tn80(ac1Var, obj2)));
    }

    @Override // p204p.ern0
    public final ern0 remove(String str) {
        dqn0 dqn0Var = this.f83800c;
        tn80 tn80Var = (tn80) dqn0Var.get(str);
        if (tn80Var == null) {
            return this;
        }
        dqn0 dqn0VarRemove = dqn0Var.remove(str);
        if (tn80Var.m81162b()) {
            Object obj = dqn0VarRemove.get(tn80Var.m81164d());
            wj50.m88279p(obj);
            dqn0VarRemove = dqn0VarRemove.mo36663m(tn80Var.m81164d(), ((tn80) obj).m81166f(tn80Var.m81163c()));
        }
        if (tn80Var.m81161a()) {
            Object obj2 = dqn0VarRemove.get(tn80Var.m81163c());
            wj50.m88279p(obj2);
            dqn0VarRemove = dqn0VarRemove.mo36663m(tn80Var.m81163c(), ((tn80) obj2).m81167g(tn80Var.m81164d()));
        }
        return new grn0(!tn80Var.m81162b() ? tn80Var.m81163c() : this.f83798a, !tn80Var.m81161a() ? tn80Var.m81164d() : this.f83799b, dqn0VarRemove);
    }
}
