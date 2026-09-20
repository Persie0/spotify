package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j6y0 extends l6y0 {

    /* JADX INFO: renamed from: a */
    public final boolean f109427a;

    /* JADX INFO: renamed from: b */
    public final String f109428b;

    /* JADX INFO: renamed from: c */
    public final float f109429c;

    public j6y0(boolean z, String str, float f) {
        this.f109427a = z;
        this.f109428b = str;
        this.f109429c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6y0)) {
            return false;
        }
        j6y0 j6y0Var = (j6y0) obj;
        return this.f109427a == j6y0Var.f109427a && wj50.m88271j(this.f109428b, j6y0Var.f109428b) && Float.compare(this.f109429c, j6y0Var.f109429c) == 0;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f109427a) * 31;
        String str = this.f109428b;
        return Float.hashCode(this.f109429c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
