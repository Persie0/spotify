package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ccc0 {

    /* JADX INFO: renamed from: a */
    public final String f36378a;

    /* JADX INFO: renamed from: b */
    public final String f36379b;

    /* JADX INFO: renamed from: c */
    public final int f36380c;

    public ccc0(String str, String str2, int i) {
        this.f36378a = str;
        this.f36379b = str2;
        this.f36380c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccc0)) {
            return false;
        }
        ccc0 ccc0Var = (ccc0) obj;
        return wj50.m88271j(this.f36378a, ccc0Var.f36378a) && wj50.m88271j(this.f36379b, ccc0Var.f36379b) && this.f36380c == ccc0Var.f36380c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36380c) + s571.m77243b(this.f36378a.hashCode() * 31, 31, this.f36379b);
    }
}
