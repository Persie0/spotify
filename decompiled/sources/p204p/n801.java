package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n801 implements q801 {

    /* JADX INFO: renamed from: a */
    public final String f151299a;

    /* JADX INFO: renamed from: b */
    public final boolean f151300b;

    public n801(String str, boolean z) {
        this.f151299a = str;
        this.f151300b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n801)) {
            return false;
        }
        n801 n801Var = (n801) obj;
        return wj50.m88271j(this.f151299a, n801Var.f151299a) && this.f151300b == n801Var.f151300b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f151300b) + (this.f151299a.hashCode() * 31);
    }
}
