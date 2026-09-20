package p204p;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class mwf1 {

    /* JADX INFO: renamed from: a */
    public final long f147785a;

    /* JADX INFO: renamed from: b */
    public final Context f147786b;

    /* JADX INFO: renamed from: c */
    public File f147787c;

    public mwf1(Context context) {
        this.f147786b = context;
        this.f147785a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* JADX INFO: renamed from: c */
    public static void m63012c(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m63012c(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(s571.m77251j("Failed to delete '", file.getAbsolutePath(), "'"));
        }
    }

    /* JADX INFO: renamed from: d */
    public static File m63013d(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    /* JADX INFO: renamed from: e */
    public static void m63014e(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("File input must be directory when it exists.");
            }
        } else {
            file.mkdirs();
            if (!file.isDirectory()) {
                throw new IOException("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final HashSet m63015a() throws IOException {
        File file = new File(m63018g(), "verified-splits");
        m63014e(file);
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && file2.getName().endsWith(".apk") && !file2.canWrite()) {
                    String name = file2.getName();
                    hashSet.add(new tif1(file2, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: b */
    public final void m63016b() throws IOException {
        File fileM63017f = m63017f();
        String[] list = fileM63017f.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f147785a))) {
                    File file = new File(fileM63017f, str);
                    file.toString();
                    m63012c(file);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final File m63017f() throws IOException {
        if (this.f147787c == null) {
            Context context = this.f147786b;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.f147787c = context.getFilesDir();
        }
        File file = new File(this.f147787c, "splitcompat");
        m63014e(file);
        return file;
    }

    /* JADX INFO: renamed from: g */
    public final File m63018g() throws IOException {
        File file = new File(m63017f(), Long.toString(this.f147785a));
        m63014e(file);
        return file;
    }
}
