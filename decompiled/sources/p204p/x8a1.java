package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x8a1 {

    /* JADX INFO: renamed from: a */
    public final vda1 f259100a;

    /* JADX INFO: renamed from: b */
    public final boolean f259101b;

    /* JADX INFO: renamed from: c */
    public final eh00 f259102c;

    public x8a1(vda1 vda1Var, boolean z, eh00 eh00Var) {
        this.f259100a = vda1Var;
        this.f259101b = z;
        this.f259102c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8a1)) {
            return false;
        }
        x8a1 x8a1Var = (x8a1) obj;
        return wj50.m88271j(this.f259100a, x8a1Var.f259100a) && this.f259101b == x8a1Var.f259101b && wj50.m88271j(this.f259102c, x8a1Var.f259102c);
    }

    public final int hashCode() {
        return this.f259102c.hashCode() + s571.m77245d(this.f259100a.hashCode() * 31, 31, this.f259101b);
    }
}
