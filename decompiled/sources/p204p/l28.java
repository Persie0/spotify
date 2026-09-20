package p204p;

import android.util.Size;

/* JADX INFO: loaded from: classes3.dex */
public final class l28 {

    /* JADX INFO: renamed from: a */
    public final int f128939a;

    /* JADX INFO: renamed from: b */
    public final p761 f128940b;

    /* JADX INFO: renamed from: c */
    public final long f128941c;

    public l28(int i, p761 p761Var, long j) {
        if (i == 0) {
            throw new NullPointerException("Null configType");
        }
        this.f128939a = i;
        this.f128940b = p761Var;
        this.f128941c = j;
    }

    /* JADX INFO: renamed from: a */
    public static int m57895a(int i) {
        if (i == 35) {
            return 2;
        }
        if (i == 256) {
            return 3;
        }
        if (i == 4101) {
            return 4;
        }
        return i == 32 ? 5 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX INFO: renamed from: b */
    public static l28 m57896b(int i, int i2, Size size, q28 q28Var) {
        p761 p761Var;
        int iM57895a = m57895a(i2);
        int iM85581a = vi21.m85581a(size);
        if (i == 1) {
            if (iM85581a <= vi21.m85581a((Size) q28Var.f184535b.get(Integer.valueOf(i2)))) {
                p761Var = p761.s720p;
            } else if (iM85581a <= vi21.m85581a((Size) q28Var.f184537d.get(Integer.valueOf(i2)))) {
                p761Var = p761.s1440p;
            } else {
                p761Var = p761.NOT_SUPPORT;
            }
        } else if (iM85581a <= vi21.m85581a(q28Var.f184534a)) {
            p761Var = p761.VGA;
        } else if (iM85581a <= vi21.m85581a(q28Var.f184536c)) {
            p761Var = p761.PREVIEW;
        } else if (iM85581a <= vi21.m85581a(q28Var.f184538e)) {
            p761Var = p761.RECORD;
        } else if (iM85581a <= vi21.m85581a((Size) q28Var.f184539f.get(Integer.valueOf(i2)))) {
            p761Var = p761.MAXIMUM;
        } else {
            Size size2 = (Size) q28Var.f184540g.get(Integer.valueOf(i2));
            if (size2 != null) {
                if (iM85581a <= size2.getHeight() * size2.getWidth()) {
                    p761Var = p761.ULTRA_MAXIMUM;
                } else {
                    p761Var = p761.NOT_SUPPORT;
                }
            } else {
                p761Var = p761.NOT_SUPPORT;
            }
        }
        return new l28(iM57895a, p761Var, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l28)) {
            return false;
        }
        l28 l28Var = (l28) obj;
        return edb.m38554c(this.f128939a, l28Var.f128939a) && this.f128940b.equals(l28Var.f128940b) && this.f128941c == l28Var.f128941c;
    }

    public final int hashCode() {
        int iM38547C = (((edb.m38547C(this.f128939a) ^ 1000003) * 1000003) ^ this.f128940b.hashCode()) * 1000003;
        long j = this.f128941c;
        return iM38547C ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        int i = this.f128939a;
        if (i == 1) {
            str = "PRIV";
        } else if (i == 2) {
            str = "YUV";
        } else if (i == 3) {
            str = "JPEG";
        } else if (i != 4) {
            str = i != 5 ? "null" : "RAW";
        } else {
            str = "JPEG_R";
        }
        sb.append(str);
        sb.append(", configSize=");
        sb.append(this.f128940b);
        sb.append(", streamUseCase=");
        return ikc0.m50938j(this.f128941c, "}", sb);
    }
}
