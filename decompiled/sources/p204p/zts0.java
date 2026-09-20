package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zts0 {

    /* JADX INFO: renamed from: a */
    public final String f286253a;

    /* JADX INFO: renamed from: b */
    public final String f286254b;

    /* JADX INFO: renamed from: c */
    public final String f286255c;

    /* JADX INFO: renamed from: d */
    public final aus0 f286256d;

    public zts0(String str, String str2, String str3, aus0 aus0Var) {
        this.f286253a = str;
        this.f286254b = str2;
        this.f286255c = str3;
        this.f286256d = aus0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zts0)) {
            return false;
        }
        zts0 zts0Var = (zts0) obj;
        return wj50.m88271j(this.f286253a, zts0Var.f286253a) && wj50.m88271j(this.f286254b, zts0Var.f286254b) && wj50.m88271j(this.f286255c, zts0Var.f286255c) && this.f286256d == zts0Var.f286256d;
    }

    public final int hashCode() {
        return this.f286256d.hashCode() + s571.m77243b(s571.m77243b(this.f286253a.hashCode() * 31, 31, this.f286254b), 31, this.f286255c);
    }
}
