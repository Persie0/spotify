package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: p.x8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2563x8 extends AbstractC2154n7 implements rf40, Collection, pq60 {
    /* JADX INFO: renamed from: b */
    public abstract AbstractC2563x8 mo45651b(int i, Object obj);

    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
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

    /* JADX INFO: renamed from: d */
    public abstract AbstractC2563x8 mo45652d(Object obj);

    /* JADX INFO: renamed from: e */
    public AbstractC2563x8 mo62888e(Collection collection) {
        isn0 isn0VarMo45653f = mo45653f();
        isn0VarMo45653f.addAll(collection);
        return isn0VarMo45653f.m51557d();
    }

    /* JADX INFO: renamed from: f */
    public abstract isn0 mo45653f();

    /* JADX INFO: renamed from: i */
    public abstract AbstractC2563x8 mo45654i(C2486v8 c2486v8);

    @Override // p204p.AbstractC2154n7, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public abstract AbstractC2563x8 mo45655j(int i);

    /* JADX INFO: renamed from: l */
    public abstract AbstractC2563x8 mo45656l(int i, Object obj);

    @Override // p204p.AbstractC2154n7, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final List subList(int i, int i2) {
        return super.subList(i, i2);
    }
}
