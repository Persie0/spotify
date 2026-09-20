package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ycv0 implements bdv0 {

    /* JADX INFO: renamed from: a */
    public final String f271575a;

    /* JADX INFO: renamed from: b */
    public final String f271576b;

    public ycv0(String str, String str2) {
        this.f271575a = str;
        this.f271576b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycv0)) {
            return false;
        }
        ycv0 ycv0Var = (ycv0) obj;
        return wj50.m88271j(this.f271575a, ycv0Var.f271575a) && wj50.m88271j(this.f271576b, ycv0Var.f271576b);
    }

    public final int hashCode() {
        return this.f271576b.hashCode() + (this.f271575a.hashCode() * 31);
    }
}
