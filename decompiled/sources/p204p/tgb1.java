package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tgb1 {

    /* JADX INFO: renamed from: a */
    public final String f220162a;

    /* JADX INFO: renamed from: b */
    public final String f220163b;

    public tgb1(String str, String str2) {
        this.f220162a = str;
        this.f220163b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgb1)) {
            return false;
        }
        tgb1 tgb1Var = (tgb1) obj;
        return wj50.m88271j(this.f220162a, tgb1Var.f220162a) && wj50.m88271j(this.f220163b, tgb1Var.f220163b);
    }

    public final int hashCode() {
        String str = this.f220162a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f220163b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
