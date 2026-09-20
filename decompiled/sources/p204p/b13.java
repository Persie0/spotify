package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b13 {

    /* JADX INFO: renamed from: a */
    public final int f22189a;

    public b13(int i) {
        this.f22189a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b13) && this.f22189a == ((b13) obj).f22189a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f22189a);
    }
}
