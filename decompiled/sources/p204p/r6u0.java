package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r6u0 {

    /* JADX INFO: renamed from: a */
    public final s6u0 f196358a;

    /* JADX INFO: renamed from: b */
    public final h66 f196359b;

    /* JADX INFO: renamed from: c */
    public final boolean f196360c;

    /* JADX INFO: renamed from: d */
    public final Boolean f196361d;

    /* JADX INFO: renamed from: e */
    public final Boolean f196362e;

    public r6u0(s6u0 s6u0Var, h66 h66Var, boolean z, Boolean bool, Boolean bool2) {
        this.f196358a = s6u0Var;
        this.f196359b = h66Var;
        this.f196360c = z;
        this.f196361d = bool;
        this.f196362e = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6u0)) {
            return false;
        }
        r6u0 r6u0Var = (r6u0) obj;
        return this.f196358a.equals(r6u0Var.f196358a) && this.f196359b.equals(r6u0Var.f196359b) && this.f196360c == r6u0Var.f196360c && wj50.m88271j(this.f196361d, r6u0Var.f196361d) && this.f196362e.equals(r6u0Var.f196362e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f196359b.hashCode() + (Integer.hashCode(this.f196358a.f206205a) * 31)) * 31, 31, this.f196360c);
        Boolean bool = this.f196361d;
        return this.f196362e.hashCode() + ((iM77245d + (bool == null ? 0 : bool.hashCode())) * 31);
    }
}
