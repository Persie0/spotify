package p204p;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class mdx0 extends AbstractC2154n7 {

    /* JADX INFO: renamed from: a */
    public final List f142526a;

    public mdx0(List list) {
        this.f142526a = list;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        return this.f142526a.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f142526a.get(g6f.m43717e0(i, this));
    }

    @Override // p204p.AbstractC2154n7, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new kdx0(this, 0);
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final ListIterator listIterator() {
        return new kdx0(this, 0);
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final ListIterator listIterator(int i) {
        return new kdx0(this, i);
    }
}
