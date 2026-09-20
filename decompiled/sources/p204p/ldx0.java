package p204p;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes11.dex */
public final class ldx0 extends AbstractC2366s8 {

    /* JADX INFO: renamed from: a */
    public final List f132373a;

    public ldx0(List list) {
        this.f132373a = list;
    }

    @Override // p204p.AbstractC2366s8
    /* JADX INFO: renamed from: a */
    public final int mo47661a() {
        return this.f132373a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f132373a.add(g6f.m43719f0(i, this), obj);
    }

    @Override // p204p.AbstractC2366s8
    /* JADX INFO: renamed from: b */
    public final Object mo47662b(int i) {
        return this.f132373a.remove(g6f.m43717e0(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f132373a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f132373a.get(g6f.m43717e0(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new kdx0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new kdx0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f132373a.set(g6f.m43717e0(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new kdx0(this, i);
    }
}
