package p196j$.nio.file.spi;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;
import p196j$.desugar.sun.nio.p197fs.C1420h;
import p196j$.nio.channels.AbstractC1431b;
import p196j$.nio.channels.C1430a;
import p196j$.nio.file.AbstractC1469e;
import p196j$.nio.file.C1463b;
import p196j$.nio.file.C1467d;
import p196j$.nio.file.C1473g;
import p196j$.nio.file.C1493s;
import p196j$.nio.file.C1500w;
import p196j$.nio.file.C1501x;
import p196j$.nio.file.C1503z;
import p196j$.nio.file.EnumC1432a;
import p196j$.nio.file.InterfaceC1498u;
import p196j$.nio.file.attribute.C1434a;
import p196j$.nio.file.attribute.C1436b;
import p196j$.nio.file.attribute.C1438c;
import p196j$.nio.file.attribute.C1442f;
import p196j$.nio.file.attribute.C1443g;
import p196j$.nio.file.attribute.C1449m;
import p196j$.nio.file.attribute.C1450n;
import p196j$.nio.file.attribute.C1452p;
import p196j$.nio.file.attribute.C1453q;
import p196j$.nio.file.attribute.C1457u;
import p196j$.nio.file.attribute.C1460x;
import p196j$.nio.file.attribute.InterfaceC1440d;
import p196j$.nio.file.attribute.InterfaceC1451o;
import p196j$.nio.file.attribute.InterfaceC1454r;

