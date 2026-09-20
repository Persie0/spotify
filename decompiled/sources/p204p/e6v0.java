package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e6v0 extends h6v0 {

    /* JADX INFO: renamed from: a */
    public final String f56768a;

    /* JADX INFO: renamed from: b */
    public final int f56769b;

    public e6v0(String str, int i) {
        this.f56768a = str;
        this.f56769b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6v0)) {
            return false;
        }
        e6v0 e6v0Var = (e6v0) obj;
        return wj50.m88271j(this.f56768a, e6v0Var.f56768a) && this.f56769b == e6v0Var.f56769b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56769b) + (this.f56768a.hashCode() * 31);
    }
}
