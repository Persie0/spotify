package androidx.compose.p002ui.text.intl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import p204p.hfa0;
import p204p.lau;
import p204p.pq60;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
public final class LocaleList implements Collection, pq60 {

    /* JADX INFO: renamed from: c */
    public static final LocaleList f534c = new LocaleList(lau.f131415a);

    /* JADX INFO: renamed from: a */
    public final List f535a;

    /* JADX INFO: renamed from: b */
    public final int f536b;

    public LocaleList(List list) {
        this.f535a = list;
        this.f536b = list.size();
    }

    /* JADX INFO: renamed from: a */
    public final hfa0 m304a() {
        return (hfa0) this.f535a.get(0);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof hfa0)) {
            return false;
        }
        return this.f535a.contains((hfa0) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f535a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocaleList) {
            return wj50.m88271j(this.f535a, ((LocaleList) obj).f535a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f535a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f535a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f535a.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f536b;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return wj50.m88262e0(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f535a + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wj50.m88264f0(this, objArr);
    }
}
