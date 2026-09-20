package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gea0 {

    /* JADX INFO: renamed from: a */
    public final String f79066a;

    /* JADX INFO: renamed from: b */
    public final String f79067b;

    /* JADX INFO: renamed from: c */
    public final String f79068c;

    public gea0(String str, String str2, String str3) {
        this.f79066a = str;
        this.f79067b = str2;
        this.f79068c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gea0)) {
            return false;
        }
        gea0 gea0Var = (gea0) obj;
        return wj50.m88271j(this.f79066a, gea0Var.f79066a) && wj50.m88271j(this.f79067b, gea0Var.f79067b) && wj50.m88271j(this.f79068c, gea0Var.f79068c);
    }

    public final int hashCode() {
        return this.f79068c.hashCode() + s571.m77243b(this.f79066a.hashCode() * 31, 31, this.f79067b);
    }
}
