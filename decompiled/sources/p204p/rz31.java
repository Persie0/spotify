package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rz31 implements b041 {

    /* JADX INFO: renamed from: a */
    public final String f204051a;

    /* JADX INFO: renamed from: b */
    public final String f204052b;

    /* JADX INFO: renamed from: c */
    public final String f204053c;

    public rz31(String str, String str2, String str3) {
        this.f204051a = str;
        this.f204052b = str2;
        this.f204053c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz31)) {
            return false;
        }
        rz31 rz31Var = (rz31) obj;
        return wj50.m88271j(this.f204051a, rz31Var.f204051a) && wj50.m88271j(this.f204052b, rz31Var.f204052b) && wj50.m88271j(this.f204053c, rz31Var.f204053c);
    }

    public final int hashCode() {
        return this.f204053c.hashCode() + s571.m77243b(this.f204051a.hashCode() * 31, 31, this.f204052b);
    }
}
