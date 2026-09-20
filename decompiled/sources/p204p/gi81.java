package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class gi81 extends ii81 {

    /* JADX INFO: renamed from: a */
    public final String f80093a;

    /* JADX INFO: renamed from: b */
    public final int f80094b;

    /* JADX INFO: renamed from: c */
    public final String f80095c;

    public gi81(String str, int i, String str2) {
        this.f80093a = str;
        this.f80094b = i;
        this.f80095c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi81)) {
            return false;
        }
        gi81 gi81Var = (gi81) obj;
        return wj50.m88271j(this.f80093a, gi81Var.f80093a) && this.f80094b == gi81Var.f80094b && wj50.m88271j(this.f80095c, gi81Var.f80095c);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f80094b, this.f80093a.hashCode() * 31, 31);
        String str = this.f80095c;
        return iM62800g + (str == null ? 0 : str.hashCode());
    }
}
