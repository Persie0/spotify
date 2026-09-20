package p204p;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import p196j$.p198io.DesugarInputStream;
import p196j$.p198io.InputStreamRetargetInterface;

/* JADX INFO: loaded from: classes.dex */
public final class zgx extends InputStream implements DataInput, InputStreamRetargetInterface {

    /* JADX INFO: renamed from: e */
    public static final ByteOrder f282726e = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: f */
    public static final ByteOrder f282727f = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: a */
    public final DataInputStream f282728a;

    /* JADX INFO: renamed from: b */
    public ByteOrder f282729b;

    /* JADX INFO: renamed from: c */
    public final int f282730c;

    /* JADX INFO: renamed from: d */
    public int f282731d;

    public zgx(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    /* JADX INFO: renamed from: a */
    public final void m96109a(long j) throws IOException {
        int i = this.f282731d;
        if (i > j) {
            this.f282731d = 0;
            DataInputStream dataInputStream = this.f282728a;
            dataInputStream.reset();
            dataInputStream.mark(this.f282730c);
        } else {
            j -= (long) i;
        }
        int i2 = (int) j;
        if (skipBytes(i2) != i2) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f282728a.available();
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f282731d++;
        return this.f282728a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f282731d++;
        return this.f282728a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        int i = this.f282731d + 1;
        this.f282731d = i;
        if (i > this.f282730c) {
            throw new EOFException();
        }
        int i2 = this.f282728a.read();
        if (i2 >= 0) {
            return (byte) i2;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f282731d += 2;
        return this.f282728a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f282731d + i2;
        this.f282731d = i3;
        if (i3 > this.f282730c) {
            throw new EOFException();
        }
        if (this.f282728a.read(bArr, i, i2) != i2) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        int i = this.f282731d + 4;
        this.f282731d = i;
        if (i > this.f282730c) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.f282728a;
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        if ((i2 | i3 | i4 | i5) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f282729b;
        if (byteOrder == f282726e) {
            return (i5 << 24) + (i4 << 16) + (i3 << 8) + i2;
        }
        if (byteOrder == f282727f) {
            return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
        }
        throw new IOException("Invalid byte order: " + this.f282729b);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j;
        long j2;
        int i = this.f282731d + 8;
        this.f282731d = i;
        if (i > this.f282730c) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.f282728a;
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        if ((i2 | i3 | i4 | i5 | i6 | i7 | i8 | i9) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f282729b;
        if (byteOrder == f282726e) {
            j = (((long) i9) << 56) + (((long) i8) << 48) + (((long) i7) << 40) + (((long) i6) << 32) + (((long) i5) << 24) + (((long) i4) << 16) + (((long) i3) << 8);
            j2 = i2;
        } else {
            if (byteOrder != f282727f) {
                throw new IOException("Invalid byte order: " + this.f282729b);
            }
            j = (((long) i2) << 56) + (((long) i3) << 48) + (((long) i4) << 40) + (((long) i5) << 32) + (((long) i6) << 24) + (((long) i7) << 16) + (((long) i8) << 8);
            j2 = i9;
        }
        return j + j2;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        int i = this.f282731d + 2;
        this.f282731d = i;
        if (i > this.f282730c) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.f282728a;
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        if ((i2 | i3) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f282729b;
        if (byteOrder == f282726e) {
            return (short) ((i3 << 8) + i2);
        }
        if (byteOrder == f282727f) {
            return (short) ((i2 << 8) + i3);
        }
        throw new IOException("Invalid byte order: " + this.f282729b);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f282731d += 2;
        return this.f282728a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f282731d++;
        return this.f282728a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        int i = this.f282731d + 2;
        this.f282731d = i;
        if (i > this.f282730c) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.f282728a;
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        if ((i2 | i3) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f282729b;
        if (byteOrder == f282726e) {
            return (i3 << 8) + i2;
        }
        if (byteOrder == f282727f) {
            return (i2 << 8) + i3;
        }
        throw new IOException("Invalid byte order: " + this.f282729b);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        int iMin = Math.min(i, this.f282730c - this.f282731d);
        int iSkipBytes = 0;
        while (iSkipBytes < iMin) {
            iSkipBytes += this.f282728a.skipBytes(iMin - iSkipBytes);
        }
        this.f282731d += iSkipBytes;
        return iSkipBytes;
    }

    @Override // java.io.InputStream, p196j$.p198io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public zgx(InputStream inputStream, ByteOrder byteOrder) throws IOException {
        this.f282729b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f282728a = dataInputStream;
        int iAvailable = dataInputStream.available();
        this.f282730c = iAvailable;
        this.f282731d = 0;
        dataInputStream.mark(iAvailable);
        this.f282729b = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f282728a.read(bArr, i, i2);
        this.f282731d += i3;
        return i3;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        int length = this.f282731d + bArr.length;
        this.f282731d = length;
        if (length <= this.f282730c) {
            if (this.f282728a.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new EOFException();
    }

    public zgx(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }
}
