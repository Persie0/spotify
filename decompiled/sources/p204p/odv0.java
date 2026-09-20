package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class odv0 implements udv0 {

    /* JADX INFO: renamed from: a */
    public final String f164255a;

    /* JADX INFO: renamed from: b */
    public final String f164256b;

    /* JADX INFO: renamed from: c */
    public final String f164257c;

    public odv0(String str, String str2, String str3) {
        this.f164255a = str;
        this.f164256b = str2;
        this.f164257c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odv0)) {
            return false;
        }
        odv0 odv0Var = (odv0) obj;
        return wj50.m88271j(this.f164255a, odv0Var.f164255a) && wj50.m88271j(this.f164256b, odv0Var.f164256b) && wj50.m88271j(this.f164257c, odv0Var.f164257c);
    }

    public final int hashCode() {
        return this.f164257c.hashCode() + s571.m77243b(this.f164255a.hashCode() * 31, 31, this.f164256b);
    }
}
