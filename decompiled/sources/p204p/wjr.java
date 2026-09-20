package p204p;

import java.io.File;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class wjr {
    /* JADX INFO: renamed from: a */
    public static xjr m88354a(File file) {
        try {
            if (!file.isDirectory() && !file.mkdirs()) {
                return new xjr(false, "checkingDir");
            }
            try {
                File file2 = new File(file, UUID.randomUUID().toString());
                if (!file2.createNewFile()) {
                    return new xjr(false, "createFile");
                }
                if (file2.delete()) {
                    return file.list() == null ? new xjr(false, "opendir") : new xjr(true, "");
                }
                return new xjr(false, "delete");
            } catch (Exception e) {
                xjr xjrVar = new xjr(false, "file-".concat(e.getClass().getSimpleName()));
                e.getMessage();
                return xjrVar;
            }
        } catch (SecurityException e2) {
            return new xjr(false, "dir-".concat(e2.getClass().getSimpleName()));
        }
    }
}
