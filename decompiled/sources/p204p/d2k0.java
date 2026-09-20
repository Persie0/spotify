package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d2k0 {

    /* JADX INFO: renamed from: a */
    public final boolean f44576a;

    /* JADX INFO: renamed from: b */
    public final j6x f44577b;

    public d2k0(boolean z, j6x j6xVar) {
        this.f44576a = z;
        this.f44577b = j6xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2k0)) {
            return false;
        }
        d2k0 d2k0Var = (d2k0) obj;
        return this.f44576a == d2k0Var.f44576a && wj50.m88271j(this.f44577b, d2k0Var.f44577b);
    }

    public final int hashCode() {
        return this.f44577b.hashCode() + (Boolean.hashCode(this.f44576a) * 31);
    }

    public /* synthetic */ d2k0() {
        this(false, new j6x(false, false));
    }
}
