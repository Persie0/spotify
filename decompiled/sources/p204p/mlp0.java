package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mlp0 {

    /* JADX INFO: renamed from: a */
    public final String f144897a;

    /* JADX INFO: renamed from: b */
    public final String f144898b;

    /* JADX INFO: renamed from: c */
    public final String f144899c;

    /* JADX INFO: renamed from: d */
    public final String f144900d;

    public mlp0(String str, String str2, String str3, String str4) {
        this.f144897a = str;
        this.f144898b = str2;
        this.f144899c = str3;
        this.f144900d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlp0)) {
            return false;
        }
        mlp0 mlp0Var = (mlp0) obj;
        return wj50.m88271j(this.f144897a, mlp0Var.f144897a) && wj50.m88271j(this.f144898b, mlp0Var.f144898b) && wj50.m88271j(this.f144899c, mlp0Var.f144899c) && wj50.m88271j(this.f144900d, mlp0Var.f144900d);
    }

    public final int hashCode() {
        return this.f144900d.hashCode() + s571.m77243b(s571.m77243b(this.f144897a.hashCode() * 31, 31, this.f144898b), 31, this.f144899c);
    }
}
