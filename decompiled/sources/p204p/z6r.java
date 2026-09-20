package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class z6r {

    /* JADX INFO: renamed from: a */
    public final String f279974a;

    /* JADX INFO: renamed from: b */
    public final long f279975b;

    public z6r(String str, long j) {
        this.f279974a = str;
        this.f279975b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6r)) {
            return false;
        }
        z6r z6rVar = (z6r) obj;
        return wj50.m88271j(this.f279974a, z6rVar.f279974a) && this.f279975b == z6rVar.f279975b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f279975b) + (this.f279974a.hashCode() * 31);
    }
}
