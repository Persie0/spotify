package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class jjn0 implements Queue {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LinkedList f113061a = new LinkedList();

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        return this.f113061a.add((o1m0) obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f113061a.addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f113061a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof o1m0) {
            return this.f113061a.contains((o1m0) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f113061a.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        return (o1m0) this.f113061a.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f113061a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f113061a.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return this.f113061a.offer((o1m0) obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return (o1m0) this.f113061a.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return (o1m0) this.f113061a.poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return (o1m0) this.f113061a.remove();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f113061a.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f113061a.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f113061a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return wj50.m88262e0(this);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof o1m0) {
            return this.f113061a.remove((o1m0) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wj50.m88264f0(this, objArr);
    }
}
