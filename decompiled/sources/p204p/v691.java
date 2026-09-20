package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class v691 implements u691 {

    /* JADX INFO: renamed from: a */
    public final Object f237791a;

    /* JADX INFO: renamed from: b */
    public final Object f237792b;

    public v691(Object obj, Object obj2) {
        this.f237791a = obj;
        this.f237792b = obj2;
    }

    @Override // p204p.u691
    /* JADX INFO: renamed from: a */
    public final Object mo60167a() {
        return this.f237792b;
    }

    @Override // p204p.u691
    /* JADX INFO: renamed from: c */
    public final Object mo60168c() {
        return this.f237791a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u691)) {
            return false;
        }
        u691 u691Var = (u691) obj;
        return wj50.m88271j(this.f237791a, u691Var.mo60168c()) && wj50.m88271j(this.f237792b, u691Var.mo60167a());
    }

    public final int hashCode() {
        Object obj = this.f237791a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f237792b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
