package p196j$.time.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p196j$.time.C1583l;
import p196j$.time.EnumC1550d;
import p196j$.time.EnumC1585n;
import p196j$.time.ZoneOffset;
import p196j$.time.temporal.EnumC1592a;

/* JADX INFO: renamed from: j$.time.zone.e */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1621e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a */
    public final EnumC1585n f10880a;

    /* JADX INFO: renamed from: b */
    public final byte f10881b;

    /* JADX INFO: renamed from: c */
    public final EnumC1550d f10882c;

    /* JADX INFO: renamed from: d */
    public final C1583l f10883d;

    /* JADX INFO: renamed from: e */
    public final boolean f10884e;

    /* JADX INFO: renamed from: f */
    public final EnumC1620d f10885f;

    /* JADX INFO: renamed from: g */
    public final ZoneOffset f10886g;

    /* JADX INFO: renamed from: h */
    public final ZoneOffset f10887h;

    /* JADX INFO: renamed from: i */
    public final ZoneOffset f10888i;

    public C1621e(EnumC1585n enumC1585n, int i, EnumC1550d enumC1550d, C1583l c1583l, boolean z, EnumC1620d enumC1620d, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f10880a = enumC1585n;
        this.f10881b = (byte) i;
        this.f10882c = enumC1550d;
        this.f10883d = c1583l;
        this.f10884e = z;
        this.f10885f = enumC1620d;
        this.f10886g = zoneOffset;
        this.f10887h = zoneOffset2;
        this.f10888i = zoneOffset3;
    }

    /* JADX INFO: renamed from: a */
    public static C1621e m24205a(DataInput dataInput) {
        C1583l c1583lM24135E;
        int totalSeconds;
        int totalSeconds2;
        int i = dataInput.readInt();
        EnumC1585n enumC1585nM24152T = EnumC1585n.m24152T(i >>> 28);
        int i2 = ((264241152 & i) >>> 22) - 32;
        int i3 = (3670016 & i) >>> 19;
        EnumC1550d enumC1550dM24061r = i3 == 0 ? null : EnumC1550d.m24061r(i3);
        int i4 = (507904 & i) >>> 14;
        EnumC1620d enumC1620d = EnumC1620d.values()[(i & 12288) >>> 12];
        int i5 = (i & 4080) >>> 4;
        int i6 = (i & 12) >>> 2;
        int i7 = i & 3;
        if (i4 == 31) {
            long j = dataInput.readInt();
            C1583l c1583l = C1583l.f10788e;
            EnumC1592a.SECOND_OF_DAY.m24165a0(j);
            int i8 = (int) (j / 3600);
            long j2 = j - ((long) (i8 * 3600));
            int i9 = (int) (j2 / 60);
            c1583lM24135E = C1583l.m24135E(i8, i9, (int) (j2 - ((long) (i9 * 60))), 0);
        } else {
            int i10 = i4 % 24;
            C1583l c1583l2 = C1583l.f10788e;
            EnumC1592a.HOUR_OF_DAY.m24165a0(i10);
            c1583lM24135E = C1583l.f10791h[i10];
        }
        ZoneOffset zoneOffsetM23978d0 = ZoneOffset.m23978d0(i5 == 255 ? dataInput.readInt() : (i5 - 128) * 900);
        if (i6 == 3) {
            totalSeconds = dataInput.readInt();
        } else {
            totalSeconds = (i6 * 1800) + zoneOffsetM23978d0.getTotalSeconds();
        }
        ZoneOffset zoneOffsetM23978d1 = ZoneOffset.m23978d0(totalSeconds);
        if (i7 == 3) {
            totalSeconds2 = dataInput.readInt();
        } else {
            totalSeconds2 = (i7 * 1800) + zoneOffsetM23978d0.getTotalSeconds();
        }
        ZoneOffset zoneOffsetM23978d2 = ZoneOffset.m23978d0(totalSeconds2);
        boolean z = i4 == 24;
        Objects.requireNonNull(enumC1585nM24152T, "month");
        Objects.requireNonNull(c1583lM24135E, "time");
        Objects.requireNonNull(enumC1620d, "timeDefnition");
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !c1583lM24135E.equals(C1583l.f10790g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (c1583lM24135E.f10795d == 0) {
            return new C1621e(enumC1585nM24152T, i2, enumC1550dM24061r, c1583lM24135E, z, enumC1620d, zoneOffsetM23978d0, zoneOffsetM23978d1, zoneOffsetM23978d2);
        }
        throw new IllegalArgumentException("Time's nano-of-second must be zero");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1617a((byte) 3, this);
    }

    /* JADX INFO: renamed from: b */
    public final void m24206b(DataOutput dataOutput) {
        byte b;
        int iM24147i0 = this.f10884e ? 86400 : this.f10883d.m24147i0();
        int totalSeconds = this.f10886g.getTotalSeconds();
        int totalSeconds2 = this.f10887h.getTotalSeconds() - totalSeconds;
        int totalSeconds3 = this.f10888i.getTotalSeconds() - totalSeconds;
        if (iM24147i0 % 3600 == 0) {
            b = this.f10884e ? (byte) 24 : this.f10883d.f10792a;
        } else {
            b = 31;
        }
        int i = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i2 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i3 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        EnumC1550d enumC1550d = this.f10882c;
        dataOutput.writeInt((this.f10880a.getValue() << 28) + ((this.f10881b + 32) << 22) + ((enumC1550d == null ? 0 : enumC1550d.getValue()) << 19) + (b << 14) + (this.f10885f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (b == 31) {
            dataOutput.writeInt(iM24147i0);
        }
        if (i == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (i2 == 3) {
            dataOutput.writeInt(this.f10887h.getTotalSeconds());
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.f10888i.getTotalSeconds());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1621e) {
            C1621e c1621e = (C1621e) obj;
            if (this.f10880a == c1621e.f10880a && this.f10881b == c1621e.f10881b && this.f10882c == c1621e.f10882c && this.f10885f == c1621e.f10885f && this.f10883d.equals(c1621e.f10883d) && this.f10884e == c1621e.f10884e && this.f10886g.equals(c1621e.f10886g) && this.f10887h.equals(c1621e.f10887h) && this.f10888i.equals(c1621e.f10888i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM24147i0 = ((this.f10883d.m24147i0() + (this.f10884e ? 1 : 0)) << 15) + (this.f10880a.ordinal() << 11) + ((this.f10881b + 32) << 5);
        EnumC1550d enumC1550d = this.f10882c;
        return ((this.f10886g.f10625b ^ (this.f10885f.ordinal() + (iM24147i0 + ((enumC1550d == null ? 7 : enumC1550d.ordinal()) << 2)))) ^ this.f10887h.f10625b) ^ this.f10888i.f10625b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.f10888i.f10625b - this.f10887h.f10625b > 0 ? "Gap " : "Overlap ");
        sb.append(this.f10887h);
        sb.append(" to ");
        sb.append(this.f10888i);
        sb.append(", ");
        EnumC1550d enumC1550d = this.f10882c;
        if (enumC1550d != null) {
            byte b = this.f10881b;
            if (b == -1) {
                sb.append(enumC1550d.name());
                sb.append(" on or before last day of ");
                sb.append(this.f10880a.name());
            } else if (b < 0) {
                sb.append(enumC1550d.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.f10881b) - 1);
                sb.append(" of ");
                sb.append(this.f10880a.name());
            } else {
                sb.append(enumC1550d.name());
                sb.append(" on or after ");
                sb.append(this.f10880a.name());
                sb.append(' ');
                sb.append((int) this.f10881b);
            }
        } else {
            sb.append(this.f10880a.name());
            sb.append(' ');
            sb.append((int) this.f10881b);
        }
        sb.append(" at ");
        sb.append(this.f10884e ? "24:00" : this.f10883d.toString());
        sb.append(" ");
        sb.append(this.f10885f);
        sb.append(", standard offset ");
        sb.append(this.f10886g);
        sb.append(']');
        return sb.toString();
    }
}
