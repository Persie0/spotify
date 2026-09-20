package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s930 implements t930 {

    /* JADX INFO: renamed from: a */
    public final int f206832a;

    /* JADX INFO: renamed from: b */
    public final String f206833b;

    public s930(int i, String str) {
        this.f206832a = i;
        this.f206833b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s930)) {
            return false;
        }
        s930 s930Var = (s930) obj;
        return this.f206832a == s930Var.f206832a && wj50.m88271j(this.f206833b, s930Var.f206833b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f206832a) * 31;
        String str = this.f206833b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
