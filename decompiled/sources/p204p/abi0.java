package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class abi0 {

    /* JADX INFO: renamed from: a */
    public final i35 f14119a;

    /* JADX INFO: renamed from: b */
    public final boolean f14120b;

    /* JADX INFO: renamed from: c */
    public final boolean f14121c;

    /* JADX INFO: renamed from: d */
    public final gh00 f14122d;

    public abi0(i35 i35Var, boolean z, boolean z2, gh00 gh00Var) {
        this.f14119a = i35Var;
        this.f14120b = z;
        this.f14121c = z2;
        this.f14122d = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abi0)) {
            return false;
        }
        abi0 abi0Var = (abi0) obj;
        return wj50.m88271j(this.f14119a, abi0Var.f14119a) && this.f14120b == abi0Var.f14120b && this.f14121c == abi0Var.f14121c && wj50.m88271j(this.f14122d, abi0Var.f14122d);
    }

    public final int hashCode() {
        return this.f14122d.hashCode() + s571.m77245d(s571.m77245d(this.f14119a.hashCode() * 31, 31, this.f14120b), 31, this.f14121c);
    }
}
