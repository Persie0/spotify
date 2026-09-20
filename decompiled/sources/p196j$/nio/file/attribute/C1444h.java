package p196j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.nio.file.attribute.h */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1444h implements BasicFileAttributes {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DosFileAttributes f10527a;

    public /* synthetic */ C1444h(DosFileAttributes dosFileAttributes) {
        this.f10527a = dosFileAttributes;
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC1419g.m23818a(this.f10527a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributes dosFileAttributes = this.f10527a;
        if (obj instanceof C1444h) {
            obj = ((C1444h) obj).f10527a;
        }
        return dosFileAttributes.equals(obj);
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f10527a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f10527a.hashCode();
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f10527a.isDirectory();
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f10527a.isOther();
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f10527a.isRegularFile();
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f10527a.isSymbolicLink();
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return AbstractC1419g.m23818a(this.f10527a.lastAccessTime());
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return AbstractC1419g.m23818a(this.f10527a.lastModifiedTime());
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f10527a.size();
    }
}
