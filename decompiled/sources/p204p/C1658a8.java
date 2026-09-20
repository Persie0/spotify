package p204p;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: p.a8 */
/* JADX INFO: loaded from: classes4.dex */
public class C1658a8 extends C2485v7 implements SortedMap {

    /* JADX INFO: renamed from: f */
    public SortedSet f13153f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ gai0 f13154g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1658a8(gai0 gai0Var, SortedMap sortedMap) {
        super(gai0Var, sortedMap, 0);
        this.f13154g = gai0Var;
    }

    /* JADX INFO: renamed from: b */
    public SortedSet mo25003b() {
        return new C1695b8(this.f13154g, mo25005d());
    }

    @Override // p204p.C2485v7, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f13153f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetMo25003b = mo25003b();
        this.f13153f = sortedSetMo25003b;
        return sortedSetMo25003b;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo25005d().comparator();
    }

    /* JADX INFO: renamed from: d */
    public SortedMap mo25005d() {
        return (SortedMap) this.f237997b;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo25005d().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new C1658a8(this.f13154g, mo25005d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo25005d().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new C1658a8(this.f13154g, mo25005d().subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new C1658a8(this.f13154g, mo25005d().tailMap(obj));
    }
}
