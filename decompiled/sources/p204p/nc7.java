package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nc7 {

    /* JADX INFO: renamed from: a */
    public final boolean f152449a;

    /* JADX INFO: renamed from: b */
    public final uhw0 f152450b;

    /* JADX INFO: renamed from: c */
    public final String f152451c;

    public nc7(boolean z, uhw0 uhw0Var, String str) {
        this.f152449a = z;
        this.f152450b = uhw0Var;
        this.f152451c = str;
    }

    /* JADX INFO: renamed from: a */
    public static nc7 m64123a(nc7 nc7Var, String str) {
        boolean z = nc7Var.f152449a;
        uhw0 uhw0Var = nc7Var.f152450b;
        nc7Var.getClass();
        return new nc7(z, uhw0Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc7)) {
            return false;
        }
        nc7 nc7Var = (nc7) obj;
        return this.f152449a == nc7Var.f152449a && wj50.m88271j(this.f152450b, nc7Var.f152450b) && wj50.m88271j(this.f152451c, nc7Var.f152451c);
    }

    public final int hashCode() {
        int iHashCode = (this.f152450b.hashCode() + (Boolean.hashCode(this.f152449a) * 31)) * 31;
        String str = this.f152451c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ nc7(uhw0 uhw0Var, int i) {
        this(true, (i & 2) != 0 ? thw0.f220511a : uhw0Var, null);
    }
}
