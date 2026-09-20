package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gjt0 {

    /* JADX INFO: renamed from: a */
    public final wit0 f80559a;

    /* JADX INFO: renamed from: b */
    public final fjt0 f80560b;

    /* JADX INFO: renamed from: c */
    public final Long f80561c;

    /* JADX INFO: renamed from: d */
    public final Long f80562d;

    /* JADX INFO: renamed from: e */
    public final boolean f80563e;

    /* JADX INFO: renamed from: f */
    public final eh00 f80564f;

    public gjt0(wit0 wit0Var, fjt0 fjt0Var, Long l, Long l2, boolean z, eh00 eh00Var) {
        this.f80559a = wit0Var;
        this.f80560b = fjt0Var;
        this.f80561c = l;
        this.f80562d = l2;
        this.f80563e = z;
        this.f80564f = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjt0)) {
            return false;
        }
        gjt0 gjt0Var = (gjt0) obj;
        return wj50.m88271j(this.f80559a, gjt0Var.f80559a) && wj50.m88271j(this.f80560b, gjt0Var.f80560b) && wj50.m88271j(this.f80561c, gjt0Var.f80561c) && wj50.m88271j(this.f80562d, gjt0Var.f80562d) && this.f80563e == gjt0Var.f80563e && wj50.m88271j(this.f80564f, gjt0Var.f80564f);
    }

    public final int hashCode() {
        int iHashCode = (this.f80560b.hashCode() + (this.f80559a.hashCode() * 31)) * 31;
        Long l = this.f80561c;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f80562d;
        return this.f80564f.hashCode() + s571.m77245d((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.f80563e);
    }
}
