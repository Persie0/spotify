package p196j$.nio.file;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.nio.file.w */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1500w implements Path {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Path f10595a;

    public /* synthetic */ C1500w(Path path) {
        this.f10595a = path;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Path m23931r(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof C1501x ? ((C1501x) path).f10596a : new C1500w(path);
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: A */
    public final /* synthetic */ boolean mo23882A(Path path) {
        return this.f10595a.endsWith(C1501x.m23932r(path));
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Path mo23883B(Path path) {
        return m23931r(this.f10595a.resolveSibling(C1501x.m23932r(path)));
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Path mo23885G(Path path) {
        return m23931r(this.f10595a.relativize(C1501x.m23932r(path)));
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ C1486m0 mo23905R(C1488n0 c1488n0, InterfaceC1482k0[] interfaceC1482k0Arr) {
        return C1486m0.m23921a(this.f10595a.register(c1488n0 == null ? null : c1488n0.f10577a, AbstractC1419g.m23837t(interfaceC1482k0Arr)));
    }

    @Override // p196j$.nio.file.Path, java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.f10595a.compareTo(AbstractC1419g.m23821d(path));
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.f10595a.endsWith(str);
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.f10595a;
        if (obj instanceof C1500w) {
            obj = ((C1500w) obj).f10595a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super Path> consumer) {
        this.f10595a.forEach(consumer);
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return m23931r(this.f10595a.getFileName());
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ AbstractC1475h getFileSystem() {
        return C1471f.m23917k(this.f10595a.getFileSystem());
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return m23931r(this.f10595a.getName(i));
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.f10595a.getNameCount();
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return m23931r(this.f10595a.getParent());
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return m23931r(this.f10595a.getRoot());
    }

    public final /* synthetic */ int hashCode() {
        return this.f10595a.hashCode();
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.f10595a.isAbsolute();
    }

    @Override // p196j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new C1464b0(this.f10595a.iterator());
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return m23931r(this.f10595a.normalize());
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1486m0 mo23889p(C1488n0 c1488n0, InterfaceC1482k0[] interfaceC1482k0Arr, C1484l0[] c1484l0Arr) {
        Path path = this.f10595a;
        WatchEvent.Modifier[] modifierArr = null;
        WatchService watchService = c1488n0 == null ? null : c1488n0.f10577a;
        WatchEvent.Kind<?>[] kindArrM23837t = AbstractC1419g.m23837t(interfaceC1482k0Arr);
        if (c1484l0Arr != null) {
            int length = c1484l0Arr.length;
            WatchEvent.Modifier[] modifierArr2 = new WatchEvent.Modifier[length];
            for (int i = 0; i < length; i++) {
                C1484l0 c1484l0 = c1484l0Arr[i];
                modifierArr2[i] = c1484l0 == null ? null : c1484l0.f10569a;
            }
            modifierArr = modifierArr2;
        }
        return C1486m0.m23921a(path.register(watchService, kindArrM23837t, modifierArr));
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return m23931r(this.f10595a.resolve(str));
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return m23931r(this.f10595a.resolveSibling(str));
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Path mo23891s(Path path) {
        return m23931r(this.f10595a.resolve(C1501x.m23932r(path)));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator<Path> spliterator() {
        return this.f10595a.spliterator();
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.f10595a.startsWith(str);
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return m23931r(this.f10595a.subpath(i, i2));
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Path mo23892t(LinkOption[] linkOptionArr) {
        return m23931r(this.f10595a.toRealPath(AbstractC1419g.m23836s(linkOptionArr)));
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return m23931r(this.f10595a.toAbsolutePath());
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.f10595a.toFile();
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.f10595a.toString();
    }

    @Override // p196j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.f10595a.toUri();
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ int compareTo(Path path) {
        return this.f10595a.compareTo(C1501x.m23932r(path));
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean mo23894x(Path path) {
        return this.f10595a.startsWith(C1501x.m23932r(path));
    }
}
