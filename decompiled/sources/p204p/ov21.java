package p204p;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes11.dex */
public final class ov21 extends AbstractMap {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f170405f = 0;

    /* JADX INFO: renamed from: a */
    public final int f170406a;

    /* JADX INFO: renamed from: b */
    public List f170407b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c */
    public Map f170408c = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: d */
    public boolean f170409d;

    /* JADX INFO: renamed from: e */
    public volatile xv21 f170410e;

    public ov21(int i) {
        this.f170406a = i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m68110a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f170407b.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((uv21) this.f170407b.get(i3)).f234320a);
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
            int iCompareTo2 = comparable.compareTo(((uv21) this.f170407b.get(i4)).f234320a);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((uv21) this.f170407b.get(i3)).f234320a);
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
    public final void m68111b() {
        if (this.f170409d) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Iterable m68112c() {
        return this.f170408c.isEmpty() ? g9g1.f77794b : this.f170408c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m68111b();
        if (!this.f170407b.isEmpty()) {
            this.f170407b.clear();
        }
        if (this.f170408c.isEmpty()) {
            return;
        }
        this.f170408c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m68110a(comparable) >= 0 || this.f170408c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final SortedMap m68113d() {
        m68111b();
        if (this.f170408c.isEmpty() && !(this.f170408c instanceof TreeMap)) {
            this.f170408c = new TreeMap();
        }
        return (SortedMap) this.f170408c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m68111b();
        int iM68110a = m68110a(comparable);
        if (iM68110a >= 0) {
            return ((uv21) this.f170407b.get(iM68110a)).setValue(obj);
        }
        m68111b();
        boolean zIsEmpty = this.f170407b.isEmpty();
        int i = this.f170406a;
        if (zIsEmpty && !(this.f170407b instanceof ArrayList)) {
            this.f170407b = new ArrayList(i);
        }
        int i2 = -(iM68110a + 1);
        if (i2 >= i) {
            return m68113d().put(comparable, obj);
        }
        if (this.f170407b.size() == i) {
            uv21 uv21Var = (uv21) this.f170407b.remove(i - 1);
            m68113d().put(uv21Var.f234320a, uv21Var.f234321b);
        }
        this.f170407b.add(i2, new uv21(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f170410e == null) {
            this.f170410e = new xv21(this, 1);
        }
        return this.f170410e;
    }

    /* JADX INFO: renamed from: f */
    public final Object m68115f(int i) {
        m68111b();
        Object obj = ((uv21) this.f170407b.remove(i)).f234321b;
        if (!this.f170408c.isEmpty()) {
            Iterator it = m68113d().entrySet().iterator();
            List list = this.f170407b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new uv21(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM68110a = m68110a(comparable);
        return iM68110a >= 0 ? ((uv21) this.f170407b.get(iM68110a)).f234321b : this.f170408c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m68111b();
        Comparable comparable = (Comparable) obj;
        int iM68110a = m68110a(comparable);
        if (iM68110a >= 0) {
            return m68115f(iM68110a);
        }
        if (this.f170408c.isEmpty()) {
            return null;
        }
        return this.f170408c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f170408c.size() + this.f170407b.size();
    }
}
