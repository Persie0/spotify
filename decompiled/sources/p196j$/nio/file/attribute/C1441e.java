package p196j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.nio.file.attribute.e */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1441e implements BasicFileAttributes {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BasicFileAttributes f10524a;

    public /* synthetic */ C1441e(BasicFileAttributes basicFileAttributes) {
        this.f10524a = basicFileAttributes;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BasicFileAttributes m23912a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof C1442f) {
            return ((C1442f) basicFileAttributes).f10525a;
        }
        if (basicFileAttributes instanceof DosFileAttributes) {
            return new C1444h((DosFileAttributes) basicFileAttributes);
        }
        return basicFileAttributes instanceof PosixFileAttributes ? new C1458v((PosixFileAttributes) basicFileAttributes) : new C1441e(basicFileAttributes);
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC1419g.m23818a(this.f10524a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.f10524a;
        if (obj instanceof C1441e) {
            obj = ((C1441e) obj).f10524a;
        }
        return basicFileAttributes.equals(obj);
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f10524a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f10524a.hashCode();
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f10524a.isDirectory();
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f10524a.isOther();
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f10524a.isRegularFile();
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f10524a.isSymbolicLink();
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return AbstractC1419g.m23818a(this.f10524a.lastAccessTime());
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return AbstractC1419g.m23818a(this.f10524a.lastModifiedTime());
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f10524a.size();
    }
}
