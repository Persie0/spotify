package p204p;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class ewy extends ovy {

    /* JADX INFO: renamed from: a */
    public final yvy f63622a;

    /* JADX INFO: renamed from: b */
    public final File f63623b;

    /* JADX INFO: renamed from: c */
    public final h15 f63624c;

    /* JADX INFO: renamed from: d */
    public final boolean f63625d;

    /* JADX INFO: renamed from: e */
    public final mxy f63626e;

    /* JADX INFO: renamed from: f */
    public static final dwy f63617f = new dwy(2, 1, "Failed to rename file at:");

    /* JADX INFO: renamed from: g */
    public static final dwy f63618g = new dwy(2, 1, "Failed to make dir at:");

    /* JADX INFO: renamed from: h */
    public static final dwy f63619h = new dwy(2, 1, "Failed to make dirs at:");

    /* JADX INFO: renamed from: i */
    public static final dwy f63620i = new dwy(1, 2, "Failed to list files at:");

    /* JADX INFO: renamed from: t */
    public static final dwy f63621t = new dwy(3, 3, "Failed to delete file at:");

    /* JADX INFO: renamed from: X */
    public static final dwy f63614X = new dwy(3, 3, "Failed to delete file on exit at:");

    /* JADX INFO: renamed from: Y */
    public static final dwy f63615Y = new dwy(2, 1, "Failed to create file at:");

    /* JADX INFO: renamed from: Z */
    public static final dwy f63616Z = new dwy(1, 2, "Failed to read at:");

    public ewy(yvy yvyVar, File file, h15 h15Var, boolean z, mxy mxyVar) {
        super(file.getAbsolutePath());
        this.f63622a = yvyVar;
        this.f63623b = file;
        this.f63624c = h15Var;
        this.f63625d = z;
        this.f63626e = mxyVar;
    }

    @Override // java.io.File
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ewy getParentFile() {
        File parentFile = this.f63623b.getParentFile();
        if (parentFile == null) {
            return null;
        }
        return new ewy(this.f63622a, parentFile, this.f63624c, this.f63625d, this.f63626e);
    }

    @Override // java.io.File
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ovy[] listFiles() {
        Object obj = this.f63626e.f233995a;
        p0b1 p0b1Var = new p0b1(System.currentTimeMillis() - System.currentTimeMillis(), this.f63623b.listFiles());
        File[] fileArr = (File[]) p0b1Var.m68693a();
        m40154d(f63620i, p0b1Var.m68694b(), 0, fileArr != null);
        if (fileArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(fileArr.length);
        for (File file : fileArr) {
            wj50.m88279p(file);
            arrayList.add(new ewy(this.f63622a, file, this.f63624c, this.f63625d, this.f63626e));
        }
        return (ovy[]) arrayList.toArray(new ovy[0]);
    }

    @Override // java.io.File
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ovy[] listFiles(FilenameFilter filenameFilter) {
        Object obj = this.f63626e.f233995a;
        p0b1 p0b1Var = new p0b1(System.currentTimeMillis() - System.currentTimeMillis(), this.f63623b.listFiles(filenameFilter));
        File[] fileArr = (File[]) p0b1Var.m68693a();
        m40154d(f63620i, p0b1Var.m68694b(), 0, fileArr != null);
        if (fileArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(fileArr.length);
        for (File file : fileArr) {
            wj50.m88279p(file);
            arrayList.add(new ewy(this.f63622a, file, this.f63624c, this.f63625d, this.f63626e));
        }
        return (ovy[]) arrayList.toArray(new ovy[0]);
    }

    @Override // java.io.File
    public final boolean canRead() {
        return this.f63623b.canRead();
    }

    @Override // java.io.File
    public final boolean canWrite() {
        return this.f63623b.canWrite();
    }

    @Override // p204p.ovy, java.io.File
    public final boolean createNewFile() throws Exception {
        boolean zBooleanValue;
        Object obj = this.f63626e.f233995a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean boolValueOf = null;
        try {
            boolValueOf = Boolean.valueOf(this.f63623b.createNewFile());
            e = null;
        } catch (Exception e) {
            e = e;
        }
        q0b1 q0b1Var = new q0b1(boolValueOf, jCurrentTimeMillis - System.currentTimeMillis(), e);
        Boolean bool = (Boolean) q0b1Var.m71807a();
        long jM71808b = q0b1Var.m71808b();
        Exception excM71809c = q0b1Var.m71809c();
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = excM71809c == null;
        }
        m40154d(f63615Y, jM71808b, 0, zBooleanValue);
        if (excM71809c != null) {
            throw excM71809c;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("File.createNewFile() result cannot be null");
    }

    /* JADX INFO: renamed from: d */
    public final void m40154d(dwy dwyVar, long j, int i, boolean z) {
        if (this.f63625d) {
            int i2 = dwyVar.f53755a;
            mxy mxyVar = this.f63626e;
            File file = this.f63623b;
            new h751(i2, mxyVar.m63116L(file.getAbsolutePath()), i, new Date(), j, z ? null : new f751(klh.m56834f(dwyVar.f53757c, " ", file.getAbsolutePath()), dwyVar.f53756b));
            this.f63624c.getClass();
        }
    }

    @Override // p204p.ovy, java.io.File
    public final boolean delete() {
        File file = this.f63623b;
        int length = (int) file.length();
        Object obj = this.f63626e.f233995a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        p0b1 p0b1Var = new p0b1(System.currentTimeMillis() - jCurrentTimeMillis, Boolean.valueOf(file.delete()));
        boolean zBooleanValue = ((Boolean) p0b1Var.m68693a()).booleanValue();
        long jM68694b = p0b1Var.m68694b();
        if (!zBooleanValue) {
            length = 0;
        }
        m40154d(f63621t, jM68694b, length, zBooleanValue);
        return zBooleanValue;
    }

    @Override // p204p.ovy, java.io.File
    public final void deleteOnExit() {
        File file = this.f63623b;
        int length = (int) file.length();
        Object obj = this.f63626e.f233995a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        file.deleteOnExit();
        m40154d(f63614X, new p0b1(System.currentTimeMillis() - jCurrentTimeMillis, w2a1.f247311a).m68694b(), length, true);
    }

    @Override // java.io.File
    public final boolean exists() {
        return this.f63623b.exists();
    }

    @Override // java.io.File
    public final File getAbsoluteFile() {
        return new ewy(this.f63622a, this.f63623b.getAbsoluteFile(), this.f63624c, this.f63625d, this.f63626e);
    }

    @Override // java.io.File
    public final String getAbsolutePath() {
        return this.f63623b.getAbsolutePath();
    }

    @Override // java.io.File
    public final String getCanonicalPath() {
        return this.f63623b.getCanonicalPath();
    }

    @Override // java.io.File
    public final String getName() {
        return this.f63623b.getName();
    }

    @Override // java.io.File
    public final String getPath() {
        return this.f63623b.getPath();
    }

    @Override // java.io.File
    public final boolean isDirectory() {
        return this.f63623b.isDirectory();
    }

    @Override // java.io.File
    public final boolean isFile() {
        return this.f63623b.isFile();
    }

    @Override // java.io.File
    public final boolean isHidden() {
        return this.f63623b.isHidden();
    }

    @Override // java.io.File
    public final long lastModified() {
        return this.f63623b.lastModified();
    }

    @Override // java.io.File
    public final long length() {
        return this.f63623b.length();
    }

    @Override // java.io.File
    public final String[] list() {
        Object obj = this.f63626e.f233995a;
        p0b1 p0b1Var = new p0b1(System.currentTimeMillis() - System.currentTimeMillis(), this.f63623b.list());
        String[] strArr = (String[]) p0b1Var.m68693a();
        m40154d(f63620i, p0b1Var.m68694b(), 0, strArr != null);
        return strArr;
    }

    @Override // p204p.ovy, java.io.File
    public final boolean mkdir() {
        Object obj = this.f63626e.f233995a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        p0b1 p0b1Var = new p0b1(System.currentTimeMillis() - jCurrentTimeMillis, Boolean.valueOf(this.f63623b.mkdir()));
        boolean zBooleanValue = ((Boolean) p0b1Var.m68693a()).booleanValue();
        m40154d(f63618g, p0b1Var.m68694b(), 0, zBooleanValue);
        return zBooleanValue;
    }

    @Override // p204p.ovy, java.io.File
    public final boolean mkdirs() {
        Object obj = this.f63626e.f233995a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        p0b1 p0b1Var = new p0b1(System.currentTimeMillis() - jCurrentTimeMillis, Boolean.valueOf(this.f63623b.mkdirs()));
        boolean zBooleanValue = ((Boolean) p0b1Var.m68693a()).booleanValue();
        m40154d(f63619h, p0b1Var.m68694b(), 0, zBooleanValue);
        return zBooleanValue;
    }

    @Override // java.io.File
    public final boolean renameTo(File file) {
        Object obj = this.f63626e.f233995a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        p0b1 p0b1Var = new p0b1(System.currentTimeMillis() - jCurrentTimeMillis, Boolean.valueOf(this.f63623b.renameTo(file)));
        boolean zBooleanValue = ((Boolean) p0b1Var.m68693a()).booleanValue();
        m40154d(f63617f, p0b1Var.m68694b(), 0, zBooleanValue);
        return zBooleanValue;
    }

    @Override // p204p.ovy, java.io.File
    public final boolean setLastModified(long j) {
        return this.f63623b.setLastModified(j);
    }

    @Override // java.io.File
    public final URI toURI() {
        return this.f63623b.toURI();
    }

    @Override // java.io.File
    public final File[] listFiles(FileFilter fileFilter) {
        Object obj = this.f63626e.f233995a;
        p0b1 p0b1Var = new p0b1(System.currentTimeMillis() - System.currentTimeMillis(), this.f63623b.listFiles(fileFilter));
        File[] fileArr = (File[]) p0b1Var.m68693a();
        m40154d(f63620i, p0b1Var.m68694b(), 0, fileArr != null);
        if (fileArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(fileArr.length);
        for (File file : fileArr) {
            wj50.m88279p(file);
            arrayList.add(new ewy(this.f63622a, file, this.f63624c, this.f63625d, this.f63626e));
        }
        return (ovy[]) arrayList.toArray(new ovy[0]);
    }
}
