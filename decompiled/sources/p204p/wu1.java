package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wu1 {

    /* JADX INFO: renamed from: a */
    public final String f255050a;

    /* JADX INFO: renamed from: b */
    public final String f255051b;

    public wu1(String str, String str2) {
        this.f255050a = str;
        this.f255051b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu1)) {
            return false;
        }
        wu1 wu1Var = (wu1) obj;
        return wj50.m88271j(this.f255050a, wu1Var.f255050a) && wj50.m88271j(this.f255051b, wu1Var.f255051b);
    }

    public final int hashCode() {
        return this.f255051b.hashCode() + (this.f255050a.hashCode() * 31);
    }
}
