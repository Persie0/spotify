package p204p;

import android.os.Process;
import android.os.SystemClock;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class eir0 implements k2l {
    @Override // p204p.k2l
    /* JADX INFO: renamed from: a */
    public final List mo29350a() {
        Object c6x0Var;
        try {
            c6x0Var = Long.valueOf(SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime());
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = -1L;
        }
        return Collections.singletonList(new s1l(((Number) c6x0Var).longValue()));
    }
}
