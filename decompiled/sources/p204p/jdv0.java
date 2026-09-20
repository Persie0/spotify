package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jdv0 implements udv0 {

    /* JADX INFO: renamed from: a */
    public final String f111401a;

    /* JADX INFO: renamed from: b */
    public final String f111402b;

    public jdv0(String str, String str2) {
        this.f111401a = str;
        this.f111402b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdv0)) {
            return false;
        }
        jdv0 jdv0Var = (jdv0) obj;
        return wj50.m88271j(this.f111401a, jdv0Var.f111401a) && wj50.m88271j(this.f111402b, jdv0Var.f111402b);
    }

    public final int hashCode() {
        return this.f111402b.hashCode() + (this.f111401a.hashCode() * 31);
    }
}
