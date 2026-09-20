package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class c5j {

    /* JADX INFO: renamed from: a */
    public final String f34193a;

    /* JADX INFO: renamed from: b */
    public final String f34194b;

    public c5j(String str, String str2) {
        this.f34193a = str;
        this.f34194b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5j)) {
            return false;
        }
        c5j c5jVar = (c5j) obj;
        return wj50.m88271j(this.f34193a, c5jVar.f34193a) && wj50.m88271j(this.f34194b, c5jVar.f34194b);
    }

    public final int hashCode() {
        return this.f34194b.hashCode() + (this.f34193a.hashCode() * 31);
    }
}
