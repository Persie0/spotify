package p196j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.nio.file.attribute.f */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1442f implements BasicFileAttributes {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BasicFileAttributes f10525a;

    public /* synthetic */ C1442f(BasicFileAttributes basicFileAttributes) {
        this.f10525a = basicFileAttributes;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BasicFileAttributes m23913a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof C1441e) {
            return ((C1441e) basicFileAttributes).f10524a;
        }
        if (basicFileAttributes instanceof C1444h) {
            return ((C1444h) basicFileAttributes).f10527a;
        }
        return basicFileAttributes instanceof C1458v ? ((C1458v) basicFileAttributes).f10538a : new C1442f(basicFileAttributes);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC1419g.m23820c(this.f10525a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.f10525a;
        if (obj instanceof C1442f) {
            obj = ((C1442f) obj).f10525a;
        }
        return basicFileAttributes.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f10525a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f10525a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f10525a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f10525a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f10525a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f10525a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return AbstractC1419g.m23820c(this.f10525a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return AbstractC1419g.m23820c(this.f10525a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f10525a.size();
    }
}
