package p204p;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: renamed from: p.v7 */
/* JADX INFO: loaded from: classes4.dex */
public class C2485v7 extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f237996a;

    /* JADX INFO: renamed from: b */
    public final transient Map f237997b;

    /* JADX INFO: renamed from: c */
    public transient AbstractSet f237998c;

    /* JADX INFO: renamed from: d */
    public transient AbstractCollection f237999d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Serializable f238000e;

    public /* synthetic */ C2485v7(Serializable serializable, Map map, int i) {
        this.f237996a = i;
        this.f238000e = serializable;
        this.f237997b = map;
    }

    /* JADX INFO: renamed from: a */
    public hf40 m84819a(Map.Entry entry) {
        Object key = entry.getKey();
        return new hf40(key, ((AbstractC1888g8) this.f238000e).mo43938l(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.f237996a) {
            case 0:
                AbstractC1888g8 abstractC1888g8 = (AbstractC1888g8) this.f238000e;
                if (this.f237997b != abstractC1888g8.f77371e) {
                    C2442u7 c2442u7 = new C2442u7(this);
                    while (c2442u7.hasNext()) {
                        c2442u7.next();
                        c2442u7.remove();
                    }
                } else {
                    abstractC1888g8.clear();
                }
                break;
            default:
                zif1 zif1Var = ((qgf1) this.f238000e).f188464c;
                if (this.f237997b != zif1Var) {
                    C2442u7 c2442u8 = new C2442u7(this, (byte) 0);
                    while (c2442u8.hasNext()) {
                        c2442u8.next();
                        c2442u8.remove();
                    }
                } else {
                    Iterator it = zif1Var.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    zif1Var.clear();
                }
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f237996a) {
            case 0:
                Map map = this.f237997b;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                Map map2 = this.f237997b;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.f237996a) {
            case 0:
                C2403t7 c2403t7 = (C2403t7) this.f237998c;
                if (c2403t7 != null) {
                    return c2403t7;
                }
                C2403t7 c2403t8 = new C2403t7(this, 0);
                this.f237998c = c2403t8;
                return c2403t8;
            default:
                y7f1 y7f1Var = (y7f1) this.f237998c;
                if (y7f1Var != null) {
                    return y7f1Var;
                }
                y7f1 y7f1Var2 = new y7f1(this);
                this.f237998c = y7f1Var2;
                return y7f1Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f237996a) {
            case 0:
                return this == obj || this.f237997b.equals(obj);
            default:
                return this == obj || this.f237997b.equals(obj);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f237996a) {
            case 0:
                Map map = this.f237997b;
                map.getClass();
                try {
                    obj2 = map.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                return ((AbstractC1888g8) this.f238000e).mo43938l(obj, collection);
            default:
                Map map2 = this.f237997b;
                map2.getClass();
                try {
                    obj3 = map2.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                qgf1 qgf1Var = (qgf1) this.f238000e;
                qgf1Var.getClass();
                List list = (List) collection2;
                return list instanceof RandomAccess ? new uaf1(qgf1Var, obj, list, null) : new ydf1(qgf1Var, obj, list, null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.f237996a) {
            case 0:
                return this.f237997b.hashCode();
            default:
                return this.f237997b.hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        switch (this.f237996a) {
            case 0:
                return ((AbstractC1888g8) this.f238000e).keySet();
            default:
                qgf1 qgf1Var = (qgf1) this.f238000e;
                y7f1 y7f1Var = qgf1Var.f143464a;
                if (y7f1Var != null) {
                    return y7f1Var;
                }
                y7f1 y7f1Var2 = new y7f1(qgf1Var, qgf1Var.f188464c);
                qgf1Var.f143464a = y7f1Var2;
                return y7f1Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.f237996a) {
            case 0:
                AbstractC1888g8 abstractC1888g8 = (AbstractC1888g8) this.f238000e;
                Collection collection = (Collection) this.f237997b.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection collectionMo43935i = abstractC1888g8.mo43935i();
                collectionMo43935i.addAll(collection);
                abstractC1888g8.f77372f -= collection.size();
                collection.clear();
                return collectionMo43935i;
            default:
                qgf1 qgf1Var = (qgf1) this.f238000e;
                Collection collection2 = (Collection) this.f237997b.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                qgf1Var.getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.f237996a) {
            case 0:
                break;
        }
        return this.f237997b.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.f237996a) {
            case 0:
                break;
        }
        return this.f237997b.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.f237996a) {
            case 0:
                C2247p8 c2247p8 = (C2247p8) this.f237999d;
                if (c2247p8 != null) {
                    return c2247p8;
                }
                C2247p8 c2247p9 = new C2247p8((AbstractMap) this, 4);
                this.f237999d = c2247p9;
                return c2247p9;
            default:
                C2247p8 c2247p10 = (C2247p8) this.f237999d;
                if (c2247p10 != null) {
                    return c2247p10;
                }
                C2247p8 c2247p11 = new C2247p8((AbstractMap) this, 6);
                this.f237999d = c2247p11;
                return c2247p11;
        }
    }
}
