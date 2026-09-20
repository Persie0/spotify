package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xe21 {

    /* JADX INFO: renamed from: a */
    public final EnumC2166nj f260619a;

    /* JADX INFO: renamed from: b */
    public final String f260620b;

    public xe21(EnumC2166nj enumC2166nj, String str) {
        this.f260619a = enumC2166nj;
        this.f260620b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe21)) {
            return false;
        }
        xe21 xe21Var = (xe21) obj;
        return this.f260619a == xe21Var.f260619a && wj50.m88271j(this.f260620b, xe21Var.f260620b);
    }

    public final int hashCode() {
        int iHashCode = this.f260619a.hashCode() * 31;
        String str = this.f260620b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return dq60.m36615o("SingleIdentifier(source=", this.f260619a.name(), ", accessoryId=", this.f260620b, ")");
    }
}
