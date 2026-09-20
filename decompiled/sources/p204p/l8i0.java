package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l8i0 {

    /* JADX INFO: renamed from: a */
    public final String f130875a;

    /* JADX INFO: renamed from: b */
    public final String f130876b;

    public l8i0(String str, String str2) {
        this.f130875a = str;
        this.f130876b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8i0)) {
            return false;
        }
        l8i0 l8i0Var = (l8i0) obj;
        return wj50.m88271j(this.f130875a, l8i0Var.f130875a) && wj50.m88271j(this.f130876b, l8i0Var.f130876b);
    }

    public final int hashCode() {
        return this.f130876b.hashCode() + (this.f130875a.hashCode() * 31);
    }
}
