package p204p;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class rpa0 {

    /* JADX INFO: renamed from: a */
    public final ppa0 f201481a;

    /* JADX INFO: renamed from: b */
    public final Object f201482b = new Object();

    public rpa0(ppa0 ppa0Var) {
        this.f201481a = ppa0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m76103a(char c, String str, String str2, Throwable th) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.f201482b) {
            dqa0 dqa0VarM70546a = this.f201481a.m70546a(jElapsedRealtime);
            dqa0VarM70546a.f51932a = c;
            dqa0VarM70546a.f51933b = str;
            dqa0VarM70546a.f51934c = str2;
            dqa0VarM70546a.f51935d = th;
            dqa0VarM70546a.f51936e = jCurrentTimeMillis;
        }
    }
}
