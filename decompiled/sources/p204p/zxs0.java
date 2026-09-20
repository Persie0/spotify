package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zxs0 implements ays0 {

    /* JADX INFO: renamed from: a */
    public final String f287389a;

    /* JADX INFO: renamed from: b */
    public final String f287390b;

    public zxs0(String str, String str2) {
        this.f287389a = str;
        this.f287390b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxs0)) {
            return false;
        }
        zxs0 zxs0Var = (zxs0) obj;
        return wj50.m88271j(this.f287389a, zxs0Var.f287389a) && wj50.m88271j(this.f287390b, zxs0Var.f287390b);
    }

    public final int hashCode() {
        int iHashCode = this.f287389a.hashCode() * 31;
        String str = this.f287390b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
