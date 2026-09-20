package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z9a1 {

    /* JADX INFO: renamed from: a */
    public final String f280731a;

    /* JADX INFO: renamed from: b */
    public final String f280732b;

    /* JADX INFO: renamed from: c */
    public final String f280733c;

    public z9a1(String str, String str2, String str3) {
        this.f280731a = str;
        this.f280732b = str2;
        this.f280733c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9a1)) {
            return false;
        }
        z9a1 z9a1Var = (z9a1) obj;
        return wj50.m88271j(this.f280731a, z9a1Var.f280731a) && wj50.m88271j(this.f280732b, z9a1Var.f280732b) && wj50.m88271j(this.f280733c, z9a1Var.f280733c);
    }

    public final int hashCode() {
        return this.f280733c.hashCode() + s571.m77243b(this.f280731a.hashCode() * 31, 31, this.f280732b);
    }
}
