package p204p;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class nw40 implements ReadableByteChannel {

    /* JADX INFO: renamed from: a */
    public final InputStream f159015a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f159016b = new AtomicBoolean(true);

    public nw40(InputStream inputStream) {
        this.f159015a = inputStream;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f159016b.compareAndSet(true, false)) {
            this.f159015a.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f159016b.get();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        boolean zHasArray = byteBuffer.hasArray();
        InputStream inputStream = this.f159015a;
        if (!zHasArray) {
            byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(inputStream.available(), 4096), byteBuffer.remaining()))];
            int i = inputStream.read(bArr);
            if (i > 0) {
                byteBuffer.put(bArr, 0, i);
            }
            return i;
        }
        int i2 = inputStream.read(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        if (i2 > 0) {
        }
        return i2;
    }
}
