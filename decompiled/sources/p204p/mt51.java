package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mt51 implements nt51 {

    /* JADX INFO: renamed from: a */
    public final int f146952a;

    /* JADX INFO: renamed from: b */
    public final boolean f146953b;

    public mt51(int i, boolean z) {
        this.f146952a = i;
        this.f146953b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt51)) {
            return false;
        }
        mt51 mt51Var = (mt51) obj;
        return this.f146952a == mt51Var.f146952a && this.f146953b == mt51Var.f146953b;
    }

    public final int hashCode() {
        int i = this.f146952a;
        return Boolean.hashCode(this.f146953b) + ((i == 0 ? 0 : edb.m38547C(i)) * 31);
    }
}
