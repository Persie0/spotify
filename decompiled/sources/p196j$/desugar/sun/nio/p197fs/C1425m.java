package p196j$.desugar.sun.nio.p197fs;

import io.ably.lib.rest.Auth;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p196j$.nio.channels.C1430a;
import p196j$.nio.file.AbstractC1475h;
import p196j$.nio.file.C1467d;
import p196j$.nio.file.CopyOption;
import p196j$.nio.file.EnumC1432a;
import p196j$.nio.file.EnumC1472f0;
import p196j$.nio.file.Files;
import p196j$.nio.file.InterfaceC1498u;
import p196j$.nio.file.LinkOption;
import p196j$.nio.file.Path;
import p196j$.nio.file.StandardCopyOption;
import p196j$.nio.file.attribute.BasicFileAttributes;
import p196j$.nio.file.attribute.FileTime;
import p196j$.nio.file.attribute.InterfaceC1440d;
import p196j$.nio.file.attribute.InterfaceC1447k;
import p196j$.nio.file.attribute.InterfaceC1451o;
import p196j$.nio.file.spi.AbstractC1496c;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.m */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1425m extends AbstractC1496c {

    /* JADX INFO: renamed from: b */
    public final String f10492b;

    /* JADX INFO: renamed from: c */
    public final String f10493c = "/";

    /* JADX INFO: renamed from: d */
    public volatile C1421i f10494d;

    public C1425m(String str) {
        this.f10492b = str;
    }

    /* JADX INFO: renamed from: B */
    public static void m23856B(URI uri) {
        if (!uri.getScheme().equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI does not match this provider");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("Authority component present");
        }
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("Path component is undefined");
        }
        if (!path.equals("/")) {
            throw new IllegalArgumentException("Path component should be '/'");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("Query component present");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("Fragment component present");
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m23857C(CopyOption[] copyOptionArr, StandardCopyOption standardCopyOption) {
        for (CopyOption copyOption : copyOptionArr) {
            if (copyOption == standardCopyOption) {
                return true;
            }
        }
        return false;
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: A */
    public final void mo23858A(Path path, String str, Object obj, LinkOption... linkOptionArr) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            str = str.substring(iIndexOf + 1);
        }
        C1414b c1414b = new C1414b(path);
        if (str.equals("lastModifiedTime")) {
            c1414b.mo23817a((FileTime) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            c1414b.mo23817a(null, (FileTime) obj, null);
        } else {
            if (str.equals("creationTime")) {
                return;
            }
            throw new IllegalArgumentException("'basic:" + str + "' not recognized");
        }
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: a */
    public final void mo23859a(Path path, EnumC1432a... enumC1432aArr) throws IOException {
        boolean zCanRead;
        File file = path.toFile();
        if (!file.exists()) {
            throw new NoSuchFileException(path.toString());
        }
        boolean z = true;
        for (EnumC1432a enumC1432a : enumC1432aArr) {
            int i = AbstractC1422j.f10486a[enumC1432a.ordinal()];
            if (i == 1) {
                zCanRead = file.canRead();
            } else if (i != 2) {
                if (i == 3) {
                    zCanRead = file.canExecute();
                }
            } else {
                zCanRead = file.canWrite();
            }
            z &= zCanRead;
        }
        if (!z) {
            throw new IOException(String.format("Unable to access file %s", path));
        }
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: b */
    public final void mo23860b(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        if (!m23857C(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.m23903b(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (m23857C(copyOptionArr, StandardCopyOption.ATOMIC_MOVE)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        FileInputStream fileInputStream = new FileInputStream(path.toFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path2.toFile());
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr, 0, 8192);
                    if (i < 0) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                    try {
                        fileInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            fileInputStream.close();
            throw th4;
        }
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: c */
    public final void mo23861c(Path path, InterfaceC1447k... interfaceC1447kArr) throws NoSuchFileException, FileAlreadyExistsException {
        if (path.getParent() != null && !Files.m23903b(path.getParent(), new LinkOption[0])) {
            throw new NoSuchFileException(path.toString());
        }
        if (!path.toFile().mkdirs()) {
            throw new FileAlreadyExistsException(path.toString());
        }
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: d */
    public final void mo23862d(Path path, Path path2) {
        throw new UnsupportedOperationException();
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: e */
    public final void mo23863e(Path path, Path path2, InterfaceC1447k... interfaceC1447kArr) {
        throw new UnsupportedOperationException();
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: f */
    public final void mo23864f(Path path) throws NoSuchFileException {
        try {
            mo23859a(path, new EnumC1432a[0]);
            mo23865g(path);
        } catch (IOException unused) {
            throw new NoSuchFileException(path.toString());
        }
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: g */
    public final boolean mo23865g(Path path) {
        return path.toFile().delete();
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: h */
    public final InterfaceC1451o mo23866h(Path path, Class cls, LinkOption... linkOptionArr) {
        cls.getClass();
        if (cls == InterfaceC1440d.class) {
            return (InterfaceC1451o) cls.cast(new C1414b(path));
        }
        return null;
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: i */
    public final C1467d mo23867i(Path path) {
        throw new SecurityException("getFileStore");
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: j */
    public final AbstractC1475h mo23868j(URI uri) {
        C1421i c1421i;
        m23856B(uri);
        C1421i c1421i2 = this.f10494d;
        if (c1421i2 != null) {
            return c1421i2;
        }
        synchronized (this) {
            try {
                c1421i = this.f10494d;
                if (c1421i == null) {
                    c1421i = new C1421i(this, this.f10492b, this.f10493c);
                    this.f10494d = c1421i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1421i;
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: k */
    public final Path mo23869k(URI uri) {
        byte bM23895a;
        C1421i c1421i = this.f10494d;
        String str = this.f10492b;
        String str2 = this.f10493c;
        char[] cArr = AbstractC1428p.f10505c;
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("URI is not absolute");
        }
        if (uri.isOpaque()) {
            throw new IllegalArgumentException("URI is not hierarchical");
        }
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI scheme is not \"file\"");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("URI has an authority component");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("URI has a fragment component");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("URI has a query component");
        }
        String rawPath = uri.getRawPath();
        int length = rawPath.length();
        if (length == 0) {
            throw new IllegalArgumentException("URI path component is empty");
        }
        if (rawPath.endsWith("/") && length > 1) {
            length--;
        }
        byte[] bArrCopyOf = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = rawPath.charAt(i);
            if (cCharAt == '%') {
                int i4 = i + 2;
                i += 3;
                bM23895a = (byte) ((AbstractC1428p.m23895a(rawPath.charAt(i3)) << 4) | AbstractC1428p.m23895a(rawPath.charAt(i4)));
                if (bM23895a == 0) {
                    throw new IllegalArgumentException("Nul character not allowed");
                }
            } else {
                if (cCharAt == 0 || cCharAt >= 128) {
                    throw new IllegalArgumentException("Bad escape");
                }
                bM23895a = (byte) cCharAt;
                i = i3;
            }
            bArrCopyOf[i2] = bM23895a;
            i2++;
        }
        if (i2 != length) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
        }
        return new C1427o(c1421i, new String(bArrCopyOf, AbstractC1429q.f10506a), str, str2);
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: l */
    public final String mo23870l() {
        return "file";
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: m */
    public final boolean mo23871m(Path path) {
        return path.toFile().isHidden();
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: n */
    public final boolean mo23872n(Path path, Path path2) throws IOException {
        if (path.equals(path2)) {
            return true;
        }
        mo23859a(path, new EnumC1432a[0]);
        mo23859a(path2, new EnumC1432a[0]);
        return path.toFile().equals(path2.toFile());
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: o */
    public final void mo23873o(Path path, Path path2, CopyOption... copyOptionArr) throws FileAlreadyExistsException {
        if (!m23857C(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.m23903b(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (m23857C(copyOptionArr, StandardCopyOption.COPY_ATTRIBUTES)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        path.toFile().renameTo(path2.toFile());
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: p */
    public final C1430a mo23874p(Path path, Set set, ExecutorService executorService, InterfaceC1447k... interfaceC1447kArr) {
        throw new UnsupportedOperationException();
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: q */
    public final SeekableByteChannel mo23875q(Path path, Set set, InterfaceC1447k... interfaceC1447kArr) {
        return mo23877s(path, set, interfaceC1447kArr);
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: r */
    public final DirectoryStream mo23876r(Path path, DirectoryStream.Filter filter) {
        C1423k c1423k = new C1423k();
        c1423k.f10487a = new C1424l(this, path, filter);
        return c1423k;
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: s */
    public final FileChannel mo23877s(Path path, Set set, InterfaceC1447k... interfaceC1447kArr) throws IOException {
        String str;
        if (path.toFile().isDirectory()) {
            throw new UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: " + path);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC1498u) it.next()).getClass();
        }
        if (path.toFile().exists()) {
            if (set.contains(EnumC1472f0.CREATE_NEW) && set.contains(EnumC1472f0.WRITE)) {
                throw new FileAlreadyExistsException(path.toString());
            }
        } else if (!set.contains(EnumC1472f0.CREATE) && !set.contains(EnumC1472f0.CREATE_NEW)) {
            throw new NoSuchFileException(path.toString());
        }
        if (set.contains(EnumC1472f0.READ) && set.contains(EnumC1472f0.APPEND)) {
            throw new IllegalArgumentException("READ + APPEND not allowed");
        }
        EnumC1472f0 enumC1472f0 = EnumC1472f0.APPEND;
        if (set.contains(enumC1472f0) && set.contains(EnumC1472f0.TRUNCATE_EXISTING)) {
            throw new IllegalArgumentException("APPEND + TRUNCATE_EXISTING not allowed");
        }
        File file = path.toFile();
        EnumC1472f0 enumC1472f1 = EnumC1472f0.WRITE;
        if (!set.contains(enumC1472f1) && !set.contains(enumC1472f0)) {
            str = "r";
        } else if (set.contains(EnumC1472f0.SYNC)) {
            str = "rws";
        } else {
            str = set.contains(EnumC1472f0.DSYNC) ? "rwd" : "rw";
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, str);
        if (set.contains(EnumC1472f0.TRUNCATE_EXISTING) && set.contains(enumC1472f1)) {
            randomAccessFile.setLength(0L);
        }
        if (!set.contains(enumC1472f0) && !set.contains(EnumC1472f0.DELETE_ON_CLOSE)) {
            return randomAccessFile.getChannel();
        }
        FileChannel channel = randomAccessFile.getChannel();
        int i = C1417e.f10476e;
        if (channel instanceof C1417e) {
            channel = ((C1417e) channel).f10477a;
        }
        return new C1417e(channel, set.contains(EnumC1472f0.DELETE_ON_CLOSE), set.contains(enumC1472f0), path);
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: u */
    public final AbstractC1475h mo23878u(URI uri, Map map) {
        m23856B(uri);
        throw new FileSystemAlreadyExistsException();
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: x */
    public final BasicFileAttributes mo23879x(Path path, Class cls, LinkOption... linkOptionArr) {
        if (cls == BasicFileAttributes.class) {
            return (BasicFileAttributes) cls.cast(((InterfaceC1440d) mo23866h(path, InterfaceC1440d.class, linkOptionArr)).readAttributes());
        }
        throw new UnsupportedOperationException();
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: y */
    public final Map mo23880y(Path path, String str, LinkOption... linkOptionArr) {
        String[] strArrSplit;
        int iIndexOf = str.indexOf(":");
        if (iIndexOf == -1) {
            strArrSplit = str.split(",");
        } else {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            strArrSplit = str.substring(iIndexOf + 1).split(",");
        }
        C1414b c1414b = new C1414b(path);
        Set set = C1414b.f10464b;
        C1413a c1413a = new C1413a();
        c1413a.f10461a = new HashSet();
        c1413a.f10462b = new HashMap();
        for (String str2 : strArrSplit) {
            if (str2.equals(Auth.WILDCARD_CLIENTID)) {
                c1413a.f10463c = true;
            } else {
                if (!((HashSet) set).contains(str2)) {
                    throw new IllegalArgumentException("'" + str2 + "' not recognized");
                }
                ((HashSet) c1413a.f10461a).add(str2);
            }
        }
        BasicFileAttributes attributes = c1414b.readAttributes();
        if (c1413a.m23816b("size")) {
            c1413a.m23815a("size", Long.valueOf(((C1415c) attributes).size()));
        }
        if (c1413a.m23816b("creationTime")) {
            c1413a.m23815a("creationTime", ((C1415c) attributes).creationTime());
        }
        if (c1413a.m23816b("lastAccessTime")) {
            c1413a.m23815a("lastAccessTime", ((C1415c) attributes).lastAccessTime());
        }
        if (c1413a.m23816b("lastModifiedTime")) {
            c1413a.m23815a("lastModifiedTime", ((C1415c) attributes).lastModifiedTime());
        }
        if (c1413a.m23816b("fileKey")) {
            c1413a.m23815a("fileKey", ((C1415c) attributes).fileKey());
        }
        if (c1413a.m23816b("isDirectory")) {
            c1413a.m23815a("isDirectory", Boolean.valueOf(((C1415c) attributes).isDirectory()));
        }
        if (c1413a.m23816b("isRegularFile")) {
            c1413a.m23815a("isRegularFile", Boolean.valueOf(((C1415c) attributes).isRegularFile()));
        }
        if (c1413a.m23816b("isSymbolicLink")) {
            c1413a.m23815a("isSymbolicLink", Boolean.valueOf(((C1415c) attributes).isSymbolicLink()));
        }
        if (c1413a.m23816b("isOther")) {
            c1413a.m23815a("isOther", Boolean.valueOf(((C1415c) attributes).isOther()));
        }
        return Collections.unmodifiableMap(c1413a.f10462b);
    }

    @Override // p196j$.nio.file.spi.AbstractC1496c
    /* JADX INFO: renamed from: z */
    public final Path mo23881z(Path path) {
        return new C1427o(this.f10494d, path.toFile().getCanonicalPath(), this.f10492b, this.f10493c);
    }
}
