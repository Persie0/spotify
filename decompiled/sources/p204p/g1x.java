package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class g1x implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f75762a;

    /* JADX INFO: renamed from: b */
    public final String f75763b;

    public g1x(String str, String str2) {
        this.f75762a = str;
        this.f75763b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1x)) {
            return false;
        }
        g1x g1xVar = (g1x) obj;
        if (!wj50.m88271j(this.f75762a, g1xVar.f75762a)) {
            return false;
        }
        String str = g1xVar.f75763b;
        wp6 wp6Var = hlq.f92726b;
        return wj50.m88271j(this.f75763b, str);
    }

    public final int hashCode() {
        int iHashCode = this.f75762a.hashCode() * 31;
        wp6 wp6Var = hlq.f92726b;
        return this.f75763b.hashCode() + iHashCode;
    }
}
