package p204p;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class q3a1 extends AbstractList implements xy70, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final ty70 f184829a;

    public q3a1(ty70 ty70Var) {
        this.f184829a = ty70Var;
    }

    @Override // p204p.xy70
    /* JADX INFO: renamed from: c */
    public final List mo72066c() {
        return Collections.unmodifiableList(this.f184829a.f224869b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f184829a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        cs70 cs70Var = new cs70(1);
        cs70Var.f41485b = this.f184829a.iterator();
        return cs70Var;
    }

    @Override // p204p.xy70
    /* JADX INFO: renamed from: k */
    public final Object mo72068k(int i) {
        return this.f184829a.f224869b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        p3a1 p3a1Var = new p3a1(0);
        p3a1Var.f173599b = this.f184829a.listIterator(i);
        return p3a1Var;
    }

    @Override // p204p.xy70
    /* JADX INFO: renamed from: n0 */
    public final void mo72069n0(bva bvaVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f184829a.size();
    }

    @Override // p204p.xy70
    /* JADX INFO: renamed from: g */
    public final xy70 mo72067g() {
        return this;
    }
}
