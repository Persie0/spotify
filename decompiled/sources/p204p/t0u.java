package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t0u extends z0u {

    /* JADX INFO: renamed from: a */
    public final String f215988a;

    /* JADX INFO: renamed from: b */
    public final boolean f215989b;

    public t0u(String str, boolean z) {
        this.f215988a = str;
        this.f215989b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0u)) {
            return false;
        }
        t0u t0uVar = (t0u) obj;
        return wj50.m88271j(this.f215988a, t0uVar.f215988a) && this.f215989b == t0uVar.f215989b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f215989b) + (this.f215988a.hashCode() * 31);
    }
}
