package p196j$.nio.file;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;
import p196j$.nio.file.attribute.AbstractC1439c0;
import p196j$.nio.file.attribute.C1437b0;
import p196j$.nio.file.spi.AbstractC1496c;
import p196j$.nio.file.spi.C1494a;
import p196j$.nio.file.spi.C1495b;

/* JADX INFO: renamed from: j$.nio.file.g */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1473g extends FileSystem {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1475h f10552a;

    public /* synthetic */ C1473g(AbstractC1475h abstractC1475h) {
        this.f10552a = abstractC1475h;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ FileSystem m23918a(AbstractC1475h abstractC1475h) {
        if (abstractC1475h == null) {
            return null;
        }
        return abstractC1475h instanceof C1471f ? ((C1471f) abstractC1475h).f10550a : new C1473g(abstractC1475h);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f10552a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC1475h abstractC1475h = this.f10552a;
        if (obj instanceof C1473g) {
            obj = ((C1473g) obj).f10552a;
        }
        return abstractC1475h.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.f10552a.mo23845a();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Path getPath(String str, String[] strArr) {
        return C1501x.m23932r(this.f10552a.mo23846b(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        InterfaceC1470e0 interfaceC1470e0Mo23847c = this.f10552a.mo23847c(str);
        if (interfaceC1470e0Mo23847c == null) {
            return null;
        }
        return interfaceC1470e0Mo23847c instanceof C1466c0 ? ((C1466c0) interfaceC1470e0Mo23847c).f10546a : new C1468d0(interfaceC1470e0Mo23847c);
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new C1433a0(this.f10552a.mo23848d());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.f10552a.mo23849e();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        C1437b0 c1437b0Mo23850f = this.f10552a.mo23850f();
        int i = AbstractC1439c0.f10523a;
        if (c1437b0Mo23850f == null) {
            return null;
        }
        return c1437b0Mo23850f.f10521a;
    }

    public final /* synthetic */ int hashCode() {
        return this.f10552a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.f10552a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.f10552a.mo23851g();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        C1488n0 c1488n0Mo23852h = this.f10552a.mo23852h();
        if (c1488n0Mo23852h == null) {
            return null;
        }
        return c1488n0Mo23852h.f10577a;
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        AbstractC1496c abstractC1496cMo23853i = this.f10552a.mo23853i();
        int i = C1495b.f10589b;
        if (abstractC1496cMo23853i == null) {
            return null;
        }
        return abstractC1496cMo23853i instanceof C1494a ? ((C1494a) abstractC1496cMo23853i).f10588b : new C1495b(abstractC1496cMo23853i);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.f10552a.mo23854j();
    }
}
