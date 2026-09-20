package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pvy0 {

    /* JADX INFO: renamed from: a */
    public final String f181865a;

    /* JADX INFO: renamed from: b */
    public final boolean f181866b;

    public pvy0(String str, boolean z) {
        this.f181865a = str;
        this.f181866b = z;
    }

    /* JADX INFO: renamed from: a */
    public static pvy0 m71206a(pvy0 pvy0Var, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = pvy0Var.f181865a;
        }
        if ((i & 2) != 0) {
            z = pvy0Var.f181866b;
        }
        pvy0Var.getClass();
        return new pvy0(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvy0)) {
            return false;
        }
        pvy0 pvy0Var = (pvy0) obj;
        return wj50.m88271j(this.f181865a, pvy0Var.f181865a) && this.f181866b == pvy0Var.f181866b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f181866b) + (this.f181865a.hashCode() * 31);
    }
}
