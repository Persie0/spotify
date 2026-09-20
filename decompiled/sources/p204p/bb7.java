package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bb7 {

    /* JADX INFO: renamed from: a */
    public final String f25448a;

    /* JADX INFO: renamed from: b */
    public final String f25449b;

    /* JADX INFO: renamed from: c */
    public final int f25450c;

    public bb7(String str, String str2, int i) {
        this.f25448a = str;
        this.f25449b = str2;
        this.f25450c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb7)) {
            return false;
        }
        bb7 bb7Var = (bb7) obj;
        return wj50.m88271j(this.f25448a, bb7Var.f25448a) && wj50.m88271j(this.f25449b, bb7Var.f25449b) && this.f25450c == bb7Var.f25450c;
    }

    public final int hashCode() {
        int iHashCode = this.f25448a.hashCode() * 31;
        String str = this.f25449b;
        return Integer.hashCode(this.f25450c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
