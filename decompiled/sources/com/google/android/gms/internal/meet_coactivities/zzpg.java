package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzpg extends RuntimeException {
    private zzpg(String str, String str2) {
        super(str);
    }

    public static zzpg zza(String str, String str2, int i) {
        return new zzpg(zze(str, str2, i, i + 1), str2);
    }

    public static zzpg zzb(String str, String str2) {
        return new zzpg(str, str2);
    }

    public static zzpg zzc(String str, String str2, int i, int i2) {
        return new zzpg(zze(str, str2, i, i2), str2);
    }

    public static zzpg zzd(String str, String str2, int i) {
        return new zzpg(zze(str, str2, i, -1), str2);
    }

    private static String zze(String str, String str2, int i, int i2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append((CharSequence) str2, i - 5, i);
        } else {
            sb.append((CharSequence) str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i2));
        sb.append(']');
        if (str2.length() - i2 > 8) {
            sb.append((CharSequence) str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append((CharSequence) str2, i2, str2.length());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
