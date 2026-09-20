package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x0c0 {

    /* JADX INFO: renamed from: a */
    public final String f256857a;

    /* JADX INFO: renamed from: b */
    public final String f256858b;

    /* JADX INFO: renamed from: c */
    public final boolean f256859c;

    public x0c0(String str, String str2, boolean z) {
        this.f256857a = str;
        this.f256858b = str2;
        this.f256859c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0c0)) {
            return false;
        }
        x0c0 x0c0Var = (x0c0) obj;
        return wj50.m88271j(this.f256857a, x0c0Var.f256857a) && wj50.m88271j(this.f256858b, x0c0Var.f256858b) && this.f256859c == x0c0Var.f256859c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256859c) + s571.m77243b(this.f256857a.hashCode() * 31, 31, this.f256858b);
    }
}
