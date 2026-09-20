package p196j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributeView;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.nio.file.attribute.u */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1457u implements InterfaceC1440d, InterfaceC1454r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PosixFileAttributeView f10537a;

    public /* synthetic */ C1457u(PosixFileAttributeView posixFileAttributeView) {
        this.f10537a = posixFileAttributeView;
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1440d
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo23817a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        this.f10537a.setTimes(AbstractC1419g.m23820c(fileTime), AbstractC1419g.m23820c(fileTime2), AbstractC1419g.m23820c(fileTime3));
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1454r
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo23911b(InterfaceC1435a0 interfaceC1435a0) throws IOException {
        this.f10537a.setOwner(C1462z.m23915a(interfaceC1435a0));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.f10537a;
        if (obj instanceof C1457u) {
            obj = ((C1457u) obj).f10537a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1454r
    public final /* synthetic */ InterfaceC1435a0 getOwner() {
        return C1461y.m23914a(this.f10537a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f10537a.hashCode();
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1451o
    public final /* synthetic */ String name() {
        return this.f10537a.name();
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1440d
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C1441e.m23912a(this.f10537a.readAttributes());
    }
}
