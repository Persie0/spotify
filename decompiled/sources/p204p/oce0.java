package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class oce0 {

    /* JADX INFO: renamed from: a */
    public final String f163910a;

    /* JADX INFO: renamed from: b */
    public final String f163911b;

    public oce0(String str, String str2) {
        this.f163910a = str;
        this.f163911b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oce0)) {
            return false;
        }
        oce0 oce0Var = (oce0) obj;
        return wj50.m88271j(this.f163910a, oce0Var.f163910a) && wj50.m88271j(this.f163911b, oce0Var.f163911b);
    }

    public final int hashCode() {
        return this.f163911b.hashCode() + (this.f163910a.hashCode() * 31);
    }
}
