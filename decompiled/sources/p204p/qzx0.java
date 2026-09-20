package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qzx0 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Object f194328a;

    /* JADX INFO: renamed from: b */
    public final Object f194329b;

    /* JADX INFO: renamed from: c */
    public qzx0 f194330c;

    /* JADX INFO: renamed from: d */
    public qzx0 f194331d;

    public qzx0(Object obj, Object obj2) {
        this.f194328a = obj;
        this.f194329b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qzx0)) {
            return false;
        }
        qzx0 qzx0Var = (qzx0) obj;
        return this.f194328a.equals(qzx0Var.f194328a) && this.f194329b.equals(qzx0Var.f194329b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f194328a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f194329b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f194328a.hashCode() ^ this.f194329b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f194328a + "=" + this.f194329b;
    }
}
