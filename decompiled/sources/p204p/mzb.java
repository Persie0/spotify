package p204p;

import android.os.SystemClock;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes3.dex */
public final class mzb implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f148667a;

    public mzb(long j) {
        this.f148667a = j;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        Logger.m3965a(edb.m38561j(SystemClock.elapsedRealtime() - this.f148667a, "[AA-RESUME] doResume exit elapsedMs="), new Object[0]);
    }
}
