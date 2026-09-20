package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: p.w8 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2524w8 extends AbstractC2154n7 implements qf40, df40 {
    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // p204p.AbstractC2154n7, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final List subList(int i, int i2) {
        return rwg1.m76560u(this, i, i2);
    }
}
