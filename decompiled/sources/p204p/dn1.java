package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dn1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final String f50654a;

    /* JADX INFO: renamed from: b */
    public final boolean f50655b;

    public dn1(String str, boolean z) {
        this.f50654a = str;
        this.f50655b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn1)) {
            return false;
        }
        dn1 dn1Var = (dn1) obj;
        return wj50.m88271j(this.f50654a, dn1Var.f50654a) && this.f50655b == dn1Var.f50655b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50655b) + (this.f50654a.hashCode() * 31);
    }
}
