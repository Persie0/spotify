package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cip0 {

    /* JADX INFO: renamed from: a */
    public final String f38416a;

    /* JADX INFO: renamed from: b */
    public final String f38417b;

    public cip0(String str, String str2) {
        this.f38416a = str;
        this.f38417b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cip0)) {
            return false;
        }
        cip0 cip0Var = (cip0) obj;
        return wj50.m88271j(this.f38416a, cip0Var.f38416a) && wj50.m88271j(this.f38417b, cip0Var.f38417b);
    }

    public final int hashCode() {
        return this.f38417b.hashCode() + (this.f38416a.hashCode() * 31);
    }
}
