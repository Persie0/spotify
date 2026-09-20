package p204p;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class et4 extends UploadDataProvider {

    /* JADX INFO: renamed from: a */
    public final org.chromium.net.UploadDataProvider f62615a;

    public et4(org.chromium.net.UploadDataProvider uploadDataProvider) {
        Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
        this.f62615a = uploadDataProvider;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f62615a.close();
    }

    public final long getLength() {
        return this.f62615a.getLength();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        this.f62615a.read(new ft4(uploadDataSink), byteBuffer);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.f62615a.rewind(new ft4(uploadDataSink));
    }
}
