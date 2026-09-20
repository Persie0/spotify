package com.google.android.gms.internal.meet_coactivities;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p204p.mif1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaiw {
    private static final long zza = TimeUnit.SECONDS.toNanos(1);

    public static Boolean zza(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static Double zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer zzc(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d = (Double) obj;
        int iIntValue = d.intValue();
        if (iIntValue == d.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: ".concat(String.valueOf(d)));
    }

    public static Long zzd(Map map, String str) {
        boolean z;
        int iCharAt;
        String strZze = zze(map, str);
        if (strZze == null) {
            return null;
        }
        try {
            if (strZze.isEmpty() || strZze.charAt(strZze.length() - 1) != 's') {
                throw new ParseException("Invalid duration string: ".concat(strZze), 0);
            }
            if (strZze.charAt(0) == '-') {
                strZze = strZze.substring(1);
                z = true;
            } else {
                z = false;
            }
            String strSubstring = strZze.substring(0, strZze.length() - 1);
            String strSubstring2 = "";
            int iIndexOf = strSubstring.indexOf(46);
            if (iIndexOf != -1) {
                strSubstring2 = strSubstring.substring(iIndexOf + 1);
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            long jM61874h = Long.parseLong(strSubstring);
            if (strSubstring2.isEmpty()) {
                iCharAt = 0;
            } else {
                iCharAt = 0;
                for (int i = 0; i < 9; i++) {
                    iCharAt *= 10;
                    if (i < strSubstring2.length()) {
                        if (strSubstring2.charAt(i) < '0' || strSubstring2.charAt(i) > '9') {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                        iCharAt = (strSubstring2.charAt(i) - '0') + iCharAt;
                    }
                }
            }
            if (jM61874h < 0) {
                throw new ParseException("Invalid duration string: ".concat(strZze), 0);
            }
            if (z) {
                jM61874h = -jM61874h;
                iCharAt = -iCharAt;
            }
            long j = iCharAt;
            try {
                long j2 = zza;
                if (j <= (-j2) || j >= j2) {
                    jM61874h = mif1.m61874h(jM61874h, j / j2);
                    iCharAt = (int) (j % j2);
                }
                if (jM61874h > 0 && iCharAt < 0) {
                    jM61874h--;
                    iCharAt = (int) (((long) iCharAt) + j2);
                }
                if (jM61874h < 0 && iCharAt > 0) {
                    jM61874h++;
                    iCharAt = (int) (((long) iCharAt) - j2);
                }
                if (jM61874h >= -315576000000L && jM61874h <= 315576000000L) {
                    long j3 = iCharAt;
                    if (j3 >= -999999999 && j3 < j2 && ((jM61874h >= 0 && iCharAt >= 0) || (jM61874h <= 0 && iCharAt <= 0))) {
                        long nanos = TimeUnit.SECONDS.toNanos(jM61874h);
                        long j4 = nanos + j3;
                        if (!(((j3 ^ nanos) < 0) | ((nanos ^ j4) >= 0))) {
                            j4 = ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
                        }
                        return Long.valueOf(j4);
                    }
                }
                throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + jM61874h + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + iCharAt + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
            } catch (IllegalArgumentException unused) {
                throw new ParseException("Duration value is out of range.", 0);
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static String zze(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static List zzf(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
        return list;
    }

    public static List zzg(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List zzh(Map map, String str) {
        List listZzg = zzg(map, str);
        if (listZzg == null) {
            return null;
        }
        zzf(listZzg);
        return listZzg;
    }

    public static List zzi(Map map, String str) {
        List listZzg = zzg(map, str);
        if (listZzg == null) {
            return null;
        }
        for (int i = 0; i < listZzg.size(); i++) {
            if (!(listZzg.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listZzg.get(i), Integer.valueOf(i), listZzg));
            }
        }
        return listZzg;
    }

    public static Map zzj(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }
}
