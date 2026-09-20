package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fb40 {

    /* JADX INFO: renamed from: a */
    public final blt0 f67707a;

    /* JADX INFO: renamed from: b */
    public final Long f67708b;

    /* JADX INFO: renamed from: c */
    public final Long f67709c;

    /* JADX INFO: renamed from: d */
    public final boolean f67710d;

    /* JADX INFO: renamed from: e */
    public final boolean f67711e;

    /* JADX INFO: renamed from: f */
    public final eh00 f67712f;

    public fb40(blt0 blt0Var, Long l, Long l2, boolean z, boolean z2, eh00 eh00Var) {
        this.f67707a = blt0Var;
        this.f67708b = l;
        this.f67709c = l2;
        this.f67710d = z;
        this.f67711e = z2;
        this.f67712f = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb40)) {
            return false;
        }
        fb40 fb40Var = (fb40) obj;
        return wj50.m88271j(this.f67707a, fb40Var.f67707a) && wj50.m88271j(this.f67708b, fb40Var.f67708b) && wj50.m88271j(this.f67709c, fb40Var.f67709c) && this.f67710d == fb40Var.f67710d && this.f67711e == fb40Var.f67711e && wj50.m88271j(this.f67712f, fb40Var.f67712f);
    }

    public final int hashCode() {
        int iHashCode = this.f67707a.hashCode() * 31;
        Long l = this.f67708b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f67709c;
        return this.f67712f.hashCode() + s571.m77245d(s571.m77245d((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.f67710d), 31, this.f67711e);
    }
}
