package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bp31 implements dp31 {

    /* JADX INFO: renamed from: a */
    public final String f29302a;

    /* JADX INFO: renamed from: b */
    public final String f29303b;

    public bp31(String str, String str2) {
        this.f29302a = str;
        this.f29303b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp31)) {
            return false;
        }
        bp31 bp31Var = (bp31) obj;
        return wj50.m88271j(this.f29302a, bp31Var.f29302a) && wj50.m88271j(this.f29303b, bp31Var.f29303b);
    }

    public final int hashCode() {
        return this.f29303b.hashCode() + (this.f29302a.hashCode() * 31);
    }
}
