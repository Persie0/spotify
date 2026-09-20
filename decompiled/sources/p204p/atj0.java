package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class atj0 {

    /* JADX INFO: renamed from: a */
    public final String f19700a;

    /* JADX INFO: renamed from: b */
    public final String f19701b;

    /* JADX INFO: renamed from: c */
    public final String f19702c;

    public atj0(String str, String str2, String str3) {
        this.f19700a = str;
        this.f19701b = str2;
        this.f19702c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atj0)) {
            return false;
        }
        atj0 atj0Var = (atj0) obj;
        return wj50.m88271j(this.f19700a, atj0Var.f19700a) && wj50.m88271j(this.f19701b, atj0Var.f19701b) && wj50.m88271j(this.f19702c, atj0Var.f19702c);
    }

    public final int hashCode() {
        return this.f19702c.hashCode() + s571.m77243b(this.f19700a.hashCode() * 31, 31, this.f19701b);
    }
}
