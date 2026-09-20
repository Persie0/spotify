package p196j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.DosFileAttributeView;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.nio.file.attribute.g */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1443g implements InterfaceC1440d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DosFileAttributeView f10526a;

    public /* synthetic */ C1443g(DosFileAttributeView dosFileAttributeView) {
        this.f10526a = dosFileAttributeView;
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1440d
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo23817a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        this.f10526a.setTimes(AbstractC1419g.m23820c(fileTime), AbstractC1419g.m23820c(fileTime2), AbstractC1419g.m23820c(fileTime3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.f10526a;
        if (obj instanceof C1443g) {
            obj = ((C1443g) obj).f10526a;
        }
        return dosFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10526a.hashCode();
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1451o
    public final /* synthetic */ String name() {
        return this.f10526a.name();
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1440d
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C1441e.m23912a(this.f10526a.readAttributes());
    }
}
