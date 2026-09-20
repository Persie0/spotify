package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a830 extends gue {

    /* JADX INFO: renamed from: f */
    public final int f13182f;

    public a830(int i) {
        this.f13182f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a830) && this.f13182f == ((a830) obj).f13182f;
    }

    public final int hashCode() {
        return edb.m38547C(this.f13182f);
    }
}
