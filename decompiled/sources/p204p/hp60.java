package p204p;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class hp60 extends ywy {
    @Override // p204p.ywy
    /* JADX INFO: renamed from: a */
    public final ai21 mo40342a(tbn0 tbn0Var) {
        return gif1.m44798i(tbn0Var.toFile(), true);
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: c */
    public void mo39301c(tbn0 tbn0Var, tbn0 tbn0Var2) throws IOException {
        if (tbn0Var.toFile().renameTo(tbn0Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + tbn0Var + " to " + tbn0Var2);
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: e */
    public final void mo40343e(tbn0 tbn0Var) throws IOException {
        if (tbn0Var.toFile().mkdir()) {
            return;
        }
        jwy jwyVarMo39302h = mo39302h(tbn0Var);
        if (jwyVarMo39302h == null || !jwyVarMo39302h.f116737b) {
            throw new IOException("failed to create directory: " + tbn0Var);
        }
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: f */
    public final void mo40344f(tbn0 tbn0Var) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = tbn0Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + tbn0Var);
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: g */
    public final List mo40345g(tbn0 tbn0Var) throws IOException {
        File file = tbn0Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                throw new IOException("failed to list " + tbn0Var);
            }
            throw new FileNotFoundException("no such file: " + tbn0Var);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            wj50.m88279p(str);
            arrayList.add(tbn0Var.m80403e(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: h */
    public jwy mo39302h(tbn0 tbn0Var) {
        File file = tbn0Var.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new jwy(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: i */
    public final xn60 mo40346i(tbn0 tbn0Var) {
        return new xn60(new RandomAccessFile(tbn0Var.toFile(), "r"));
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: k */
    public final ai21 mo40347k(tbn0 tbn0Var, boolean z) throws IOException {
        if (!z || !whg1.m88141n(this, tbn0Var)) {
            return gif1.m44799j(tbn0Var.toFile());
        }
        throw new IOException(tbn0Var + " already exists.");
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: n */
    public final wt31 mo40348n(tbn0 tbn0Var) {
        return gif1.m44800k(tbn0Var.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
