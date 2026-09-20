package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eq10 {

    /* JADX INFO: renamed from: a */
    public final String f61759a;

    /* JADX INFO: renamed from: b */
    public final String f61760b;

    public eq10(String str, String str2) {
        this.f61759a = str;
        this.f61760b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq10)) {
            return false;
        }
        eq10 eq10Var = (eq10) obj;
        return wj50.m88271j(this.f61759a, eq10Var.f61759a) && wj50.m88271j(this.f61760b, eq10Var.f61760b);
    }

    public final int hashCode() {
        return this.f61760b.hashCode() + (this.f61759a.hashCode() * 31);
    }
}
