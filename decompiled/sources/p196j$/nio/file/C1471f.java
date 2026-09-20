package p196j$.nio.file;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;
import p196j$.nio.file.attribute.C1437b0;
import p196j$.nio.file.spi.AbstractC1496c;
import p196j$.nio.file.spi.C1494a;
import p196j$.nio.file.spi.C1495b;

/* JADX INFO: renamed from: j$.nio.file.f */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1471f extends AbstractC1475h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileSystem f10550a;

    public C1471f(FileSystem fileSystem) {
        this.f10550a = fileSystem;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ AbstractC1475h m23917k(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C1473g ? ((C1473g) fileSystem).f10552a : new C1471f(fileSystem);
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterable mo23845a() {
        return this.f10550a.getFileStores();
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Path mo23846b(String str, String[] strArr) {
        return C1500w.m23931r(this.f10550a.getPath(str, strArr));
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1470e0 mo23847c(String str) {
        PathMatcher pathMatcher = this.f10550a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof C1468d0 ? ((C1468d0) pathMatcher).f10548a : new C1466c0(pathMatcher);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f10550a.close();
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: d */
    public final Iterable mo23848d() {
        return new C1433a0(this.f10550a.getRootDirectories());
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String mo23849e() {
        return this.f10550a.getSeparator();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.f10550a;
        if (obj instanceof C1471f) {
            obj = ((C1471f) obj).f10550a;
        }
        return fileSystem.equals(obj);
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1437b0 mo23850f() {
        UserPrincipalLookupService userPrincipalLookupService = this.f10550a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return new C1437b0(userPrincipalLookupService);
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean mo23851g() {
        return this.f10550a.isReadOnly();
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1488n0 mo23852h() {
        return C1488n0.m23922a(this.f10550a.newWatchService());
    }

    public final /* synthetic */ int hashCode() {
        return this.f10550a.hashCode();
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC1496c mo23853i() {
        FileSystemProvider fileSystemProviderProvider = this.f10550a.provider();
        int i = C1494a.f10587c;
        if (fileSystemProviderProvider == null) {
            return null;
        }
        return fileSystemProviderProvider instanceof C1495b ? ((C1495b) fileSystemProviderProvider).f10590a : new C1494a(fileSystemProviderProvider);
    }

    @Override // p196j$.nio.file.AbstractC1475h
    public final /* synthetic */ boolean isOpen() {
        return this.f10550a.isOpen();
    }

    @Override // p196j$.nio.file.AbstractC1475h
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Set mo23854j() {
        return this.f10550a.supportedFileAttributeViews();
    }
}
