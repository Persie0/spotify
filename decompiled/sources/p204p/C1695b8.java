package p204p;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: p.b8 */
/* JADX INFO: loaded from: classes4.dex */
public class C1695b8 extends C2523w7 implements SortedSet {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gai0 f24441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1695b8(gai0 gai0Var, SortedMap sortedMap) {
        super(gai0Var, sortedMap);
        this.f24441d = gai0Var;
    }

    /* JADX INFO: renamed from: a */
    public SortedMap mo28408a() {
        return (SortedMap) this.f248499b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo28408a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo28408a().firstKey();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return new C1695b8(this.f24441d, mo28408a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo28408a().lastKey();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new C1695b8(this.f24441d, mo28408a().subMap(obj, obj2));
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new C1695b8(this.f24441d, mo28408a().tailMap(obj));
    }
}
