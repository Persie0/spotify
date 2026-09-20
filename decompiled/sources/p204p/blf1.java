package p204p;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class blf1 extends r591 implements ListIterator {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28178c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractList f28179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ blf1(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator, 1);
        this.f28178c = i;
        this.f28179d = abstractList;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.r591
    /* JADX INFO: renamed from: b */
    public final Object mo29758b(Object obj) {
        switch (this.f28178c) {
            case 0:
                return ((s4h1) ((vj90) this.f28179d).f241925c).zza(obj);
            default:
                return ((s4h1) ((wj90) this.f28179d).f251916c).zza(obj);
        }
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
        return mo29758b(((ListIterator) this.f196002b).previous());
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
