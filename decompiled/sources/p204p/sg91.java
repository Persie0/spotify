package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sg91 {

    /* JADX INFO: renamed from: e */
    public static final sg91 f208795e = new sg91(false, false, false, false);

    /* JADX INFO: renamed from: a */
    public final boolean f208796a;

    /* JADX INFO: renamed from: b */
    public final boolean f208797b;

    /* JADX INFO: renamed from: c */
    public final boolean f208798c;

    /* JADX INFO: renamed from: d */
    public final boolean f208799d;

    public sg91(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f208796a = z;
        this.f208797b = z2;
        this.f208798c = z3;
        this.f208799d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg91)) {
            return false;
        }
        sg91 sg91Var = (sg91) obj;
        return this.f208796a == sg91Var.f208796a && this.f208797b == sg91Var.f208797b && this.f208798c == sg91Var.f208798c && this.f208799d == sg91Var.f208799d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f208799d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f208796a) * 31, 31, this.f208797b), 31, this.f208798c);
    }
}
