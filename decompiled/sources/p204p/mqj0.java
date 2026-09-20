package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mqj0 implements nqj0 {

    /* JADX INFO: renamed from: a */
    public final boolean f146302a;

    /* JADX INFO: renamed from: b */
    public final boolean f146303b;

    public mqj0(boolean z, boolean z2) {
        this.f146302a = z;
        this.f146303b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqj0)) {
            return false;
        }
        mqj0 mqj0Var = (mqj0) obj;
        return this.f146302a == mqj0Var.f146302a && this.f146303b == mqj0Var.f146303b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f146303b) + (Boolean.hashCode(this.f146302a) * 31);
    }

    public final String toString() {
        return "NoInternet(wifiDisabled=" + this.f146302a + ", mobileDataDisabled=" + this.f146303b + ")";
    }
}
