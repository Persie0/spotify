package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sd1 implements td1 {

    /* JADX INFO: renamed from: a */
    public final String f207849a;

    /* JADX INFO: renamed from: b */
    public final String f207850b;

    /* JADX INFO: renamed from: c */
    public final String f207851c;

    public sd1(String str, String str2, String str3) {
        this.f207849a = str;
        this.f207850b = str2;
        this.f207851c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd1)) {
            return false;
        }
        sd1 sd1Var = (sd1) obj;
        return wj50.m88271j(this.f207849a, sd1Var.f207849a) && wj50.m88271j(this.f207850b, sd1Var.f207850b) && wj50.m88271j(this.f207851c, sd1Var.f207851c);
    }

    public final int hashCode() {
        return this.f207851c.hashCode() + s571.m77243b(this.f207849a.hashCode() * 31, 31, this.f207850b);
    }
}
