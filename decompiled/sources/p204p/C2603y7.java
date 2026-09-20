package p204p;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: p.y7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C2603y7 extends C1695b8 implements NavigableSet {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gai0 f269920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2603y7(gai0 gai0Var, NavigableMap navigableMap) {
        super(gai0Var, navigableMap);
        this.f269920e = gai0Var;
    }

    @Override // p204p.C1695b8
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final NavigableMap mo28408a() {
        return (NavigableMap) ((SortedMap) this.f248499b);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return mo28408a().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C2523w7) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C2603y7(this.f269920e, mo28408a().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return mo28408a().floorKey(obj);
    }

    @Override // p204p.C1695b8, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return mo28408a().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return mo28408a().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C2442u7 c2442u7 = (C2442u7) iterator();
        if (!c2442u7.hasNext()) {
            return null;
        }
        Object next = c2442u7.next();
        c2442u7.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // p204p.C1695b8, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // p204p.C1695b8, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new C2603y7(this.f269920e, mo28408a().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C2603y7(this.f269920e, mo28408a().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C2603y7(this.f269920e, mo28408a().tailMap(obj, z));
    }
}
