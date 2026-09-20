package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c4j0 implements Set, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LinkedHashSet f33962a;

    /* JADX INFO: renamed from: b */
    public final z3j0 f33963b;

    /* JADX INFO: renamed from: c */
    public final z3j0 f33964c;

    /* JADX INFO: renamed from: d */
    public final z3j0 f33965d;

    /* JADX INFO: renamed from: e */
    public final z3j0 f33966e;

    /* JADX INFO: renamed from: f */
    public final z3j0 f33967f;

    public c4j0(z3j0 z3j0Var, z3j0 z3j0Var2, z3j0 z3j0Var3, z3j0 z3j0Var4, z3j0 z3j0Var5) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(5);
        if (z3j0Var != null) {
            linkedHashSet.add(z3j0Var);
        }
        if (z3j0Var2 != null) {
            linkedHashSet.add(z3j0Var2);
        }
        if (z3j0Var3 != null) {
            linkedHashSet.add(z3j0Var3);
        }
        if (z3j0Var4 != null) {
            linkedHashSet.add(z3j0Var4);
        }
        if (z3j0Var5 != null) {
            linkedHashSet.add(z3j0Var5);
        }
        this.f33962a = linkedHashSet;
        this.f33963b = z3j0Var;
        this.f33964c = z3j0Var2;
        this.f33965d = z3j0Var3;
        this.f33966e = z3j0Var4;
        this.f33967f = z3j0Var5;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof z3j0)) {
            return false;
        }
        return this.f33962a.contains((z3j0) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f33962a.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4j0)) {
            return false;
        }
        c4j0 c4j0Var = (c4j0) obj;
        return wj50.m88271j(this.f33963b, c4j0Var.f33963b) && wj50.m88271j(this.f33964c, c4j0Var.f33964c) && wj50.m88271j(this.f33965d, c4j0Var.f33965d) && wj50.m88271j(this.f33966e, c4j0Var.f33966e) && wj50.m88271j(this.f33967f, c4j0Var.f33967f);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        z3j0 z3j0Var = this.f33963b;
        int iHashCode = (z3j0Var == null ? 0 : z3j0Var.hashCode()) * 31;
        z3j0 z3j0Var2 = this.f33964c;
        int iHashCode2 = (iHashCode + (z3j0Var2 == null ? 0 : z3j0Var2.hashCode())) * 31;
        z3j0 z3j0Var3 = this.f33965d;
        int iHashCode3 = (iHashCode2 + (z3j0Var3 == null ? 0 : z3j0Var3.hashCode())) * 31;
        z3j0 z3j0Var4 = this.f33966e;
        int iHashCode4 = (iHashCode3 + (z3j0Var4 == null ? 0 : z3j0Var4.hashCode())) * 31;
        z3j0 z3j0Var5 = this.f33967f;
        return iHashCode4 + (z3j0Var5 != null ? z3j0Var5.hashCode() : 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f33962a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f33962a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f33962a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return wj50.m88262e0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wj50.m88264f0(this, objArr);
    }
}
