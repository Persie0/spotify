package p196j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.nio.file.attribute.c */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1438c implements BasicFileAttributeView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1440d f10522a;

    public /* synthetic */ C1438c(InterfaceC1440d interfaceC1440d) {
        this.f10522a = interfaceC1440d;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1440d interfaceC1440d = this.f10522a;
        if (obj instanceof C1438c) {
            obj = ((C1438c) obj).f10522a;
        }
        return interfaceC1440d.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f10522a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f10522a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C1442f.m23913a(this.f10522a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.f10522a.mo23817a(AbstractC1419g.m23818a(fileTime), AbstractC1419g.m23818a(fileTime2), AbstractC1419g.m23818a(fileTime3));
    }
}
