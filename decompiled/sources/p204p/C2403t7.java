package p204p;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: p.t7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C2403t7 extends r601 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f217653b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractMap f217654c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2403t7(AbstractMap abstractMap, int i) {
        super(0);
        this.f217653b = i;
        this.f217654c = abstractMap;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m80171a(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map mapM80172b = m80172b();
        mapM80172b.getClass();
        try {
            obj2 = mapM80172b.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (upf.m83705v(obj2, entry.getValue())) {
            return obj2 != null || m80172b().containsKey(key);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final Map m80172b() {
        switch (this.f217653b) {
            case 0:
                return (C2485v7) this.f217654c;
            default:
                return (hkc0) this.f217654c;
        }
    }

    @Override // p204p.r601, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        m80172b().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f217653b) {
            case 0:
                Set setEntrySet = ((C2485v7) this.f217654c).f237997b.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return m80171a(obj);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m80173d(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return m80172b().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return m80172b().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f217653b) {
            case 0:
                return new C2442u7((C2485v7) this.f217654c);
            default:
                hkc0 hkc0Var = (hkc0) this.f217654c;
                Iterator it = hkc0Var.f92416a.entrySet().iterator();
                gkc0 gkc0Var = hkc0Var.f92417b;
                gkc0Var.getClass();
                return new ow50(it, new hy10(gkc0Var, 1));
        }
    }

    @Override // p204p.r601, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object objRemove;
        switch (this.f217653b) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC1888g8 abstractC1888g8 = (AbstractC1888g8) ((C2485v7) this.f217654c).f238000e;
                Object key = entry.getKey();
                Map map = abstractC1888g8.f77371e;
                map.getClass();
                try {
                    objRemove = map.remove(key);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    objRemove = null;
                }
                Collection collection = (Collection) objRemove;
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    abstractC1888g8.f77372f -= size;
                }
                return true;
            default:
                return m80173d(obj);
        }
    }

    @Override // p204p.r601, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return gmg1.m45238B(this, collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // p204p.r601, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(y85.m93062g(collection.size()));
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return m80172b().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return m80172b().size();
    }
}
