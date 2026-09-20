package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kbv0 implements i4e {

    /* JADX INFO: renamed from: a */
    public final int f121293a;

    /* JADX INFO: renamed from: b */
    public final boolean f121294b;

    /* JADX INFO: renamed from: c */
    public final boolean f121295c;

    /* JADX INFO: renamed from: d */
    public final cfv0 f121296d;

    public kbv0(int i, boolean z, boolean z2, cfv0 cfv0Var) {
        this.f121293a = i;
        this.f121294b = z;
        this.f121295c = z2;
        this.f121296d = cfv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbv0)) {
            return false;
        }
        kbv0 kbv0Var = (kbv0) obj;
        return this.f121293a == kbv0Var.f121293a && this.f121294b == kbv0Var.f121294b && this.f121295c == kbv0Var.f121295c && wj50.m88271j(this.f121296d, kbv0Var.f121296d);
    }

    public final int hashCode() {
        return this.f121296d.hashCode() + s571.m77245d(s571.m77245d(Integer.hashCode(this.f121293a) * 31, 31, this.f121294b), 31, this.f121295c);
    }
}
