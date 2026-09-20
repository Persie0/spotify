package p196j$.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.WatchService;

/* JADX INFO: renamed from: j$.nio.file.n0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1488n0 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WatchService f10577a;

    public /* synthetic */ C1488n0(WatchService watchService) {
        this.f10577a = watchService;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1488n0 m23922a(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return new C1488n0(watchService);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f10577a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.f10577a;
        if (obj instanceof C1488n0) {
            obj = ((C1488n0) obj).f10577a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10577a.hashCode();
    }
}
