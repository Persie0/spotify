package p204p;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class gk2 {
    public static final fk2 Companion = new fk2();

    /* JADX INFO: renamed from: a */
    public final String f80681a;

    /* JADX INFO: renamed from: b */
    public final String f80682b;

    /* JADX INFO: renamed from: c */
    public final String f80683c;

    public /* synthetic */ gk2(String str, String str2, int i, String str3) {
        if ((i & 1) == 0) {
            this.f80681a = "";
        } else {
            this.f80681a = str;
        }
        if ((i & 2) == 0) {
            this.f80682b = "";
        } else {
            this.f80682b = str2;
        }
        if ((i & 4) == 0) {
            this.f80683c = "";
        } else {
            this.f80683c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk2)) {
            return false;
        }
        gk2 gk2Var = (gk2) obj;
        return wj50.m88271j(this.f80681a, gk2Var.f80681a) && wj50.m88271j(this.f80682b, gk2Var.f80682b) && wj50.m88271j(this.f80683c, gk2Var.f80683c);
    }

    public final int hashCode() {
        return this.f80683c.hashCode() + s571.m77243b(this.f80681a.hashCode() * 31, 31, this.f80682b);
    }
}
