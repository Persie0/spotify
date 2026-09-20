package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gdf implements hdf {

    /* JADX INFO: renamed from: a */
    public final String f78828a;

    /* JADX INFO: renamed from: b */
    public final int f78829b;

    /* JADX INFO: renamed from: c */
    public final int f78830c;

    public gdf(String str, int i, int i2) {
        this.f78828a = str;
        this.f78829b = i;
        this.f78830c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdf)) {
            return false;
        }
        gdf gdfVar = (gdf) obj;
        return wj50.m88271j(this.f78828a, gdfVar.f78828a) && this.f78829b == gdfVar.f78829b && this.f78830c == gdfVar.f78830c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f78830c) + mt60.m62800g(this.f78829b, this.f78828a.hashCode() * 31, 31);
    }
}
