package p204p;

import android.os.StrictMode;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class nvu0 {

    /* JADX INFO: renamed from: a */
    public final File f158962a;

    /* JADX INFO: renamed from: b */
    public final long f158963b;

    /* JADX INFO: renamed from: c */
    public x2b f158964c;

    public nvu0(File file, long j) {
        this.f158962a = file;
        this.f158963b = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m65748a(y4l0 y4l0Var) {
        try {
            synchronized (this) {
                try {
                    if (this.f158964c == null) {
                        File file = this.f158962a;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                        if (!file.exists() && !file.mkdir()) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            throw new IOException();
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        this.f158964c = new x2b(this.f158962a, this.f158963b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            y4l0Var.f269183l = this.f158964c;
        } catch (IOException unused) {
            Logger.m3966b("Could not create cache, %s", this.f158962a.getAbsolutePath());
            na6.m63957e("Could not create cache");
        }
    }
}
