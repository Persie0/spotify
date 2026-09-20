package p204p;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class hyf1 extends AbstractList implements RandomAccess, nof1 {

    /* JADX INFO: renamed from: a */
    public final kof1 f96581a;

    public hyf1(kof1 kof1Var) {
        this.f96581a = kof1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.f96581a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new cs70(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new p3a1(this, i);
    }

    @Override // p204p.nof1
    /* JADX INFO: renamed from: n1 */
    public final void mo49187n1(zhf1 zhf1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f96581a.size();
    }

    @Override // p204p.nof1
    public final Object zzf(int i) {
        return this.f96581a.f124778b.get(i);
    }

    @Override // p204p.nof1
    public final List zzh() {
        return Collections.unmodifiableList(this.f96581a.f124778b);
    }

    @Override // p204p.nof1
    public final nof1 zze() {
        return this;
    }
}
