package p204p;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes11.dex */
public final class lfa1 extends UploadDataProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132880a;

    /* JADX INFO: renamed from: b */
    public final Object f132881b;

    public /* synthetic */ lfa1(Object obj, int i) {
        this.f132880a = i;
        this.f132881b = obj;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f132880a) {
            case 1:
                ((UploadDataProvider) this.f132881b).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        switch (this.f132880a) {
            case 0:
                return ((ByteBuffer) this.f132881b).limit();
            default:
                return ((UploadDataProvider) this.f132881b).getLength();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        switch (this.f132880a) {
            case 0:
                ByteBuffer byteBuffer2 = (ByteBuffer) this.f132881b;
                if (!byteBuffer.hasRemaining()) {
                    throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
                }
                if (byteBuffer.remaining() >= byteBuffer2.remaining()) {
                    byteBuffer.put(byteBuffer2);
                } else {
                    int iLimit = byteBuffer2.limit();
                    byteBuffer.put(byteBuffer2);
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            default:
                ((UploadDataProvider) this.f132881b).read(uploadDataSink, byteBuffer);
                return;
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        switch (this.f132880a) {
            case 0:
                uploadDataSink.onRewindSucceeded();
                break;
            default:
                ((UploadDataProvider) this.f132881b).rewind(uploadDataSink);
                break;
        }
    }
}
