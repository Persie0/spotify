package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x00 {

    /* JADX INFO: renamed from: a */
    public final String f256715a;

    /* JADX INFO: renamed from: b */
    public final String f256716b;

    public x00(String str, String str2) {
        this.f256715a = str;
        this.f256716b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x00)) {
            return false;
        }
        x00 x00Var = (x00) obj;
        return wj50.m88271j(this.f256715a, x00Var.f256715a) && wj50.m88271j(this.f256716b, x00Var.f256716b);
    }

    public final int hashCode() {
        return this.f256716b.hashCode() + (this.f256715a.hashCode() * 31);
    }
}
