package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sy90 implements wy90 {

    /* JADX INFO: renamed from: a */
    public final boolean f215194a;

    /* JADX INFO: renamed from: b */
    public final boolean f215195b;

    /* JADX INFO: renamed from: c */
    public final String f215196c;

    public sy90(String str, boolean z, boolean z2) {
        this.f215194a = z;
        this.f215195b = z2;
        this.f215196c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy90)) {
            return false;
        }
        sy90 sy90Var = (sy90) obj;
        return this.f215194a == sy90Var.f215194a && this.f215195b == sy90Var.f215195b && wj50.m88271j(this.f215196c, sy90Var.f215196c);
    }

    public final int hashCode() {
        return this.f215196c.hashCode() + s571.m77245d(Boolean.hashCode(this.f215194a) * 31, 31, this.f215195b);
    }
}
