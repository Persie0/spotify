package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xyw implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f267433a;

    /* JADX INFO: renamed from: b */
    public final String f267434b;

    public xyw(String str, String str2) {
        this.f267433a = str;
        this.f267434b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyw)) {
            return false;
        }
        xyw xywVar = (xyw) obj;
        if (!wj50.m88271j(this.f267433a, xywVar.f267433a)) {
            return false;
        }
        String str = xywVar.f267434b;
        wp6 wp6Var = ahn0.f15723b;
        return wj50.m88271j(this.f267434b, str);
    }

    public final int hashCode() {
        int iHashCode = this.f267433a.hashCode() * 31;
        wp6 wp6Var = ahn0.f15723b;
        return this.f267434b.hashCode() + iHashCode;
    }
}
