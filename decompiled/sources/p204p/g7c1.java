package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g7c1 {

    /* JADX INFO: renamed from: a */
    public final String f77242a;

    /* JADX INFO: renamed from: b */
    public final String f77243b;

    public g7c1(String str, String str2) {
        this.f77242a = str;
        this.f77243b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7c1)) {
            return false;
        }
        g7c1 g7c1Var = (g7c1) obj;
        return wj50.m88271j(this.f77242a, g7c1Var.f77242a) && wj50.m88271j(this.f77243b, g7c1Var.f77243b);
    }

    public final int hashCode() {
        return this.f77243b.hashCode() + (this.f77242a.hashCode() * 31);
    }
}
