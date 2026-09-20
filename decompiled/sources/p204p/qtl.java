package p204p;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes6.dex */
public final class qtl extends UploadDataProvider {

    /* JADX INFO: renamed from: a */
    public final byte[] f192407a;

    /* JADX INFO: renamed from: b */
    public int f192408b;

    public qtl(byte[] bArr) {
        this.f192407a = bArr;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.f192407a.length;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        byte[] bArr = this.f192407a;
        int iMin = Math.min(bArr.length - this.f192408b, byteBuffer.remaining());
        byteBuffer.put(bArr, this.f192408b, iMin);
        this.f192408b += iMin;
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.f192408b = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
