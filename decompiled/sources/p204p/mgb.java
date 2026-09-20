package p204p;

import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;

/* JADX INFO: loaded from: classes.dex */
public final class mgb {

    /* JADX INFO: renamed from: a */
    public int f143426a;

    /* JADX INFO: renamed from: b */
    public long f143427b;

    /* JADX INFO: renamed from: c */
    public Object f143428c;

    public mgb(long j, Exception exc) {
        this.f143427b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof CameraValidator$CameraIdListIncorrectException) {
            this.f143426a = 2;
            this.f143428c = exc;
            return;
        }
        if (!(exc instanceof InitializationException)) {
            this.f143426a = 0;
            this.f143428c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.f143428c = exc;
        if (exc instanceof CameraUnavailableException) {
            this.f143426a = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.f143426a = 1;
        } else {
            this.f143426a = 0;
        }
    }
}
