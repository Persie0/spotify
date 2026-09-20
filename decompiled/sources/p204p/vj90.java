package p204p;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class vj90 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f241923a = 0;

    /* JADX INFO: renamed from: b */
    public final List f241924b;

    /* JADX INFO: renamed from: c */
    public final Object f241925c;

    public vj90(List list, s4h1 s4h1Var) {
        list.getClass();
        this.f241924b = list;
        this.f241925c = s4h1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        switch (this.f241923a) {
            case 0:
                return ((qh00) this.f241925c).apply(this.f241924b.get(i));
            default:
                return ((s4h1) this.f241925c).zza(this.f241924b.get(i));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        switch (this.f241923a) {
            case 0:
                break;
        }
        return this.f241924b.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.f241923a) {
            case 0:
                break;
        }
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f241923a) {
            case 0:
                return new uj90(this, this.f241924b.listIterator(i), 0);
            default:
                return new blf1(this, this.f241924b.listIterator(i), 0);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        switch (this.f241923a) {
            case 0:
                return ((qh00) this.f241925c).apply(this.f241924b.remove(i));
            default:
                return ((s4h1) this.f241925c).zza(this.f241924b.remove(i));
        }
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        switch (this.f241923a) {
            case 0:
                this.f241924b.subList(i, i2).clear();
                break;
            default:
                this.f241924b.subList(i, i2).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f241923a) {
            case 0:
                break;
        }
        return this.f241924b.size();
    }

    public vj90(List list, qh00 qh00Var) {
        list.getClass();
        this.f241924b = list;
        this.f241925c = qh00Var;
    }
}
