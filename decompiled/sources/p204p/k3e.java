package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k3e {

    /* JADX INFO: renamed from: a */
    public final String f118864a;

    /* JADX INFO: renamed from: b */
    public final String f118865b;

    public k3e(String str, String str2) {
        this.f118864a = str;
        this.f118865b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3e)) {
            return false;
        }
        k3e k3eVar = (k3e) obj;
        return wj50.m88271j(this.f118864a, k3eVar.f118864a) && wj50.m88271j(this.f118865b, k3eVar.f118865b);
    }

    public final int hashCode() {
        return this.f118865b.hashCode() + (this.f118864a.hashCode() * 31);
    }
}
