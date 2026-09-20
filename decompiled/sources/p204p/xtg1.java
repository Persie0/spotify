package p204p;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class xtg1 extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f265869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fug1 f265870b;

    public /* synthetic */ xtg1(fug1 fug1Var, int i) {
        this.f265869a = i;
        this.f265870b = fug1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f265869a) {
            case 0:
                this.f265870b.clear();
                break;
            default:
                this.f265870b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f265869a) {
            case 0:
                fug1 fug1Var = this.f265870b;
                Map mapM42732d = fug1Var.m42732d();
                if (mapM42732d != null) {
                    return mapM42732d.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM42736h = fug1Var.m42736h(entry.getKey());
                    if (iM42736h != -1 && Objects.equals(fug1Var.m42730b()[iM42736h], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f265870b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f265869a) {
            case 0:
                fug1 fug1Var = this.f265870b;
                Map mapM42732d = fug1Var.m42732d();
                return mapM42732d != null ? mapM42732d.entrySet().iterator() : new utg1(fug1Var, 1);
            default:
                fug1 fug1Var2 = this.f265870b;
                Map mapM42732d2 = fug1Var2.m42732d();
                return mapM42732d2 != null ? mapM42732d2.keySet().iterator() : new utg1(fug1Var2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f265869a) {
            case 0:
                fug1 fug1Var = this.f265870b;
                Map mapM42732d = fug1Var.m42732d();
                if (mapM42732d != null) {
                    return mapM42732d.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!fug1Var.m42731c()) {
                        int iM42734f = fug1Var.m42734f();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = fug1Var.f73496a;
                        Objects.requireNonNull(obj2);
                        int iM92079Z = xtm0.m92079Z(key, value, iM42734f, obj2, fug1Var.m42738j(), fug1Var.m42729a(), fug1Var.m42730b());
                        if (iM92079Z != -1) {
                            fug1Var.m42733e(iM92079Z, iM42734f);
                            fug1Var.f73501f--;
                            fug1Var.f73500e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                fug1 fug1Var2 = this.f265870b;
                Map mapM42732d2 = fug1Var2.m42732d();
                if (mapM42732d2 != null) {
                    return mapM42732d2.keySet().remove(obj);
                }
                return fug1Var2.m42737i(obj) != fug1.f73495t;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f265869a) {
            case 0:
                break;
        }
        return this.f265870b.size();
    }
}
