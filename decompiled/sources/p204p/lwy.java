package p204p;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class lwy implements WritableByteChannel {

    /* JADX INFO: renamed from: a */
    public final FileOutputStream f137655a;

    /* JADX INFO: renamed from: b */
    public final FileChannel f137656b;

    public lwy(FileOutputStream fileOutputStream) {
        this.f137655a = fileOutputStream;
        this.f137656b = fileOutputStream.getChannel();
    }

    /* JADX INFO: renamed from: a */
    public final void m60130a(long j) throws IOException {
        this.f137656b.position(j);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f137655a.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f137656b.isOpen();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.f137656b.write(byteBuffer);
    }
}
