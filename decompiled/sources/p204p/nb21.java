package p204p;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: classes3.dex */
public final class nb21 extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ConditionVariable f152165a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ob21 f152166b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb21(ob21 ob21Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f152166b = ob21Var;
        this.f152165a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f152166b) {
            this.f152165a.open();
            ob21.m66585a(this.f152166b);
            this.f152166b.f163517b.getClass();
        }
    }
}
