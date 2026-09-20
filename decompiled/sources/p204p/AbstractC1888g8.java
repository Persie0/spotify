package p204p;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: p.g8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1888g8 extends AbstractC2329r8 implements Serializable {

    /* JADX INFO: renamed from: e */
    public transient Map f77371e;

    /* JADX INFO: renamed from: f */
    public transient int f77372f;

    public AbstractC1888g8(Map map) {
        c95.m31843i(map.isEmpty());
        this.f77371e = map;
    }

    @Override // p204p.eai0
    public final void clear() {
        Iterator it = this.f77371e.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f77371e.clear();
        this.f77372f = 0;
    }

    @Override // p204p.AbstractC2329r8
    /* JADX INFO: renamed from: e */
    public Map mo43931e() {
        return new C2485v7(this, this.f77371e, 0);
    }

    @Override // p204p.AbstractC2329r8
    /* JADX INFO: renamed from: f */
    public final Collection mo43932f() {
        return this instanceof qd20 ? new C2284q8(this, 0) : new C2247p8(this, 0);
    }

    @Override // p204p.AbstractC2329r8
    /* JADX INFO: renamed from: g */
    public Set mo43933g() {
        return new C2523w7(this, this.f77371e);
    }

    @Override // p204p.eai0
    public Collection get(Object obj) {
        Collection collectionMo43935i = (Collection) this.f77371e.get(obj);
        if (collectionMo43935i == null) {
            collectionMo43935i = mo43935i();
        }
        return mo43938l(obj, collectionMo43935i);
    }

    @Override // p204p.AbstractC2329r8
    /* JADX INFO: renamed from: h */
    public final Iterator mo43934h() {
        return new C2365s7(this, 1);
    }

    /* JADX INFO: renamed from: i */
    public abstract Collection mo43935i();

    /* JADX INFO: renamed from: j */
    public boolean m43936j(Object obj, Object obj2) {
        Collection collection = (Collection) this.f77371e.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f77372f++;
            return true;
        }
        Collection collectionMo43935i = mo43935i();
        if (!collectionMo43935i.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f77372f++;
        this.f77371e.put(obj, collectionMo43935i);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m43937k(Map map) {
        this.f77371e = map;
        this.f77372f = 0;
        for (Collection collection : map.values()) {
            c95.m31843i(!collection.isEmpty());
            this.f77372f = collection.size() + this.f77372f;
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract Collection mo43938l(Object obj, Collection collection);

    @Override // p204p.eai0
    public final int size() {
        return this.f77372f;
    }
}
