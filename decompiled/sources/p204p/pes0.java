package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class pes0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final wke0 f176841a;

    /* JADX INFO: renamed from: b */
    public final boolean f176842b;

    /* JADX INFO: renamed from: c */
    public final boolean f176843c;

    public pes0(wke0 wke0Var, boolean z, boolean z2) {
        this.f176841a = wke0Var;
        this.f176842b = z;
        this.f176843c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pes0)) {
            return false;
        }
        pes0 pes0Var = (pes0) obj;
        return wj50.m88271j(this.f176841a, pes0Var.f176841a) && this.f176842b == pes0Var.f176842b && this.f176843c == pes0Var.f176843c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f176843c) + s571.m77245d(this.f176841a.hashCode() * 31, 31, this.f176842b);
    }
}
