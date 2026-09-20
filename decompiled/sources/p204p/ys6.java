package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ys6 {

    /* JADX INFO: renamed from: a */
    public final String f275697a;

    /* JADX INFO: renamed from: b */
    public final String f275698b;

    public ys6(String str, String str2) {
        this.f275697a = str;
        this.f275698b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys6)) {
            return false;
        }
        ys6 ys6Var = (ys6) obj;
        return wj50.m88271j(this.f275697a, ys6Var.f275697a) && wj50.m88271j(this.f275698b, ys6Var.f275698b);
    }

    public final int hashCode() {
        return this.f275698b.hashCode() + (this.f275697a.hashCode() * 31);
    }
}
