package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: p.w7 */
/* JADX INFO: loaded from: classes4.dex */
public class C2523w7 extends r601 {

    /* JADX INFO: renamed from: b */
    public final Map f248499b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC1888g8 f248500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2523w7(AbstractC1888g8 abstractC1888g8, Map map) {
        super(0);
        this.f248500c = abstractC1888g8;
        map.getClass();
        this.f248499b = map;
    }

    @Override // p204p.r601, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C2442u7 c2442u7 = (C2442u7) it;
            if (!c2442u7.hasNext()) {
                return;
            }
            c2442u7.next();
            c2442u7.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f248499b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f248499b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f248499b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f248499b.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f248499b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2442u7(this, this.f248499b.entrySet().iterator());
    }

    @Override // p204p.r601, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f248499b.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f248500c.f77372f -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f248499b.size();
    }
}
