package p204p;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class ly7 {

    /* JADX INFO: renamed from: a */
    public final Executor f137978a;

    /* JADX INFO: renamed from: b */
    public final Handler f137979b;

    public ly7(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f137978a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f137979b = handler;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ly7) {
            ly7 ly7Var = (ly7) obj;
            if (this.f137978a.equals(ly7Var.f137978a) && this.f137979b.equals(ly7Var.f137979b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f137978a.hashCode() ^ 1000003) * 1000003) ^ this.f137979b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f137978a + ", schedulerHandler=" + this.f137979b + "}";
    }
}
