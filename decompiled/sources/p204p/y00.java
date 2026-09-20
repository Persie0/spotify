package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class y00 {

    /* JADX INFO: renamed from: a */
    public final String f267829a;

    /* JADX INFO: renamed from: b */
    public final String f267830b;

    /* JADX INFO: renamed from: c */
    public final int f267831c;

    public y00(String str, String str2, int i) {
        this.f267829a = str;
        this.f267830b = str2;
        this.f267831c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00)) {
            return false;
        }
        y00 y00Var = (y00) obj;
        return this.f267829a.equals(y00Var.f267829a) && this.f267830b.equals(y00Var.f267830b) && this.f267831c == y00Var.f267831c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f267831c) + s571.m77243b(this.f267829a.hashCode() * 31, 31, this.f267830b);
    }
}
