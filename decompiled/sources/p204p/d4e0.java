package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d4e0 {

    /* JADX INFO: renamed from: a */
    public final boolean f45145a;

    /* JADX INFO: renamed from: b */
    public final boolean f45146b;

    /* JADX INFO: renamed from: c */
    public final boolean f45147c;

    public /* synthetic */ d4e0(boolean z, boolean z2, int i) {
        this(z, false, (i & 8) != 0 ? false : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4e0)) {
            return false;
        }
        d4e0 d4e0Var = (d4e0) obj;
        return this.f45145a == d4e0Var.f45145a && this.f45146b == d4e0Var.f45146b && this.f45147c == d4e0Var.f45147c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f45147c) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f45145a) * 31, 31, false), 31, this.f45146b);
    }

    public d4e0(boolean z, boolean z2, boolean z3) {
        this.f45145a = z;
        this.f45146b = z2;
        this.f45147c = z3;
    }
}
