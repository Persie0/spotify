package p196j$.nio.channels;

import java.io.IOException;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.Channel;

/* JADX INFO: renamed from: j$.nio.channels.a */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1430a implements Channel {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AsynchronousFileChannel f10508a;

    public C1430a(AsynchronousFileChannel asynchronousFileChannel) {
        this.f10508a = asynchronousFileChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f10508a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AsynchronousFileChannel asynchronousFileChannel = this.f10508a;
        if (obj instanceof C1430a) {
            obj = ((C1430a) obj).f10508a;
        }
        return asynchronousFileChannel.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10508a.hashCode();
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return this.f10508a.isOpen();
    }
}
