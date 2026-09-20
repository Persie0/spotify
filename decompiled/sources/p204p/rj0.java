package p204p;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class rj0 {
    public static final qj0 Companion = new qj0();

    /* JADX INFO: renamed from: a */
    public final String f199671a;

    /* JADX INFO: renamed from: b */
    public final String f199672b;

    public /* synthetic */ rj0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f199671a = null;
        } else {
            this.f199671a = str;
        }
        if ((i & 2) == 0) {
            this.f199672b = null;
        } else {
            this.f199672b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj0)) {
            return false;
        }
        rj0 rj0Var = (rj0) obj;
        return wj50.m88271j(this.f199671a, rj0Var.f199671a) && wj50.m88271j(this.f199672b, rj0Var.f199672b);
    }

    public final int hashCode() {
        String str = this.f199671a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f199672b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public rj0(String str, String str2) {
        this.f199671a = str;
        this.f199672b = str2;
    }
}
