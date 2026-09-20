package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c13 {

    /* JADX INFO: renamed from: a */
    public final boolean f32955a;

    /* JADX INFO: renamed from: b */
    public final String f32956b;

    /* JADX INFO: renamed from: c */
    public final String f32957c;

    public c13(boolean z, String str, String str2) {
        this.f32955a = z;
        this.f32956b = str;
        this.f32957c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c13)) {
            return false;
        }
        c13 c13Var = (c13) obj;
        return this.f32955a == c13Var.f32955a && wj50.m88271j(this.f32956b, c13Var.f32956b) && wj50.m88271j(this.f32957c, c13Var.f32957c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f32955a) * 31;
        String str = this.f32956b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f32957c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
