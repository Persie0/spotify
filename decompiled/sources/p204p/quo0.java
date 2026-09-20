package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class quo0 {

    /* JADX INFO: renamed from: a */
    public final String f192754a;

    /* JADX INFO: renamed from: b */
    public final boolean f192755b;

    /* JADX INFO: renamed from: c */
    public final boolean f192756c;

    public quo0(String str, boolean z, boolean z2) {
        this.f192754a = str;
        this.f192755b = z;
        this.f192756c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quo0)) {
            return false;
        }
        quo0 quo0Var = (quo0) obj;
        return wj50.m88271j(this.f192754a, quo0Var.f192754a) && this.f192755b == quo0Var.f192755b && this.f192756c == quo0Var.f192756c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f192756c) + s571.m77245d(this.f192754a.hashCode() * 31, 31, this.f192755b);
    }
}
