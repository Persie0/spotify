package p204p;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes11.dex */
public final class s3a1 extends AbstractList implements RandomAccess, zy70 {

    /* JADX INFO: renamed from: a */
    public final vy70 f205250a;

    public s3a1(vy70 vy70Var) {
        this.f205250a = vy70Var;
    }

    @Override // p204p.zy70
    /* JADX INFO: renamed from: c */
    public final List mo77119c() {
        return Collections.unmodifiableList(this.f205250a.f245999a);
    }

    @Override // p204p.zy70
    /* JADX INFO: renamed from: f1 */
    public final void mo77120f1(xj90 xj90Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f205250a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        cs70 cs70Var = new cs70(3);
        cs70Var.f41485b = this.f205250a.iterator();
        return cs70Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        p3a1 p3a1Var = new p3a1(2);
        p3a1Var.f173599b = this.f205250a.listIterator(i);
        return p3a1Var;
    }

    @Override // p204p.zy70
    /* JADX INFO: renamed from: q0 */
    public final hva mo77122q0(int i) {
        return this.f205250a.mo77122q0(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f205250a.size();
    }

    @Override // p204p.zy70
    /* JADX INFO: renamed from: g */
    public final s3a1 mo77121g() {
        return this;
    }
}
