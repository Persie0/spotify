package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tiv extends uiv {

    /* JADX INFO: renamed from: a */
    public final int f220749a;

    public tiv(int i) {
        this.f220749a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tiv) && this.f220749a == ((tiv) obj).f220749a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f220749a);
    }
}
