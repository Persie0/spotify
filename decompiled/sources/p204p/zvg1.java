package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zvg1 extends tvg1 {

    /* JADX INFO: renamed from: d */
    public final transient bwg1 f286708d;

    public zvg1(bwg1 bwg1Var) {
        this.f286708d = bwg1Var;
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: a */
    public final o0f1 mo43014a() {
        return new evg1(this.f286708d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        Collection collection = (Collection) this.f286708d.mo30689a().get(key);
        return collection != null && collection.contains(value);
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: f */
    public final boolean mo43018f() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new evg1(this.f286708d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f286708d.f31655b;
    }
}
