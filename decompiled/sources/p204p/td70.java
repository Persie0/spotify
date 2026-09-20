package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class td70 {

    /* JADX INFO: renamed from: a */
    public final int f219253a;

    /* JADX INFO: renamed from: b */
    public final int f219254b;

    /* JADX INFO: renamed from: c */
    public final int f219255c;

    public td70(int i, int i2, int i3) {
        this.f219253a = i;
        this.f219254b = i2;
        this.f219255c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td70)) {
            return false;
        }
        td70 td70Var = (td70) obj;
        return this.f219253a == td70Var.f219253a && this.f219254b == td70Var.f219254b && this.f219255c == td70Var.f219255c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f219255c) + mt60.m62800g(this.f219254b, Integer.hashCode(this.f219253a) * 31, 31);
    }
}
