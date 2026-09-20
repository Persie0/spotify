package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kc81 {

    /* JADX INFO: renamed from: a */
    public final boolean f121403a;

    /* JADX INFO: renamed from: b */
    public final boolean f121404b;

    /* JADX INFO: renamed from: c */
    public final boolean f121405c;

    /* JADX INFO: renamed from: d */
    public final boolean f121406d;

    /* JADX INFO: renamed from: e */
    public final boolean f121407e;

    /* JADX INFO: renamed from: f */
    public final boolean f121408f;

    /* JADX INFO: renamed from: g */
    public final boolean f121409g;

    public kc81(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f121403a = z;
        this.f121404b = z2;
        this.f121405c = z3;
        this.f121406d = z4;
        this.f121407e = z5;
        this.f121408f = z6;
        this.f121409g = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc81)) {
            return false;
        }
        kc81 kc81Var = (kc81) obj;
        return this.f121403a == kc81Var.f121403a && this.f121404b == kc81Var.f121404b && this.f121405c == kc81Var.f121405c && this.f121406d == kc81Var.f121406d && this.f121407e == kc81Var.f121407e && this.f121408f == kc81Var.f121408f && this.f121409g == kc81Var.f121409g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121409g) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f121403a) * 31, 31, this.f121404b), 31, this.f121405c), 31, this.f121406d), 31, this.f121407e), 31, this.f121408f);
    }
}
