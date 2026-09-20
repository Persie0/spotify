package p196j$.nio.file.attribute;

import java.nio.file.attribute.PosixFileAttributes;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.nio.file.attribute.v */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1458v implements BasicFileAttributes {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PosixFileAttributes f10538a;

    public /* synthetic */ C1458v(PosixFileAttributes posixFileAttributes) {
        this.f10538a = posixFileAttributes;
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC1419g.m23818a(this.f10538a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributes posixFileAttributes = this.f10538a;
        if (obj instanceof C1458v) {
            obj = ((C1458v) obj).f10538a;
        }
        return posixFileAttributes.equals(obj);
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f10538a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f10538a.hashCode();
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f10538a.isDirectory();
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f10538a.isOther();
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f10538a.isRegularFile();
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f10538a.isSymbolicLink();
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return AbstractC1419g.m23818a(this.f10538a.lastAccessTime());
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return AbstractC1419g.m23818a(this.f10538a.lastModifiedTime());
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f10538a.size();
    }
}
