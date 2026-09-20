package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r8v0 {

    /* JADX INFO: renamed from: a */
    public final String f196841a;

    /* JADX INFO: renamed from: b */
    public final boolean f196842b;

    /* JADX INFO: renamed from: c */
    public final Integer f196843c;

    /* JADX INFO: renamed from: d */
    public final boolean f196844d;

    public r8v0(Integer num, String str, boolean z, boolean z2) {
        this.f196841a = str;
        this.f196842b = z;
        this.f196843c = num;
        this.f196844d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8v0)) {
            return false;
        }
        r8v0 r8v0Var = (r8v0) obj;
        return wj50.m88271j(this.f196841a, r8v0Var.f196841a) && this.f196842b == r8v0Var.f196842b && wj50.m88271j(this.f196843c, r8v0Var.f196843c) && this.f196844d == r8v0Var.f196844d;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f196841a.hashCode() * 31, 31, this.f196842b);
        Integer num = this.f196843c;
        return Boolean.hashCode(this.f196844d) + ((iM77245d + (num == null ? 0 : num.hashCode())) * 31);
    }
}
