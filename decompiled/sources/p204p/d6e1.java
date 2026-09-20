package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d6e1 implements l6e1 {

    /* JADX INFO: renamed from: a */
    public final String f45684a;

    /* JADX INFO: renamed from: b */
    public final String f45685b;

    public d6e1(String str, String str2) {
        this.f45684a = str;
        this.f45685b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6e1)) {
            return false;
        }
        d6e1 d6e1Var = (d6e1) obj;
        return wj50.m88271j(this.f45684a, d6e1Var.f45684a) && wj50.m88271j(this.f45685b, d6e1Var.f45685b);
    }

    public final int hashCode() {
        return this.f45685b.hashCode() + (this.f45684a.hashCode() * 31);
    }
}
