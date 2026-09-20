package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class glu0 {

    /* JADX INFO: renamed from: a */
    public final flu0 f81183a;

    /* JADX INFO: renamed from: b */
    public final String f81184b;

    /* JADX INFO: renamed from: c */
    public final boolean f81185c;

    public glu0(flu0 flu0Var, String str, boolean z) {
        this.f81183a = flu0Var;
        this.f81184b = str;
        this.f81185c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glu0)) {
            return false;
        }
        glu0 glu0Var = (glu0) obj;
        return wj50.m88271j(this.f81183a, glu0Var.f81183a) && wj50.m88271j(this.f81184b, glu0Var.f81184b) && this.f81185c == glu0Var.f81185c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f81185c) + s571.m77243b(this.f81183a.hashCode() * 31, 31, this.f81184b);
    }
}
