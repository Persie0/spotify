package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class k8b {

    /* JADX INFO: renamed from: a */
    public final String f120278a;

    /* JADX INFO: renamed from: b */
    public final long f120279b;

    public k8b(String str, long j) {
        this.f120278a = str;
        this.f120279b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8b)) {
            return false;
        }
        k8b k8bVar = (k8b) obj;
        return wj50.m88271j(this.f120278a, k8bVar.f120278a) && this.f120279b == k8bVar.f120279b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f120279b) + (this.f120278a.hashCode() * 31);
    }
}
