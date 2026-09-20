package p204p;

/* JADX INFO: loaded from: classes9.dex */
@rtz0
public final class wp8 {
    public static final vp8 Companion = new vp8();

    /* JADX INFO: renamed from: a */
    public final String f253697a;

    /* JADX INFO: renamed from: b */
    public final String f253698b;

    public /* synthetic */ wp8(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f253697a = null;
        } else {
            this.f253697a = str;
        }
        if ((i & 2) == 0) {
            this.f253698b = null;
        } else {
            this.f253698b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp8)) {
            return false;
        }
        wp8 wp8Var = (wp8) obj;
        return wj50.m88271j(this.f253697a, wp8Var.f253697a) && wj50.m88271j(this.f253698b, wp8Var.f253698b);
    }

    public final int hashCode() {
        String str = this.f253697a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f253698b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public wp8(String str, String str2) {
        this.f253697a = str;
        this.f253698b = str2;
    }
}
