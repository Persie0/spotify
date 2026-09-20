package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ffd1 {

    /* JADX INFO: renamed from: a */
    public final String f68987a;

    /* JADX INFO: renamed from: b */
    public final String f68988b;

    /* JADX INFO: renamed from: c */
    public final String f68989c;

    public ffd1(String str, String str2, String str3) {
        this.f68987a = str;
        this.f68988b = str2;
        this.f68989c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffd1)) {
            return false;
        }
        ffd1 ffd1Var = (ffd1) obj;
        return wj50.m88271j(this.f68987a, ffd1Var.f68987a) && wj50.m88271j(this.f68988b, ffd1Var.f68988b) && wj50.m88271j(this.f68989c, ffd1Var.f68989c);
    }

    public final int hashCode() {
        return this.f68989c.hashCode() + s571.m77243b(this.f68987a.hashCode() * 31, 31, this.f68988b);
    }
}
