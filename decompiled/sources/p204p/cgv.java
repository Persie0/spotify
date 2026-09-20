package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class cgv {

    /* JADX INFO: renamed from: a */
    public final iad1 f37812a;

    /* JADX INFO: renamed from: b */
    public final String f37813b;

    public cgv(String str, iad1 iad1Var) {
        this.f37812a = iad1Var;
        this.f37813b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgv)) {
            return false;
        }
        cgv cgvVar = (cgv) obj;
        return wj50.m88271j(this.f37812a, cgvVar.f37812a) && wj50.m88271j(this.f37813b, cgvVar.f37813b);
    }

    public final int hashCode() {
        return this.f37813b.hashCode() + (this.f37812a.hashCode() * 31);
    }
}
