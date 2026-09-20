package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class k4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f119198a;

    /* JADX INFO: renamed from: b */
    public final String f119199b;

    public k4d(String str, String str2) {
        this.f119198a = str;
        this.f119199b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4d)) {
            return false;
        }
        k4d k4dVar = (k4d) obj;
        return wj50.m88271j(this.f119198a, k4dVar.f119198a) && wj50.m88271j(this.f119199b, k4dVar.f119199b);
    }

    public final int hashCode() {
        return this.f119199b.hashCode() + (this.f119198a.hashCode() * 31);
    }
}
