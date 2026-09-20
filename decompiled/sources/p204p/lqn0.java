package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class lqn0 extends AbstractC2444u8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136092a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2404t8 f136093b;

    public /* synthetic */ lqn0(AbstractC2404t8 abstractC2404t8, int i) {
        this.f136092a = i;
        this.f136093b = abstractC2404t8;
    }

    @Override // p204p.AbstractC2444u8
    /* JADX INFO: renamed from: a */
    public final int mo59769a() {
        switch (this.f136092a) {
            case 0:
                return ((hqn0) this.f136093b).size();
            default:
                return ((hrn0) this.f136093b).size();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f136092a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f136092a) {
            case 0:
                ((hqn0) this.f136093b).clear();
                break;
            default:
                ((hrn0) this.f136093b).clear();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x003d A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        switch (this.f136092a) {
            case 0:
                hqn0 hqn0Var = (hqn0) this.f136093b;
                V v = hqn0Var.get(entry.getKey());
                Boolean boolValueOf = v == 0 ? null : Boolean.valueOf(v.equals(entry.getValue()));
                if (boolValueOf != null) {
                    return boolValueOf.booleanValue();
                }
                if (entry.getValue() == null && hqn0Var.containsKey(entry.getKey())) {
                    return true;
                }
                return false;
            default:
                hrn0 hrn0Var = (hrn0) this.f136093b;
                V v2 = hrn0Var.get(entry.getKey());
                Boolean boolValueOf2 = v2 == 0 ? null : Boolean.valueOf(v2.equals(entry.getValue()));
                if (boolValueOf2 != null) {
                    return boolValueOf2.booleanValue();
                }
                if (entry.getValue() == null && hrn0Var.containsKey(entry.getKey())) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f136092a) {
            case 0:
                return new nqn0((hqn0) this.f136093b);
            default:
                return new irn0((hrn0) this.f136093b, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        switch (this.f136092a) {
            case 0:
                return ((hqn0) this.f136093b).remove(entry.getKey(), entry.getValue());
            default:
                return ((hrn0) this.f136093b).remove(entry.getKey(), entry.getValue());
        }
    }
}
