package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fi0 implements gi0 {

    /* JADX INFO: renamed from: a */
    public final String f69734a;

    /* JADX INFO: renamed from: b */
    public final String f69735b;

    public fi0(String str, String str2) {
        this.f69734a = str;
        this.f69735b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi0)) {
            return false;
        }
        fi0 fi0Var = (fi0) obj;
        return wj50.m88271j(this.f69734a, fi0Var.f69734a) && wj50.m88271j(this.f69735b, fi0Var.f69735b);
    }

    public final int hashCode() {
        return this.f69735b.hashCode() + (this.f69734a.hashCode() * 31);
    }
}
