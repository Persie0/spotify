package p204p;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class h1p0 {

    /* JADX INFO: renamed from: d */
    public static final h1p0 f86671d = new h1p0(1.0f);

    /* JADX INFO: renamed from: e */
    public static final String f86672e;

    /* JADX INFO: renamed from: f */
    public static final String f86673f;

    /* JADX INFO: renamed from: a */
    public final float f86674a;

    /* JADX INFO: renamed from: b */
    public final float f86675b;

    /* JADX INFO: renamed from: c */
    public final int f86676c;

    static {
        String str = h0b1.f86200a;
        f86672e = Integer.toString(0, 36);
        f86673f = Integer.toString(1, 36);
    }

    public h1p0(float f) {
        this(f, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public final long m46463a(long j) {
        return j * ((long) this.f86676c);
    }

    /* JADX INFO: renamed from: b */
    public final h1p0 m46464b(float f) {
        return new h1p0(f, this.f86675b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1p0.class == obj.getClass()) {
            h1p0 h1p0Var = (h1p0) obj;
            if (this.f86674a == h1p0Var.f86674a && this.f86675b == h1p0Var.f86675b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f86675b) + ((Float.floatToRawIntBits(this.f86674a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f86674a), Float.valueOf(this.f86675b)};
        String str = h0b1.f86200a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public h1p0(float f, float f2) {
        c95.m31843i(f > 0.0f);
        c95.m31843i(f2 > 0.0f);
        this.f86674a = f;
        this.f86675b = f2;
        this.f86676c = Math.round(f * 1000.0f);
    }
}
