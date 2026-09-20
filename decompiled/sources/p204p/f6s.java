package p204p;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes5.dex */
public final class f6s {

    /* JADX INFO: renamed from: a */
    public final e6s f66494a;

    public f6s(e6s e6sVar) {
        this.f66494a = e6sVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m40885a() {
        new Handler(Looper.getMainLooper()).post(new eph(this, 17));
    }
}
