package p196j$.nio.file;

import java.nio.file.DirectoryStream;
import java.util.Iterator;

/* JADX INFO: renamed from: j$.nio.file.l */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1483l {

    /* JADX INFO: renamed from: a */
    public final Path f10564a;

    /* JADX INFO: renamed from: b */
    public final Object f10565b;

    /* JADX INFO: renamed from: c */
    public final DirectoryStream f10566c;

    /* JADX INFO: renamed from: d */
    public final Iterator f10567d;

    /* JADX INFO: renamed from: e */
    public boolean f10568e;

    public C1483l(Path path, Object obj, DirectoryStream directoryStream) {
        this.f10564a = path;
        this.f10565b = obj;
        this.f10566c = directoryStream;
        this.f10567d = directoryStream.iterator();
    }
}
