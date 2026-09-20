package p204p;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: p.x7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C2562x7 extends C1658a8 implements NavigableMap {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ gai0 f258777h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2562x7(gai0 gai0Var, NavigableMap navigableMap) {
        super(gai0Var, navigableMap);
        this.f258777h = gai0Var;
    }

    @Override // p204p.C1658a8
    /* JADX INFO: renamed from: b */
    public final SortedSet mo25003b() {
        return new C2603y7(this.f258777h, mo25005d());
    }

    @Override // p204p.C1658a8
    /* JADX INFO: renamed from: c */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = mo25005d().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return m84819a(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return mo25005d().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C2562x7(this.f258777h, mo25005d().descendingMap());
    }

    /* JADX INFO: renamed from: e */
    public final hf40 m90108e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionMo43935i = this.f258777h.mo43935i();
        collectionMo43935i.addAll((Collection) entry.getValue());
        it.remove();
        return new hf40(entry.getKey(), Collections.unmodifiableList((List) collectionMo43935i));
    }

    @Override // p204p.C1658a8
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final NavigableMap mo25005d() {
        return (NavigableMap) ((SortedMap) this.f237997b);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = mo25005d().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return m84819a(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = mo25005d().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return m84819a(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return mo25005d().floorKey(obj);
    }

    @Override // p204p.C1658a8, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = mo25005d().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return m84819a(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return mo25005d().higherKey(obj);
    }

    @Override // p204p.C1658a8, p204p.C2485v7, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = mo25005d().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return m84819a(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = mo25005d().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return m84819a(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return mo25005d().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m90108e(((C2403t7) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m90108e(((C2403t7) ((C2485v7) descendingMap()).entrySet()).iterator());
    }

    @Override // p204p.C1658a8, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // p204p.C1658a8, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new C2562x7(this.f258777h, mo25005d().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C2562x7(this.f258777h, mo25005d().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C2562x7(this.f258777h, mo25005d().tailMap(obj, z));
    }
}
