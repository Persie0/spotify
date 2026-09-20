package androidx.car.app.model;

import android.annotation.SuppressLint;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p196j$.time.LocalDateTime;
import p196j$.time.ZoneId;
import p196j$.time.ZoneOffset;
import p196j$.time.ZonedDateTime;
import p196j$.time.format.TextStyle;
import p204p.dq60;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class DateTimeWithZone {
    private static final long MAX_ZONE_OFFSET_SECONDS = TimeUnit.HOURS.toSeconds(1) * 18;
    private final long mTimeSinceEpochMillis;
    private final int mZoneOffsetSeconds;
    private final String mZoneShortName;

    private DateTimeWithZone() {
        this.mTimeSinceEpochMillis = 0L;
        this.mZoneOffsetSeconds = 0;
        this.mZoneShortName = null;
    }

    public static DateTimeWithZone create(long j, int i, String str) {
        if (j < 0) {
            throw new IllegalArgumentException("Time since epoch must be greater than or equal to zero");
        }
        if (Math.abs(i) > MAX_ZONE_OFFSET_SECONDS) {
            throw new IllegalArgumentException("Zone offset not in valid range: -18:00 to +18:00");
        }
        Objects.requireNonNull(str);
        if (str.isEmpty()) {
            throw new IllegalArgumentException("The time zone short name can not be null or empty");
        }
        return new DateTimeWithZone(j, i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateTimeWithZone)) {
            return false;
        }
        DateTimeWithZone dateTimeWithZone = (DateTimeWithZone) obj;
        return this.mTimeSinceEpochMillis == dateTimeWithZone.mTimeSinceEpochMillis && this.mZoneOffsetSeconds == dateTimeWithZone.mZoneOffsetSeconds && Objects.equals(this.mZoneShortName, dateTimeWithZone.mZoneShortName);
    }

    public long getTimeSinceEpochMillis() {
        return this.mTimeSinceEpochMillis;
    }

    @SuppressLint({"MethodNameUnits"})
    public int getZoneOffsetSeconds() {
        return this.mZoneOffsetSeconds;
    }

    public String getZoneShortName() {
        return this.mZoneShortName;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.mTimeSinceEpochMillis), Integer.valueOf(this.mZoneOffsetSeconds), this.mZoneShortName);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[time since epoch (ms): ");
        sb.append(this.mTimeSinceEpochMillis);
        sb.append("( ");
        sb.append(new Date(this.mTimeSinceEpochMillis));
        sb.append(")  zone offset (s): ");
        sb.append(this.mZoneOffsetSeconds);
        sb.append(", zone: ");
        return dq60.m36616p(this.mZoneShortName, "]", sb);
    }

    private DateTimeWithZone(long j, int i, String str) {
        this.mTimeSinceEpochMillis = j;
        this.mZoneOffsetSeconds = i;
        this.mZoneShortName = str;
    }

    public static DateTimeWithZone create(long j, TimeZone timeZone) {
        if (j >= 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Objects.requireNonNull(timeZone);
            return create(j, (int) timeUnit.toSeconds(timeZone.getOffset(j)), timeZone.getDisplayName(false, 0));
        }
        throw new IllegalArgumentException("timeSinceEpochMillis must be greater than or equal to zero");
    }

    public static DateTimeWithZone create(ZonedDateTime zonedDateTime) {
        Objects.requireNonNull(zonedDateTime);
        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        ZoneId zone = zonedDateTime.getZone();
        ZoneOffset offset = zone.getRules().getOffset(localDateTime);
        return create(TimeUnit.SECONDS.toMillis(localDateTime.toEpochSecond(offset)), offset.getTotalSeconds(), zone.getDisplayName(TextStyle.SHORT, Locale.getDefault()));
    }
}
