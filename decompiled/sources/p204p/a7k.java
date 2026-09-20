package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class a7k {

    /* JADX INFO: renamed from: a */
    public final String f13085a;

    /* JADX INFO: renamed from: b */
    public final String f13086b;

    public a7k(String str, String str2) {
        this.f13085a = str;
        this.f13086b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7k)) {
            return false;
        }
        a7k a7kVar = (a7k) obj;
        return wj50.m88271j(this.f13085a, a7kVar.f13085a) && wj50.m88271j(this.f13086b, a7kVar.f13086b);
    }

    public final int hashCode() {
        return this.f13086b.hashCode() + (this.f13085a.hashCode() * 31);
    }
}
