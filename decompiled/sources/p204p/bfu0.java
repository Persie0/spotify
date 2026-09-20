package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bfu0 {

    /* JADX INFO: renamed from: a */
    public final String f26785a;

    /* JADX INFO: renamed from: b */
    public final String f26786b;

    public bfu0(String str, String str2) {
        this.f26785a = str;
        this.f26786b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfu0)) {
            return false;
        }
        bfu0 bfu0Var = (bfu0) obj;
        return wj50.m88271j(this.f26785a, bfu0Var.f26785a) && wj50.m88271j(this.f26786b, bfu0Var.f26786b);
    }

    public final int hashCode() {
        int iHashCode = this.f26785a.hashCode() * 31;
        String str = this.f26786b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
