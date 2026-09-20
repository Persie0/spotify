package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vce0 {

    /* JADX INFO: renamed from: a */
    public final String f240114a;

    /* JADX INFO: renamed from: b */
    public final String f240115b;

    /* JADX INFO: renamed from: c */
    public final int f240116c;

    public vce0(String str, String str2, int i) {
        this.f240114a = str;
        this.f240115b = str2;
        this.f240116c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vce0)) {
            return false;
        }
        vce0 vce0Var = (vce0) obj;
        return wj50.m88271j(this.f240114a, vce0Var.f240114a) && wj50.m88271j(this.f240115b, vce0Var.f240115b) && this.f240116c == vce0Var.f240116c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f240116c) + s571.m77243b(this.f240114a.hashCode() * 31, 31, this.f240115b);
    }
}
