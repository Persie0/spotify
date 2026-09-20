package p196j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public interface Path extends Comparable<Path>, Iterable<Path> {
    /* JADX INFO: renamed from: A */
    boolean mo23882A(Path path);

    /* JADX INFO: renamed from: B */
    default Path mo23883B(Path path) {
        path.getClass();
        Path parent = getParent();
        return parent == null ? path : parent.mo23891s(path);
    }

    /* JADX INFO: renamed from: G */
    Path mo23885G(Path path);

    /* JADX INFO: renamed from: R */
    default C1486m0 mo23905R(C1488n0 c1488n0, InterfaceC1482k0... interfaceC1482k0Arr) {
        return mo23889p(c1488n0, interfaceC1482k0Arr, new C1484l0[0]);
    }

    default boolean endsWith(String str) {
        return mo23882A(getFileSystem().mo23846b(str, new String[0]));
    }

    boolean equals(Object obj);

    Path getFileName();

    AbstractC1475h getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    boolean isAbsolute();

    default Iterator iterator() {
        return new C1499v(this);
    }

    Path normalize();

    /* JADX INFO: renamed from: p */
    C1486m0 mo23889p(C1488n0 c1488n0, InterfaceC1482k0[] interfaceC1482k0Arr, C1484l0... c1484l0Arr);

    default Path resolve(String str) {
        return mo23891s(getFileSystem().mo23846b(str, new String[0]));
    }

    default Path resolveSibling(String str) {
        return mo23883B(getFileSystem().mo23846b(str, new String[0]));
    }

    /* JADX INFO: renamed from: s */
    Path mo23891s(Path path);

    default boolean startsWith(String str) {
        return mo23894x(getFileSystem().mo23846b(str, new String[0]));
    }

    Path subpath(int i, int i2);

    /* JADX INFO: renamed from: t */
    Path mo23892t(LinkOption... linkOptionArr);

    Path toAbsolutePath();

    default File toFile() {
        if (getFileSystem() == AbstractC1479j.f10561a) {
            return new File(toString());
        }
        throw new UnsupportedOperationException("Path not associated with default file system.");
    }

    String toString();

    URI toUri();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    int compareTo(Path path);

    /* JADX INFO: renamed from: x */
    boolean mo23894x(Path path);
}
