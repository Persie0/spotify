package p204p;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class ahx extends FilterOutputStream {

    /* JADX INFO: renamed from: a */
    public final OutputStream f15814a;

    /* JADX INFO: renamed from: b */
    public ByteOrder f15815b;

    public ahx(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f15814a = outputStream;
        this.f15815b = byteOrder;
    }

    /* JADX INFO: renamed from: a */
    public final void m26001a(ByteOrder byteOrder) {
        this.f15815b = byteOrder;
    }

    /* JADX INFO: renamed from: c */
    public final void m26002c(int i) throws IOException {
        this.f15814a.write(i);
    }

    /* JADX INFO: renamed from: e */
    public final void m26003e(int i) throws IOException {
        ByteOrder byteOrder = this.f15815b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f15814a;
        if (byteOrder == byteOrder2) {
            outputStream.write(i & 255);
            outputStream.write((i >>> 8) & 255);
            outputStream.write((i >>> 16) & 255);
            outputStream.write((i >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((i >>> 24) & 255);
            outputStream.write((i >>> 16) & 255);
            outputStream.write((i >>> 8) & 255);
            outputStream.write(i & 255);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m26004f(short s) throws IOException {
        ByteOrder byteOrder = this.f15815b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f15814a;
        if (byteOrder == byteOrder2) {
            outputStream.write(s & 255);
            outputStream.write((s >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((s >>> 8) & 255);
            outputStream.write(s & 255);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m26005g(long j) throws IOException {
        m26003e((int) j);
    }

    /* JADX INFO: renamed from: h */
    public final void m26006h(int i) throws IOException {
        m26004f((short) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f15814a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f15814a.write(bArr, i, i2);
    }
}
