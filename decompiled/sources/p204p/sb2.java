package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sb2 {

    /* JADX INFO: renamed from: a */
    public final int f207319a;

    /* JADX INFO: renamed from: b */
    public final int f207320b;

    /* JADX INFO: renamed from: c */
    public final int f207321c;

    public sb2(int i, int i2, int i3) {
        this.f207319a = i;
        this.f207320b = i2;
        this.f207321c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb2)) {
            return false;
        }
        sb2 sb2Var = (sb2) obj;
        return this.f207319a == sb2Var.f207319a && this.f207320b == sb2Var.f207320b && this.f207321c == sb2Var.f207321c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f207321c) + mt60.m62800g(this.f207320b, Integer.hashCode(this.f207319a) * 31, 31);
    }
}
