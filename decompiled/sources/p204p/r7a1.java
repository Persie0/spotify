package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r7a1 implements t7a1 {

    /* JADX INFO: renamed from: a */
    public final String f196476a;

    /* JADX INFO: renamed from: b */
    public final String f196477b;

    public r7a1(String str, String str2) {
        this.f196476a = str;
        this.f196477b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7a1)) {
            return false;
        }
        r7a1 r7a1Var = (r7a1) obj;
        return wj50.m88271j(this.f196476a, r7a1Var.f196476a) && wj50.m88271j(this.f196477b, r7a1Var.f196477b);
    }

    public final int hashCode() {
        return this.f196477b.hashCode() + (this.f196476a.hashCode() * 31);
    }
}
