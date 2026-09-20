package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gd7 {

    /* JADX INFO: renamed from: a */
    public final String f78746a;

    /* JADX INFO: renamed from: b */
    public final String f78747b;

    /* JADX INFO: renamed from: c */
    public final String f78748c;

    /* JADX INFO: renamed from: d */
    public final String f78749d;

    /* JADX INFO: renamed from: e */
    public final Float f78750e;

    public gd7(String str, String str2, String str3, String str4, Float f) {
        this.f78746a = str;
        this.f78747b = str2;
        this.f78748c = str3;
        this.f78749d = str4;
        this.f78750e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd7)) {
            return false;
        }
        gd7 gd7Var = (gd7) obj;
        return wj50.m88271j(this.f78746a, gd7Var.f78746a) && wj50.m88271j(this.f78747b, gd7Var.f78747b) && wj50.m88271j(this.f78748c, gd7Var.f78748c) && wj50.m88271j(this.f78749d, gd7Var.f78749d) && wj50.m88271j(this.f78750e, gd7Var.f78750e);
    }

    public final int hashCode() {
        int iHashCode = this.f78746a.hashCode() * 31;
        String str = this.f78747b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f78748c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f78749d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.f78750e;
        return iHashCode4 + (f != null ? f.hashCode() : 0);
    }
}
