package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bw40 {

    /* JADX INFO: renamed from: a */
    public final boolean f31534a;

    /* JADX INFO: renamed from: b */
    public final boolean f31535b;

    public bw40(boolean z, boolean z2) {
        this.f31534a = z;
        this.f31535b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw40)) {
            return false;
        }
        bw40 bw40Var = (bw40) obj;
        return this.f31534a == bw40Var.f31534a && this.f31535b == bw40Var.f31535b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31535b) + (Boolean.hashCode(this.f31534a) * 31);
    }
}
