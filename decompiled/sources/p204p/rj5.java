package p204p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class rj5 implements Collection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uj5 f199723a;

    public rj5(uj5 uj5Var) {
        this.f199723a = uj5Var;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f199723a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f199723a.m25307a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f199723a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new sj5(this.f199723a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        uj5 uj5Var = this.f199723a;
        int iM25307a = uj5Var.m25307a(obj);
        if (iM25307a < 0) {
            return false;
        }
        uj5Var.m25313g(iM25307a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        uj5 uj5Var = this.f199723a;
        int i = uj5Var.f13976c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(uj5Var.m25315i(i2))) {
                uj5Var.m25313g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        uj5 uj5Var = this.f199723a;
        int i = uj5Var.f13976c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(uj5Var.m25315i(i2))) {
                uj5Var.m25313g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f199723a.f13976c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        uj5 uj5Var = this.f199723a;
        int i = uj5Var.f13976c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = uj5Var.m25315i(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        uj5 uj5Var = this.f199723a;
        int i = uj5Var.f13976c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = uj5Var.m25315i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
