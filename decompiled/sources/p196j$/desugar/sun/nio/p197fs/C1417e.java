package p196j$.desugar.sun.nio.p197fs;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import p196j$.nio.file.Path;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.e */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1417e extends FileChannel implements SeekableByteChannel {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f10476e = 0;

    /* JADX INFO: renamed from: a */
    public final FileChannel f10477a;

    /* JADX INFO: renamed from: b */
    public final boolean f10478b;

    /* JADX INFO: renamed from: c */
    public final boolean f10479c;

    /* JADX INFO: renamed from: d */
    public final Path f10480d;

    public C1417e(FileChannel fileChannel, boolean z, boolean z2, Path path) {
        this.f10477a = fileChannel;
        this.f10478b = z;
        this.f10479c = z2;
        this.f10480d = z ? path : null;
    }

    @Override // java.nio.channels.FileChannel
    public final void force(boolean z) throws IOException {
        this.f10477a.force(z);
    }

    @Override // java.nio.channels.spi.AbstractInterruptibleChannel
    public final void implCloseChannel() {
        this.f10477a.close();
        if (this.f10478b) {
            this.f10480d.toFile().delete();
        }
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock lock(long j, long j2, boolean z) throws IOException {
        FileLock fileLockLock = this.f10477a.lock(j, j2, z);
        if (fileLockLock == null) {
            return null;
        }
        return new C1418f(fileLockLock, this);
    }

    @Override // java.nio.channels.FileChannel
    public final MappedByteBuffer map(FileChannel.MapMode mapMode, long j, long j2) {
        return this.f10477a.map(mapMode, j, j2);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.f10477a.read(byteBuffer);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final long size() {
        return this.f10477a.size();
    }

    @Override // java.nio.channels.FileChannel
    public final long transferFrom(ReadableByteChannel readableByteChannel, long j, long j2) {
        return this.f10477a.transferFrom(readableByteChannel, j, j2);
    }

    @Override // java.nio.channels.FileChannel
    public final long transferTo(long j, long j2, WritableByteChannel writableByteChannel) {
        return this.f10477a.transferTo(j, j2, writableByteChannel);
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock tryLock(long j, long j2, boolean z) throws IOException {
        FileLock fileLockTryLock = this.f10477a.tryLock(j, j2, z);
        if (fileLockTryLock == null) {
            return null;
        }
        return new C1418f(fileLockTryLock, this);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (!this.f10479c) {
            return this.f10477a.write(byteBuffer);
        }
        FileChannel fileChannel = this.f10477a;
        return fileChannel.write(byteBuffer, fileChannel.size());
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final long position() {
        return this.f10477a.position();
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.ScatteringByteChannel
    public final long read(ByteBuffer[] byteBufferArr, int i, int i2) {
        return this.f10477a.read(byteBufferArr, i, i2);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final FileChannel truncate(long j) throws IOException {
        FileChannel fileChannelTruncate = this.f10477a.truncate(j);
        return fileChannelTruncate instanceof C1417e ? (C1417e) fileChannelTruncate : new C1417e(fileChannelTruncate, false, false, null);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final FileChannel position(long j) throws IOException {
        FileChannel fileChannelPosition = this.f10477a.position(j);
        if (fileChannelPosition instanceof C1417e) {
            return (C1417e) fileChannelPosition;
        }
        return new C1417e(fileChannelPosition, false, false, null);
    }

    @Override // java.nio.channels.FileChannel
    public final int read(ByteBuffer byteBuffer, long j) {
        return this.f10477a.read(byteBuffer, j);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.GatheringByteChannel
    public final long write(ByteBuffer[] byteBufferArr, int i, int i2) {
        return this.f10477a.write(byteBufferArr, i, i2);
    }

    @Override // java.nio.channels.FileChannel
    public final int write(ByteBuffer byteBuffer, long j) {
        return this.f10477a.write(byteBuffer, j);
    }
}
