package p204p;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: p.c8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1732c8 extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    public final Object f35053a;

    /* JADX INFO: renamed from: b */
    public Collection f35054b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1732c8 f35055c;

    /* JADX INFO: renamed from: d */
    public final Collection f35056d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC1888g8 f35057e;

    public AbstractC1732c8(AbstractC1888g8 abstractC1888g8, Object obj, Collection collection, AbstractC1732c8 abstractC1732c8) {
        this.f35057e = abstractC1888g8;
        this.f35053a = obj;
        this.f35054b = collection;
        this.f35055c = abstractC1732c8;
        this.f35056d = abstractC1732c8 == null ? null : abstractC1732c8.f35054b;
    }

    /* JADX INFO: renamed from: a */
    public final void m31765a() {
        AbstractC1732c8 abstractC1732c8 = this.f35055c;
        if (abstractC1732c8 != null) {
            abstractC1732c8.m31765a();
        } else {
            this.f35057e.f77371e.put(this.f35053a, this.f35054b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        m31766b();
        boolean zIsEmpty = this.f35054b.isEmpty();
        boolean zAdd = this.f35054b.add(obj);
        if (zAdd) {
            this.f35057e.f77372f++;
            if (zIsEmpty) {
                m31765a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f35054b.addAll(collection);
        if (zAddAll) {
            this.f35057e.f77372f += this.f35054b.size() - size;
            if (size == 0) {
                m31765a();
            }
        }
        return zAddAll;
    }

    /* JADX INFO: renamed from: b */
    public final void m31766b() {
        Collection collection;
        AbstractC1732c8 abstractC1732c8 = this.f35055c;
        if (abstractC1732c8 != null) {
            abstractC1732c8.m31766b();
            if (abstractC1732c8.f35054b != this.f35056d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f35054b.isEmpty() || (collection = (Collection) this.f35057e.f77371e.get(this.f35053a)) == null) {
                return;
            }
            this.f35054b = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f35054b.clear();
        this.f35057e.f77372f -= size;
        m31767d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        m31766b();
        return this.f35054b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        m31766b();
        return this.f35054b.containsAll(collection);
    }

    /* JADX INFO: renamed from: d */
    public final void m31767d() {
        AbstractC1732c8 abstractC1732c8 = this.f35055c;
        if (abstractC1732c8 != null) {
            abstractC1732c8.m31767d();
        } else if (this.f35054b.isEmpty()) {
            this.f35057e.f77371e.remove(this.f35053a);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m31766b();
        return this.f35054b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        m31766b();
        return this.f35054b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        m31766b();
        return new C2442u7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        m31766b();
        boolean zRemove = this.f35054b.remove(obj);
        if (zRemove) {
            this.f35057e.f77372f--;
            m31767d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f35054b.removeAll(collection);
        if (zRemoveAll) {
            this.f35057e.f77372f += this.f35054b.size() - size;
            m31767d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f35054b.retainAll(collection);
        if (zRetainAll) {
            this.f35057e.f77372f += this.f35054b.size() - size;
            m31767d();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        m31766b();
        return this.f35054b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m31766b();
        return this.f35054b.toString();
    }
}
