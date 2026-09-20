package p196j$.time.zone;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p196j$.time.LocalDateTime;
import p196j$.time.ZoneOffset;

/* JADX INFO: renamed from: j$.time.zone.b */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1618b implements Comparable, Serializable {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f10873e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a */
    public final long f10874a;

    /* JADX INFO: renamed from: b */
    public final LocalDateTime f10875b;

    /* JADX INFO: renamed from: c */
    public final ZoneOffset f10876c;

    /* JADX INFO: renamed from: d */
    public final ZoneOffset f10877d;

    public C1618b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f10874a = localDateTime.toEpochSecond(zoneOffset);
        this.f10875b = localDateTime;
        this.f10876c = zoneOffset;
        this.f10877d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1617a((byte) 2, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f10874a, ((C1618b) obj).f10874a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1618b) {
            C1618b c1618b = (C1618b) obj;
            if (this.f10874a == c1618b.f10874a && this.f10876c.equals(c1618b.f10876c) && this.f10877d.equals(c1618b.f10877d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10875b.hashCode() ^ this.f10876c.f10625b) ^ Integer.rotateLeft(this.f10877d.f10625b, 16);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m24204r() {
        return this.f10877d.getTotalSeconds() > this.f10876c.getTotalSeconds();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(m24204r() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f10875b);
        sb.append(this.f10876c);
        sb.append(" to ");
        sb.append(this.f10877d);
        sb.append(']');
        return sb.toString();
    }

    public C1618b(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f10874a = j;
        this.f10875b = LocalDateTime.m23956Z(j, 0, zoneOffset);
        this.f10876c = zoneOffset;
        this.f10877d = zoneOffset2;
    }
}
