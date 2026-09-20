package p204p;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class t3a1 extends AbstractList implements az70, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final wy70 f216735a;

    public t3a1(wy70 wy70Var) {
        this.f216735a = wy70Var;
    }

    @Override // p204p.az70
    /* JADX INFO: renamed from: a1 */
    public final void mo27580a1(dva dvaVar) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.az70
    /* JADX INFO: renamed from: c */
    public final List mo27581c() {
        return Collections.unmodifiableList(this.f216735a.f256227b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f216735a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        cs70 cs70Var = new cs70(4);
        cs70Var.f41485b = this.f216735a.iterator();
        return cs70Var;
    }

    @Override // p204p.az70
    /* JADX INFO: renamed from: k */
    public final Object mo27583k(int i) {
        return this.f216735a.f256227b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        p3a1 p3a1Var = new p3a1(3);
        p3a1Var.f173599b = this.f216735a.listIterator(i);
        return p3a1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f216735a.size();
    }

    @Override // p204p.az70
    /* JADX INFO: renamed from: g */
    public final az70 mo27582g() {
        return this;
    }
}
