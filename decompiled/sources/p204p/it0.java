package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class it0 {

    /* JADX INFO: renamed from: d */
    public static final String f105376d;

    /* JADX INFO: renamed from: e */
    public static final String f105377e;

    /* JADX INFO: renamed from: f */
    public static final String f105378f;

    /* JADX INFO: renamed from: a */
    public final long f105379a;

    /* JADX INFO: renamed from: b */
    public final long f105380b;

    /* JADX INFO: renamed from: c */
    public final String f105381c;

    static {
        String str = h0b1.f86200a;
        f105376d = Integer.toString(0, 36);
        f105377e = Integer.toString(1, 36);
        f105378f = Integer.toString(2, 36);
    }

    public it0(long j, String str, long j2) {
        c95.m31843i((j == -9223372036854775807L && j2 == -9223372036854775807L && str == null) ? false : true);
        this.f105379a = j == -9223372036854775807L ? 0L : j;
        this.f105380b = j2;
        this.f105381c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && it0.class == obj.getClass()) {
            it0 it0Var = (it0) obj;
            if (this.f105379a == it0Var.f105379a && this.f105380b == it0Var.f105380b && Objects.equals(this.f105381c, it0Var.f105381c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f105379a), Long.valueOf(this.f105380b), this.f105381c);
    }
}
