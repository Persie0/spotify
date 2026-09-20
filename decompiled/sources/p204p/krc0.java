package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class krc0 {

    /* JADX INFO: renamed from: d */
    public static final krc0 f125610d = new krc0("", false, false);

    /* JADX INFO: renamed from: a */
    public final String f125611a;

    /* JADX INFO: renamed from: b */
    public final boolean f125612b;

    /* JADX INFO: renamed from: c */
    public final boolean f125613c;

    public krc0(String str, boolean z, boolean z2) {
        this.f125611a = str;
        this.f125612b = z;
        this.f125613c = z2;
    }

    /* JADX INFO: renamed from: a */
    public static krc0 m57150a(krc0 krc0Var, String str, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = krc0Var.f125611a;
        }
        if ((i & 2) != 0) {
            z = krc0Var.f125612b;
        }
        if ((i & 4) != 0) {
            z2 = krc0Var.f125613c;
        }
        krc0Var.getClass();
        return new krc0(str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krc0)) {
            return false;
        }
        krc0 krc0Var = (krc0) obj;
        return wj50.m88271j(this.f125611a, krc0Var.f125611a) && this.f125612b == krc0Var.f125612b && this.f125613c == krc0Var.f125613c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125613c) + s571.m77245d(this.f125611a.hashCode() * 31, 31, this.f125612b);
    }
}
