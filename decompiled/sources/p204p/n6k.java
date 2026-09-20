package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n6k {

    /* JADX INFO: renamed from: a */
    public final String f150898a;

    /* JADX INFO: renamed from: b */
    public final boolean f150899b;

    public n6k(String str, boolean z) {
        this.f150898a = str;
        this.f150899b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6k)) {
            return false;
        }
        n6k n6kVar = (n6k) obj;
        return wj50.m88271j(this.f150898a, n6kVar.f150898a) && this.f150899b == n6kVar.f150899b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150899b) + (this.f150898a.hashCode() * 31);
    }
}
