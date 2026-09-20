package p196j$.desugar.sun.nio.p197fs;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;
import p196j$.nio.file.Path;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.l */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1424l implements Iterator {

    /* JADX INFO: renamed from: a */
    public final DirectoryStream.Filter f10488a;

    /* JADX INFO: renamed from: b */
    public final File[] f10489b;

    /* JADX INFO: renamed from: c */
    public int f10490c = 0;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1425m f10491d;

    public C1424l(C1425m c1425m, Path path, DirectoryStream.Filter filter) {
        this.f10491d = c1425m;
        File[] fileArrListFiles = path.toFile().listFiles();
        this.f10489b = fileArrListFiles == null ? new File[0] : fileArrListFiles;
        this.f10488a = filter;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1427o next() {
        C1427o c1427o;
        do {
            int i = this.f10490c;
            File[] fileArr = this.f10489b;
            if (i >= fileArr.length) {
                return null;
            }
            this.f10490c = i + 1;
            File file = fileArr[i];
            C1421i c1421i = this.f10491d.f10494d;
            String path = file.getPath();
            C1425m c1425m = this.f10491d;
            c1427o = new C1427o(c1421i, path, c1425m.f10492b, c1425m.f10493c);
            try {
            } catch (IOException e) {
                throw new DirectoryIteratorException(e);
            }
        } while (!this.f10488a.accept(c1427o));
        return c1427o;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (next() == null) {
            return false;
        }
        this.f10490c--;
        return true;
    }
}
