package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zs00 {

    /* JADX INFO: renamed from: a */
    public final String f285802a;

    /* JADX INFO: renamed from: b */
    public final String f285803b;

    public zs00(String str, String str2) {
        this.f285802a = str;
        this.f285803b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs00)) {
            return false;
        }
        zs00 zs00Var = (zs00) obj;
        return wj50.m88271j(this.f285802a, zs00Var.f285802a) && wj50.m88271j(this.f285803b, zs00Var.f285803b);
    }

    public final int hashCode() {
        return this.f285803b.hashCode() + (this.f285802a.hashCode() * 31);
    }
}
