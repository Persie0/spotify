package p204p;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class lxy {
    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
        bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf)))));
        bigIntegerValueOf.multiply(BigInteger.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID).multiply(BigInteger.valueOf(1152921504606846976L)));
    }

    /* JADX INFO: renamed from: a */
    public static void m60206a(File file, File file2) throws FileNotFoundException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (file.exists()) {
            return;
        }
        throw new FileNotFoundException("Source '" + file + "' does not exist");
    }

    /* JADX INFO: renamed from: b */
    public static void m60207b(ovy ovyVar, ovy ovyVar2) throws Throwable {
        ArrayList arrayList;
        ovy[] ovyVarArrListFiles;
        m60206a(ovyVar, ovyVar2);
        ewy ewyVar = (ewy) ovyVar;
        File file = ewyVar.f63623b;
        if (!file.isDirectory()) {
            throw new IOException("Source '" + ovyVar + "' exists but is not a directory");
        }
        String canonicalPath = file.getCanonicalPath();
        File file2 = ((ewy) ovyVar2).f63623b;
        if (canonicalPath.equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + ovyVar + "' and destination '" + ovyVar2 + "' are the same");
        }
        if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath()) || (ovyVarArrListFiles = ewyVar.listFiles()) == null || ovyVarArrListFiles.length <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(ovyVarArrListFiles.length);
            for (ovy ovyVar3 : ovyVarArrListFiles) {
                arrayList.add(new File(ovyVar2, ((ewy) ovyVar3).f63623b.getName()).getCanonicalPath());
            }
        }
        m60209d(ovyVar, ovyVar2, arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static void m60208c(ovy ovyVar, ovy ovyVar2) throws Throwable {
        m60206a(ovyVar, ovyVar2);
        File file = ((ewy) ovyVar).f63623b;
        if (file.isDirectory()) {
            throw new IOException("Source '" + ovyVar + "' exists but is a directory");
        }
        String canonicalPath = file.getCanonicalPath();
        ewy ewyVar = (ewy) ovyVar2;
        File file2 = ewyVar.f63623b;
        if (canonicalPath.equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + ovyVar + "' and destination '" + ovyVar2 + "' are the same");
        }
        ewy parentFile = ewyVar.getParentFile();
        if (parentFile != null && !parentFile.mkdirs() && !parentFile.f63623b.isDirectory()) {
            throw new IOException("Destination '" + parentFile + "' directory cannot be created");
        }
        if (!file2.exists() || file2.canWrite()) {
            m60210e(ovyVar, ovyVar2);
            return;
        }
        throw new IOException("Destination '" + ovyVar2 + "' exists but is read-only");
    }

    /* JADX INFO: renamed from: d */
    public static void m60209d(File file, File file2, List list) throws Throwable {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' exists but is not a directory");
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' directory cannot be created");
        }
        if (!file2.canWrite()) {
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        for (File file3 : fileArrListFiles) {
            File file4 = new File(file2, file3.getName());
            if (list == null || !list.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    m60209d(file3, file4, list);
                } else {
                    m60210e(file3, file4);
                }
            }
        }
        file2.setLastModified(file.lastModified());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.nio.channels.FileChannel, java.nio.channels.ReadableByteChannel] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX INFO: renamed from: e */
    public static void m60210e(File file, File file2) throws Throwable {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        ?? channel;
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
        ?? r7 = 0;
        r7 = 0;
        r7 = 0;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    channel = fileInputStream.getChannel();
                    try {
                        ?? channel2 = fileOutputStream.getChannel();
                        try {
                            long size = channel.size();
                            long j = 0;
                            while (j < size) {
                                long j2 = size - j;
                                if (j2 > 31457280) {
                                    j2 = 31457280;
                                }
                                long jTransferFrom = channel2.transferFrom(channel, j, j2);
                                if (jTransferFrom == 0) {
                                    break;
                                } else {
                                    j += jTransferFrom;
                                }
                            }
                            sv30.m79426b(new Closeable[]{channel2, fileOutputStream, channel, fileInputStream});
                            long length = file.length();
                            long length2 = file2.length();
                            if (length == length2) {
                                file2.setLastModified(file.lastModified());
                                return;
                            }
                            throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
                        } catch (Throwable th) {
                            th = th;
                            r7 = channel2;
                            sv30.m79426b(new Closeable[]{r7, fileOutputStream, channel, fileInputStream});
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    channel = 0;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
                channel = fileOutputStream;
                sv30.m79426b(new Closeable[]{r7, fileOutputStream, channel, fileInputStream});
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m60211f(File file) throws IOException {
        if (!file.isDirectory()) {
            boolean zExists = file.exists();
            if (file.delete()) {
                return;
            }
            if (zExists) {
                throw new IOException("Unable to delete file: " + file);
            }
            throw new FileNotFoundException("File does not exist: " + file);
        }
        if (file.exists()) {
            if (!m60212g(file)) {
                if (!file.exists()) {
                    throw new IllegalArgumentException(file + " does not exist");
                }
                if (!file.isDirectory()) {
                    throw new IllegalArgumentException(file + " is not a directory");
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("Failed to list contents of " + file);
                }
                IOException e = null;
                for (File file2 : fileArrListFiles) {
                    try {
                        m60211f(file2);
                    } catch (IOException e2) {
                        e = e2;
                    }
                }
                if (e != null) {
                    throw e;
                }
            }
            if (file.delete()) {
                return;
            }
            throw new IOException("Unable to delete directory " + file + ".");
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m60212g(File file) {
        File canonicalFile;
        File parentFile;
        File[] fileArrListFiles;
        if (uc60.f228952a) {
            try {
                return ((Boolean) uc60.f228953b.invoke(null, uc60.f228954c.invoke(file, null))).booleanValue();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        if (file == null) {
            throw new NullPointerException("File must not be null");
        }
        if (oxy.f171614a == '\\') {
            return false;
        }
        File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
        if (file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
            return (file.exists() || (parentFile = (canonicalFile = file.getCanonicalFile()).getParentFile()) == null || !parentFile.exists() || (fileArrListFiles = parentFile.listFiles(new jxy(canonicalFile))) == null || fileArrListFiles.length <= 0) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static long m60213h(ovy ovyVar) {
        if (!((ewy) ovyVar).f63623b.exists()) {
            throw new IllegalArgumentException(ovyVar + " does not exist");
        }
        if (((ewy) ovyVar).f63623b.isDirectory()) {
            return m60214i(ovyVar);
        }
        throw new IllegalArgumentException(ovyVar + " is not a directory");
    }

    /* JADX INFO: renamed from: i */
    public static long m60214i(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return 0L;
        }
        long jM60214i = 0;
        for (File file2 : fileArrListFiles) {
            try {
                if (!m60212g(file2)) {
                    jM60214i += file2.isDirectory() ? m60214i(file2) : file2.length();
                    if (jM60214i < 0) {
                        break;
                    }
                } else {
                    continue;
                }
            } catch (IOException unused) {
            }
        }
        return jM60214i;
    }
}
