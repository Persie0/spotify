package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class n0u extends o0u {

    /* JADX INFO: renamed from: a */
    public final String f149169a;

    /* JADX INFO: renamed from: b */
    public final boolean f149170b;

    public n0u(String str, boolean z) {
        this.f149169a = str;
        this.f149170b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0u)) {
            return false;
        }
        n0u n0uVar = (n0u) obj;
        return wj50.m88271j(this.f149169a, n0uVar.f149169a) && this.f149170b == n0uVar.f149170b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149170b) + (this.f149169a.hashCode() * 31);
    }
}
