package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h1x implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f86771a;

    /* JADX INFO: renamed from: b */
    public final String f86772b;

    public h1x(String str, String str2) {
        this.f86771a = str;
        this.f86772b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1x)) {
            return false;
        }
        h1x h1xVar = (h1x) obj;
        if (!wj50.m88271j(this.f86771a, h1xVar.f86771a)) {
            return false;
        }
        String str = h1xVar.f86772b;
        wp6 wp6Var = hlq.f92726b;
        return wj50.m88271j(this.f86772b, str);
    }

    public final int hashCode() {
        int iHashCode = this.f86771a.hashCode() * 31;
        wp6 wp6Var = hlq.f92726b;
        return this.f86772b.hashCode() + iHashCode;
    }
}
