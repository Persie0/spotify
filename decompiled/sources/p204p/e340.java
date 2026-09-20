package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class e340 {

    /* JADX INFO: renamed from: a */
    public final String f55615a;

    /* JADX INFO: renamed from: b */
    public final String f55616b;

    public e340(String str, String str2) {
        this.f55615a = str;
        this.f55616b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e340)) {
            return false;
        }
        e340 e340Var = (e340) obj;
        return wj50.m88271j(this.f55615a, e340Var.f55615a) && wj50.m88271j(this.f55616b, e340Var.f55616b);
    }

    public final int hashCode() {
        return this.f55616b.hashCode() + (this.f55615a.hashCode() * 31);
    }
}
