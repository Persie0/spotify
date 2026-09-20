package p196j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.nio.file.attribute.b */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1436b implements InterfaceC1440d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BasicFileAttributeView f10520a;

    public /* synthetic */ C1436b(BasicFileAttributeView basicFileAttributeView) {
        this.f10520a = basicFileAttributeView;
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1440d
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo23817a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        this.f10520a.setTimes(AbstractC1419g.m23820c(fileTime), AbstractC1419g.m23820c(fileTime2), AbstractC1419g.m23820c(fileTime3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.f10520a;
        if (obj instanceof C1436b) {
            obj = ((C1436b) obj).f10520a;
        }
        return basicFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10520a.hashCode();
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1451o
    public final /* synthetic */ String name() {
        return this.f10520a.name();
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1440d
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C1441e.m23912a(this.f10520a.readAttributes());
    }
}
