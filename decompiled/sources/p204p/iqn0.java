package p204p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class iqn0 extends AbstractC2404t8 implements drn0 {

    /* JADX INFO: renamed from: a */
    public eqn0 f104805a;

    /* JADX INFO: renamed from: b */
    public on3 f104806b = new on3(18);

    /* JADX INFO: renamed from: c */
    public mj91 f104807c;

    /* JADX INFO: renamed from: d */
    public Object f104808d;

    /* JADX INFO: renamed from: e */
    public int f104809e;

    /* JADX INFO: renamed from: f */
    public int f104810f;

    public iqn0(eqn0 eqn0Var) {
        this.f104805a = eqn0Var;
        this.f104807c = eqn0Var.f61928a;
        this.f104810f = eqn0Var.f61929b;
    }

    @Override // p204p.AbstractC2404t8
    /* JADX INFO: renamed from: a */
    public final Set mo48297a() {
        return new mqn0(0, this);
    }

    @Override // p204p.AbstractC2404t8
    /* JADX INFO: renamed from: b */
    public final Set mo48298b() {
        return new mqn0(1, this);
    }

    @Override // p204p.AbstractC2404t8
    /* JADX INFO: renamed from: c */
    public final int mo48299c() {
        return this.f104810f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f104807c = mj91.f144207e;
        m51389f(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f104807c.m61943d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // p204p.AbstractC2404t8
    /* JADX INFO: renamed from: d */
    public final Collection mo48300d() {
        return new oec0(this, 2);
    }

    @Override // p204p.drn0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public eqn0 build() {
        mj91 mj91Var = this.f104807c;
        eqn0 eqn0Var = this.f104805a;
        if (mj91Var != eqn0Var.f61928a) {
            this.f104806b = new on3(18);
            eqn0Var = new eqn0(this.f104807c, size());
        }
        this.f104805a = eqn0Var;
        return eqn0Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m51389f(int i) {
        this.f104810f = i;
        this.f104809e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f104807c.m61946g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f104808d = null;
        this.f104807c = this.f104807c.m61950l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f104808d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        eqn0 eqn0VarBuild = null;
        eqn0 eqn0Var = map instanceof eqn0 ? (eqn0) map : null;
        if (eqn0Var == null) {
            iqn0 iqn0Var = map instanceof iqn0 ? (iqn0) map : null;
            if (iqn0Var != null) {
                eqn0VarBuild = iqn0Var.build();
            }
        } else {
            eqn0VarBuild = eqn0Var;
        }
        if (eqn0VarBuild == null) {
            super.putAll(map);
            return;
        }
        bqq bqqVar = new bqq();
        bqqVar.f29869a = 0;
        int size = size();
        this.f104807c = this.f104807c.m61951m(eqn0VarBuild.f61928a, 0, bqqVar, this);
        int i = (eqn0VarBuild.f61929b + size) - bqqVar.f29869a;
        if (size != i) {
            m51389f(i);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f104808d = null;
        mj91 mj91VarM61952n = this.f104807c.m61952n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (mj91VarM61952n == null) {
            mj91VarM61952n = mj91.f144207e;
        }
        this.f104807c = mj91VarM61952n;
        return this.f104808d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        mj91 mj91VarM61953o = this.f104807c.m61953o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mj91VarM61953o == null) {
            mj91VarM61953o = mj91.f144207e;
        }
        this.f104807c = mj91VarM61953o;
        return size != size();
    }
}
