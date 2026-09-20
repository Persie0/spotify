package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n2k {

    /* JADX INFO: renamed from: a */
    public final int f149775a;

    public n2k(int i) {
        this.f149775a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2k) && this.f149775a == ((n2k) obj).f149775a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f149775a);
    }
}
