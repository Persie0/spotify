package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class nec0 extends AbstractC2444u8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152971a;

    /* JADX INFO: renamed from: b */
    public final mec0 f152972b;

    public /* synthetic */ nec0(mec0 mec0Var, int i) {
        this.f152971a = i;
        this.f152972b = mec0Var;
    }

    @Override // p204p.AbstractC2444u8
    /* JADX INFO: renamed from: a */
    public final int mo59769a() {
        switch (this.f152971a) {
            case 0:
                break;
        }
        return this.f152972b.f142675i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f152971a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f152971a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f152971a) {
            case 0:
                this.f152972b.clear();
                break;
            default:
                this.f152972b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f152971a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                mec0 mec0Var = this.f152972b;
                mec0Var.getClass();
                int iM61544f = mec0Var.m61544f(entry.getKey());
                if (iM61544f < 0) {
                    return false;
                }
                Object[] objArr = mec0Var.f142668b;
                wj50.m88279p(objArr);
                return wj50.m88271j(objArr[iM61544f], entry.getValue());
            default:
                return this.f152972b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        boolean zM88271j;
        switch (this.f152971a) {
            case 0:
                mec0 mec0Var = this.f152972b;
                mec0Var.getClass();
                for (Object obj : collection) {
                    if (obj == null) {
                        return false;
                    }
                    try {
                        Map.Entry entry = (Map.Entry) obj;
                        int iM61544f = mec0Var.m61544f(entry.getKey());
                        if (iM61544f < 0) {
                            zM88271j = false;
                        } else {
                            Object[] objArr = mec0Var.f142668b;
                            wj50.m88279p(objArr);
                            zM88271j = wj50.m88271j(objArr[iM61544f], entry.getValue());
                        }
                        if (!zM88271j) {
                            return false;
                        }
                    } catch (ClassCastException unused) {
                        return false;
                    }
                }
                return true;
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f152971a) {
            case 0:
                break;
        }
        return this.f152972b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f152971a) {
            case 0:
                mec0 mec0Var = this.f152972b;
                mec0Var.getClass();
                return new jec0(mec0Var, 0);
            default:
                mec0 mec0Var2 = this.f152972b;
                mec0Var2.getClass();
                return new lec0(mec0Var2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f152971a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                mec0 mec0Var = this.f152972b;
                mec0Var.m61541c();
                int iM61544f = mec0Var.m61544f(entry.getKey());
                if (iM61544f < 0) {
                    return false;
                }
                Object[] objArr = mec0Var.f142668b;
                wj50.m88279p(objArr);
                if (!wj50.m88271j(objArr[iM61544f], entry.getValue())) {
                    return false;
                }
                mec0Var.m61548j(iM61544f);
                return true;
            default:
                mec0 mec0Var2 = this.f152972b;
                mec0Var2.m61541c();
                int iM61544f2 = mec0Var2.m61544f(obj);
                if (iM61544f2 < 0) {
                    return false;
                }
                mec0Var2.m61548j(iM61544f2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f152971a) {
            case 0:
                this.f152972b.m61541c();
                break;
            default:
                this.f152972b.m61541c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f152971a) {
            case 0:
                this.f152972b.m61541c();
                break;
            default:
                this.f152972b.m61541c();
                break;
        }
        return super.retainAll(collection);
    }
}
