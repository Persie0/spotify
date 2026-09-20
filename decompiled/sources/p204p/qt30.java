package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qt30 {

    /* JADX INFO: renamed from: a */
    public final String f192271a;

    /* JADX INFO: renamed from: b */
    public final String f192272b;

    public qt30(String str, String str2) {
        this.f192271a = str;
        this.f192272b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt30)) {
            return false;
        }
        qt30 qt30Var = (qt30) obj;
        return wj50.m88271j(this.f192271a, qt30Var.f192271a) && wj50.m88271j(this.f192272b, qt30Var.f192272b);
    }

    public final int hashCode() {
        return this.f192272b.hashCode() + (this.f192271a.hashCode() * 31);
    }
}
