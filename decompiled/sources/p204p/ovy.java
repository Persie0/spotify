package p204p;

import java.io.File;
import java.io.FilenameFilter;
import p196j$.nio.file.Path;
import p196j$.p198io.DesugarFile;
import p196j$.p198io.FileRetargetInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class ovy extends File implements FileRetargetInterface {
    /* JADX INFO: renamed from: a */
    public abstract ewy getParentFile();

    /* JADX INFO: renamed from: b */
    public abstract ovy[] listFiles();

    /* JADX INFO: renamed from: c */
    public abstract ovy[] listFiles(FilenameFilter filenameFilter);

    @Override // java.io.File
    public abstract boolean createNewFile();

    @Override // java.io.File
    public abstract boolean delete();

    @Override // java.io.File
    public abstract void deleteOnExit();

    @Override // java.io.File
    public abstract boolean mkdir();

    @Override // java.io.File
    public abstract boolean mkdirs();

    @Override // java.io.File
    public abstract boolean setLastModified(long j);

    @Override // java.io.File, p196j$.p198io.FileRetargetInterface
    public /* synthetic */ Path toPath() {
        return DesugarFile.toPath(this);
    }
}
