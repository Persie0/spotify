package com.google.android.gms.internal.meet_coactivities;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;
import p204p.dq60;
import p204p.edb;

/* JADX INFO: loaded from: classes4.dex */
public final class zzmq {
    static final Locale zza = Locale.ROOT;

    public static String zza(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            if (!obj.getClass().isArray()) {
                String string = obj.toString();
                return string != null ? string : zzd(obj, "toString() returned null");
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            return obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : Arrays.toString((Object[]) obj);
        } catch (RuntimeException e) {
            return zze(obj, e);
        }
    }

    public static void zzb(StringBuilder sb, Number number, zzmj zzmjVar) {
        boolean zZzk = zzmjVar.zzk();
        long jLongValue = number.longValue();
        if (number instanceof Long) {
            zzf(sb, jLongValue, zZzk);
            return;
        }
        if (number instanceof Integer) {
            zzf(sb, jLongValue & 4294967295L, zZzk);
            return;
        }
        if (number instanceof Byte) {
            zzf(sb, jLongValue & 255, zZzk);
            return;
        }
        if (number instanceof Short) {
            zzf(sb, jLongValue & 65535, zZzk);
        } else {
            if (!(number instanceof BigInteger)) {
                throw new IllegalStateException("unsupported number type: ".concat(String.valueOf(number.getClass())));
            }
            String string = ((BigInteger) number).toString(16);
            if (zZzk) {
                string = string.toUpperCase(zza);
            }
            sb.append(string);
        }
    }

    public static void zzc(Formattable formattable, StringBuilder sb, zzmj zzmjVar) {
        int iZza = zzmjVar.zza();
        int i = iZza & 162;
        if (i != 0) {
            i = ((iZza & 32) != 0 ? 1 : 0) | ((iZza & 128) != 0 ? 2 : 0) | ((iZza & 2) != 0 ? 4 : 0);
        }
        int length = sb.length();
        Formatter formatter = new Formatter(sb, zza);
        try {
            formattable.formatTo(formatter, i, zzmjVar.zzc(), zzmjVar.zzb());
        } catch (RuntimeException e) {
            sb.setLength(length);
            try {
                formatter.out().append(zze(formattable, e));
            } catch (IOException unused) {
            }
        }
    }

    private static String zzd(Object obj, String str) {
        return dq60.m36616p(str, "}", edb.m38571t(System.identityHashCode(obj), "{", obj.getClass().getName(), "@", ": "));
    }

    private static String zze(Object obj, RuntimeException runtimeException) {
        String simpleName;
        try {
            simpleName = runtimeException.toString();
        } catch (RuntimeException e) {
            simpleName = e.getClass().getSimpleName();
        }
        return zzd(obj, simpleName);
    }

    private static void zzf(StringBuilder sb, long j, boolean z) {
        if (j == 0) {
            sb.append("0");
            return;
        }
        String str = true != z ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int iNumberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & (-4); iNumberOfLeadingZeros >= 0; iNumberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> iNumberOfLeadingZeros) & 15)));
        }
    }
}
