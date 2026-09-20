package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qkc0 {

    /* JADX INFO: renamed from: a */
    public final String f189529a;

    /* JADX INFO: renamed from: b */
    public final int f189530b;

    public qkc0(String str, int i) {
        this.f189529a = str;
        this.f189530b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkc0)) {
            return false;
        }
        qkc0 qkc0Var = (qkc0) obj;
        return wj50.m88271j(this.f189529a, qkc0Var.f189529a) && this.f189530b == qkc0Var.f189530b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f189530b) + (this.f189529a.hashCode() * 31);
    }
}
