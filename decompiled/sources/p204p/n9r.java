package p204p;

/* JADX INFO: loaded from: classes17.dex */
public final class n9r {

    /* JADX INFO: renamed from: a */
    public final String f151851a;

    /* JADX INFO: renamed from: b */
    public final int f151852b;

    public n9r(String str, int i) {
        this.f151851a = str;
        this.f151852b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9r)) {
            return false;
        }
        n9r n9rVar = (n9r) obj;
        return wj50.m88271j(this.f151851a, n9rVar.f151851a) && this.f151852b == n9rVar.f151852b;
    }

    public final int hashCode() {
        return (this.f151851a.hashCode() * 31) + edb.m38547C(this.f151852b);
    }
}
