package androidx.compose.p002ui.unit;

import p204p.epv0;
import p204p.tf71;

/* JADX INFO: loaded from: classes.dex */
public final class TextUnit {

    /* JADX INFO: renamed from: b */
    public static final tf71[] f546b = {new tf71(0), new tf71(4294967296L), new tf71(8589934592L)};

    /* JADX INFO: renamed from: c */
    public static final long f547c = epv0.m39669E(0, Float.NaN);

    /* JADX INFO: renamed from: a */
    public final long f548a;

    /* JADX INFO: renamed from: a */
    public static final boolean m306a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static final long m307b(long j) {
        return f546b[(int) ((j & 1095216660480L) >>> 32)].f219878a;
    }

    /* JADX INFO: renamed from: c */
    public static final float m308c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m309d(long j) {
        return (j & 1095216660480L) == 8589934592L;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m310e(long j) {
        return (j & 1095216660480L) == 4294967296L;
    }

    /* JADX INFO: renamed from: f */
    public static String m311f(long j) {
        long jM307b = m307b(j);
        if (tf71.m80605a(jM307b, 0L)) {
            return "Unspecified";
        }
        if (tf71.m80605a(jM307b, 4294967296L)) {
            return m308c(j) + ".sp";
        }
        if (!tf71.m80605a(jM307b, 8589934592L)) {
            return "Invalid";
        }
        return m308c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextUnit) {
            return this.f548a == ((TextUnit) obj).f548a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f548a);
    }

    public final String toString() {
        return m311f(this.f548a);
    }
}
