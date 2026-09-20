package p204p;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: p.p8 */
/* JADX INFO: loaded from: classes4.dex */
public class C2247p8 extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174792a;

    /* JADX INFO: renamed from: b */
    public final Object f174793b;

    public /* synthetic */ C2247p8(Object obj, int i) {
        this.f174792a = i;
        this.f174793b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f174792a) {
            case 0:
                ((AbstractC2329r8) this.f174793b).clear();
                break;
            case 1:
                ((AbstractC1888g8) this.f174793b).clear();
                break;
            case 2:
                ((nqf) this.f174793b).clear();
                break;
            case 3:
                ((ajc0) this.f174793b).clear();
                break;
            case 4:
                ((AbstractMap) this.f174793b).clear();
                break;
            case 5:
                ((zif1) this.f174793b).clear();
                break;
            case 6:
                ((C2485v7) this.f174793b).clear();
                break;
            default:
                ((fug1) this.f174793b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f174792a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((AbstractC2329r8) this.f174793b).m74959c(entry.getKey(), entry.getValue());
            case 1:
                return ((AbstractC1888g8) this.f174793b).mo74960d(obj);
            case 2:
            case 5:
            default:
                return super.contains(obj);
            case 3:
                return ((ajc0) this.f174793b).containsValue(obj);
            case 4:
                return ((AbstractMap) this.f174793b).containsValue(obj);
            case 6:
                return ((C2485v7) this.f174793b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f174792a) {
            case 3:
                return ((ajc0) this.f174793b).isEmpty();
            case 4:
                return ((AbstractMap) this.f174793b).isEmpty();
            case 5:
            default:
                return super.isEmpty();
            case 6:
                return ((C2485v7) this.f174793b).isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f174792a) {
            case 0:
                return ((AbstractC2329r8) this.f174793b).mo43934h();
            case 1:
                return new C2365s7((AbstractC1888g8) this.f174793b, 0);
            case 2:
                nqf nqfVar = (nqf) this.f174793b;
                Map mapM65416c = nqfVar.m65416c();
                return mapM65416c != null ? mapM65416c.values().iterator() : new jqf(nqfVar, 2);
            case 3:
                return new bic0((ajc0) this.f174793b, 2);
            case 4:
                return new fkc0(((AbstractMap) this.f174793b).entrySet().iterator(), 1);
            case 5:
                zif1 zif1Var = (zif1) this.f174793b;
                Map mapM96207d = zif1Var.m96207d();
                return mapM96207d != null ? mapM96207d.values().iterator() : new fhf1(zif1Var, 2);
            case 6:
                return new slf1(((C2485v7) this.f174793b).entrySet().iterator(), 1);
            default:
                fug1 fug1Var = (fug1) this.f174793b;
                Map mapM42732d = fug1Var.m42732d();
                return mapM42732d != null ? mapM42732d.values().iterator() : new utg1(fug1Var, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f174792a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((AbstractC2329r8) this.f174793b).remove(entry.getKey(), entry.getValue());
            case 4:
                AbstractMap abstractMap = (AbstractMap) this.f174793b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (upf.m83705v(obj, entry2.getValue())) {
                            abstractMap.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 6:
                C2485v7 c2485v7 = (C2485v7) this.f174793b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry3 : c2485v7.entrySet()) {
                        if (qvf1.m74003H(obj, entry3.getValue())) {
                            c2485v7.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f174792a) {
            case 4:
                AbstractMap abstractMap = (AbstractMap) this.f174793b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            case 5:
            default:
                return super.removeAll(collection);
            case 6:
                C2485v7 c2485v7 = (C2485v7) this.f174793b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : c2485v7.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((qgf1) c2485v7.f238000e).m61705b().removeAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f174792a) {
            case 4:
                AbstractMap abstractMap = (AbstractMap) this.f174793b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            case 5:
            default:
                return super.retainAll(collection);
            case 6:
                C2485v7 c2485v7 = (C2485v7) this.f174793b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : c2485v7.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((qgf1) c2485v7.f238000e).m61705b().retainAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f174792a) {
            case 0:
                return ((AbstractC2329r8) this.f174793b).size();
            case 1:
                return ((AbstractC1888g8) this.f174793b).f77372f;
            case 2:
                return ((nqf) this.f174793b).size();
            case 3:
                return ((ajc0) this.f174793b).size();
            case 4:
                return ((AbstractMap) this.f174793b).size();
            case 5:
                return ((zif1) this.f174793b).size();
            case 6:
                return ((C2485v7) this.f174793b).f237997b.size();
            default:
                return ((fug1) this.f174793b).size();
        }
    }

    public /* synthetic */ C2247p8(AbstractMap abstractMap, int i) {
        this.f174792a = i;
        this.f174793b = abstractMap;
    }
}
