package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tmv0 {

    /* JADX INFO: renamed from: a */
    public final String f221785a;

    /* JADX INFO: renamed from: b */
    public final String f221786b;

    /* JADX INFO: renamed from: c */
    public final boolean f221787c;

    public tmv0(String str, String str2, boolean z) {
        this.f221785a = str;
        this.f221786b = str2;
        this.f221787c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmv0)) {
            return false;
        }
        tmv0 tmv0Var = (tmv0) obj;
        return wj50.m88271j(this.f221785a, tmv0Var.f221785a) && wj50.m88271j(this.f221786b, tmv0Var.f221786b) && this.f221787c == tmv0Var.f221787c;
    }

    public final int hashCode() {
        int iHashCode = this.f221785a.hashCode() * 31;
        String str = this.f221786b;
        return Boolean.hashCode(this.f221787c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
