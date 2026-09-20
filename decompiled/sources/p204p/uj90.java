package p204p;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class uj90 extends r591 implements ListIterator {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f230945c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractList f230946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uj90(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator, 0);
        this.f230945c = i;
        this.f230946d = abstractList;
    }

    @Override // p204p.r591
    /* JADX INFO: renamed from: a */
    public final Object mo41890a(Object obj) {
        switch (this.f230945c) {
            case 0:
                return ((qh00) ((vj90) this.f230946d).f241925c).apply(obj);
            default:
                return ((qh00) ((wj90) this.f230946d).f251916c).apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f196002b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f196002b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo41890a(((ListIterator) this.f196002b).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f196002b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
