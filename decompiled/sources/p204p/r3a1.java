package p204p;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class r3a1 extends AbstractList implements yy70, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final uy70 f195466a;

    public r3a1(uy70 uy70Var) {
        this.f195466a = uy70Var;
    }

    @Override // p204p.yy70
    /* JADX INFO: renamed from: c */
    public final List mo74623c() {
        return Collections.unmodifiableList(this.f195466a.f235203b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f195466a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        cs70 cs70Var = new cs70(2);
        cs70Var.f41485b = this.f195466a.iterator();
        return cs70Var;
    }

    @Override // p204p.yy70
    /* JADX INFO: renamed from: k */
    public final Object mo74625k(int i) {
        return this.f195466a.f235203b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        p3a1 p3a1Var = new p3a1(1);
        p3a1Var.f173599b = this.f195466a.listIterator(i);
        return p3a1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f195466a.f235203b.size();
    }

    @Override // p204p.yy70
    /* JADX INFO: renamed from: u0 */
    public final void mo74626u0(gva gvaVar) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.yy70
    /* JADX INFO: renamed from: g */
    public final yy70 mo74624g() {
        return this;
    }
}
