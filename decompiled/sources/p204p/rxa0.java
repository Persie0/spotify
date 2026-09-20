package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rxa0 {

    /* JADX INFO: renamed from: a */
    public final String f203569a;

    /* JADX INFO: renamed from: b */
    public final eh00 f203570b;

    public rxa0(String str, eh00 eh00Var) {
        this.f203569a = str;
        this.f203570b = eh00Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m76610a() {
        return this.f203569a;
    }

    /* JADX INFO: renamed from: b */
    public final eh00 m76611b() {
        return this.f203570b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxa0)) {
            return false;
        }
        rxa0 rxa0Var = (rxa0) obj;
        return wj50.m88271j(this.f203569a, rxa0Var.f203569a) && wj50.m88271j(this.f203570b, rxa0Var.f203570b);
    }

    public final int hashCode() {
        return this.f203570b.hashCode() + (this.f203569a.hashCode() * 31);
    }
}
