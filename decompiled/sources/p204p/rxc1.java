package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rxc1 implements ayc1 {

    /* JADX INFO: renamed from: a */
    public final int f203574a;

    public rxc1(int i) {
        this.f203574a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxc1) && this.f203574a == ((rxc1) obj).f203574a;
    }

    public final int hashCode() {
        int i = this.f203574a;
        if (i == 0) {
            return 0;
        }
        return edb.m38547C(i);
    }
}
