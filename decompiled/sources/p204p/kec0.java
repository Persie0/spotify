package p204p;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class kec0 implements Map.Entry, sq60 {

    /* JADX INFO: renamed from: a */
    public final mec0 f121856a;

    /* JADX INFO: renamed from: b */
    public final int f121857b;

    /* JADX INFO: renamed from: c */
    public final int f121858c;

    public kec0(mec0 mec0Var, int i) {
        this.f121856a = mec0Var;
        this.f121857b = i;
        this.f121858c = mec0Var.f142674h;
    }

    /* JADX INFO: renamed from: a */
    public final void m56202a() {
        if (this.f121856a.f142674h != this.f121858c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return wj50.m88271j(entry.getKey(), getKey()) && wj50.m88271j(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m56202a();
        return this.f121856a.f142667a[this.f121857b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m56202a();
        Object[] objArr = this.f121856a.f142668b;
        wj50.m88279p(objArr);
        return objArr[this.f121857b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m56202a();
        mec0 mec0Var = this.f121856a;
        mec0Var.m61541c();
        Object[] objArr = mec0Var.f142668b;
        if (objArr == null) {
            int length = mec0Var.f142667a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            mec0Var.f142668b = objArr;
        }
        int i = this.f121857b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
