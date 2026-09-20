package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yb91 {

    /* JADX INFO: renamed from: a */
    public final boolean f271113a;

    /* JADX INFO: renamed from: b */
    public final String f271114b;

    public yb91(boolean z, String str) {
        this.f271113a = z;
        this.f271114b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb91)) {
            return false;
        }
        yb91 yb91Var = (yb91) obj;
        return this.f271113a == yb91Var.f271113a && wj50.m88271j(this.f271114b, yb91Var.f271114b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f271113a) * 31;
        String str = this.f271114b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
