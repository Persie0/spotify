package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class yi50 implements zi50 {

    /* JADX INFO: renamed from: a */
    public final boolean f273039a;

    /* JADX INFO: renamed from: b */
    public final boolean f273040b;

    /* JADX INFO: renamed from: c */
    public final long f273041c;

    public yi50(long j, boolean z, boolean z2) {
        this.f273039a = z;
        this.f273040b = z2;
        this.f273041c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi50)) {
            return false;
        }
        yi50 yi50Var = (yi50) obj;
        return this.f273039a == yi50Var.f273039a && this.f273040b == yi50Var.f273040b && this.f273041c == yi50Var.f273041c;
    }

    @Override // p204p.zi50
    public final String getName() {
        return "playing_state_changed";
    }

    public final int hashCode() {
        return Long.hashCode(this.f273041c) + s571.m77245d(Boolean.hashCode(this.f273039a) * 31, 31, this.f273040b);
    }
}
