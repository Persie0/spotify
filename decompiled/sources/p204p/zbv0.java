package p204p;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class zbv0 {
    public static final ybv0 Companion = new ybv0();

    /* JADX INFO: renamed from: a */
    public final String f281404a;

    /* JADX INFO: renamed from: b */
    public final String f281405b;

    /* JADX INFO: renamed from: c */
    public final Boolean f281406c;

    public /* synthetic */ zbv0(int i, String str, String str2, Boolean bool) {
        if ((i & 1) == 0) {
            this.f281404a = null;
        } else {
            this.f281404a = str;
        }
        if ((i & 2) == 0) {
            this.f281405b = null;
        } else {
            this.f281405b = str2;
        }
        if ((i & 4) == 0) {
            this.f281406c = null;
        } else {
            this.f281406c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbv0)) {
            return false;
        }
        zbv0 zbv0Var = (zbv0) obj;
        return wj50.m88271j(this.f281404a, zbv0Var.f281404a) && wj50.m88271j(this.f281405b, zbv0Var.f281405b) && wj50.m88271j(this.f281406c, zbv0Var.f281406c);
    }

    public final int hashCode() {
        String str = this.f281404a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f281405b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f281406c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public zbv0(Boolean bool, String str, String str2) {
        this.f281404a = str;
        this.f281405b = str2;
        this.f281406c = bool;
    }
}
