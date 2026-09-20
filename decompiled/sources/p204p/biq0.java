package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class biq0 implements ciq0 {

    /* JADX INFO: renamed from: a */
    public final String f27528a;

    /* JADX INFO: renamed from: b */
    public final String f27529b;

    /* JADX INFO: renamed from: c */
    public final boolean f27530c;

    public biq0(String str, String str2, boolean z) {
        this.f27528a = str;
        this.f27529b = str2;
        this.f27530c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof biq0)) {
            return false;
        }
        biq0 biq0Var = (biq0) obj;
        return wj50.m88271j(this.f27528a, biq0Var.f27528a) && wj50.m88271j(this.f27529b, biq0Var.f27529b) && this.f27530c == biq0Var.f27530c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27530c) + s571.m77243b(this.f27528a.hashCode() * 31, 31, this.f27529b);
    }
}
