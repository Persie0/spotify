package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q4w {

    /* JADX INFO: renamed from: a */
    public final boolean f185355a;

    /* JADX INFO: renamed from: b */
    public final boolean f185356b;

    /* JADX INFO: renamed from: c */
    public final boolean f185357c;

    public q4w(boolean z, boolean z2, boolean z3) {
        this.f185355a = z;
        this.f185356b = z2;
        this.f185357c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4w)) {
            return false;
        }
        q4w q4wVar = (q4w) obj;
        return this.f185355a == q4wVar.f185355a && this.f185356b == q4wVar.f185356b && this.f185357c == q4wVar.f185357c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f185357c) + s571.m77245d(Boolean.hashCode(this.f185355a) * 31, 31, this.f185356b);
    }
}
