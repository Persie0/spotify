package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gfj0 {

    /* JADX INFO: renamed from: a */
    public final String f79367a;

    /* JADX INFO: renamed from: b */
    public final String f79368b;

    /* JADX INFO: renamed from: c */
    public final ffj0 f79369c;

    public gfj0(String str, String str2, ffj0 ffj0Var) {
        this.f79367a = str;
        this.f79368b = str2;
        this.f79369c = ffj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfj0)) {
            return false;
        }
        gfj0 gfj0Var = (gfj0) obj;
        return wj50.m88271j(this.f79367a, gfj0Var.f79367a) && wj50.m88271j(this.f79368b, gfj0Var.f79368b) && this.f79369c == gfj0Var.f79369c;
    }

    public final int hashCode() {
        int iHashCode = this.f79367a.hashCode() * 31;
        String str = this.f79368b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ffj0 ffj0Var = this.f79369c;
        return iHashCode2 + (ffj0Var != null ? ffj0Var.hashCode() : 0);
    }
}