/* JADX INFO: renamed from: j$.nio.file.spi.b */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1495b extends FileSystemProvider {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f10589b = 0;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1496c f10590a;

    public /* synthetic */ C1495b(AbstractC1496c abstractC1496c) {
        this.f10590a = abstractC1496c;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        EnumC1432a enumC1432a;
        AbstractC1496c abstractC1496c = this.f10590a;
        p196j$.nio.file.Path pathM23931r = C1500w.m23931r(path);
        EnumC1432a[] enumC1432aArr = null;
        if (accessModeArr != null) {
            int length = accessModeArr.length;
            EnumC1432a[] enumC1432aArr2 = new EnumC1432a[length];
            for (int i = 0; i < length; i++) {
                AccessMode accessMode = accessModeArr[i];
                if (accessMode == null) {
                    enumC1432a = null;
                } else if (accessMode == AccessMode.READ) {
                    enumC1432a = EnumC1432a.READ;
                } else {
                    enumC1432a = accessMode == AccessMode.WRITE ? EnumC1432a.WRITE : EnumC1432a.EXECUTE;
                }
                enumC1432aArr2[i] = enumC1432a;
            }
            enumC1432aArr = enumC1432aArr2;
        }
        abstractC1496c.mo23859a(pathM23931r, enumC1432aArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        p196j$.nio.file.CopyOption[] copyOptionArr2;
        AbstractC1496c abstractC1496c = this.f10590a;
        p196j$.nio.file.Path pathM23931r = C1500w.m23931r(path);
        p196j$.nio.file.Path pathM23931r2 = C1500w.m23931r(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            p196j$.nio.file.CopyOption[] copyOptionArr3 = new p196j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C1463b.m23916a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        abstractC1496c.mo23860b(pathM23931r, pathM23931r2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.f10590a.mo23861c(C1500w.m23931r(path), AbstractC1419g.m23834q(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.f10590a.mo23862d(C1500w.m23931r(path), C1500w.m23931r(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.f10590a.mo23863e(C1500w.m23931r(path), C1500w.m23931r(path2), AbstractC1419g.m23834q(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.f10590a.mo23864f(C1500w.m23931r(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.f10590a.mo23865g(C1500w.m23931r(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC1496c abstractC1496c = this.f10590a;
        if (obj instanceof C1495b) {
            obj = ((C1495b) obj).f10590a;
        }
        return abstractC1496c.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        InterfaceC1451o interfaceC1451oMo23866h = this.f10590a.mo23866h(C1500w.m23931r(path), AbstractC1419g.m23822e(cls), AbstractC1419g.m23832o(linkOptionArr));
        if (interfaceC1451oMo23866h == null) {
            return null;
        }
        if (interfaceC1451oMo23866h instanceof C1449m) {
            return ((C1449m) interfaceC1451oMo23866h).f10531a;
        }
        if (interfaceC1451oMo23866h instanceof InterfaceC1440d) {
            InterfaceC1440d interfaceC1440d = (InterfaceC1440d) interfaceC1451oMo23866h;
            if (interfaceC1440d instanceof C1436b) {
                return ((C1436b) interfaceC1440d).f10520a;
            }
            if (interfaceC1440d instanceof C1443g) {
                return ((C1443g) interfaceC1440d).f10526a;
            }
            return interfaceC1440d instanceof C1457u ? ((C1457u) interfaceC1440d).f10537a : new C1438c(interfaceC1440d);
        }
        if (!(interfaceC1451oMo23866h instanceof InterfaceC1454r)) {
            return interfaceC1451oMo23866h instanceof C1460x ? ((C1460x) interfaceC1451oMo23866h).f10540a : new C1450n(interfaceC1451oMo23866h);
        }
        InterfaceC1454r interfaceC1454r = (InterfaceC1454r) interfaceC1451oMo23866h;
        if (interfaceC1454r instanceof C1452p) {
            return ((C1452p) interfaceC1454r).f10533a;
        }
        if (interfaceC1454r instanceof C1434a) {
            return ((C1434a) interfaceC1454r).f10519a;
        }
        return interfaceC1454r instanceof C1457u ? ((C1457u) interfaceC1454r).f10537a : new C1453q(interfaceC1454r);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        C1467d c1467dMo23867i = this.f10590a.mo23867i(C1500w.m23931r(path));
        int i = AbstractC1469e.f10549a;
        if (c1467dMo23867i == null) {
            return null;
        }
        return c1467dMo23867i.f10547a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return C1473g.m23918a(this.f10590a.mo23868j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return C1501x.m23932r(this.f10590a.mo23869k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.f10590a.mo23870l();
    }

    public final /* synthetic */ int hashCode() {
        return this.f10590a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.f10590a.mo23871m(C1500w.m23931r(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.f10590a.mo23872n(C1500w.m23931r(path), C1500w.m23931r(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        p196j$.nio.file.CopyOption[] copyOptionArr2;
        AbstractC1496c abstractC1496c = this.f10590a;
        p196j$.nio.file.Path pathM23931r = C1500w.m23931r(path);
        p196j$.nio.file.Path pathM23931r2 = C1500w.m23931r(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            p196j$.nio.file.CopyOption[] copyOptionArr3 = new p196j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C1463b.m23916a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        abstractC1496c.mo23873o(pathM23931r, pathM23931r2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        C1430a c1430aMo23874p = this.f10590a.mo23874p(C1500w.m23931r(path), AbstractC1419g.m23826i(set), executorService, AbstractC1419g.m23834q(fileAttributeArr));
        int i = AbstractC1431b.f10509a;
        if (c1430aMo23874p == null) {
            return null;
        }
        return c1430aMo23874p.f10508a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.f10590a.mo23875q(C1500w.m23931r(path), AbstractC1419g.m23826i(set), AbstractC1419g.m23834q(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new C1503z(this.f10590a.mo23876r(C1500w.m23931r(path), new C1420h(filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.f10590a.mo23877s(C1500w.m23931r(path), AbstractC1419g.m23826i(set), AbstractC1419g.m23834q(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return C1473g.m23918a(this.f10590a.mo23878u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC1498u[] interfaceC1498uArr;
        AbstractC1496c abstractC1496c = this.f10590a;
        p196j$.nio.file.Path pathM23931r = C1500w.m23931r(path);
        if (openOptionArr == null) {
            interfaceC1498uArr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC1498u[] interfaceC1498uArr2 = new InterfaceC1498u[length];
            for (int i = 0; i < length; i++) {
                interfaceC1498uArr2[i] = C1493s.m23926a(openOptionArr[i]);
            }
            interfaceC1498uArr = interfaceC1498uArr2;
        }
        return abstractC1496c.mo23928v(pathM23931r, interfaceC1498uArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC1498u[] interfaceC1498uArr;
        AbstractC1496c abstractC1496c = this.f10590a;
        p196j$.nio.file.Path pathM23931r = C1500w.m23931r(path);
        if (openOptionArr == null) {
            interfaceC1498uArr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC1498u[] interfaceC1498uArr2 = new InterfaceC1498u[length];
            for (int i = 0; i < length; i++) {
                interfaceC1498uArr2[i] = C1493s.m23926a(openOptionArr[i]);
            }
            interfaceC1498uArr = interfaceC1498uArr2;
        }
        return abstractC1496c.mo23929w(pathM23931r, interfaceC1498uArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C1442f.m23913a(this.f10590a.mo23879x(C1500w.m23931r(path), AbstractC1419g.m23823f(cls), AbstractC1419g.m23832o(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return C1501x.m23932r(this.f10590a.mo23881z(C1500w.m23931r(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.f10590a.mo23858A(C1500w.m23931r(path), str, AbstractC1419g.m23825h(obj), AbstractC1419g.m23832o(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return C1473g.m23918a(this.f10590a.mo23927t(C1500w.m23931r(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return AbstractC1419g.m23824g(this.f10590a.mo23880y(C1500w.m23931r(path), str, AbstractC1419g.m23832o(linkOptionArr)));
    }
}
