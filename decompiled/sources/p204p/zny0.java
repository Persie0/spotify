package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zny0 {

    /* JADX INFO: renamed from: a */
    public final long f284598a;

    /* JADX INFO: renamed from: b */
    public final long f284599b;

    /* JADX INFO: renamed from: c */
    public final long f284600c;

    /* JADX INFO: renamed from: d */
    public final float f284601d;

    public zny0(float f, long j, long j2, long j3) {
        this.f284598a = j;
        this.f284599b = j2;
        this.f284600c = j3;
        this.f284601d = f;
    }

    /* JADX INFO: renamed from: a */
    public static zny0 m96601a(zny0 zny0Var, long j, long j2) {
        long j3 = zny0Var.f284599b;
        float f = zny0Var.f284601d;
        zny0Var.getClass();
        return new zny0(f, j, j3, j2);
    }

    /* JADX INFO: renamed from: b */
    public final long m96602b() {
        return this.f284599b;
    }

    /* JADX INFO: renamed from: c */
    public final float m96603c(long j) {
        long j2 = this.f284599b;
        if (j2 <= 0) {
            return 0.0f;
        }
        return n0e1.m63436m((this.f284598a + (this.f284601d * (j - this.f284600c))) / j2, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zny0)) {
            return false;
        }
        zny0 zny0Var = (zny0) obj;
        return this.f284598a == zny0Var.f284598a && this.f284599b == zny0Var.f284599b && this.f284600c == zny0Var.f284600c && Float.compare(this.f284601d, zny0Var.f284601d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f284601d) + dq60.m36605e(dq60.m36605e(Long.hashCode(this.f284598a) * 31, this.f284599b, 31), this.f284600c, 31);
    }
}
