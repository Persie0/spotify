package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class l78 {

    /* JADX INFO: renamed from: e */
    public static final Object f130603e = kkc0.m56695h0(new pqm0(0, 1), new pqm0(1, 2), new pqm0(2, 4), new pqm0(3, 8), new pqm0(4, 16), new pqm0(5, 32), new pqm0(6, 64), new pqm0(7, 128), new pqm0(8, 256), new pqm0(9, 512), new pqm0(10, 1024), new pqm0(11, 2048), new pqm0(12, 4096), new pqm0(13, 8192), new pqm0(14, 16384), new pqm0(15, 32768), new pqm0(16, 65536), new pqm0(17, 131072), new pqm0(18, 262144), new pqm0(19, 524288), new pqm0(20, 1048576), new pqm0(21, 2097152), new pqm0(22, 4194304), new pqm0(23, 8388608));

    /* JADX INFO: renamed from: a */
    public final int f130604a;

    /* JADX INFO: renamed from: b */
    public final int f130605b;

    /* JADX INFO: renamed from: c */
    public final char f130606c;

    /* JADX INFO: renamed from: d */
    public final int f130607d;

    public l78(int i, int i2, char c, int i3) {
        this.f130604a = i;
        this.f130605b = i2;
        this.f130606c = c;
        this.f130607d = i3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final Integer m58407a() {
        return (Integer) f130603e.get(Integer.valueOf(this.f130605b));
    }

    /* JADX INFO: renamed from: b */
    public final Integer m58408b() {
        int i = this.f130607d;
        if (i <= 8) {
            return 1;
        }
        return i == 10 ? 2 : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l78)) {
            return false;
        }
        l78 l78Var = (l78) obj;
        return this.f130604a == l78Var.f130604a && this.f130605b == l78Var.f130605b && this.f130606c == l78Var.f130606c && this.f130607d == l78Var.f130607d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130607d) + ((Character.hashCode(this.f130606c) + mt60.m62800g(this.f130605b, Integer.hashCode(this.f130604a) * 31, 31)) * 31);
    }
}
