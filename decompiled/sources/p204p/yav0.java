package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yav0 implements abv0 {

    /* JADX INFO: renamed from: a */
    public final String f271019a;

    /* JADX INFO: renamed from: b */
    public final int f271020b;

    public yav0(String str, int i) {
        this.f271019a = str;
        this.f271020b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yav0)) {
            return false;
        }
        yav0 yav0Var = (yav0) obj;
        return this.f271019a.equals(yav0Var.f271019a) && this.f271020b == yav0Var.f271020b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f271020b) + (this.f271019a.hashCode() * 31);
    }
}
