package p204p;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes11.dex */
public final class nfa1 extends UploadDataProvider {

    /* JADX INFO: renamed from: a */
    public volatile FileChannel f153305a;

    /* JADX INFO: renamed from: b */
    public final mfa1 f153306b;

    /* JADX INFO: renamed from: c */
    public final Object f153307c = new Object();

    public nfa1(mfa1 mfa1Var) {
        this.f153306b = mfa1Var;
    }

    /* JADX INFO: renamed from: a */
    public final FileChannel m64338a() {
        if (this.f153305a == null) {
            synchronized (this.f153307c) {
                try {
                    if (this.f153305a == null) {
                        this.f153305a = this.f153306b.mo34935c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f153305a;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.f153305a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return m64338a().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        FileChannel fileChannelM64338a = m64338a();
        int i = 0;
        while (i == 0) {
            int i2 = fileChannelM64338a.read(byteBuffer);
            if (i2 == -1) {
                break;
            } else {
                i += i2;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        m64338a().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
