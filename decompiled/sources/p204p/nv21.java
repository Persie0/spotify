package p204p;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class nv21 extends AbstractMap {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f158767g = 0;

    /* JADX INFO: renamed from: a */
    public Object[] f158768a;

    /* JADX INFO: renamed from: b */
    public int f158769b;

    /* JADX INFO: renamed from: c */
    public Map f158770c;

    /* JADX INFO: renamed from: d */
    public boolean f158771d;

    /* JADX INFO: renamed from: e */
    public volatile xv21 f158772e;

    /* JADX INFO: renamed from: f */
    public Map f158773f;

    /* JADX INFO: renamed from: f */
    public static nv21 m65712f() {
        nv21 nv21Var = new nv21();
        Map map = Collections.EMPTY_MAP;
        nv21Var.f158770c = map;
        nv21Var.f158773f = map;
        return nv21Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0030 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m65713a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int i4 = this.f158769b;
        int i5 = i4 - 1;
        if (i5 < 0) {
            i = 0;
            while (i <= i5) {
                i3 = (i + i5) / 2;
                iCompareTo = comparable.compareTo(((tv21) this.f158768a[i3]).f224032a);
                if (iCompareTo < 0) {
                    i5 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((tv21) this.f158768a[i5]).f224032a);
            if (iCompareTo2 > 0) {
                i2 = i4 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i = 0;
                while (i <= i5) {
                    i3 = (i + i5) / 2;
                    iCompareTo = comparable.compareTo(((tv21) this.f158768a[i3]).f224032a);
                    if (iCompareTo < 0) {
                        i5 = i3 - 1;
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
    public final void m65714b() {
        if (this.f158771d) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final tv21 m65715c(int i) {
        if (i < this.f158769b) {
            return (tv21) this.f158768a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m65714b();
        if (this.f158769b != 0) {
            this.f158768a = null;
            this.f158769b = 0;
        }
        if (this.f158770c.isEmpty()) {
            return;
        }
        this.f158770c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m65713a(comparable) >= 0 || this.f158770c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Set m65716d() {
        return this.f158770c.isEmpty() ? Collections.EMPTY_SET : this.f158770c.entrySet();
    }

    /* JADX INFO: renamed from: e */
    public final SortedMap m65717e() {
        m65714b();
        if (this.f158770c.isEmpty() && !(this.f158770c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f158770c = treeMap;
            this.f158773f = treeMap.descendingMap();
        }
        return (SortedMap) this.f158770c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f158772e == null) {
            this.f158772e = new xv21(this, 0);
        }
        return this.f158772e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv21)) {
            return super.equals(obj);
        }
        nv21 nv21Var = (nv21) obj;
        int size = size();
        if (size == nv21Var.size()) {
            int i = this.f158769b;
            if (i != nv21Var.f158769b) {
                return ((AbstractSet) entrySet()).equals(nv21Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (m65715c(i2).equals(nv21Var.m65715c(i2))) {
                }
            }
            if (i != size) {
                return this.f158770c.equals(nv21Var.f158770c);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m65714b();
        int iM65713a = m65713a(comparable);
        if (iM65713a >= 0) {
            return ((tv21) this.f158768a[iM65713a]).setValue(obj);
        }
        m65714b();
        if (this.f158768a == null) {
            this.f158768a = new Object[16];
        }
        int i = -(iM65713a + 1);
        if (i >= 16) {
            return m65717e().put(comparable, obj);
        }
        int i2 = this.f158769b;
        if (i2 == 16) {
            tv21 tv21Var = (tv21) this.f158768a[15];
            this.f158769b = i2 - 1;
            m65717e().put(tv21Var.f224032a, tv21Var.f224033b);
        }
        Object[] objArr = this.f158768a;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.f158768a[i] = new tv21(this, comparable, obj);
        this.f158769b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM65713a = m65713a(comparable);
        return iM65713a >= 0 ? ((tv21) this.f158768a[iM65713a]).f224033b : this.f158770c.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public final Object m65719h(int i) {
        m65714b();
        Object[] objArr = this.f158768a;
        Object obj = ((tv21) objArr[i]).f224033b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f158769b - i) - 1);
        this.f158769b--;
        if (!this.f158770c.isEmpty()) {
            Iterator it = m65717e().entrySet().iterator();
            Object[] objArr2 = this.f158768a;
            int i2 = this.f158769b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new tv21(this, (Comparable) entry.getKey(), entry.getValue());
            this.f158769b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f158769b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f158768a[i2].hashCode();
        }
        return this.f158770c.size() > 0 ? this.f158770c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m65714b();
        Comparable comparable = (Comparable) obj;
        int iM65713a = m65713a(comparable);
        if (iM65713a >= 0) {
            return m65719h(iM65713a);
        }
        if (this.f158770c.isEmpty()) {
            return null;
        }
        return this.f158770c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f158770c.size() + this.f158769b;
    }
}
