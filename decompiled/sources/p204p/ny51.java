package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ny51 implements ec40 {

    /* JADX INFO: renamed from: a */
    public final p340 f159718a;

    /* JADX INFO: renamed from: b */
    public final vb40 f159719b;

    /* JADX INFO: renamed from: c */
    public final int f159720c;

    /* JADX INFO: renamed from: d */
    public final pge0 f159721d;

    /* JADX INFO: renamed from: e */
    public final String f159722e;

    /* JADX INFO: renamed from: f */
    public final boolean f159723f;

    /* JADX INFO: renamed from: g */
    public final boolean f159724g;

    public ny51(p340 p340Var, vb40 vb40Var, int i, pge0 pge0Var, String str, boolean z, boolean z2) {
        this.f159718a = p340Var;
        this.f159719b = vb40Var;
        this.f159720c = i;
        this.f159721d = pge0Var;
        this.f159722e = str;
        this.f159723f = z;
        this.f159724g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny51)) {
            return false;
        }
        ny51 ny51Var = (ny51) obj;
        return wj50.m88271j(this.f159718a, ny51Var.f159718a) && wj50.m88271j(this.f159719b, ny51Var.f159719b) && this.f159720c == ny51Var.f159720c && wj50.m88271j(this.f159721d, ny51Var.f159721d) && wj50.m88271j(this.f159722e, ny51Var.f159722e) && this.f159723f == ny51Var.f159723f && this.f159724g == ny51Var.f159724g;
    }

    @Override // p204p.ec40
    public final vb40 getRequest() {
        return this.f159719b;
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f159720c, (this.f159719b.hashCode() + (this.f159718a.hashCode() * 31)) * 31, 31);
        pge0 pge0Var = this.f159721d;
        int iHashCode = (iM40938f + (pge0Var == null ? 0 : pge0Var.hashCode())) * 31;
        String str = this.f159722e;
        return Boolean.hashCode(this.f159724g) + s571.m77245d((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f159723f);
    }

    @Override // p204p.ec40
    /* JADX INFO: renamed from: j */
    public final p340 mo38473j() {
        return this.f159718a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.f159718a);
        sb.append(", request=");
        sb.append(this.f159719b);
        sb.append(", dataSource=");
        sb.append(adn.m25613y(this.f159720c));
        sb.append(", memoryCacheKey=");
        sb.append(this.f159721d);
        sb.append(", diskCacheKey=");
        sb.append(this.f159722e);
        sb.append(", isSampled=");
        sb.append(this.f159723f);
        sb.append(", isPlaceholderCached=");
        return s571.m77253l(sb, this.f159724g, ')');
    }
}
