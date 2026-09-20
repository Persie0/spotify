package p196j$.desugar.sun.nio.p197fs;

import p196j$.nio.file.attribute.BasicFileAttributes;
import p196j$.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.c */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1415c implements BasicFileAttributes {

    /* JADX INFO: renamed from: a */
    public final FileTime f10466a;

    /* JADX INFO: renamed from: b */
    public final FileTime f10467b;

    /* JADX INFO: renamed from: c */
    public final FileTime f10468c;

    /* JADX INFO: renamed from: d */
    public final boolean f10469d;

    /* JADX INFO: renamed from: e */
    public final boolean f10470e;

    /* JADX INFO: renamed from: f */
    public final boolean f10471f;

    /* JADX INFO: renamed from: g */
    public final boolean f10472g;

    /* JADX INFO: renamed from: h */
    public final long f10473h;

    /* JADX INFO: renamed from: i */
    public final Object f10474i;

    public C1415c(FileTime fileTime, FileTime fileTime2, FileTime fileTime3, boolean z, boolean z2, boolean z3, boolean z4, long j, Object obj) {
        this.f10466a = fileTime;
        this.f10467b = fileTime2;
        this.f10468c = fileTime3;
        this.f10469d = z;
        this.f10470e = z2;
        this.f10471f = z3;
        this.f10472g = z4;
        this.f10473h = j;
        this.f10474i = obj;
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final FileTime creationTime() {
        return this.f10468c;
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final Object fileKey() {
        return this.f10474i;
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final boolean isDirectory() {
        return this.f10470e;
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final boolean isOther() {
        return this.f10472g;
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final boolean isRegularFile() {
        return this.f10469d;
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final boolean isSymbolicLink() {
        return this.f10471f;
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final FileTime lastAccessTime() {
        return this.f10467b;
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final FileTime lastModifiedTime() {
        return this.f10466a;
    }

    @Override // p196j$.nio.file.attribute.BasicFileAttributes
    public final long size() {
        return this.f10473h;
    }
}
