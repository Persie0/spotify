package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zg9 {

    /* JADX INFO: renamed from: a */
    public final String f282551a;

    /* JADX INFO: renamed from: b */
    public final String f282552b;

    public zg9(String str, String str2) {
        this.f282551a = str;
        this.f282552b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg9)) {
            return false;
        }
        zg9 zg9Var = (zg9) obj;
        return wj50.m88271j(this.f282551a, zg9Var.f282551a) && wj50.m88271j(this.f282552b, zg9Var.f282552b);
    }

    public final int hashCode() {
        return this.f282552b.hashCode() + (this.f282551a.hashCode() * 31);
    }
}
