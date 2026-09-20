package com.google.android.gms.internal.meet_coactivities;

import java.io.InputStream;
import java.io.OutputStream;
import p196j$.p198io.DesugarInputStream;
import p196j$.p198io.InputStreamRetargetInterface;

/* JADX INFO: loaded from: classes4.dex */
final class zzadj extends InputStream implements InputStreamRetargetInterface {
    @Override // java.io.InputStream
    public final int available() {
        throw null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw null;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        throw null;
    }

    @Override // java.io.InputStream
    public final int read() {
        throw null;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw null;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        throw null;
    }

    public final String toString() {
        throw null;
    }

    @Override // java.io.InputStream, p196j$.p198io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        throw null;
    }
}
