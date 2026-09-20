package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class giv0 {

    /* JADX INFO: renamed from: a */
    public final String f80266a;

    /* JADX INFO: renamed from: b */
    public final boolean f80267b;

    public giv0(String str, boolean z) {
        this.f80266a = str;
        this.f80267b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof giv0)) {
            return false;
        }
        giv0 giv0Var = (giv0) obj;
        return wj50.m88271j(this.f80266a, giv0Var.f80266a) && this.f80267b == giv0Var.f80267b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f80267b) + (this.f80266a.hashCode() * 31);
    }
}
