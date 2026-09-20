package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nj11 {

    /* JADX INFO: renamed from: a */
    public final boolean f154419a;

    /* JADX INFO: renamed from: b */
    public final String f154420b;

    public nj11(boolean z, String str) {
        this.f154419a = z;
        this.f154420b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj11)) {
            return false;
        }
        nj11 nj11Var = (nj11) obj;
        return this.f154419a == nj11Var.f154419a && wj50.m88271j(this.f154420b, nj11Var.f154420b);
    }

    public final int hashCode() {
        return this.f154420b.hashCode() + (Boolean.hashCode(this.f154419a) * 31);
    }
}
