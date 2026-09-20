package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dh70 implements hh70 {

    /* JADX INFO: renamed from: a */
    public final String f49004a;

    /* JADX INFO: renamed from: b */
    public final String f49005b;

    public dh70(String str, String str2) {
        this.f49004a = str;
        this.f49005b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh70)) {
            return false;
        }
        dh70 dh70Var = (dh70) obj;
        return wj50.m88271j(this.f49004a, dh70Var.f49004a) && wj50.m88271j(this.f49005b, dh70Var.f49005b);
    }

    public final int hashCode() {
        return this.f49005b.hashCode() + (this.f49004a.hashCode() * 31);
    }
}
