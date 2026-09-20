package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class gy7 {

    /* JADX INFO: renamed from: a */
    public final int f85490a;

    /* JADX INFO: renamed from: b */
    public final long f85491b;

    public gy7(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.f85490a = i;
        this.f85491b = j;
    }

    /* JADX INFO: renamed from: a */
    public static gy7 m46122a() {
        return new gy7(3, -1L);
    }

    /* JADX INFO: renamed from: b */
    public static gy7 m46123b(long j) {
        return new gy7(1, j);
    }

    /* JADX INFO: renamed from: c */
    public static gy7 m46124c() {
        return new gy7(2, -1L);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gy7)) {
            return false;
        }
        gy7 gy7Var = (gy7) obj;
        return edb.m38554c(this.f85490a, gy7Var.f85490a) && this.f85491b == gy7Var.f85491b;
    }

    public final int hashCode() {
        int iM38547C = (edb.m38547C(this.f85490a) ^ 1000003) * 1000003;
        long j = this.f85491b;
        return iM38547C ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.f85490a;
        if (i == 1) {
            str = "OK";
        } else if (i == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return ikc0.m50938j(this.f85491b, "}", sb);
    }
}
