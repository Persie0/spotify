package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x7t {

    /* JADX INFO: renamed from: a */
    public final String f258987a;

    /* JADX INFO: renamed from: b */
    public final String f258988b;

    public x7t(String str, String str2) {
        this.f258987a = str;
        this.f258988b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7t)) {
            return false;
        }
        x7t x7tVar = (x7t) obj;
        return wj50.m88271j(this.f258987a, x7tVar.f258987a) && wj50.m88271j(this.f258988b, x7tVar.f258988b);
    }

    public final int hashCode() {
        return this.f258988b.hashCode() + (this.f258987a.hashCode() * 31);
    }
}
