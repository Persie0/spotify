package p204p;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public final class s540 {

    /* JADX INFO: renamed from: a */
    public final File f205726a;

    /* JADX INFO: renamed from: b */
    public final b0s f205727b;

    public s540(File file, b0s b0sVar) {
        this.f205726a = file;
        this.f205727b = b0sVar;
    }

    /* JADX INFO: renamed from: a */
    public final Uri m77231a() {
        Object c6x0Var;
        try {
            File file = new File(this.f205726a, "vtec");
            if (!file.exists()) {
                file.mkdirs();
            }
            File fileCreateTempFile = File.createTempFile("vtec_upload_image", ".jpg", file);
            fileCreateTempFile.deleteOnExit();
            c6x0Var = fileCreateTempFile;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        boolean z = c6x0Var instanceof c6x0;
        Object obj = c6x0Var;
        if (z) {
            obj = null;
        }
        File file2 = (File) obj;
        if (file2 != null) {
            return (Uri) this.f205727b.invoke(file2);
        }
        return null;
    }
}
