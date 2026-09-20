package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p9z0 {

    /* JADX INFO: renamed from: a */
    public final String f175330a;

    /* JADX INFO: renamed from: b */
    public final String f175331b;

    public p9z0(String str, String str2) {
        this.f175330a = str;
        this.f175331b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9z0)) {
            return false;
        }
        p9z0 p9z0Var = (p9z0) obj;
        return wj50.m88271j(this.f175330a, p9z0Var.f175330a) && wj50.m88271j(this.f175331b, p9z0Var.f175331b);
    }

    public final int hashCode() {
        return edb.m38547C(2) + s571.m77243b(this.f175330a.hashCode() * 31, 31, this.f175331b);
    }
}
