package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mqn0 extends AbstractC2444u8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146319a;

    /* JADX INFO: renamed from: b */
    public final iqn0 f146320b;

    public /* synthetic */ mqn0(int i, iqn0 iqn0Var) {
        this.f146319a = i;
        this.f146320b = iqn0Var;
    }

    @Override // p204p.AbstractC2444u8
    /* JADX INFO: renamed from: a */
    public final int mo59769a() {
        switch (this.f146319a) {
            case 0:
                break;
        }
        return this.f146320b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f146319a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f146319a) {
            case 0:
                this.f146320b.clear();
                break;
            default:
                this.f146320b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f146319a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                iqn0 iqn0Var = this.f146320b;
                Object obj2 = iqn0Var.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && iqn0Var.containsKey(entry.getKey());
            default:
                return this.f146320b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f146319a) {
            case 0:
                return new nqn0(this.f146320b);
            default:
                oj91[] oj91VarArr = new oj91[8];
                for (int i = 0; i < 8; i++) {
                    oj91VarArr[i] = new rj91();
                }
                return new qqn0(this.f146320b, oj91VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f146319a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f146320b.remove(entry.getKey(), entry.getValue());
            default:
                iqn0 iqn0Var = this.f146320b;
                if (!iqn0Var.containsKey(obj)) {
                    return false;
                }
                iqn0Var.remove(obj);
                return true;
        }
    }
}
