package p196j$.desugar.sun.nio.p197fs;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p196j$.nio.file.EnumC1432a;
import p196j$.nio.file.Path;
import p196j$.nio.file.attribute.BasicFileAttributes;
import p196j$.nio.file.attribute.FileTime;
import p196j$.nio.file.attribute.InterfaceC1440d;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.b */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1414b implements InterfaceC1440d {

    /* JADX INFO: renamed from: b */
    public static final Set f10464b;

    /* JADX INFO: renamed from: a */
    public final Path f10465a;

    static {
        String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        Charset charset = AbstractC1429q.f10506a;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 9; i++) {
            hashSet.add(strArr[i]);
        }
        f10464b = hashSet;
    }

    public C1414b(Path path) {
        this.f10465a = path;
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1440d
    /* JADX INFO: renamed from: a */
    public final void mo23817a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        long jConvert;
        if (fileTime == null && fileTime2 == null) {
            return;
        }
        Path path = this.f10465a;
        path.getFileSystem().mo23853i().mo23859a(path, EnumC1432a.WRITE);
        File file = path.toFile();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fileTime.getClass();
        Objects.requireNonNull(timeUnit, "unit");
        if (timeUnit != null) {
            jConvert = timeUnit.convert(fileTime.f10516a, timeUnit);
        } else {
            long jConvert2 = timeUnit.convert(fileTime.f10517b.f10611a, TimeUnit.SECONDS);
            if (jConvert2 == Long.MIN_VALUE || jConvert2 == Long.MAX_VALUE) {
                jConvert = jConvert2;
            } else {
                long jConvert3 = timeUnit.convert(fileTime.f10517b.f10612b, TimeUnit.NANOSECONDS);
                long j = jConvert2 + jConvert3;
                if (((jConvert3 ^ j) & (jConvert2 ^ j)) < 0) {
                    jConvert = jConvert2 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
                } else {
                    jConvert = j;
                }
            }
        }
        if (file.setLastModified(jConvert)) {
            return;
        }
        throw new IOException("File.setLastModified did not succeed on " + path);
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1451o
    public final String name() {
        return "basic";
    }

    @Override // p196j$.nio.file.attribute.InterfaceC1440d
    public final BasicFileAttributes readAttributes() {
        boolean z;
        Path path = this.f10465a;
        path.getFileSystem().mo23853i().mo23859a(path, new EnumC1432a[0]);
        File file = path.toFile();
        long jLastModified = file.lastModified();
        Objects.requireNonNull(TimeUnit.MILLISECONDS, "unit");
        FileTime fileTime = new FileTime(jLastModified);
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        try {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            z = !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        return new C1415c(fileTime, fileTime, fileTime, zIsFile, zIsDirectory, z, (zIsFile || zIsDirectory || z) ? false : true, file.length(), Integer.valueOf(file.hashCode()));
    }
}
