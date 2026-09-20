package p196j$.desugar.sun.nio.p197fs;

import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.f */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1418f extends FileLock {

    /* JADX INFO: renamed from: a */
    public final FileLock f10481a;

    public C1418f(FileLock fileLock, C1417e c1417e) {
        super(c1417e, fileLock.position(), fileLock.size(), fileLock.isShared());
        this.f10481a = fileLock;
    }

    @Override // java.nio.channels.FileLock
    public final boolean isValid() {
        return this.f10481a.isValid();
    }

    @Override // java.nio.channels.FileLock
    public final void release() throws IOException {
        this.f10481a.release();
    }
}
