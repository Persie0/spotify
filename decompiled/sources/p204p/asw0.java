package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class asw0 {

    /* JADX INFO: renamed from: a */
    public final String f19522a;

    /* JADX INFO: renamed from: b */
    public final String f19523b;

    public asw0(String str, String str2) {
        this.f19522a = str;
        this.f19523b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asw0)) {
            return false;
        }
        asw0 asw0Var = (asw0) obj;
        return wj50.m88271j(this.f19522a, asw0Var.f19522a) && wj50.m88271j(this.f19523b, asw0Var.f19523b);
    }

    public final int hashCode() {
        return this.f19523b.hashCode() + (this.f19522a.hashCode() * 31);
    }
}
