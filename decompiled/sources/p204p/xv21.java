package p204p;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class xv21 extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f266254a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractMap f266255b;

    public /* synthetic */ xv21(AbstractMap abstractMap, int i) {
        this.f266254a = i;
        this.f266255b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f266254a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((nv21) this.f266255b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((ov21) this.f266255b).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((pv21) this.f266255b).m71110f((Comparable) entry3.getKey(), entry3.getValue());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f266254a) {
            case 0:
                ((nv21) this.f266255b).clear();
                break;
            case 1:
                ((ov21) this.f266255b).clear();
                break;
            default:
                ((pv21) this.f266255b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f266254a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((nv21) this.f266255b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((ov21) this.f266255b).get(entry2.getKey());
                Object value2 = entry2.getValue();
                return obj3 == value2 || (obj3 != null && obj3.equals(value2));
            default:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((pv21) this.f266255b).get(entry3.getKey());
                Object value3 = entry3.getValue();
                return obj4 == value3 || (obj4 != null && obj4.equals(value3));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f266254a) {
            case 0:
                return new wv21((nv21) this.f266255b, 0);
            case 1:
                return new wv21((ov21) this.f266255b, 1);
            default:
                return new wv21((pv21) this.f266255b, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f266254a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((nv21) this.f266255b).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((ov21) this.f266255b).remove(entry2.getKey());
                return true;
            default:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((pv21) this.f266255b).remove(entry3.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f266254a) {
            case 0:
                return ((nv21) this.f266255b).size();
            case 1:
                return ((ov21) this.f266255b).size();
            default:
                return ((pv21) this.f266255b).size();
        }
    }
}
