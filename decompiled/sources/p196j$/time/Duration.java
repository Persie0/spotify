package p196j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import p196j$.time.temporal.C1609r;
import p196j$.time.temporal.ChronoUnit;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1606o;
import p196j$.time.temporal.Temporal;
import p196j$.time.temporal.TemporalUnit;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class Duration implements InterfaceC1606o, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);

    /* JADX INFO: renamed from: c */
    public static final BigInteger f10605c = BigInteger.valueOf(1000000000);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a */
    public final long f10606a;

    /* JADX INFO: renamed from: b */
    public final int f10607b;

    public Duration(long j, int i) {
        this.f10606a = j;
        this.f10607b = i;
    }

    /* JADX INFO: renamed from: E */
    public static Duration m23936E(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new Duration(j, i);
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return ofNanos(temporal.mo23953l(temporal2, ChronoUnit.NANOS));
        } catch (C1512b | ArithmeticException unused) {
            long jMo23953l = temporal.mo23953l(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                EnumC1592a enumC1592a = EnumC1592a.NANO_OF_SECOND;
                long jMo23843i = temporal2.mo23843i(enumC1592a) - temporal.mo23843i(enumC1592a);
                if (jMo23953l > 0 && jMo23843i < 0) {
                    jMo23953l++;
                } else if (jMo23953l < 0 && jMo23843i > 0) {
                    jMo23953l--;
                }
                j = jMo23843i;
            } catch (C1512b unused2) {
            }
            return ofSeconds(jMo23953l, j);
        }
    }

    /* JADX INFO: renamed from: of */
    public static Duration m23937of(long j, TemporalUnit temporalUnit) {
        Duration duration = ZERO;
        duration.getClass();
        Objects.requireNonNull(temporalUnit, "unit");
        if (temporalUnit == ChronoUnit.DAYS) {
            return duration.m23939T(Math.multiplyExact(j, 86400), 0L);
        }
        if (temporalUnit.isDurationEstimated()) {
            throw new C1609r("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return duration;
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            Duration durationM23938K = temporalUnit.getDuration().m23938K(j);
            return duration.m23939T(durationM23938K.getSeconds(), 0L).m23939T(0L, durationM23938K.getNano());
        }
        int i = AbstractC1551e.f10697a[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return duration.m23939T(0L, j);
        }
        if (i == 2) {
            return duration.m23939T((j / 1000000000) * 1000, 0L).m23939T(0L, (j % 1000000000) * 1000);
        }
        if (i != 3) {
            return i != 4 ? duration.m23939T(Math.multiplyExact(temporalUnit.getDuration().f10606a, j), 0L) : duration.m23939T(j, 0L);
        }
        return duration.m23939T(j / 1000, (j % 1000) * 1000000);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return m23936E(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return m23936E(Math.multiplyExact(j, 60), 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return m23936E(j2, i);
    }

    public static Duration ofSeconds(long j) {
        return m23936E(j, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1611u((byte) 1, this);
    }

    /* JADX INFO: renamed from: K */
    public final Duration m23938K(long j) {
        if (j == 0) {
            return ZERO;
        }
        if (j == 1) {
            return this;
        }
        BigInteger bigIntegerExact = BigDecimal.valueOf(this.f10606a).add(BigDecimal.valueOf(this.f10607b, 9)).multiply(BigDecimal.valueOf(j)).movePointRight(9).toBigIntegerExact();
        BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(f10605c);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() <= 63) {
            return ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
    }

    /* JADX INFO: renamed from: T */
    public final Duration m23939T(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(Math.addExact(Math.addExact(this.f10606a, j), j2 / 1000000000), ((long) this.f10607b) + (j2 % 1000000000));
    }

    public Duration abs() {
        return this.f10606a < 0 ? m23938K(-1L) : this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f10606a == duration.f10606a && this.f10607b == duration.f10607b) {
                return true;
            }
        }
        return false;
    }

    public int getNano() {
        return this.f10607b;
    }

    public long getSeconds() {
        return this.f10606a;
    }

    public int hashCode() {
        long j = this.f10606a;
        return (this.f10607b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public Duration minus(Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        return seconds == Long.MIN_VALUE ? m23939T(Long.MAX_VALUE, -nano).m23939T(1L, 0L) : m23939T(-seconds, -nano);
    }

    public Duration plus(Duration duration) {
        return m23939T(duration.getSeconds(), duration.getNano());
    }

    @Override // p196j$.time.temporal.InterfaceC1606o
    /* JADX INFO: renamed from: r */
    public final Temporal mo23940r(Temporal temporal) {
        long j = this.f10606a;
        if (j != 0) {
            temporal = temporal.mo23950e(j, ChronoUnit.SECONDS);
        }
        int i = this.f10607b;
        return i != 0 ? temporal.mo23950e(i, ChronoUnit.NANOS) : temporal;
    }

    public long toMillis() {
        long j = this.f10606a;
        long j2 = this.f10607b;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j, 1000), j2 / 1000000);
    }

    public long toMinutes() {
        return this.f10606a / 60;
    }

    public long toSeconds() {
        return this.f10606a;
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.f10606a;
        if (j < 0 && this.f10607b > 0) {
            j++;
        }
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.f10607b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (this.f10606a >= 0 || this.f10607b <= 0 || i2 != 0) {
            sb.append(i2);
        } else {
            sb.append("-0");
        }
        if (this.f10607b > 0) {
            int length = sb.length();
            if (this.f10606a < 0) {
                sb.append(2000000000 - ((long) this.f10607b));
            } else {
                sb.append(((long) this.f10607b) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    public static Duration ofSeconds(long j, long j2) {
        return m23936E(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iCompare = Long.compare(this.f10606a, duration.f10606a);
        return iCompare != 0 ? iCompare : this.f10607b - duration.f10607b;
    }
}
