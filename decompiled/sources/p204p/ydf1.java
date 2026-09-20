package p204p;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public class ydf1 extends AbstractCollection implements List {

    /* JADX INFO: renamed from: a */
    public final Object f271748a;

    /* JADX INFO: renamed from: b */
    public Collection f271749b;

    /* JADX INFO: renamed from: c */
    public final ydf1 f271750c;

    /* JADX INFO: renamed from: d */
    public final Collection f271751d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ qgf1 f271752e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ qgf1 f271753f;

    public ydf1(qgf1 qgf1Var, Object obj, List list, ydf1 ydf1Var) {
        this.f271753f = qgf1Var;
        this.f271752e = qgf1Var;
        this.f271748a = obj;
        this.f271749b = list;
        this.f271750c = ydf1Var;
        this.f271751d = ydf1Var == null ? null : ydf1Var.f271749b;
    }

    /* JADX INFO: renamed from: a */
    public final void m93431a() {
        ydf1 ydf1Var = this.f271750c;
        if (ydf1Var != null) {
            ydf1Var.m93431a();
        } else if (this.f271749b.isEmpty()) {
            this.f271752e.f188464c.remove(this.f271748a);
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean zIsEmpty = this.f271749b.isEmpty();
        ((List) this.f271749b).add(i, obj);
        if (zIsEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f271749b).addAll(i, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f271749b.size();
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (size() == 0) {
            return;
        }
        this.f271749b.clear();
        m93431a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        zzb();
        return this.f271749b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f271749b.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f271749b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f271749b).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        zzb();
        return this.f271749b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f271749b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        zzb();
        return new C2442u7(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f271749b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new cdf1(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object objRemove = ((List) this.f271749b).remove(i);
        m93431a();
        return objRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        size();
        boolean zRemoveAll = this.f271749b.removeAll(collection);
        if (zRemoveAll) {
            this.f271749b.size();
            m93431a();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        size();
        boolean zRetainAll = this.f271749b.retainAll(collection);
        if (zRetainAll) {
            this.f271749b.size();
            m93431a();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f271749b).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzb();
        return this.f271749b.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List listSubList = ((List) this.f271749b).subList(i, i2);
        ydf1 ydf1Var = this.f271750c;
        if (ydf1Var == null) {
            ydf1Var = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        Object obj = this.f271748a;
        qgf1 qgf1Var = this.f271753f;
        return z ? new uaf1(qgf1Var, obj, listSubList, ydf1Var) : new ydf1(qgf1Var, obj, listSubList, ydf1Var);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f271749b.toString();
    }

    public final void zza() {
        ydf1 ydf1Var = this.f271750c;
        if (ydf1Var != null) {
            ydf1Var.zza();
            return;
        }
        this.f271752e.f188464c.put(this.f271748a, this.f271749b);
    }

    public final void zzb() {
        ydf1 ydf1Var = this.f271750c;
        if (ydf1Var != null) {
            ydf1Var.zzb();
            if (ydf1Var.f271749b != this.f271751d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f271749b.isEmpty()) {
            Collection collection = (Collection) this.f271752e.f188464c.get(this.f271748a);
            if (collection != null) {
                this.f271749b = collection;
            }
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new cdf1(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f271749b.remove(obj);
        if (zRemove) {
            m93431a();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f271749b.isEmpty();
        boolean zAdd = this.f271749b.add(obj);
        if (!zAdd || !zIsEmpty) {
            return zAdd;
        }
        zza();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f271749b.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f271749b.size();
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }
}
