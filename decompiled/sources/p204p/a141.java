package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a141 {

    /* JADX INFO: renamed from: a */
    public final String f11327a;

    /* JADX INFO: renamed from: b */
    public final int f11328b;

    /* JADX INFO: renamed from: c */
    public final boolean f11329c;

    /* JADX INFO: renamed from: d */
    public final boolean f11330d;

    public /* synthetic */ a141() {
        this("", 100, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a141)) {
            return false;
        }
        a141 a141Var = (a141) obj;
        return wj50.m88271j(this.f11327a, a141Var.f11327a) && this.f11328b == a141Var.f11328b && this.f11329c == a141Var.f11329c && this.f11330d == a141Var.f11330d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11330d) + s571.m77245d(mt60.m62800g(this.f11328b, this.f11327a.hashCode() * 31, 31), 31, this.f11329c);
    }

    public a141(String str, int i, boolean z, boolean z2) {
        this.f11327a = str;
        this.f11328b = i;
        this.f11329c = z;
        this.f11330d = z2;
    }
}
