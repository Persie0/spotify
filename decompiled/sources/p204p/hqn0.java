package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class hqn0 extends AbstractC2404t8 implements crn0 {

    /* JADX INFO: renamed from: a */
    public dqn0 f94222a;

    /* JADX INFO: renamed from: b */
    public oh3 f94223b = new oh3(18);

    /* JADX INFO: renamed from: c */
    public lj91 f94224c;

    /* JADX INFO: renamed from: d */
    public Object f94225d;

    /* JADX INFO: renamed from: e */
    public int f94226e;

    /* JADX INFO: renamed from: f */
    public int f94227f;

    public hqn0(dqn0 dqn0Var) {
        this.f94222a = dqn0Var;
        this.f94224c = dqn0Var.f52041a;
        this.f94227f = dqn0Var.mo36659c();
    }

    @Override // p204p.AbstractC2404t8
    /* JADX INFO: renamed from: a */
    public final Set mo48297a() {
        return new lqn0(this, 0);
    }

    @Override // p204p.AbstractC2404t8
    /* JADX INFO: renamed from: b */
    public final Set mo48298b() {
        return new oqn0(this, 0);
    }

    @Override // p204p.AbstractC2404t8
    /* JADX INFO: renamed from: c */
    public final int mo48299c() {
        return this.f94227f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f94224c = lj91.f134015e;
        m48307k(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f94224c.m59119d(obj == null ? 0 : obj.hashCode(), 0, obj);
    }

    @Override // p204p.AbstractC2404t8
    /* JADX INFO: renamed from: d */
    public final Collection mo48300d() {
        return new oec0(this, 1);
    }

    @Override // p204p.crn0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final dqn0 build() {
        lj91 lj91Var = this.f94224c;
        dqn0 dqn0Var = this.f94222a;
        if (lj91Var != dqn0Var.f52041a) {
            this.f94223b = new oh3(18);
            dqn0Var = new dqn0(this.f94224c, size());
        }
        this.f94222a = dqn0Var;
        return dqn0Var;
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
        if (map instanceof dqn0) {
            return this.f94224c.m59122g(((dqn0) obj).f52041a, cqn0.f40952f);
        }
        if (map instanceof hqn0) {
            return this.f94224c.m59122g(((hqn0) obj).f94224c, cqn0.f40953g);
        }
        if (map instanceof grn0) {
            return this.f94224c.m59122g(((grn0) obj).f83800c.f52041a, cqn0.f40954h);
        }
        if (map instanceof hrn0) {
            return this.f94224c.m59122g(((hrn0) obj).f94492d.f94224c, cqn0.f40955i);
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

    /* JADX INFO: renamed from: f */
    public final int m48302f() {
        return this.f94226e;
    }

    /* JADX INFO: renamed from: g */
    public final lj91 m48303g() {
        return this.f94224c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return this.f94224c.m59123h(obj == null ? 0 : obj.hashCode(), 0, obj);
    }

    /* JADX INFO: renamed from: h */
    public final oh3 m48304h() {
        return this.f94223b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m48305i(int i) {
        this.f94226e = i;
    }

    /* JADX INFO: renamed from: j */
    public final void m48306j(Object obj) {
        this.f94225d = obj;
    }

    /* JADX INFO: renamed from: k */
    public final void m48307k(int i) {
        this.f94227f = i;
        this.f94226e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f94225d = null;
        this.f94224c = this.f94224c.m59127m(obj == null ? 0 : obj.hashCode(), obj, obj2, 0, this);
        return this.f94225d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        dqn0 dqn0VarBuild = null;
        dqn0 dqn0Var = map instanceof dqn0 ? (dqn0) map : null;
        if (dqn0Var == null) {
            hqn0 hqn0Var = map instanceof hqn0 ? (hqn0) map : null;
            if (hqn0Var != null) {
                dqn0VarBuild = hqn0Var.build();
            }
        } else {
            dqn0VarBuild = dqn0Var;
        }
        if (dqn0VarBuild == null) {
            super.putAll(map);
            return;
        }
        aqq aqqVar = new aqq();
        aqqVar.f18758a = 0;
        int size = size();
        this.f94224c = this.f94224c.m59128n(dqn0VarBuild.f52041a, 0, aqqVar, this);
        int iMo36659c = (dqn0VarBuild.mo36659c() + size) - aqqVar.f18758a;
        if (size != iMo36659c) {
            m48307k(iMo36659c);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        this.f94225d = null;
        lj91 lj91VarM59129o = this.f94224c.m59129o(obj == null ? 0 : obj.hashCode(), obj, 0, this);
        if (lj91VarM59129o == null) {
            lj91VarM59129o = lj91.f134015e;
        }
        this.f94224c = lj91VarM59129o;
        return this.f94225d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        lj91 lj91VarM59130p = this.f94224c.m59130p(obj == null ? 0 : obj.hashCode(), obj, obj2, 0, this);
        if (lj91VarM59130p == null) {
            lj91VarM59130p = lj91.f134015e;
        }
        this.f94224c = lj91VarM59130p;
        return size != size();
    }
}
