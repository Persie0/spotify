package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bz5 {

    /* JADX INFO: renamed from: a */
    public final String f32409a;

    /* JADX INFO: renamed from: b */
    public final String f32410b;

    /* JADX INFO: renamed from: c */
    public final String f32411c;

    public bz5(String str, String str2, String str3) {
        this.f32409a = str;
        this.f32410b = str2;
        this.f32411c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz5)) {
            return false;
        }
        bz5 bz5Var = (bz5) obj;
        return wj50.m88271j(this.f32409a, bz5Var.f32409a) && wj50.m88271j(this.f32410b, bz5Var.f32410b) && wj50.m88271j(this.f32411c, bz5Var.f32411c);
    }

    public final int hashCode() {
        int iHashCode = this.f32409a.hashCode() * 31;
        String str = this.f32410b;
        return this.f32411c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
