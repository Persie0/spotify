package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f5t extends o5t {

    /* JADX INFO: renamed from: a */
    public final int f66167a;

    public f5t(int i) {
        this.f66167a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5t) && this.f66167a == ((f5t) obj).f66167a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f66167a);
    }
}
