package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zw5 {

    /* JADX INFO: renamed from: a */
    public final String f286919a;

    /* JADX INFO: renamed from: b */
    public final String f286920b;

    /* JADX INFO: renamed from: c */
    public final String f286921c;

    public zw5(String str, String str2, String str3) {
        this.f286919a = str;
        this.f286920b = str2;
        this.f286921c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw5)) {
            return false;
        }
        zw5 zw5Var = (zw5) obj;
        return wj50.m88271j(this.f286919a, zw5Var.f286919a) && wj50.m88271j(this.f286920b, zw5Var.f286920b) && wj50.m88271j(this.f286921c, zw5Var.f286921c);
    }

    public final int hashCode() {
        return this.f286921c.hashCode() + s571.m77243b(this.f286919a.hashCode() * 31, 31, this.f286920b);
    }
}
