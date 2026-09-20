package p204p;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public final class q601 extends p601 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f56628a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f56628a.iterator();
        it.getClass();
        wfq0 wfq0Var = this.f56629b;
        wfq0Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (wfq0Var.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new q601(((SortedSet) this.f56628a).headSet(obj), this.f56629b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f56628a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f56629b.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new q601(((SortedSet) this.f56628a).subSet(obj, obj2), this.f56629b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new q601(((SortedSet) this.f56628a).tailSet(obj), this.f56629b);
    }
}
