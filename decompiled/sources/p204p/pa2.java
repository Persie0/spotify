package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pa2 extends ra2 {

    /* JADX INFO: renamed from: a */
    public final int f175367a;

    /* JADX INFO: renamed from: b */
    public final int f175368b;

    /* JADX INFO: renamed from: c */
    public final int f175369c;

    public pa2(int i, int i2, int i3) {
        this.f175367a = i;
        this.f175368b = i2;
        this.f175369c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa2)) {
            return false;
        }
        pa2 pa2Var = (pa2) obj;
        return this.f175367a == pa2Var.f175367a && this.f175368b == pa2Var.f175368b && this.f175369c == pa2Var.f175369c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f175369c) + mt60.m62800g(this.f175368b, Integer.hashCode(this.f175367a) * 31, 31);
    }
}
