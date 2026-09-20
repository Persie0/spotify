package p196j$.nio.file.attribute;

import java.util.concurrent.TimeUnit;
import p196j$.time.Instant;
import p196j$.time.LocalDateTime;
import p196j$.time.ZoneOffset;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class FileTime implements Comparable<FileTime> {

    /* JADX INFO: renamed from: a */
    public final long f10516a;

    /* JADX INFO: renamed from: b */
    public Instant f10517b;

    /* JADX INFO: renamed from: c */
    public String f10518c;

    public FileTime(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f10516a = j;
        this.f10517b = null;
    }

    /* JADX INFO: renamed from: K */
    public static long m23906K(long j, long j2, long j3) {
        if (j > j3) {
            return Long.MAX_VALUE;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }

    /* JADX INFO: renamed from: r */
    public static void m23907r(StringBuilder sb, int i, int i2) {
        while (i > 0) {
            sb.append((char) ((i2 / i) + 48));
            i2 %= i;
            i /= 10;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final int compareTo(FileTime fileTime) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            fileTime.getClass();
            return Long.compare(this.f10516a, fileTime.f10516a);
        }
        long j = m23910Z().f10611a;
        int iCompare = Long.compare(j, fileTime.m23910Z().f10611a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Long.compare(m23910Z().f10612b, fileTime.m23910Z().f10612b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        if (j != 31556889864403199L && j != -31557014167219200L) {
            return 0;
        }
        long days = timeUnit != null ? timeUnit.toDays(this.f10516a) : TimeUnit.SECONDS.toDays(m23910Z().f10611a);
        long days2 = timeUnit != null ? timeUnit.toDays(fileTime.f10516a) : TimeUnit.SECONDS.toDays(fileTime.m23910Z().f10611a);
        return days == days2 ? Long.compare(m23909T(days), fileTime.m23909T(days2)) : Long.compare(days, days2);
    }

    /* JADX INFO: renamed from: T */
    public final long m23909T(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return timeUnit != null ? timeUnit.toNanos(this.f10516a - timeUnit.convert(j, TimeUnit.DAYS)) : TimeUnit.SECONDS.toNanos(m23910Z().f10611a - TimeUnit.DAYS.toSeconds(j));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    /* JADX WARN: Code duplicated, block: B:22:0x009f  */
    /* JADX INFO: renamed from: Z */
    public final Instant m23910Z() {
        long jM23906K;
        int iFloorMod;
        long jFloorDiv;
        if (this.f10517b == null) {
            switch (AbstractC1455s.f10535a[TimeUnit.MILLISECONDS.ordinal()]) {
                case 1:
                    jM23906K = m23906K(this.f10516a, 86400L, 106751991167300L);
                    long j = jM23906K;
                    iFloorMod = 0;
                    jFloorDiv = j;
                    if (jFloorDiv <= -31557014167219200L) {
                        this.f10517b = Instant.f10609d;
                    } else if (jFloorDiv < 31556889864403199L) {
                        this.f10517b = Instant.m23942K(jFloorDiv, iFloorMod);
                    } else {
                        this.f10517b = Instant.f10610e;
                    }
                    break;
                case 2:
                    jM23906K = m23906K(this.f10516a, 3600L, 2562047788015215L);
                    long j2 = jM23906K;
                    iFloorMod = 0;
                    jFloorDiv = j2;
                    if (jFloorDiv <= -31557014167219200L) {
                        this.f10517b = Instant.f10609d;
                    } else if (jFloorDiv < 31556889864403199L) {
                        this.f10517b = Instant.m23942K(jFloorDiv, iFloorMod);
                    } else {
                        this.f10517b = Instant.f10610e;
                    }
                    break;
                case 3:
                    jM23906K = m23906K(this.f10516a, 60L, 153722867280912930L);
                    long j3 = jM23906K;
                    iFloorMod = 0;
                    jFloorDiv = j3;
                    if (jFloorDiv <= -31557014167219200L) {
                        this.f10517b = Instant.f10609d;
                    } else if (jFloorDiv < 31556889864403199L) {
                        this.f10517b = Instant.m23942K(jFloorDiv, iFloorMod);
                    } else {
                        this.f10517b = Instant.f10610e;
                    }
                    break;
                case 4:
                    jM23906K = this.f10516a;
                    long j4 = jM23906K;
                    iFloorMod = 0;
                    jFloorDiv = j4;
                    if (jFloorDiv <= -31557014167219200L) {
                        this.f10517b = Instant.f10609d;
                    } else if (jFloorDiv < 31556889864403199L) {
                        this.f10517b = Instant.m23942K(jFloorDiv, iFloorMod);
                    } else {
                        this.f10517b = Instant.f10610e;
                    }
                    break;
                case 5:
                    jFloorDiv = Math.floorDiv(this.f10516a, 1000L);
                    iFloorMod = ((int) Math.floorMod(this.f10516a, 1000L)) * 1000000;
                    if (jFloorDiv <= -31557014167219200L) {
                        this.f10517b = Instant.f10609d;
                    } else if (jFloorDiv < 31556889864403199L) {
                        this.f10517b = Instant.m23942K(jFloorDiv, iFloorMod);
                    } else {
                        this.f10517b = Instant.f10610e;
                    }
                    break;
                case 6:
                    jFloorDiv = Math.floorDiv(this.f10516a, 1000000L);
                    iFloorMod = ((int) Math.floorMod(this.f10516a, 1000000L)) * 1000;
                    if (jFloorDiv <= -31557014167219200L) {
                        this.f10517b = Instant.f10609d;
                    } else if (jFloorDiv < 31556889864403199L) {
                        this.f10517b = Instant.m23942K(jFloorDiv, iFloorMod);
                    } else {
                        this.f10517b = Instant.f10610e;
                    }
                    break;
                case 7:
                    jFloorDiv = Math.floorDiv(this.f10516a, 1000000000L);
                    iFloorMod = (int) Math.floorMod(this.f10516a, 1000000000L);
                    if (jFloorDiv <= -31557014167219200L) {
                        this.f10517b = Instant.f10609d;
                    } else if (jFloorDiv < 31556889864403199L) {
                        this.f10517b = Instant.m23942K(jFloorDiv, iFloorMod);
                    } else {
                        this.f10517b = Instant.f10610e;
                    }
                    break;
                default:
                    throw new AssertionError("Unit not handled");
            }
        }
        return this.f10517b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof FileTime) && compareTo((FileTime) obj) == 0;
    }

    public final int hashCode() {
        return m23910Z().hashCode();
    }

    public long toMillis() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            return timeUnit.toMillis(this.f10516a);
        }
        Instant instant = this.f10517b;
        long j = instant.f10611a;
        int i = instant.f10612b;
        long j2 = j * 1000;
        if (((Math.abs(j) | 1000) >>> 31) == 0 || j2 / 1000 == j) {
            return j2 + ((long) (i / 1000000));
        }
        return j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final String toString() {
        long seconds;
        int i;
        long jFloorDiv;
        LocalDateTime localDateTimeM23956Z;
        int i2;
        if (this.f10518c == null) {
            if (this.f10517b == null) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (timeUnit.compareTo(TimeUnit.SECONDS) >= 0) {
                    seconds = timeUnit.toSeconds(this.f10516a);
                    i = 0;
                } else {
                    seconds = m23910Z().f10611a;
                    i = m23910Z().f10612b;
                }
            } else {
                seconds = m23910Z().f10611a;
                i = m23910Z().f10612b;
            }
            if (seconds >= -62167219200L) {
                long j = seconds - 253402300800L;
                jFloorDiv = Math.floorDiv(j, 315569520000L) + 1;
                localDateTimeM23956Z = LocalDateTime.m23956Z(Math.floorMod(j, 315569520000L) - 62167219200L, i, ZoneOffset.UTC);
                i2 = localDateTimeM23956Z.f10615a.f10781a;
            } else {
                long j2 = seconds + 62167219200L;
                jFloorDiv = j2 / 315569520000L;
                localDateTimeM23956Z = LocalDateTime.m23956Z((j2 % 315569520000L) - 62167219200L, i, ZoneOffset.UTC);
                i2 = localDateTimeM23956Z.f10615a.f10781a;
            }
            int i3 = (((int) jFloorDiv) * 10000) + i2;
            if (i3 <= 0) {
                i3--;
            }
            int i4 = localDateTimeM23956Z.f10616b.f10795d;
            StringBuilder sb = new StringBuilder(64);
            sb.append(i3 < 0 ? "-" : "");
            int iAbs = Math.abs(i3);
            if (iAbs < 10000) {
                m23907r(sb, 1000, Math.abs(iAbs));
            } else {
                sb.append(String.valueOf(iAbs));
            }
            sb.append('-');
            m23907r(sb, 10, localDateTimeM23956Z.f10615a.f10782b);
            sb.append('-');
            m23907r(sb, 10, localDateTimeM23956Z.f10615a.f10783c);
            sb.append('T');
            m23907r(sb, 10, localDateTimeM23956Z.f10616b.f10792a);
            sb.append(':');
            m23907r(sb, 10, localDateTimeM23956Z.f10616b.f10793b);
            sb.append(':');
            m23907r(sb, 10, localDateTimeM23956Z.f10616b.f10794c);
            if (i4 != 0) {
                sb.append('.');
                int i5 = 100000000;
                while (i4 % 10 == 0) {
                    i4 /= 10;
                    i5 /= 10;
                }
                m23907r(sb, i5, i4);
            }
            sb.append('Z');
            this.f10518c = sb.toString();
        }
        return this.f10518c;
    }
}
