package p196j$.time;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p196j$.time.temporal.AbstractC1608q;
import p196j$.time.temporal.C1609r;
import p196j$.time.temporal.EnumC1592a;
import p196j$.time.temporal.InterfaceC1603l;
import p196j$.time.temporal.InterfaceC1604m;
import p196j$.time.temporal.InterfaceC1607p;
import p196j$.time.temporal.Temporal;
import p196j$.time.zone.ZoneRules;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class ZoneOffset extends ZoneId implements InterfaceC1603l, InterfaceC1604m, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: b */
    public final int f10625b;

    /* JADX INFO: renamed from: c */
    public final transient String f10626c;

    /* JADX INFO: renamed from: d */
    public static final ConcurrentMap f10621d = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: e */
    public static final ConcurrentMap f10622e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = m23978d0(0);

    /* JADX INFO: renamed from: f */
    public static final ZoneOffset f10623f = m23978d0(-64800);

    /* JADX INFO: renamed from: g */
    public static final ZoneOffset f10624g = m23978d0(64800);

    public ZoneOffset(int i) {
        String string;
        this.f10625b = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = iAbs / 3600;
            int i3 = (iAbs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            sb.append(i3 < 10 ? ":0" : ":");
            sb.append(i3);
            int i4 = iAbs % 60;
            if (i4 != 0) {
                sb.append(i4 < 10 ? ":0" : ":");
                sb.append(i4);
            }
            string = sb.toString();
        }
        this.f10626c = string;
    }

    /* JADX INFO: renamed from: a0 */
    public static ZoneOffset m23975a0(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporal.mo23841b(AbstractC1608q.f10837d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new C1512b("Unable to obtain ZoneOffset from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX INFO: renamed from: b0 */
    public static ZoneOffset m23976b0(String str) {
        int iM23979e0;
        int iM23979e1;
        int iM23979e2;
        char cCharAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) ((ConcurrentHashMap) f10622e).get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                if (length == 5) {
                    iM23979e0 = m23979e0(str, 1, false);
                    iM23979e1 = m23979e0(str, 3, false);
                } else if (length == 6) {
                    iM23979e0 = m23979e0(str, 1, false);
                    iM23979e1 = m23979e0(str, 4, true);
                } else if (length == 7) {
                    iM23979e0 = m23979e0(str, 1, false);
                    iM23979e1 = m23979e0(str, 3, false);
                    iM23979e2 = m23979e0(str, 5, false);
                } else {
                    if (length != 9) {
                        throw new C1512b("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                    }
                    iM23979e0 = m23979e0(str, 1, false);
                    iM23979e1 = m23979e0(str, 4, true);
                    iM23979e2 = m23979e0(str, 7, true);
                }
                iM23979e2 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt != '+' || cCharAt == '-') {
                return cCharAt == '-' ? m23977c0(-iM23979e0, -iM23979e1, -iM23979e2) : m23977c0(iM23979e0, iM23979e1, iM23979e2);
            }
            throw new C1512b("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
        }
        str = str.charAt(0) + "0" + str.charAt(1);
        iM23979e0 = m23979e0(str, 1, false);
        iM23979e1 = 0;
        iM23979e2 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt != '+') {
        }
        if (cCharAt == '-') {
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static ZoneOffset m23977c0(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new C1512b("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new C1512b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new C1512b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new C1512b("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new C1512b("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        }
        if (i3 < -59 || i3 > 59) {
            throw new C1512b("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) == 18 && (i2 | i3) != 0) {
            throw new C1512b("Zone offset not in valid range: -18:00 to +18:00");
        }
        return m23978d0((i2 * 60) + (i * 3600) + i3);
    }

    /* JADX INFO: renamed from: d0 */
    public static ZoneOffset m23978d0(int i) {
        if (i < -64800 || i > 64800) {
            throw new C1512b("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 != 0) {
            return new ZoneOffset(i);
        }
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentMap concurrentMap = f10621d;
        ZoneOffset zoneOffset = (ZoneOffset) concurrentMap.get(numValueOf);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        concurrentMap.putIfAbsent(numValueOf, new ZoneOffset(i));
        ZoneOffset zoneOffset2 = (ZoneOffset) concurrentMap.get(numValueOf);
        f10622e.putIfAbsent(zoneOffset2.f10626c, zoneOffset2);
        return zoneOffset2;
    }

    /* JADX INFO: renamed from: e0 */
    public static int m23979e0(CharSequence charSequence, int i, boolean z) {
        if (z) {
            String str = (String) charSequence;
            if (str.charAt(i - 1) != ':') {
                throw new C1512b("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i);
        char cCharAt2 = str2.charAt(i + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new C1512b("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    /* JADX INFO: renamed from: f0 */
    public static ZoneOffset m23980f0(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? m23978d0(dataInput.readInt()) : m23978d0(b * 900);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1611u((byte) 8, this);
    }

    @Override // p196j$.time.ZoneId
    /* JADX INFO: renamed from: Z */
    public final void mo23973Z(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        m23981g0(dataOutput);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    public final Object mo23841b(C1580i c1580i) {
        return (c1580i == AbstractC1608q.f10837d || c1580i == AbstractC1608q.f10838e) ? this : super.mo23841b(c1580i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f10625b - this.f10625b;
    }

    @Override // p196j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.f10625b == ((ZoneOffset) obj).f10625b;
    }

    @Override // p196j$.time.temporal.InterfaceC1604m
    /* JADX INFO: renamed from: f */
    public final Temporal mo23951f(Temporal temporal) {
        return temporal.mo23948c(this.f10625b, EnumC1592a.OFFSET_SECONDS);
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: g */
    public final int mo23952g(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p == EnumC1592a.OFFSET_SECONDS) {
            return this.f10625b;
        }
        if (interfaceC1607p == null) {
            return super.mo23920j(interfaceC1607p).m24175a(mo23843i(interfaceC1607p), interfaceC1607p);
        }
        throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
    }

    /* JADX INFO: renamed from: g0 */
    public final void m23981g0(DataOutput dataOutput) throws IOException {
        int i = this.f10625b;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    @Override // p196j$.time.ZoneId
    public final ZoneRules getRules() {
        return new ZoneRules(this);
    }

    public int getTotalSeconds() {
        return this.f10625b;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    public final boolean mo23842h(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p instanceof EnumC1592a) {
            return interfaceC1607p == EnumC1592a.OFFSET_SECONDS;
        }
        return interfaceC1607p != null && interfaceC1607p.mo24167r(this);
    }

    @Override // p196j$.time.ZoneId
    public final int hashCode() {
        return this.f10625b;
    }

    @Override // p196j$.time.temporal.InterfaceC1603l
    /* JADX INFO: renamed from: i */
    public final long mo23843i(InterfaceC1607p interfaceC1607p) {
        if (interfaceC1607p == EnumC1592a.OFFSET_SECONDS) {
            return this.f10625b;
        }
        if (interfaceC1607p instanceof EnumC1592a) {
            throw new C1609r(AbstractC1513c.m23991a("Unsupported field: ", interfaceC1607p));
        }
        return interfaceC1607p.mo24163T(this);
    }

    @Override // p196j$.time.ZoneId
    /* JADX INFO: renamed from: o */
    public final String mo23974o() {
        return this.f10626c;
    }

    @Override // p196j$.time.ZoneId
    public final String toString() {
        return this.f10626c;
    }
}
