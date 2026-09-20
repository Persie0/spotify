package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e9n0 extends j9n0 {

    /* JADX INFO: renamed from: a */
    public final String f57488a;

    /* JADX INFO: renamed from: b */
    public final int f57489b;

    public e9n0(String str, int i) {
        this.f57488a = str;
        this.f57489b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9n0)) {
            return false;
        }
        e9n0 e9n0Var = (e9n0) obj;
        return wj50.m88271j(this.f57488a, e9n0Var.f57488a) && this.f57489b == e9n0Var.f57489b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f57489b) + (this.f57488a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LocalPasswordValidationReceived(validation=");
        int i = this.f57489b;
        if (i == 1) {
            str = "VALID";
        } else if (i == 2) {
            str = "TOO_SHORT";
        } else if (i == 3) {
            str = "TOO_WEAK";
        } else if (i != 4) {
            str = i != 5 ? "null" : "NOT_VALIDATED";
        } else {
            str = "NOT_SET";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
