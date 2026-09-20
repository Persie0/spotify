package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class u7e0 implements moa {

    /* JADX INFO: renamed from: a */
    public final String f227590a;

    /* JADX INFO: renamed from: b */
    public final rq91 f227591b;

    /* JADX INFO: renamed from: c */
    public final ezs0 f227592c;

    public u7e0(String str, rq91 rq91Var, ezs0 ezs0Var) {
        this.f227590a = str;
        this.f227591b = rq91Var;
        this.f227592c = ezs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7e0)) {
            return false;
        }
        u7e0 u7e0Var = (u7e0) obj;
        return wj50.m88271j(this.f227590a, u7e0Var.f227590a) && this.f227591b.equals(u7e0Var.f227591b) && this.f227592c.equals(u7e0Var.f227592c);
    }

    @Override // p204p.moa
    public final String getId() {
        return this.f227590a;
    }

    public final int hashCode() {
        return this.f227592c.hashCode() + mt60.m62800g(this.f227591b.f201781b, this.f227590a.hashCode() * 31, 31);
    }
}
