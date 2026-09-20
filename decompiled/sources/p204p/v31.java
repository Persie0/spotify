package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class v31 extends lug1 {

    /* JADX INFO: renamed from: b */
    public final String f236748b;

    /* JADX INFO: renamed from: c */
    public final String f236749c;

    /* JADX INFO: renamed from: d */
    public final String f236750d;

    public v31(String str, String str2, String str3) {
        this.f236748b = str;
        this.f236749c = str2;
        this.f236750d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v31)) {
            return false;
        }
        v31 v31Var = (v31) obj;
        return wj50.m88271j(this.f236748b, v31Var.f236748b) && wj50.m88271j(this.f236749c, v31Var.f236749c) && wj50.m88271j(this.f236750d, v31Var.f236750d);
    }

    public final int hashCode() {
        return this.f236750d.hashCode() + s571.m77243b(this.f236748b.hashCode() * 31, 31, this.f236749c);
    }
}
