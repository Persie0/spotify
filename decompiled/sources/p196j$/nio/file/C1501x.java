package p196j$.nio.file;

import java.io.File;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.nio.file.x */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1501x implements Path {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Path f10596a;

    public /* synthetic */ C1501x(Path path) {
        this.f10596a = path;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Path m23932r(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof C1500w ? ((C1500w) path).f10595a : new C1501x(path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.f10596a.compareTo(AbstractC1419g.m23821d(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.f10596a.endsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.f10596a;
        if (obj instanceof C1501x) {
            obj = ((C1501x) obj).f10596a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super Path> consumer) {
        this.f10596a.forEach(consumer);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return m23932r(this.f10596a.getFileName());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ FileSystem getFileSystem() {
        return C1473g.m23918a(this.f10596a.getFileSystem());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return m23932r(this.f10596a.getName(i));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.f10596a.getNameCount();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return m23932r(this.f10596a.getParent());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return m23932r(this.f10596a.getRoot());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.f10596a.hashCode();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.f10596a.isAbsolute();
    }

    @Override // java.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new C1464b0(this.f10596a.iterator());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return m23932r(this.f10596a.normalize());
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        C1486m0 c1486m0Mo23905R = this.f10596a.mo23905R(C1488n0.m23922a(watchService), AbstractC1419g.m23833p(kindArr));
        if (c1486m0Mo23905R == null) {
            return null;
        }
        return c1486m0Mo23905R.f10575a;
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path relativize(Path path) {
        return m23932r(this.f10596a.mo23885G(C1500w.m23931r(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return m23932r(this.f10596a.resolve(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return m23932r(this.f10596a.resolveSibling(str));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator<Path> spliterator() {
        return this.f10596a.spliterator();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.f10596a.startsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return m23932r(this.f10596a.subpath(i, i2));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return m23932r(this.f10596a.toAbsolutePath());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.f10596a.toFile();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path toRealPath(LinkOption[] linkOptionArr) {
        return m23932r(this.f10596a.mo23892t(AbstractC1419g.m23832o(linkOptionArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.f10596a.toString();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.f10596a.toUri();
    }

    @Override // java.nio.file.Path
    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final /* synthetic */ int compareTo2(Path path) {
        return this.f10596a.compareTo(C1500w.m23931r(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(Path path) {
        return this.f10596a.mo23882A(C1500w.m23931r(path));
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        C1484l0[] c1484l0Arr;
        Path path = this.f10596a;
        C1488n0 c1488n0M23922a = C1488n0.m23922a(watchService);
        InterfaceC1482k0[] interfaceC1482k0ArrM23833p = AbstractC1419g.m23833p(kindArr);
        if (modifierArr == null) {
            c1484l0Arr = null;
        } else {
            int length = modifierArr.length;
            c1484l0Arr = new C1484l0[length];
            for (int i = 0; i < length; i++) {
                WatchEvent.Modifier modifier = modifierArr[i];
                c1484l0Arr[i] = modifier == null ? null : new C1484l0(modifier);
            }
        }
        C1486m0 c1486m0Mo23889p = path.mo23889p(c1488n0M23922a, interfaceC1482k0ArrM23833p, c1484l0Arr);
        if (c1486m0Mo23889p == null) {
            return null;
        }
        return c1486m0Mo23889p.f10575a;
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolve(Path path) {
        return m23932r(this.f10596a.mo23891s(C1500w.m23931r(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolveSibling(Path path) {
        return m23932r(this.f10596a.mo23883B(C1500w.m23931r(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(Path path) {
        return this.f10596a.mo23894x(C1500w.m23931r(path));
    }
}
