package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ehi0 {

    /* JADX INFO: renamed from: a */
    public final String f59599a;

    /* JADX INFO: renamed from: b */
    public final String f59600b;

    public ehi0(String str, String str2) {
        this.f59599a = str;
        this.f59600b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehi0)) {
            return false;
        }
        ehi0 ehi0Var = (ehi0) obj;
        return wj50.m88271j(this.f59599a, ehi0Var.f59599a) && wj50.m88271j(this.f59600b, ehi0Var.f59600b);
    }

    public final int hashCode() {
        return this.f59600b.hashCode() + (this.f59599a.hashCode() * 31);
    }
}
