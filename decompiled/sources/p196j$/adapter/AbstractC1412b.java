package p196j$.adapter;

import android.os.StrictMode;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.spi.FileSystemProvider;
import p196j$.desugar.sun.nio.p197fs.AbstractC1416d;
import p196j$.nio.file.spi.AbstractC1496c;
import p196j$.nio.file.spi.C1494a;
import p196j$.nio.file.spi.C1495b;

/* JADX INFO: renamed from: j$.adapter.b */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC1412b {

    /* JADX INFO: renamed from: a */
    public static final AbstractC1496c f10460a;

    static {
        AbstractC1496c c1494a;
        if (AbstractC1411a.f10458a) {
            FileSystemProvider fileSystemProviderProvider = FileSystems.getDefault().provider();
            int i = C1494a.f10587c;
            if (fileSystemProviderProvider == null) {
                c1494a = null;
            } else {
                c1494a = fileSystemProviderProvider instanceof C1495b ? ((C1495b) fileSystemProviderProvider).f10590a : new C1494a(fileSystemProviderProvider);
            }
        } else {
            if (AbstractC1411a.f10459b) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().build());
            }
            c1494a = AbstractC1416d.f10475a;
        }
        f10460a = c1494a;
        c1494a.mo23868j(URI.create("file:///"));
    }
}
