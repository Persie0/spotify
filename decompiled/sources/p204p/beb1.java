package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class beb1 {

    /* JADX INFO: renamed from: d */
    public static final beb1 f26325d = new beb1(256, 256, 256);

    /* JADX INFO: renamed from: a */
    public final int f26326a;

    /* JADX INFO: renamed from: b */
    public final int f26327b;

    /* JADX INFO: renamed from: c */
    public final int f26328c;

    public beb1(int i, int i2, int i3) {
        this.f26326a = i;
        this.f26327b = i2;
        this.f26328c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beb1)) {
            return false;
        }
        beb1 beb1Var = (beb1) obj;
        return this.f26326a == beb1Var.f26326a && this.f26327b == beb1Var.f26327b && this.f26328c == beb1Var.f26328c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26328c) + mt60.m62800g(this.f26327b, Integer.hashCode(this.f26326a) * 31, 31);
    }

    public final String toString() {
        int i = this.f26327b;
        int i2 = this.f26326a;
        int i3 = this.f26328c;
        if (i3 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append('.');
            sb.append(i);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i2);
        sb2.append('.');
        sb2.append(i);
        sb2.append('.');
        sb2.append(i3);
        return sb2.toString();
    }
}
