package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class bo40 {

    /* JADX INFO: renamed from: a */
    public final int f29008a;

    /* JADX INFO: renamed from: b */
    public final Object f29009b;

    public bo40(int i, Object obj) {
        this.f29008a = i;
        this.f29009b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo40)) {
            return false;
        }
        bo40 bo40Var = (bo40) obj;
        return this.f29008a == bo40Var.f29008a && wj50.m88271j(this.f29009b, bo40Var.f29009b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f29008a) * 31;
        Object obj = this.f29009b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f29008a + ", value=" + this.f29009b + ')';
    }
}
