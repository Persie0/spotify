package p204p;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class v0c1 {
    public static final u0c1 Companion = new u0c1();

    /* JADX INFO: renamed from: a */
    public final String f235963a;

    /* JADX INFO: renamed from: b */
    public final String f235964b;

    public /* synthetic */ v0c1(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f235963a = null;
        } else {
            this.f235963a = str;
        }
        if ((i & 2) == 0) {
            this.f235964b = null;
        } else {
            this.f235964b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0c1)) {
            return false;
        }
        v0c1 v0c1Var = (v0c1) obj;
        return wj50.m88271j(this.f235963a, v0c1Var.f235963a) && wj50.m88271j(this.f235964b, v0c1Var.f235964b);
    }

    public final int hashCode() {
        String str = this.f235963a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f235964b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
