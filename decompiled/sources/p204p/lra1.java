package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lra1 {

    /* JADX INFO: renamed from: a */
    public final int f136248a;

    public lra1(int i) {
        this.f136248a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lra1) && this.f136248a == ((lra1) obj).f136248a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f136248a);
    }
}
