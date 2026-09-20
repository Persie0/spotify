package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j9b {

    /* JADX INFO: renamed from: a */
    public final String f110132a;

    /* JADX INFO: renamed from: b */
    public final String f110133b;

    public j9b(String str, String str2) {
        this.f110132a = str;
        this.f110133b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9b)) {
            return false;
        }
        j9b j9bVar = (j9b) obj;
        return wj50.m88271j(this.f110132a, j9bVar.f110132a) && wj50.m88271j(this.f110133b, j9bVar.f110133b);
    }

    public final int hashCode() {
        return this.f110133b.hashCode() + (this.f110132a.hashCode() * 31);
    }
}
