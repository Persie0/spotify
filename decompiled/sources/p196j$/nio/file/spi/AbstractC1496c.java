package p196j$.nio.file.spi;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;
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
import p196j$.nio.file.attribute.BasicFileAttributes;
import p196j$.nio.file.attribute.InterfaceC1447k;
import p196j$.nio.file.attribute.InterfaceC1451o;

/* JADX INFO: renamed from: j$.nio.file.spi.c */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC1496c {

    /* JADX INFO: renamed from: a */
    public static final Set f10591a = AbstractC1419g.m23831n(new Object[]{EnumC1472f0.CREATE, EnumC1472f0.TRUNCATE_EXISTING, EnumC1472f0.WRITE});

    public AbstractC1496c() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo23858A(Path path, String str, Object obj, LinkOption... linkOptionArr);

    /* JADX INFO: renamed from: a */
    public abstract void mo23859a(Path path, EnumC1432a... enumC1432aArr);

    /* JADX INFO: renamed from: b */
    public abstract void mo23860b(Path path, Path path2, CopyOption... copyOptionArr);

    /* JADX INFO: renamed from: c */
    public abstract void mo23861c(Path path, InterfaceC1447k... interfaceC1447kArr);

    /* JADX INFO: renamed from: d */
    public abstract void mo23862d(Path path, Path path2);

    /* JADX INFO: renamed from: e */
    public abstract void mo23863e(Path path, Path path2, InterfaceC1447k... interfaceC1447kArr);

    /* JADX INFO: renamed from: f */
    public abstract void mo23864f(Path path);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo23865g(Path path);

    /* JADX INFO: renamed from: h */
    public abstract InterfaceC1451o mo23866h(Path path, Class cls, LinkOption... linkOptionArr);

    /* JADX INFO: renamed from: i */
    public abstract C1467d mo23867i(Path path);

    /* JADX INFO: renamed from: j */
    public abstract AbstractC1475h mo23868j(URI uri);

    /* JADX INFO: renamed from: k */
    public abstract Path mo23869k(URI uri);

    /* JADX INFO: renamed from: l */
    public abstract String mo23870l();

    /* JADX INFO: renamed from: m */
    public abstract boolean mo23871m(Path path);

    /* JADX INFO: renamed from: n */
    public abstract boolean mo23872n(Path path, Path path2);

    /* JADX INFO: renamed from: o */
    public abstract void mo23873o(Path path, Path path2, CopyOption... copyOptionArr);

    /* JADX INFO: renamed from: p */
    public abstract C1430a mo23874p(Path path, Set set, ExecutorService executorService, InterfaceC1447k... interfaceC1447kArr);

    /* JADX INFO: renamed from: q */
    public abstract SeekableByteChannel mo23875q(Path path, Set set, InterfaceC1447k... interfaceC1447kArr);

    /* JADX INFO: renamed from: r */
    public abstract DirectoryStream mo23876r(Path path, DirectoryStream.Filter filter);

    /* JADX INFO: renamed from: s */
    public abstract FileChannel mo23877s(Path path, Set set, InterfaceC1447k... interfaceC1447kArr);

    /* JADX INFO: renamed from: t */
    public AbstractC1475h mo23927t(Path path, Map map) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: u */
    public abstract AbstractC1475h mo23878u(URI uri, Map map);

    /* JADX INFO: renamed from: v */
    public InputStream mo23928v(Path path, InterfaceC1498u... interfaceC1498uArr) {
        Set set;
        if (interfaceC1498uArr.length > 0) {
            for (InterfaceC1498u interfaceC1498u : interfaceC1498uArr) {
                if (interfaceC1498u == EnumC1472f0.APPEND || interfaceC1498u == EnumC1472f0.WRITE) {
                    throw new UnsupportedOperationException("'" + interfaceC1498u + "' not allowed");
                }
            }
        }
        int i = Files.f10511a;
        if (interfaceC1498uArr.length == 0) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, interfaceC1498uArr);
            set = hashSet;
        }
        return Channels.newInputStream(Files.m23904c(path).mo23875q(path, set, new InterfaceC1447k[0]));
    }

    /* JADX INFO: renamed from: w */
    public OutputStream mo23929w(Path path, InterfaceC1498u... interfaceC1498uArr) {
        Set set;
        if (interfaceC1498uArr.length == 0) {
            set = f10591a;
        } else {
            HashSet hashSet = new HashSet();
            for (InterfaceC1498u interfaceC1498u : interfaceC1498uArr) {
                if (interfaceC1498u == EnumC1472f0.READ) {
                    throw new IllegalArgumentException("READ not allowed");
                }
                hashSet.add(interfaceC1498u);
            }
            hashSet.add(EnumC1472f0.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(mo23875q(path, set, new InterfaceC1447k[0]));
    }

    /* JADX INFO: renamed from: x */
    public abstract BasicFileAttributes mo23879x(Path path, Class cls, LinkOption... linkOptionArr);

    /* JADX INFO: renamed from: y */
    public abstract Map mo23880y(Path path, String str, LinkOption... linkOptionArr);

    /* JADX INFO: renamed from: z */
    public abstract Path mo23881z(Path path);
}
