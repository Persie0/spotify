package p204p;

import com.spotify.playbacknative.AudioDriver;

/* JADX INFO: loaded from: classes3.dex */
public final class g1i0 {

    /* JADX INFO: renamed from: a */
    public final long f75635a;

    public /* synthetic */ g1i0(long j) {
        this.f75635a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ g1i0 m43357a(long j) {
        return new g1i0(j);
    }

    /* JADX INFO: renamed from: b */
    public static long m43358b(long j, long j2) {
        return ((j & 2147483647L) << 1) | 1 | (((long) ((((short) Float.intBitsToFloat((int) (j2 & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (j2 >> 32))) << 16))) << 32);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m43359c(long j) {
        return (j & 1) != 0;
    }

    /* JADX INFO: renamed from: d */
    public static final long m43360d(long j) {
        int i = (int) (j >>> 32);
        float f = (short) (i >>> 16);
        return (((long) Float.floatToRawIntBits((short) (i & AudioDriver.SPOTIFY_MAX_VOLUME))) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: e */
    public static final long m43361e(long j) {
        return (j >> 1) & 2147483647L;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g1i0) {
            return this.f75635a == ((g1i0) obj).f75635a;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long m43362f() {
        return this.f75635a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f75635a);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.f75635a + ')';
    }
}
