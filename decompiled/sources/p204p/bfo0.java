package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bfo0 {

    /* JADX INFO: renamed from: a */
    public final String f26753a;

    /* JADX INFO: renamed from: b */
    public final boolean f26754b;

    /* JADX INFO: renamed from: c */
    public final boolean f26755c;

    /* JADX INFO: renamed from: d */
    public final boolean f26756d;

    public bfo0(String str, boolean z, boolean z2, boolean z3) {
        this.f26753a = str;
        this.f26754b = z;
        this.f26755c = z2;
        this.f26756d = z3;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m29030a() {
        return this.f26754b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m29031b() {
        return this.f26755c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfo0)) {
            return false;
        }
        bfo0 bfo0Var = (bfo0) obj;
        return wj50.m88271j(this.f26753a, bfo0Var.f26753a) && this.f26754b == bfo0Var.f26754b && this.f26755c == bfo0Var.f26755c && this.f26756d == bfo0Var.f26756d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26756d) + s571.m77245d(s571.m77245d(this.f26753a.hashCode() * 31, 31, this.f26754b), 31, this.f26755c);
    }

    public /* synthetic */ bfo0(String str, boolean z) {
        this(str, z, false, false);
    }
}
