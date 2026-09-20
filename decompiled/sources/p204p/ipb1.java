package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ipb1 extends jpb1 {

    /* JADX INFO: renamed from: a */
    public final String f104466a;

    /* JADX INFO: renamed from: b */
    public final String f104467b;

    public ipb1(String str, String str2) {
        this.f104466a = str;
        this.f104467b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipb1)) {
            return false;
        }
        ipb1 ipb1Var = (ipb1) obj;
        return wj50.m88271j(this.f104466a, ipb1Var.f104466a) && wj50.m88271j(this.f104467b, ipb1Var.f104467b);
    }

    public final int hashCode() {
        return this.f104467b.hashCode() + (this.f104466a.hashCode() * 31);
    }
}
