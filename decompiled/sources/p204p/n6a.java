package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n6a implements q6a {

    /* JADX INFO: renamed from: a */
    public final String f150766a;

    /* JADX INFO: renamed from: b */
    public final String f150767b;

    public n6a(String str, String str2) {
        this.f150766a = str;
        this.f150767b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6a)) {
            return false;
        }
        n6a n6aVar = (n6a) obj;
        return wj50.m88271j(this.f150766a, n6aVar.f150766a) && wj50.m88271j(this.f150767b, n6aVar.f150767b);
    }

    public final int hashCode() {
        return this.f150767b.hashCode() + (this.f150766a.hashCode() * 31);
    }
}
