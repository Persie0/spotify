package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class jdx0 extends tvl0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final tvl0 f111406a;

    public jdx0(tvl0 tvl0Var) {
        this.f111406a = tvl0Var;
    }

    @Override // p204p.tvl0
    /* JADX INFO: renamed from: a */
    public final tvl0 mo47258a() {
        return this.f111406a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f111406a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jdx0) {
            return this.f111406a.equals(((jdx0) obj).f111406a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f111406a.hashCode();
    }

    public final String toString() {
        return this.f111406a + ".reverse()";
    }
}
