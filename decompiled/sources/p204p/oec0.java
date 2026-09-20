package p204p;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class oec0 extends AbstractCollection implements Collection, qq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f164400a;

    /* JADX INFO: renamed from: b */
    public final Object f164401b;

    public /* synthetic */ oec0(Object obj, int i) {
        this.f164400a = i;
        this.f164401b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f164400a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f164400a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f164400a) {
            case 0:
                ((mec0) this.f164401b).clear();
                break;
            case 1:
                ((hqn0) this.f164401b).clear();
                break;
            case 2:
                ((iqn0) this.f164401b).clear();
                break;
            default:
                ((hrn0) this.f164401b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f164400a) {
            case 0:
                return ((mec0) this.f164401b).containsValue(obj);
            case 1:
                return ((hqn0) this.f164401b).containsValue(obj);
            case 2:
                return ((iqn0) this.f164401b).containsValue(obj);
            default:
                return ((hrn0) this.f164401b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f164400a) {
            case 0:
                return ((mec0) this.f164401b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f164400a) {
            case 0:
                mec0 mec0Var = (mec0) this.f164401b;
                mec0Var.getClass();
                return new jec0(mec0Var, 1);
            case 1:
                hqn0 hqn0Var = (hqn0) this.f164401b;
                nj91[] nj91VarArr = new nj91[8];
                for (int i = 0; i < 8; i++) {
                    nj91VarArr[i] = new pj91(2);
                }
                return new pqn0(hqn0Var, nj91VarArr);
            case 2:
                iqn0 iqn0Var = (iqn0) this.f164401b;
                oj91[] oj91VarArr = new oj91[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    oj91VarArr[i2] = new qj91(1);
                }
                return new qqn0(iqn0Var, oj91VarArr);
            default:
                return new irn0((hrn0) this.f164401b, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f164400a) {
            case 0:
                mec0 mec0Var = (mec0) this.f164401b;
                mec0Var.m61541c();
                int iM61545g = mec0Var.m61545g(obj);
                if (iM61545g < 0) {
                    return false;
                }
                mec0Var.m61548j(iM61545g);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f164400a) {
            case 0:
                ((mec0) this.f164401b).m61541c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f164400a) {
            case 0:
                ((mec0) this.f164401b).m61541c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f164400a) {
            case 0:
                return ((mec0) this.f164401b).f142675i;
            case 1:
                return ((hqn0) this.f164401b).size();
            case 2:
                return ((iqn0) this.f164401b).size();
            default:
                return ((hrn0) this.f164401b).size();
        }
    }
}
