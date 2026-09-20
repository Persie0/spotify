package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class sb71 {

    /* JADX INFO: renamed from: a */
    public final ew31 f207373a;

    /* JADX INFO: renamed from: b */
    public final ew31 f207374b;

    /* JADX INFO: renamed from: c */
    public final ew31 f207375c;

    /* JADX INFO: renamed from: d */
    public final ew31 f207376d;

    public sb71(ew31 ew31Var, ew31 ew31Var2, ew31 ew31Var3, ew31 ew31Var4) {
        this.f207373a = ew31Var;
        this.f207374b = ew31Var2;
        this.f207375c = ew31Var3;
        this.f207376d = ew31Var4;
    }

    /* JADX INFO: renamed from: a */
    public final ew31 m77714a() {
        return this.f207374b;
    }

    /* JADX INFO: renamed from: b */
    public final ew31 m77715b() {
        return this.f207375c;
    }

    /* JADX INFO: renamed from: c */
    public final ew31 m77716c() {
        return this.f207376d;
    }

    /* JADX INFO: renamed from: d */
    public final ew31 m77717d() {
        return this.f207373a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof sb71)) {
            return false;
        }
        sb71 sb71Var = (sb71) obj;
        return wj50.m88271j(this.f207373a, sb71Var.f207373a) && wj50.m88271j(this.f207374b, sb71Var.f207374b) && wj50.m88271j(this.f207375c, sb71Var.f207375c) && wj50.m88271j(this.f207376d, sb71Var.f207376d);
    }

    public final int hashCode() {
        ew31 ew31Var = this.f207373a;
        int iHashCode = (ew31Var != null ? ew31Var.hashCode() : 0) * 31;
        ew31 ew31Var2 = this.f207374b;
        int iHashCode2 = (iHashCode + (ew31Var2 != null ? ew31Var2.hashCode() : 0)) * 31;
        ew31 ew31Var3 = this.f207375c;
        int iHashCode3 = (iHashCode2 + (ew31Var3 != null ? ew31Var3.hashCode() : 0)) * 31;
        ew31 ew31Var4 = this.f207376d;
        return iHashCode3 + (ew31Var4 != null ? ew31Var4.hashCode() : 0);
    }

    public /* synthetic */ sb71(ew31 ew31Var, ew31 ew31Var2, int i) {
        this(ew31Var, null, null, (i & 8) != 0 ? null : ew31Var2);
    }
}
