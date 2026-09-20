package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pgi0 {

    /* JADX INFO: renamed from: a */
    public final String f177340a;

    /* JADX INFO: renamed from: b */
    public final String f177341b;

    public pgi0(String str, String str2) {
        this.f177340a = str;
        this.f177341b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgi0)) {
            return false;
        }
        pgi0 pgi0Var = (pgi0) obj;
        return wj50.m88271j(this.f177340a, pgi0Var.f177340a) && wj50.m88271j(this.f177341b, pgi0Var.f177341b);
    }

    public final int hashCode() {
        return this.f177341b.hashCode() + (this.f177340a.hashCode() * 31);
    }
}
