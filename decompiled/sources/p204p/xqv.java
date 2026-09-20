package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xqv {

    /* JADX INFO: renamed from: a */
    public final String f265121a;

    /* JADX INFO: renamed from: b */
    public final String f265122b;

    public xqv(String str, String str2) {
        this.f265121a = str;
        this.f265122b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqv)) {
            return false;
        }
        xqv xqvVar = (xqv) obj;
        return wj50.m88271j(this.f265121a, xqvVar.f265121a) && wj50.m88271j(this.f265122b, xqvVar.f265122b);
    }

    public final int hashCode() {
        return this.f265122b.hashCode() + (this.f265121a.hashCode() * 31);
    }
}
