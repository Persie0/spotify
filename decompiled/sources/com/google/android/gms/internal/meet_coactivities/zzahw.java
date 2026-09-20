package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.TimeUnit;
import p204p.c95;
import p204p.dq60;

/* JADX INFO: loaded from: classes4.dex */
final class zzahw implements zzzp {
    @Override // com.google.android.gms.internal.meet_coactivities.zzzp
    public final /* bridge */ /* synthetic */ Object zza(String str) {
        c95.m31844j(str.length() > 0, "empty timeout");
        c95.m31844j(str.length() <= 9, "bad timeout format");
        long j = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j);
        }
        throw new IllegalArgumentException(dq60.m36612l("Invalid timeout unit: ", cCharAt));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzp
    public final /* bridge */ /* synthetic */ String zzb(Object obj) {
        Long l = (Long) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        }
        if (l.longValue() < 100000000) {
            return String.valueOf(l).concat("n");
        }
        if (l.longValue() < 100000000000L) {
            return timeUnit.toMicros(l.longValue()) + "u";
        }
        if (l.longValue() < 100000000000000L) {
            return timeUnit.toMillis(l.longValue()) + "m";
        }
        if (l.longValue() < 100000000000000000L) {
            return timeUnit.toSeconds(l.longValue()) + "S";
        }
        if (l.longValue() < 6000000000000000000L) {
            return timeUnit.toMinutes(l.longValue()) + "M";
        }
        return timeUnit.toHours(l.longValue()) + "H";
    }
}
