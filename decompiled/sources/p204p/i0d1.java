package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class i0d1 {

    /* JADX INFO: renamed from: a */
    public final String f97210a;

    /* JADX INFO: renamed from: b */
    public final String f97211b;

    /* JADX INFO: renamed from: c */
    public final String f97212c;

    /* JADX INFO: renamed from: d */
    public final String f97213d;

    public i0d1(String str, String str2, String str3, String str4) {
        this.f97210a = str;
        this.f97211b = str2;
        this.f97212c = str3;
        this.f97213d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0d1)) {
            return false;
        }
        i0d1 i0d1Var = (i0d1) obj;
        return wj50.m88271j(this.f97210a, i0d1Var.f97210a) && wj50.m88271j(this.f97211b, i0d1Var.f97211b) && wj50.m88271j(this.f97212c, i0d1Var.f97212c) && wj50.m88271j(this.f97213d, i0d1Var.f97213d);
    }

    public final int hashCode() {
        return this.f97213d.hashCode() + s571.m77243b(s571.m77243b(this.f97210a.hashCode() * 31, 31, this.f97211b), 31, this.f97212c);
    }
}
