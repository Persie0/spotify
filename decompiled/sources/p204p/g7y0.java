package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g7y0 {

    /* JADX INFO: renamed from: a */
    public final int f77369a;

    public g7y0(int i) {
        this.f77369a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7y0) && this.f77369a == ((g7y0) obj).f77369a;
    }

    public final int hashCode() {
        int i = this.f77369a;
        if (i == 0) {
            return 0;
        }
        return edb.m38547C(i);
    }
}
