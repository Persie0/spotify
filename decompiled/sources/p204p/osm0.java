package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class osm0 {

    /* JADX INFO: renamed from: a */
    public final sk4 f168837a;

    /* JADX INFO: renamed from: b */
    public final int f168838b;

    /* JADX INFO: renamed from: c */
    public final int f168839c;

    public osm0(sk4 sk4Var, int i, int i2) {
        this.f168837a = sk4Var;
        this.f168838b = i;
        this.f168839c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osm0)) {
            return false;
        }
        osm0 osm0Var = (osm0) obj;
        return this.f168837a.equals(osm0Var.f168837a) && this.f168838b == osm0Var.f168838b && this.f168839c == osm0Var.f168839c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f168839c) + mt60.m62800g(this.f168838b, this.f168837a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f168837a);
        sb.append(", startIndex=");
        sb.append(this.f168838b);
        sb.append(", endIndex=");
        return edb.m38567p(sb, this.f168839c, ')');
    }
}
