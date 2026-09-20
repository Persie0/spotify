package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yei {

    /* JADX INFO: renamed from: a */
    public final String f271998a;

    /* JADX INFO: renamed from: b */
    public final z650 f271999b;

    public yei(String str, z650 z650Var) {
        this.f271998a = str;
        this.f271999b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yei)) {
            return false;
        }
        yei yeiVar = (yei) obj;
        return wj50.m88271j(this.f271998a, yeiVar.f271998a) && wj50.m88271j(this.f271999b, yeiVar.f271999b);
    }

    public final int hashCode() {
        int iHashCode = this.f271998a.hashCode() * 31;
        z650 z650Var = this.f271999b;
        return iHashCode + (z650Var == null ? 0 : z650Var.f279709a.hashCode());
    }
}
