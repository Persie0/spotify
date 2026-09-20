package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class hrn0 extends AbstractC2404t8 implements crn0 {

    /* JADX INFO: renamed from: a */
    public grn0 f94489a;

    /* JADX INFO: renamed from: b */
    public Object f94490b;

    /* JADX INFO: renamed from: c */
    public Object f94491c;

    /* JADX INFO: renamed from: d */
    public final hqn0 f94492d;

    public hrn0(grn0 grn0Var) {
        this.f94489a = grn0Var;
        this.f94490b = grn0Var.f83798a;
        this.f94491c = grn0Var.f83799b;
        dqn0 dqn0Var = grn0Var.f83800c;
        dqn0Var.getClass();
        this.f94492d = new hqn0(dqn0Var);
    }

    @Override // p204p.AbstractC2404t8
    /* JADX INFO: renamed from: a */
    public final Set mo48297a() {
        return new lqn0(this, 1);
    }

    @Override // p204p.AbstractC2404t8
    /* JADX INFO: renamed from: b */
    public final Set mo48298b() {
        return new oqn0(this, 1);
    }

    @Override // p204p.crn0
    public final ern0 build() {
        dqn0 dqn0VarBuild = this.f94492d.build();
        grn0 grn0Var = this.f94489a;
        if (dqn0VarBuild == grn0Var.f83800c) {
            Object obj = grn0Var.f83798a;
            Object obj2 = grn0Var.f83799b;
        } else {
            grn0Var = new grn0(this.f94490b, this.f94491c, dqn0VarBuild);
        }
        this.f94489a = grn0Var;
        return grn0Var;
    }

    @Override // p204p.AbstractC2404t8
    /* JADX INFO: renamed from: c */
    public final int mo48299c() {
        return this.f94492d.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f94492d.clear();
        t6x0 t6x0Var = t6x0.f217624Q0;
        this.f94490b = t6x0Var;
        this.f94491c = t6x0Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f94492d.containsKey(obj);
    }

    @Override // p204p.AbstractC2404t8
    /* JADX INFO: renamed from: d */
    public final Collection mo48300d() {
        return new oec0(this, 3);
    }

    /* JADX INFO: renamed from: e */
    public final hqn0 m48400e() {
        return this.f94492d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        boolean z = map instanceof grn0;
        hqn0 hqn0Var = this.f94492d;
        if (z) {
            return hqn0Var.f94224c.m59122g(((grn0) obj).f83800c.f52041a, cqn0.f40927L0);
        }
        if (map instanceof hrn0) {
            return hqn0Var.f94224c.m59122g(((hrn0) obj).f94492d.f94224c, cqn0.f40928M0);
        }
        if (map instanceof dqn0) {
            return hqn0Var.f94224c.m59122g(((dqn0) obj).f52041a, cqn0.f40929N0);
        }
        if (map instanceof hqn0) {
            return hqn0Var.f94224c.m59122g(((hqn0) obj).f94224c, cqn0.f40930O0);
        }
        if (size() != map.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (map.isEmpty()) {
            return true;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!oqg1.m67637f(this, (Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        tn80 tn80Var = (tn80) this.f94492d.get(obj);
        if (tn80Var == null) {
            return null;
        }
        return tn80Var.f221904a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        hqn0 hqn0Var = this.f94492d;
        tn80 tn80Var = (tn80) hqn0Var.get(obj);
        if (tn80Var != null) {
            Object obj3 = tn80Var.f221904a;
            if (obj3 == obj2) {
                return obj2;
            }
            hqn0Var.put(obj, tn80Var.m81168h(obj2));
            return obj3;
        }
        if (isEmpty()) {
            this.f94490b = obj;
            this.f94491c = obj;
            hqn0Var.put(obj, new tn80(obj2));
            return null;
        }
        Object obj4 = this.f94491c;
        Object obj5 = hqn0Var.get(obj4);
        wj50.m88279p(obj5);
        hqn0Var.put(obj4, ((tn80) obj5).m81166f(obj));
        hqn0Var.put(obj, new tn80(obj2, obj4));
        this.f94491c = obj;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        hqn0 hqn0Var = this.f94492d;
        tn80 tn80Var = (tn80) hqn0Var.remove(obj);
        if (tn80Var == null) {
            return null;
        }
        Object obj2 = tn80Var.f221906c;
        Object obj3 = tn80Var.f221905b;
        if (tn80Var.m81162b()) {
            V v = hqn0Var.get(obj3);
            wj50.m88279p(v);
            hqn0Var.put(obj3, ((tn80) v).m81166f(obj2));
        } else {
            this.f94490b = obj2;
        }
        if (tn80Var.m81161a()) {
            V v2 = hqn0Var.get(obj2);
            wj50.m88279p(v2);
            hqn0Var.put(obj2, ((tn80) v2).m81167g(obj3));
        } else {
            this.f94491c = obj3;
        }
        return tn80Var.f221904a;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        tn80 tn80Var = (tn80) this.f94492d.get(obj);
        if (tn80Var == null || !wj50.m88271j(tn80Var.f221904a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
