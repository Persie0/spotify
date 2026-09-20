package p196j$.time.zone;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;
import p196j$.time.C1579h;
import p196j$.time.C1583l;
import p196j$.time.EnumC1550d;
import p196j$.time.EnumC1585n;
import p196j$.time.Instant;
import p196j$.time.LocalDateTime;
import p196j$.time.ZoneOffset;
import p196j$.time.chrono.C1542s;
import p196j$.time.temporal.C1605n;
import p196j$.time.temporal.EnumC1592a;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class ZoneRules implements Serializable {

    /* JADX INFO: renamed from: i */
    public static final long[] f10859i = new long[0];

    /* JADX INFO: renamed from: j */
    public static final C1621e[] f10860j = new C1621e[0];

    /* JADX INFO: renamed from: k */
    public static final LocalDateTime[] f10861k = new LocalDateTime[0];

    /* JADX INFO: renamed from: l */
    public static final C1618b[] f10862l = new C1618b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a */
    public final long[] f10863a;

    /* JADX INFO: renamed from: b */
    public final ZoneOffset[] f10864b;

    /* JADX INFO: renamed from: c */
    public final long[] f10865c;

    /* JADX INFO: renamed from: d */
    public final LocalDateTime[] f10866d;

    /* JADX INFO: renamed from: e */
    public final ZoneOffset[] f10867e;

    /* JADX INFO: renamed from: f */
    public final C1621e[] f10868f;

    /* JADX INFO: renamed from: g */
    public final TimeZone f10869g;

    /* JADX INFO: renamed from: h */
    public final transient ConcurrentMap f10870h = new ConcurrentHashMap();

    public ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, C1621e[] c1621eArr) {
        this.f10863a = jArr;
        this.f10864b = zoneOffsetArr;
        this.f10865c = jArr2;
        this.f10867e = zoneOffsetArr2;
        this.f10868f = c1621eArr;
        if (jArr2.length == 0) {
            this.f10866d = f10861k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < jArr2.length) {
                int i2 = i + 1;
                C1618b c1618b = new C1618b(jArr2[i], zoneOffsetArr2[i], zoneOffsetArr2[i2]);
                if (c1618b.m24204r()) {
                    arrayList.add(c1618b.f10875b);
                    arrayList.add(c1618b.f10875b.m23961b0(c1618b.f10877d.getTotalSeconds() - c1618b.f10876c.getTotalSeconds()));
                } else {
                    arrayList.add(c1618b.f10875b.m23961b0(c1618b.f10877d.getTotalSeconds() - c1618b.f10876c.getTotalSeconds()));
                    arrayList.add(c1618b.f10875b);
                }
                i = i2;
            }
            this.f10866d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f10869g = null;
    }

    /* JADX INFO: renamed from: a */
    public static Object m24192a(LocalDateTime localDateTime, C1618b c1618b) {
        LocalDateTime localDateTime2 = c1618b.f10875b;
        if (c1618b.m24204r()) {
            if (localDateTime.m23958K(localDateTime2)) {
                return c1618b.f10876c;
            }
            if (!localDateTime.m23958K(c1618b.f10875b.m23961b0(c1618b.f10877d.getTotalSeconds() - c1618b.f10876c.getTotalSeconds()))) {
                return c1618b.f10877d;
            }
        } else {
            if (!localDateTime.m23958K(localDateTime2)) {
                return c1618b.f10877d;
            }
            if (localDateTime.m23958K(c1618b.f10875b.m23961b0(c1618b.f10877d.getTotalSeconds() - c1618b.f10876c.getTotalSeconds()))) {
                return c1618b.f10876c;
            }
        }
        return c1618b;
    }

    /* JADX INFO: renamed from: c */
    public static int m24193c(long j, ZoneOffset zoneOffset) {
        return C1579h.m24114i0(Math.floorDiv(j + ((long) zoneOffset.getTotalSeconds()), 86400)).f10781a;
    }

    /* JADX INFO: renamed from: h */
    public static ZoneOffset m24194h(int i) {
        return ZoneOffset.m23978d0(i / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1617a(this.f10869g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX INFO: renamed from: b */
    public final C1618b[] m24195b(int i) {
        C1579h c1579hM24110E;
        C1618b[] c1618bArr = f10862l;
        Integer numValueOf = Integer.valueOf(i);
        C1618b[] c1618bArr2 = (C1618b[]) ((ConcurrentHashMap) this.f10870h).get(numValueOf);
        if (c1618bArr2 != null) {
            return c1618bArr2;
        }
        long j = 1;
        int i2 = 0;
        int i3 = 1;
        if (this.f10869g != null) {
            if (i < 1800) {
                return c1618bArr;
            }
            LocalDateTime localDateTime = LocalDateTime.f10613c;
            C1579h c1579hM24113h0 = C1579h.m24113h0(i - 1, 12, 31);
            EnumC1592a.HOUR_OF_DAY.m24165a0(0);
            long epochSecond = new LocalDateTime(c1579hM24113h0, C1583l.f10791h[0]).toEpochSecond(this.f10864b[0]);
            long j2 = 1000;
            int offset = this.f10869g.getOffset(epochSecond * 1000);
            long j3 = 31968000 + epochSecond;
            while (epochSecond < j3) {
                long j4 = epochSecond + 7776000;
                long j5 = j2;
                if (offset != this.f10869g.getOffset(j4 * j5)) {
                    while (j4 - epochSecond > j) {
                        long jFloorDiv = Math.floorDiv(j4 + epochSecond, 2L);
                        if (this.f10869g.getOffset(jFloorDiv * j5) == offset) {
                            epochSecond = jFloorDiv;
                        } else {
                            j4 = jFloorDiv;
                        }
                        j = 1;
                    }
                    if (this.f10869g.getOffset(epochSecond * j5) == offset) {
                        epochSecond = j4;
                    }
                    ZoneOffset zoneOffsetM24194h = m24194h(offset);
                    int offset2 = this.f10869g.getOffset(epochSecond * j5);
                    ZoneOffset zoneOffsetM24194h2 = m24194h(offset2);
                    if (m24193c(epochSecond, zoneOffsetM24194h2) == i) {
                        c1618bArr = (C1618b[]) Arrays.copyOf(c1618bArr, c1618bArr.length + 1);
                        c1618bArr[c1618bArr.length - 1] = new C1618b(epochSecond, zoneOffsetM24194h, zoneOffsetM24194h2);
                    }
                    offset = offset2;
                } else {
                    epochSecond = j4;
                }
                j2 = j5;
                j = 1;
            }
            if (1916 <= i && i < 2100) {
                ((ConcurrentHashMap) this.f10870h).putIfAbsent(numValueOf, c1618bArr);
            }
            return c1618bArr;
        }
        C1621e[] c1621eArr = this.f10868f;
        C1618b[] c1618bArr3 = new C1618b[c1621eArr.length];
        int i4 = 0;
        while (i4 < c1621eArr.length) {
            C1621e c1621e = c1621eArr[i4];
            byte b = c1621e.f10881b;
            if (b < 0) {
                EnumC1585n enumC1585n = c1621e.f10880a;
                long j6 = i;
                C1542s.f10679c.getClass();
                int iM24153E = enumC1585n.m24153E(C1542s.m24053b0(j6)) + 1 + c1621e.f10881b;
                C1579h c1579h = C1579h.f10779d;
                EnumC1592a.YEAR.m24165a0(j6);
                EnumC1592a.DAY_OF_MONTH.m24165a0(iM24153E);
                c1579hM24110E = C1579h.m24110E(i, enumC1585n.getValue(), iM24153E);
                EnumC1550d enumC1550d = c1621e.f10882c;
                if (enumC1550d != null) {
                    c1579hM24110E = c1579hM24110E.mo23949d(new C1605n(enumC1550d.getValue(), i3));
                }
            } else {
                EnumC1585n enumC1585n2 = c1621e.f10880a;
                C1579h c1579h2 = C1579h.f10779d;
                EnumC1592a.YEAR.m24165a0(i);
                EnumC1592a.DAY_OF_MONTH.m24165a0(b);
                c1579hM24110E = C1579h.m24110E(i, enumC1585n2.getValue(), b);
                EnumC1550d enumC1550d2 = c1621e.f10882c;
                if (enumC1550d2 != null) {
                    c1579hM24110E = c1579hM24110E.mo23949d(new C1605n(enumC1550d2.getValue(), i2));
                }
            }
            if (c1621e.f10884e) {
                c1579hM24110E = c1579hM24110E.m24126l0(1L);
            }
            LocalDateTime localDateTimeM23955T = LocalDateTime.m23955T(c1579hM24110E, c1621e.f10883d);
            EnumC1620d enumC1620d = c1621e.f10885f;
            ZoneOffset zoneOffset = c1621e.f10886g;
            ZoneOffset zoneOffset2 = c1621e.f10887h;
            int i5 = AbstractC1619c.f10878a[enumC1620d.ordinal()];
            if (i5 == 1) {
                localDateTimeM23955T = localDateTimeM23955T.m23961b0(zoneOffset2.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
            } else if (i5 == 2) {
                localDateTimeM23955T = localDateTimeM23955T.m23961b0(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds());
            }
            c1618bArr3[i4] = new C1618b(localDateTimeM23955T, c1621e.f10887h, c1621e.f10888i);
            i4++;
            i2 = 0;
        }
        if (i < 2100) {
            ((ConcurrentHashMap) this.f10870h).putIfAbsent(numValueOf, c1618bArr3);
        }
        return c1618bArr3;
    }

    /* JADX INFO: renamed from: d */
    public final ZoneOffset m24196d(Instant instant) {
        TimeZone timeZone = this.f10869g;
        if (timeZone != null) {
            return m24194h(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f10865c;
        if (jArr.length == 0) {
            return this.f10864b[0];
        }
        long j = instant.f10611a;
        if (this.f10868f.length <= 0 || j <= jArr[jArr.length - 1]) {
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return this.f10867e[iBinarySearch + 1];
        }
        ZoneOffset[] zoneOffsetArr = this.f10867e;
        C1618b[] c1618bArrM24195b = m24195b(m24193c(j, zoneOffsetArr[zoneOffsetArr.length - 1]));
        C1618b c1618b = null;
        for (int i = 0; i < c1618bArrM24195b.length; i++) {
            c1618b = c1618bArrM24195b[i];
            if (j < c1618b.f10874a) {
                return c1618b.f10876c;
            }
        }
        return c1618b.f10877d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r8.m23965r(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r8.f10616b.m24146h0() <= r0.f10616b.m24146h0()) goto L44;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m24197e(LocalDateTime localDateTime) {
        Object obj = null;
        int i = 0;
        if (this.f10869g != null) {
            C1618b[] c1618bArrM24195b = m24195b(localDateTime.f10615a.f10781a);
            if (c1618bArrM24195b.length == 0) {
                return m24194h(this.f10869g.getOffset(localDateTime.toEpochSecond(this.f10864b[0]) * 1000));
            }
            int length = c1618bArrM24195b.length;
            while (i < length) {
                C1618b c1618b = c1618bArrM24195b[i];
                Object objM24192a = m24192a(localDateTime, c1618b);
                if ((objM24192a instanceof C1618b) || objM24192a.equals(c1618b.f10876c)) {
                    return objM24192a;
                }
                i++;
                obj = objM24192a;
            }
            return obj;
        }
        if (this.f10865c.length == 0) {
            return this.f10864b[0];
        }
        if (this.f10868f.length > 0) {
            LocalDateTime[] localDateTimeArr = this.f10866d;
            LocalDateTime localDateTime2 = localDateTimeArr[localDateTimeArr.length - 1];
            if (localDateTime2 == null) {
                long jMo24011M = localDateTime.f10615a.mo24011M();
                long jMo24011M2 = localDateTime2.f10615a.mo24011M();
                if (jMo24011M <= jMo24011M2) {
                    if (jMo24011M == jMo24011M2) {
                    }
                }
                C1618b[] c1618bArrM24195b2 = m24195b(localDateTime.f10615a.f10781a);
                int length2 = c1618bArrM24195b2.length;
                while (i < length2) {
                    C1618b c1618b2 = c1618bArrM24195b2[i];
                    Object objM24192a2 = m24192a(localDateTime, c1618b2);
                    if ((objM24192a2 instanceof C1618b) || objM24192a2.equals(c1618b2.f10876c)) {
                        return objM24192a2;
                    }
                    i++;
                    obj = objM24192a2;
                }
                return obj;
            }
            localDateTime.getClass();
        }
        int iBinarySearch = Arrays.binarySearch(this.f10866d, localDateTime);
        if (iBinarySearch == -1) {
            return this.f10867e[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else {
            Object[] objArr = this.f10866d;
            if (iBinarySearch < objArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (objArr[iBinarySearch].equals(objArr[i2])) {
                    iBinarySearch = i2;
                }
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return this.f10867e[(iBinarySearch / 2) + 1];
        }
        LocalDateTime[] localDateTimeArr2 = this.f10866d;
        LocalDateTime localDateTime3 = localDateTimeArr2[iBinarySearch];
        LocalDateTime localDateTime4 = localDateTimeArr2[iBinarySearch + 1];
        ZoneOffset[] zoneOffsetArr = this.f10867e;
        int i3 = iBinarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr[i3];
        ZoneOffset zoneOffset2 = zoneOffsetArr[i3 + 1];
        return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? new C1618b(localDateTime3, zoneOffset, zoneOffset2) : new C1618b(localDateTime4, zoneOffset, zoneOffset2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneRules) {
            ZoneRules zoneRules = (ZoneRules) obj;
            if (Objects.equals(this.f10869g, zoneRules.f10869g) && Arrays.equals(this.f10863a, zoneRules.f10863a) && Arrays.equals(this.f10864b, zoneRules.f10864b) && Arrays.equals(this.f10865c, zoneRules.f10865c) && Arrays.equals(this.f10867e, zoneRules.f10867e) && Arrays.equals(this.f10868f, zoneRules.f10868f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final List m24198f(LocalDateTime localDateTime) {
        Object objM24197e = m24197e(localDateTime);
        if (!(objM24197e instanceof C1618b)) {
            return Collections.singletonList((ZoneOffset) objM24197e);
        }
        C1618b c1618b = (C1618b) objM24197e;
        return c1618b.m24204r() ? Collections.EMPTY_LIST : AbstractC1419g.m23830m(new Object[]{c1618b.f10876c, c1618b.f10877d});
    }

    /* JADX INFO: renamed from: g */
    public final boolean m24199g(Instant instant) {
        ZoneOffset zoneOffsetM24194h;
        TimeZone timeZone = this.f10869g;
        if (timeZone != null) {
            zoneOffsetM24194h = m24194h(timeZone.getRawOffset());
        } else if (this.f10865c.length == 0) {
            zoneOffsetM24194h = this.f10864b[0];
        } else {
            int iBinarySearch = Arrays.binarySearch(this.f10863a, instant.f10611a);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            zoneOffsetM24194h = this.f10864b[iBinarySearch + 1];
        }
        return !zoneOffsetM24194h.equals(m24196d(instant));
    }

    public ZoneOffset getOffset(LocalDateTime localDateTime) {
        Object objM24197e = m24197e(localDateTime);
        return objM24197e instanceof C1618b ? ((C1618b) objM24197e).f10876c : (ZoneOffset) objM24197e;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f10869g) ^ Arrays.hashCode(this.f10863a)) ^ Arrays.hashCode(this.f10864b)) ^ Arrays.hashCode(this.f10865c)) ^ Arrays.hashCode(this.f10867e)) ^ Arrays.hashCode(this.f10868f);
    }

    public final String toString() {
        TimeZone timeZone = this.f10869g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        ZoneOffset[] zoneOffsetArr = this.f10864b;
        return "ZoneRules[currentStandardOffset=" + zoneOffsetArr[zoneOffsetArr.length - 1] + "]";
    }

    public ZoneRules(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f10864b = zoneOffsetArr;
        long[] jArr = f10859i;
        this.f10863a = jArr;
        this.f10865c = jArr;
        this.f10866d = f10861k;
        this.f10867e = zoneOffsetArr;
        this.f10868f = f10860j;
        this.f10869g = null;
    }

    public ZoneRules(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {m24194h(timeZone.getRawOffset())};
        this.f10864b = zoneOffsetArr;
        long[] jArr = f10859i;
        this.f10863a = jArr;
        this.f10865c = jArr;
        this.f10866d = f10861k;
        this.f10867e = zoneOffsetArr;
        this.f10868f = f10860j;
        this.f10869g = timeZone;
    }
}
