package p204p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class qrn0 extends AbstractC2444u8 implements wrn0 {

    /* JADX INFO: renamed from: a */
    public orn0 f191887a;

    /* JADX INFO: renamed from: b */
    public Object f191888b;

    /* JADX INFO: renamed from: c */
    public Object f191889c;

    /* JADX INFO: renamed from: d */
    public final hqn0 f191890d;

    public qrn0(orn0 orn0Var) {
        this.f191887a = orn0Var;
        this.f191888b = orn0Var.f168628a;
        this.f191889c = orn0Var.f168629b;
        dqn0 dqn0Var = orn0Var.f168630c;
        dqn0Var.getClass();
        this.f191890d = new hqn0(dqn0Var);
    }

    @Override // p204p.AbstractC2444u8
    /* JADX INFO: renamed from: a */
    public final int mo59769a() {
        return this.f191890d.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        t6x0 t6x0Var = t6x0.f217624Q0;
        hqn0 hqn0Var = this.f191890d;
        if (hqn0Var.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.f191888b = obj;
            this.f191889c = obj;
            hqn0Var.put(obj, new yn80(t6x0Var, t6x0Var));
            return true;
        }
        Object obj2 = hqn0Var.get(this.f191889c);
        wj50.m88279p(obj2);
        hqn0Var.put(this.f191889c, new yn80(((yn80) obj2).f274418a, obj));
        hqn0Var.put(obj, new yn80(this.f191889c, t6x0Var));
        this.f191889c = obj;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final orn0 m73654b() {
        dqn0 dqn0VarBuild = this.f191890d.build();
        orn0 orn0Var = this.f191887a;
        if (dqn0VarBuild != orn0Var.f168630c) {
            orn0Var = new orn0(this.f191888b, this.f191889c, dqn0VarBuild);
        }
        this.f191887a = orn0Var;
        return orn0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f191890d.clear();
        t6x0 t6x0Var = t6x0.f217624Q0;
        this.f191888b = t6x0Var;
        this.f191889c = t6x0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f191890d.containsKey(obj);
    }

    /* JADX INFO: renamed from: d */
    public final hqn0 m73655d() {
        return this.f191890d;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (mo59769a() != set.size()) {
            return false;
        }
        boolean z = set instanceof orn0;
        hqn0 hqn0Var = this.f191890d;
        if (z) {
            return hqn0Var.f94224c.m59122g(((orn0) obj).f168630c.f52041a, cqn0.f40933R0);
        }
        return set instanceof qrn0 ? hqn0Var.f94224c.m59122g(((qrn0) obj).f191890d.f94224c, cqn0.f40934S0) : super.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new trn0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        hqn0 hqn0Var = this.f191890d;
        yn80 yn80Var = (yn80) hqn0Var.remove(obj);
        if (yn80Var == null) {
            return false;
        }
        Object obj2 = yn80Var.f274419b;
        Object obj3 = yn80Var.f274418a;
        t6x0 t6x0Var = t6x0.f217624Q0;
        if (obj3 != t6x0Var) {
            Object obj4 = hqn0Var.get(obj3);
            wj50.m88279p(obj4);
            hqn0Var.put(obj3, new yn80(((yn80) obj4).f274418a, obj2));
        } else {
            this.f191888b = obj2;
        }
        if (obj2 == t6x0Var) {
            this.f191889c = obj3;
            return true;
        }
        Object obj5 = hqn0Var.get(obj2);
        wj50.m88279p(obj5);
        hqn0Var.put(obj2, new yn80(obj3, ((yn80) obj5).f274419b));
        return true;
    }
}
