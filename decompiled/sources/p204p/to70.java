package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class to70 {

    /* JADX INFO: renamed from: a */
    public final int f222194a;

    public to70(int i) {
        this.f222194a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof to70) && this.f222194a == ((to70) obj).f222194a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f222194a);
    }

    public final String toString() {
        return edb.m38567p(new StringBuilder("LayoutInfo(layoutId="), this.f222194a, ')');
    }
}
