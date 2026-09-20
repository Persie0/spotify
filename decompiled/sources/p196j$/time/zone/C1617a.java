package p196j$.time.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;
import p196j$.time.ZoneOffset;

/* JADX INFO: renamed from: j$.time.zone.a */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1617a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: a */
    public byte f10871a;

    /* JADX INFO: renamed from: b */
    public Object f10872b;

    public C1617a() {
    }

    /* JADX INFO: renamed from: a */
    public static long m24200a(DataInput dataInput) {
        int i = dataInput.readByte() & 255;
        if (i == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    /* JADX INFO: renamed from: b */
    public static ZoneOffset m24201b(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? ZoneOffset.m23978d0(dataInput.readInt()) : ZoneOffset.m23978d0(b * 900);
    }

    /* JADX INFO: renamed from: c */
    public static void m24202c(long j, DataOutput dataOutput) throws IOException {
        if (j < -4575744000L || j >= 10413792000L || j % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j);
        } else {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & 255);
            dataOutput.writeByte((i >>> 8) & 255);
            dataOutput.writeByte(i & 255);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m24203d(ZoneOffset zoneOffset, DataOutput dataOutput) throws IOException {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(totalSeconds);
        }
    }

    private Object readResolve() {
        return this.f10872b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object zoneRules;
        byte b = objectInput.readByte();
        this.f10871a = b;
        if (b == 1) {
            long[] jArr = ZoneRules.f10859i;
            int i = objectInput.readInt();
            long[] jArr2 = i == 0 ? jArr : new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr2[i2] = m24200a(objectInput);
            }
            int i3 = i + 1;
            ZoneOffset[] zoneOffsetArr = new ZoneOffset[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                zoneOffsetArr[i4] = m24201b(objectInput);
            }
            int i5 = objectInput.readInt();
            if (i5 != 0) {
                jArr = new long[i5];
            }
            long[] jArr3 = jArr;
            for (int i6 = 0; i6 < i5; i6++) {
                jArr3[i6] = m24200a(objectInput);
            }
            int i7 = i5 + 1;
            ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                zoneOffsetArr2[i8] = m24201b(objectInput);
            }
            int i9 = objectInput.readByte();
            C1621e[] c1621eArr = i9 == 0 ? ZoneRules.f10860j : new C1621e[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                c1621eArr[i10] = C1621e.m24205a(objectInput);
            }
            zoneRules = new ZoneRules(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, c1621eArr);
        } else if (b == 2) {
            int i11 = C1618b.f10873e;
            long jM24200a = m24200a(objectInput);
            ZoneOffset zoneOffsetM24201b = m24201b(objectInput);
            ZoneOffset zoneOffsetM24201b2 = m24201b(objectInput);
            if (zoneOffsetM24201b.equals(zoneOffsetM24201b2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            zoneRules = new C1618b(jM24200a, zoneOffsetM24201b, zoneOffsetM24201b2);
        } else if (b == 3) {
            zoneRules = C1621e.m24205a(objectInput);
        } else {
            if (b != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            zoneRules = new ZoneRules(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f10872b = zoneRules;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.f10871a;
        Object obj = this.f10872b;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b == 2) {
                C1618b c1618b = (C1618b) obj;
                m24202c(c1618b.f10874a, objectOutput);
                m24203d(c1618b.f10876c, objectOutput);
                m24203d(c1618b.f10877d, objectOutput);
                return;
            }
            if (b == 3) {
                ((C1621e) obj).m24206b(objectOutput);
                return;
            } else {
                if (b != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((ZoneRules) obj).f10869g.getID());
                return;
            }
        }
        ZoneRules zoneRules = (ZoneRules) obj;
        objectOutput.writeInt(zoneRules.f10863a.length);
        for (long j : zoneRules.f10863a) {
            m24202c(j, objectOutput);
        }
        for (ZoneOffset zoneOffset : zoneRules.f10864b) {
            m24203d(zoneOffset, objectOutput);
        }
        objectOutput.writeInt(zoneRules.f10865c.length);
        for (long j2 : zoneRules.f10865c) {
            m24202c(j2, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : zoneRules.f10867e) {
            m24203d(zoneOffset2, objectOutput);
        }
        objectOutput.writeByte(zoneRules.f10868f.length);
        for (C1621e c1621e : zoneRules.f10868f) {
            c1621e.m24206b(objectOutput);
        }
    }

    public C1617a(byte b, Object obj) {
        this.f10871a = b;
        this.f10872b = obj;
    }
}
