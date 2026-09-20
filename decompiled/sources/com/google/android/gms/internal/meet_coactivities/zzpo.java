package com.google.android.gms.internal.meet_coactivities;

import java.math.BigDecimal;
import java.math.RoundingMode;
import p196j$.time.Duration;
import p196j$.time.temporal.ChronoUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzpo {
    static final Duration zza;
    private static final double zzb;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(Long.MIN_VALUE);
        zza = durationOfSeconds;
        zzb = durationOfSeconds.getSeconds();
        Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
        Duration.ofMillis(Long.MAX_VALUE);
        Duration.ofMillis(Long.MIN_VALUE);
        ChronoUnit chronoUnit = ChronoUnit.MICROS;
        Duration.m23937of(Long.MAX_VALUE, chronoUnit);
        Duration.m23937of(Long.MIN_VALUE, chronoUnit);
        Duration.ofNanos(Long.MAX_VALUE);
        Duration.ofNanos(Long.MIN_VALUE);
    }

    public static Duration zza(Duration duration, double d) {
        if (Double.isNaN(d)) {
            throw new ArithmeticException("Cannot multiply a duration by NaN");
        }
        if (Double.isInfinite(d)) {
            throw new ArithmeticException("result does not fit into the range of a Duration");
        }
        BigDecimal bigDecimalMultiply = BigDecimal.valueOf(duration.getSeconds()).add(BigDecimal.valueOf(duration.getNano(), 9)).multiply(new BigDecimal(d));
        if (bigDecimalMultiply.compareTo(BigDecimal.valueOf(9.223372036854776E18d)) >= 0 || bigDecimalMultiply.compareTo(BigDecimal.valueOf(zzb)) <= 0) {
            throw new ArithmeticException("result does not fit into the range of a Duration");
        }
        long jLongValue = bigDecimalMultiply.longValue();
        return Duration.ofSeconds(jLongValue, bigDecimalMultiply.subtract(BigDecimal.valueOf(jLongValue)).setScale(9, RoundingMode.HALF_EVEN).unscaledValue().longValue());
    }
}
