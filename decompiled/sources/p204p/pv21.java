package p204p;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class pv21 extends AbstractMap {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f181578g = 0;

    /* JADX INFO: renamed from: a */
    public final int f181579a;

    /* JADX INFO: renamed from: b */
    public List f181580b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c */
    public Map f181581c;

    /* JADX INFO: renamed from: d */
    public boolean f181582d;

    /* JADX INFO: renamed from: e */
    public volatile xv21 f181583e;

    /* JADX INFO: renamed from: f */
    public Map f181584f;

    public pv21(int i) {
        this.f181579a = i;
        Map map = Collections.EMPTY_MAP;
        this.f181581c = map;
        this.f181584f = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m71105a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f181580b.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((vv21) this.f181580b.get(i3)).m86452a());
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((vv21) this.f181580b.get(i4)).m86452a());
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((vv21) this.f181580b.get(i3)).m86452a());
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m71106b() {
        if (this.f181582d) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry m71107c(int i) {
        return (Map.Entry) this.f181580b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m71106b();
        if (!this.f181580b.isEmpty()) {
            this.f181580b.clear();
        }
        if (this.f181581c.isEmpty()) {
            return;
        }
        this.f181581c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m71105a(comparable) >= 0 || this.f181581c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m71108d() {
        return this.f181581c.isEmpty() ? j9g1.f110171b : this.f181581c.entrySet();
    }

    /* JADX INFO: renamed from: e */
    public final SortedMap m71109e() {
        m71106b();
        if (this.f181581c.isEmpty() && !(this.f181581c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f181581c = treeMap;
            this.f181584f = treeMap.descendingMap();
        }
        return (SortedMap) this.f181581c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f181583e == null) {
            this.f181583e = new xv21(this, 2);
        }
        return this.f181583e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv21)) {
            return super.equals(obj);
        }
        pv21 pv21Var = (pv21) obj;
        int size = size();
        if (size == pv21Var.size()) {
            int size2 = this.f181580b.size();
            if (size2 != pv21Var.f181580b.size()) {
                return ((AbstractSet) entrySet()).equals(pv21Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (m71107c(i).equals(pv21Var.m71107c(i))) {
                }
            }
            if (size2 != size) {
                return this.f181581c.equals(pv21Var.f181581c);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m71110f(Comparable comparable, Object obj) {
        m71106b();
        int iM71105a = m71105a(comparable);
        if (iM71105a >= 0) {
            return ((vv21) this.f181580b.get(iM71105a)).setValue(obj);
        }
        m71106b();
        boolean zIsEmpty = this.f181580b.isEmpty();
        int i = this.f181579a;
        if (zIsEmpty && !(this.f181580b instanceof ArrayList)) {
            this.f181580b = new ArrayList(i);
        }
        int i2 = -(iM71105a + 1);
        if (i2 >= i) {
            return m71109e().put(comparable, obj);
        }
        if (this.f181580b.size() == i) {
            vv21 vv21Var = (vv21) this.f181580b.remove(i - 1);
            m71109e().put(vv21Var.m86452a(), vv21Var.getValue());
        }
        this.f181580b.add(i2, new vv21(this, comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m71111g(int i) {
        m71106b();
        Object value = ((vv21) this.f181580b.remove(i)).getValue();
        if (!this.f181581c.isEmpty()) {
            Iterator it = m71109e().entrySet().iterator();
            this.f181580b.add(new vv21(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM71105a = m71105a(comparable);
        return iM71105a >= 0 ? ((vv21) this.f181580b.get(iM71105a)).getValue() : this.f181581c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f181580b.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((vv21) this.f181580b.get(i)).hashCode();
        }
        return this.f181581c.size() > 0 ? this.f181581c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        ikc0.m50942n(obj);
        return m71110f(null, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m71106b();
        Comparable comparable = (Comparable) obj;
        int iM71105a = m71105a(comparable);
        if (iM71105a >= 0) {
            return m71111g(iM71105a);
        }
        if (this.f181581c.isEmpty()) {
            return null;
        }
        return this.f181581c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f181581c.size() + this.f181580b.size();
    }
}
