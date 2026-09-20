package p204p;

import android.os.Trace;

/* JADX INFO: loaded from: classes3.dex */
public final class ab81 {

    /* JADX INFO: renamed from: a */
    public static final ab81 f14043a = new ab81();

    /* JADX INFO: renamed from: a */
    public final void m25340a(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    /* JADX INFO: renamed from: b */
    public final void m25341b(String str, int i) {
        Trace.endAsyncSection(str, i);
    }
}
