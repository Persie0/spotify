package p204p;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes3.dex */
public final class itz0 implements Externalizable {

    /* JADX INFO: renamed from: a */
    public byte f105794a;

    /* JADX INFO: renamed from: b */
    public Serializable f105795b;

    public itz0(byte b, Serializable serializable) {
        this.f105794a = b;
        this.f105795b = serializable;
    }

    /* JADX INFO: renamed from: a */
    public static long m51640a(DataInput dataInput) {
        int i = dataInput.readByte() & 255;
        if (i == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    /* JADX INFO: renamed from: b */
    public static Serializable m51641b(byte b, DataInput dataInput) throws IOException {
        if (b != 1) {
            if (b == 2) {
                return ize1.m51992h(dataInput);
            }
            if (b == 3) {
                return jze1.m54881a(dataInput);
            }
            throw new StreamCorruptedException("Unknown serialized type");
        }
        int i = dataInput.readInt();
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = m51640a(dataInput);
        }
        int i3 = i + 1;
        hze1[] hze1VarArr = new hze1[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            hze1VarArr[i4] = m51642c(dataInput);
        }
        int i5 = dataInput.readInt();
        long[] jArr2 = new long[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            jArr2[i6] = m51640a(dataInput);
        }
        int i7 = i5 + 1;
        hze1[] hze1VarArr2 = new hze1[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            hze1VarArr2[i8] = m51642c(dataInput);
        }
        int i9 = dataInput.readByte();
        jze1[] jze1VarArr = new jze1[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            jze1VarArr[i10] = jze1.m54881a(dataInput);
        }
        return new ro41(jArr, hze1VarArr, jArr2, hze1VarArr2, jze1VarArr);
    }

    /* JADX INFO: renamed from: c */
    public static hze1 m51642c(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? hze1.m49269u(dataInput.readInt()) : hze1.m49269u(b * 900);
    }

    /* JADX INFO: renamed from: d */
    public static void m51643d(long j, DataOutput dataOutput) throws IOException {
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

    /* JADX INFO: renamed from: e */
    public static void m51644e(hze1 hze1Var, DataOutput dataOutput) throws IOException {
        int i = hze1Var.f96910b;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    private Object readResolve() {
        return this.f105795b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        this.f105794a = b;
        this.f105795b = m51641b(b, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.f105794a;
        Serializable serializable = this.f105795b;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b == 2) {
                ((ize1) serializable).writeExternal(objectOutput);
                return;
            } else {
                if (b != 3) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                ((jze1) serializable).writeExternal(objectOutput);
                return;
            }
        }
        ro41 ro41Var = (ro41) serializable;
        jze1[] jze1VarArr = ro41Var.f201072f;
        long[] jArr = ro41Var.f201069c;
        long[] jArr2 = ro41Var.f201067a;
        objectOutput.writeInt(jArr2.length);
        for (long j : jArr2) {
            m51643d(j, objectOutput);
        }
        for (hze1 hze1Var : ro41Var.f201068b) {
            m51644e(hze1Var, objectOutput);
        }
        objectOutput.writeInt(jArr.length);
        for (long j2 : jArr) {
            m51643d(j2, objectOutput);
        }
        for (hze1 hze1Var2 : ro41Var.f201071e) {
            m51644e(hze1Var2, objectOutput);
        }
        objectOutput.writeByte(jze1VarArr.length);
        for (jze1 jze1Var : jze1VarArr) {
            jze1Var.writeExternal(objectOutput);
        }
    }
}
