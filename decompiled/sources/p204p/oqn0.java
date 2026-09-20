package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class oqn0 extends AbstractC2444u8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f168325a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2404t8 f168326b;

    public /* synthetic */ oqn0(AbstractC2404t8 abstractC2404t8, int i) {
        this.f168325a = i;
        this.f168326b = abstractC2404t8;
    }

    @Override // p204p.AbstractC2444u8
    /* JADX INFO: renamed from: a */
    public final int mo59769a() {
        switch (this.f168325a) {
            case 0:
                return ((hqn0) this.f168326b).size();
            default:
                return ((hrn0) this.f168326b).size();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f168325a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f168325a) {
            case 0:
                ((hqn0) this.f168326b).clear();
                break;
            default:
                ((hrn0) this.f168326b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f168325a) {
            case 0:
                return ((hqn0) this.f168326b).containsKey(obj);
            default:
                return ((hrn0) this.f168326b).f94492d.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f168325a) {
            case 0:
                hqn0 hqn0Var = (hqn0) this.f168326b;
                nj91[] nj91VarArr = new nj91[8];
                for (int i = 0; i < 8; i++) {
                    nj91VarArr[i] = new pj91(1);
                }
                return new pqn0(hqn0Var, nj91VarArr);
            default:
                return new irn0((hrn0) this.f168326b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f168325a) {
            case 0:
                hqn0 hqn0Var = (hqn0) this.f168326b;
                if (!hqn0Var.containsKey(obj)) {
                    return false;
                }
                hqn0Var.remove(obj);
                return true;
            default:
                hrn0 hrn0Var = (hrn0) this.f168326b;
                if (!hrn0Var.f94492d.containsKey(obj)) {
                    return false;
                }
                hrn0Var.remove(obj);
                return true;
        }
    }
}
