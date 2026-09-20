package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class are {

    /* JADX INFO: renamed from: a */
    public final String f19038a;

    /* JADX INFO: renamed from: b */
    public final int f19039b;

    /* JADX INFO: renamed from: c */
    public final nt80 f19040c;

    /* JADX INFO: renamed from: d */
    public final int f19041d;

    public are(int i, int i2, String str, nt80 nt80Var) {
        this.f19038a = str;
        this.f19039b = i;
        this.f19040c = nt80Var;
        this.f19041d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof are)) {
            return false;
        }
        are areVar = (are) obj;
        return this.f19038a.equals(areVar.f19038a) && this.f19039b == areVar.f19039b && this.f19040c.equals(areVar.f19040c) && this.f19041d == areVar.f19041d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19041d) + ((this.f19040c.hashCode() + mt60.m62800g(this.f19039b, this.f19038a.hashCode() * 31, 31)) * 31);
    }
}
