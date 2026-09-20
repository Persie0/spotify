package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ntc1 {

    /* JADX INFO: renamed from: a */
    public final String f158046a;

    /* JADX INFO: renamed from: b */
    public final boolean f158047b;

    /* JADX INFO: renamed from: c */
    public final boolean f158048c;

    public ntc1(String str, boolean z, boolean z2) {
        this.f158046a = str;
        this.f158047b = z;
        this.f158048c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntc1)) {
            return false;
        }
        ntc1 ntc1Var = (ntc1) obj;
        return wj50.m88271j(this.f158046a, ntc1Var.f158046a) && this.f158047b == ntc1Var.f158047b && this.f158048c == ntc1Var.f158048c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f158048c) + s571.m77245d(this.f158046a.hashCode() * 31, 31, this.f158047b);
    }
}
